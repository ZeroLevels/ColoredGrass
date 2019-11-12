package com.lazynessmind.coloredgrass.proxy;

import com.lazynessmind.coloredgrass.ColoredGrassBlock;
import com.lazynessmind.coloredgrass.ColoredGrassItem;
import com.lazynessmind.coloredgrass.ModSetup;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class ClientProxy implements IProxy{

    @Override
    public void init() {

        for(Block block : ModSetup.BLOCKS){
            if(block instanceof ColoredGrassBlock){
                Minecraft.getInstance().getBlockColors().register((blockState, iEnviromentBlockReader, blockPos, i) -> {
                    return ((IBlockColor) blockState.getBlock()).getColor(blockState, iEnviromentBlockReader, blockPos, i);
                }, block);
            }
        }

        for(Item item : ModSetup.ITEMS){
            if(item instanceof ColoredGrassItem){
                Minecraft.getInstance().getItemColors().register((stack, i) -> {
                    return ((IItemColor) stack.getItem()).getColor(stack, i);
                }, item);
            }
        }
    }

    @Override
    public PlayerEntity getClientEntity() {
        return Minecraft.getInstance().player;
    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
