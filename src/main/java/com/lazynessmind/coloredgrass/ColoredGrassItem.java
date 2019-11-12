package com.lazynessmind.coloredgrass;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ColoredGrassItem extends BlockItem implements IItemColor {

    public ColoredGrassItem(Block block) {
        super(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
        setRegistryName(block.getRegistryName());
        ModSetup.ITEMS.add(this);
    }

    @Override
    public int getColor(ItemStack itemStack, int i) {
        return ((ColoredGrassBlock) getBlock()).color.colorValue;
    }
}
