package com.jtripled.integrity.asm;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraftforge.fml.common.asm.transformers.deobf.FMLDeobfuscatingRemapper;
import org.apache.commons.codec.digest.DigestUtils;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

/**
 *
 * @author jtripled
 */
public class ASMHelper
{
    public static String createMethodDescriptor(boolean obfuscated, String returnType, String... types)
    {
        String result = "(";
        
        for (String type : types)
        {
            if (type.length() == 1) result += type;
            else
            {
                result += "L" + (obfuscated ? FMLDeobfuscatingRemapper.INSTANCE.unmap(type) : type) + ";";
            }
        }
        
        if (returnType.length() > 1)
        {
            returnType = "L" + unmapType(obfuscated, returnType) + ";";
        }
        
        result += ")" + returnType;
        
        return result;
    }
    
    public static String unmapType(boolean obfuscated, String type)
    {
        return obfuscated ? FMLDeobfuscatingRemapper.INSTANCE.unmap(type) : type;
    }
    
    public static boolean methodEquals(MethodNode methodNode, String[] names, String desc)
    {
        boolean nameMatches = false;
        
        for (String name : names)
        {
            if (methodNode.name.equals(name))
            {
                nameMatches = true;
                break;
            }
        }
        
        return nameMatches && methodNode.desc.equals(desc);
    }
    
    public static void clearNextInstructions(MethodNode methodNode, AbstractInsnNode insnNode)
    {
        Iterator<AbstractInsnNode> iterator = methodNode.instructions.iterator(methodNode.instructions.indexOf(insnNode));
        
        while (iterator.hasNext())
        {
            iterator.next();
            iterator.remove();
        }
    }
    
    public static MethodInsnNode getUniqueMethodInsnNode(MethodNode methodNode, int opcode, String owner, String[] names, String desc)
    {
        List<MethodInsnNode> matchedMethodNodes = matchMethodInsnNodes(methodNode, opcode, owner, names, desc);
        
        if (matchedMethodNodes.isEmpty()) throw new RuntimeException("No method instruction node found matching " + owner + " " + names[0] + " " + desc);
        
        return matchedMethodNodes.get(matchedMethodNodes.size() - 1);
    }
    
    public static List<MethodInsnNode> matchMethodInsnNodes(MethodNode methodNode, int opcode, String owner, String[] names, String desc)
    {
       ArrayList<MethodInsnNode> matches = Lists.newArrayList();
       ArrayList<String> validMethodNames = Lists.newArrayList(names);
       
       for (AbstractInsnNode insnNode : methodNode.instructions.toArray())
       {
           if (insnNode instanceof MethodInsnNode && insnNode.getOpcode() == opcode)
           {
               MethodInsnNode methodInsnNode = (MethodInsnNode)insnNode;
               
               if (methodInsnNode.owner.equals(owner) & validMethodNames.contains(methodInsnNode.name) && methodInsnNode.desc.equals(desc))
               {
                   matches.add(methodInsnNode);
               }
           }
       }
       
       return matches;
    }
    
    public static void verifyClassHash(String className, byte[] bytes, String... expectedHashes)
    {
        String currentHash = DigestUtils.md5Hex(bytes);

        if (!Lists.newArrayList(expectedHashes).contains(currentHash))
        {
            String error = String.format("Unexpected hash %s detected for class %s. Crashes or bugs may occur!", currentHash, className);
        }
        else
        {
            //LOGGER.info(String.format("Valid hash %s found for class %s.", currentHash, className));
        }
    }
}
