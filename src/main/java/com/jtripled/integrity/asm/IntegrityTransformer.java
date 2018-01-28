package com.jtripled.integrity.asm;

import com.jtripled.integrity.IntegrityRegistry;
import com.jtripled.voxen.asm.ClassTransformer;
import com.jtripled.voxen.asm.Type;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockConcretePowder;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

/**
 *
 * @author jtripled
 */
public class IntegrityTransformer extends ClassTransformer
{
    public static String[] ON_END_FALLING_NAMES = { "onEndFalling" };

    @Override
    public String[] getClasses()
    {
        return new String[] {
            "net.minecraft.block.BlockConcretePowder",
            "net.minecraft.block.BlockPane"
        };
    }
    
    @Override
    public byte[] onTransform(String className, byte[] bytes, ClassNode node, boolean obfuscated)
    {
        if (isClass("net.minecraft.block.BlockConcretePowder"))
        {
            String[] onEndFallingNames = { "onEndFalling" };
            String onEndFallingDescription = createMethodDescription(Type.VOID, Type.WORLD, Type.BLOCK_POS, Type.BLOCK_STATE, "net.minecraft.block.state.IBlockState");
            String[] updateTickNames = { "updateTick" };
            String updateTickDescription = createMethodDescription(Type.VOID, Type.WORLD, Type.BLOCK_POS, Type.BLOCK_STATE, Type.RANDOM);
            
            for (MethodNode method : node.methods)
            {
                if (isMethod(method, onEndFallingNames, onEndFallingDescription))
                {
                    System.out.println("Transforming net.minecraft.block.BlockConcretePowder#onEndFalling");
                    
                    InsnList instructions = new InsnList();
                    instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
                    instructions.add(new VarInsnNode(Opcodes.ALOAD, 2));
                    instructions.add(new VarInsnNode(Opcodes.ALOAD, 3));
                    instructions.add(new VarInsnNode(Opcodes.ALOAD, 4));
                    instructions.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "com/jtripled/integrity/asm/IntegrityTransformer", "onEndFalling", onEndFallingDescription, false));
                    instructions.add(new InsnNode(Opcodes.RETURN));
                    method.instructions.clear();
                    method.instructions.insert(instructions);
                    
                    System.out.println("Successfully transformed net.minecraft.block.BlockConcretePowder#onEndFalling");
                    break;
                }
            }
            
            ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            node.accept(writer);
            
            {
                System.out.println("Adding net.minecraft.block.BlockConcretePowder#updateTick");
                
                MethodVisitor visitor = writer.visitMethod(Opcodes.ACC_PUBLIC, updateTickNames[0], updateTickDescription, null, null);
                visitor.visitVarInsn(Opcodes.ALOAD, 1);
                visitor.visitVarInsn(Opcodes.ALOAD, 2);
                visitor.visitVarInsn(Opcodes.ALOAD, 3);
                visitor.visitVarInsn(Opcodes.ALOAD, 4);
                visitor.visitMethodInsn(Opcodes.INVOKESTATIC, "com/jtripled/integrity/asm/IntegrityTransformer", "updateTick", updateTickDescription, false);
                visitor.visitInsn(Opcodes.RETURN);
                visitor.visitMaxs(0, 0);
                
                System.out.println("Successfully added net.minecraft.block.BlockConcretePowder#updateTick");
            }
            
