package com.lazynessmind.coloredgrass;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IEnviromentBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

import javax.annotation.Nullable;

public class ColoredGrassBlock extends GrassBlock implements IBlockColor, IGrowable {

    public MaterialColor color;

    public ColoredGrassBlock(MaterialColor color, String name) {
        super(Block.Properties.create(Material.ORGANIC, color).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT));
        setRegistryName(name);
        ModSetup.BLOCKS.add(this);
        this.color = color;
    }

    @Override
    public boolean canSustainPlant(BlockState p_canSustainPlant_1_, IBlockReader p_canSustainPlant_2_, BlockPos p_canSustainPlant_3_, Direction p_canSustainPlant_4_, IPlantable p_canSustainPlant_5_) {
        return true;
    }

    @Override
    public int getColor(BlockState blockState, @Nullable IEnviromentBlockReader iEnviromentBlockReader, @Nullable BlockPos blockPos, int i) {
        return color.colorValue;
    }

    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        if (state.getBlock() != newState.getBlock()) {
            if(!ColoredGrass.proxy.getClientEntity().isCreative()){
                if(EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, ColoredGrass.proxy.getClientEntity().getHeldItem(Hand.MAIN_HAND)) > 0){
                    InventoryHelper.spawnItemStack(worldIn, pos.getX(), pos.getY()+0.5, pos.getZ(), new ItemStack(Item.getItemFromBlock(this)));
                } else {
                    InventoryHelper.spawnItemStack(worldIn, pos.getX(), pos.getY()+0.5, pos.getZ(), new ItemStack(Item.getItemFromBlock(Blocks.DIRT)));
                }
            }
        }
        super.onReplaced(state, worldIn, pos, newState, isMoving);
    }
}