            return writer.toByteArray();
        }
        else if (isClass("net.minecraft.block.BlockPane"))
        {
            String[] onBlockActivatedNames = { "onBlockActivated" };
            String onBlockActivatedDescription = createMethodDescription(Type.BOOL, Type.WORLD, Type.BLOCK_POS, Type.BLOCK_STATE, Type.ENTITY_PLAYER, Type.ENUM_HAND, Type.ENUM_FACING, Type.FLOAT, Type.FLOAT, Type.FLOAT);
            
            ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            node.accept(writer);
            
            {
                System.out.println("Adding net.minecraft.block.BlockPane#onBlockActivated");
                
                MethodVisitor visitor = writer.visitMethod(Opcodes.ACC_PUBLIC, onBlockActivatedNames[0], onBlockActivatedDescription, null, null);
                visitor.visitVarInsn(Opcodes.ALOAD, 1);
                visitor.visitVarInsn(Opcodes.ALOAD, 2);
                visitor.visitVarInsn(Opcodes.ALOAD, 3);
                visitor.visitVarInsn(Opcodes.ALOAD, 4);
                visitor.visitVarInsn(Opcodes.ALOAD, 5);
                visitor.visitVarInsn(Opcodes.ALOAD, 6);
                visitor.visitVarInsn(Opcodes.FLOAD, 7);
                visitor.visitVarInsn(Opcodes.FLOAD, 8);
                visitor.visitVarInsn(Opcodes.FLOAD, 9);
                visitor.visitMethodInsn(Opcodes.INVOKESTATIC, "com/jtripled/integrity/asm/IntegrityTransformer", "onBlockActivated", onBlockActivatedDescription, false);
                visitor.visitInsn(Opcodes.IRETURN);
                visitor.visitMaxs(0, 0);
                
                System.out.println("Successfully added net.minecraft.block.BlockPane#onBlockActivated");
            }
            
            return writer.toByteArray();
        }
        return bytes;
    }
    
    // Replaces 'onEndFalling' in BlockConcretePowder
    public static void onEndFalling(World world, BlockPos pos, IBlockState state, IBlockState otherState)
    {
        BlockPos.MutableBlockPos downPos = new BlockPos.MutableBlockPos(pos);
        IBlockState downState;
        
        do
        {
            downPos.move(EnumFacing.DOWN);
            downState = world.getBlockState(downPos);
        } while (downState.getBlock() == Blocks.IRON_BARS);
        
        if (world.getBlockState(downPos.up()).getBlock() == Blocks.IRON_BARS)
        {
            world.setBlockState(downPos.up(), getReinforcedState(state), 3);
            world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
        }
    }
    
    // Replaces 'updateTick' in BlockConcretePowder
    public static void updateTick(World world, BlockPos pos, IBlockState state, Random rand)
    {
        if (!world.isRemote)
        {
            if (world.getBlockState(pos.down()).getBlock() == Blocks.IRON_BARS)
            {
                BlockPos.MutableBlockPos downPos = new BlockPos.MutableBlockPos(pos);
                IBlockState downState;

                do
                {
                    downPos.move(EnumFacing.DOWN);
                    downState = world.getBlockState(downPos);
                } while (downState.getBlock() == Blocks.IRON_BARS);

                world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
                world.setBlockState(downPos.up(), getReinforcedState(state), 3);
            }
            else
            {
                checkFallable((BlockFalling) state.getBlock(), world, pos);
            }
        }
    }
    
    // Replaces 'onBlockActivated' in BlockPane
    public static boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (state.getBlock() == Blocks.IRON_BARS
                && player.getHeldItem(hand).getItem().getUnlocalizedName().contains("concretePowder"))
        {
            if (!world.isRemote)
            {
                IBlockState concreteState = Blocks.CONCRETE_POWDER.getStateFromMeta(player.getHeldItem(hand).getItem().getMetadata(player.getHeldItem(hand)));
                world.setBlockState(pos, getReinforcedState(concreteState), 3);
            }
            return true;
        }
        return false;
    }
    
    private static IBlockState getReinforcedState(IBlockState state)
    {
        switch (state.getValue(BlockConcretePowder.COLOR))
        {
            case BLACK: return ((Block) IntegrityRegistry.BLACK_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case BLUE: return ((Block) IntegrityRegistry.BLUE_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case BROWN: return ((Block) IntegrityRegistry.BROWN_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case CYAN: return ((Block) IntegrityRegistry.CYAN_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case GRAY: return ((Block) IntegrityRegistry.GRAY_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case GREEN: return ((Block) IntegrityRegistry.GREEN_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case LIGHT_BLUE: return ((Block) IntegrityRegistry.LIGHT_BLUE_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case LIME: return ((Block) IntegrityRegistry.LIME_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case MAGENTA: return ((Block) IntegrityRegistry.MAGENTA_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case ORANGE: return ((Block) IntegrityRegistry.ORANGE_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case PINK: return ((Block) IntegrityRegistry.PINK_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case PURPLE: return ((Block) IntegrityRegistry.PURPLE_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case RED: return ((Block) IntegrityRegistry.RED_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case SILVER: return ((Block) IntegrityRegistry.SILVER_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case WHITE: return ((Block) IntegrityRegistry.WHITE_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case YELLOW: return ((Block) IntegrityRegistry.YELLOW_REINFORCED_CONCRETE_POWDER).getDefaultState();
            default: return ((Block) IntegrityRegistry.WHITE_REINFORCED_CONCRETE_POWDER).getDefaultState();
        }
    }

    private static void checkFallable(BlockFalling block, World world, BlockPos pos)
    {
        if ((world.isAirBlock(pos.down()) || BlockFalling.canFallThrough(world.getBlockState(pos.down()))) && pos.getY() >= 0)
        {
            int i = 32;

            if (!block.fallInstantly && world.isAreaLoaded(pos.add(-32, -32, -32), pos.add(32, 32, 32)))
            {
                if (!world.isRemote)
                {
                    EntityFallingBlock entityfallingblock = new EntityFallingBlock(world, (double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, world.getBlockState(pos));
                    //block.onStartFalling(entityfallingblock);
                    world.spawnEntity(entityfallingblock);
                }
            }
            else
            {
                IBlockState state = world.getBlockState(pos);
                world.setBlockToAir(pos);
                BlockPos blockpos;

                for (blockpos = pos.down(); (world.isAirBlock(blockpos) || BlockFalling.canFallThrough(world.getBlockState(blockpos))) && blockpos.getY() > 0; blockpos = blockpos.down())
                {
                    ;
                }

                if (blockpos.getY() > 0)
                {
                    world.setBlockState(blockpos.up(), state); //Forge: Fix loss of state information during world gen.
                }
            }
        }
    }
}