package com.lazynessmind.coloredgrass;

import net.minecraft.block.Block;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = ColoredGrass.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModSetup {

    public static List<Block> BLOCKS = new ArrayList<>();
    public static List<Item> ITEMS = new ArrayList<>();

    @ObjectHolder("coloredgrass:colored_grass_white")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_WHITE = new ColoredGrassBlock(MaterialColor.SNOW, "colored_grass_white");
    @ObjectHolder("coloredgrass:colored_grass_orange")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_ORANGE = new ColoredGrassBlock(MaterialColor.ADOBE, "colored_grass_orange");
    @ObjectHolder("coloredgrass:colored_grass_magenta")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_MAGENTA = new ColoredGrassBlock(MaterialColor.MAGENTA, "colored_grass_magenta");
    @ObjectHolder("coloredgrass:colored_grass_light_blue")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_LIGHT_BLUE = new ColoredGrassBlock(MaterialColor.LIGHT_BLUE, "colored_grass_light_blue");
    @ObjectHolder("coloredgrass:colored_grass_yellow")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_YELLOW = new ColoredGrassBlock(MaterialColor.YELLOW, "colored_grass_yellow");
    @ObjectHolder("coloredgrass:colored_grass_lime")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_LIME = new ColoredGrassBlock(MaterialColor.LIME, "colored_grass_lime");
    @ObjectHolder("coloredgrass:colored_grass_pink")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_PINK = new ColoredGrassBlock(MaterialColor.PINK, "colored_grass_pink");
    @ObjectHolder("coloredgrass:colored_grass_gray")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_GRAY = new ColoredGrassBlock(MaterialColor.GRAY, "colored_grass_gray");
    @ObjectHolder("coloredgrass:colored_grass_light_gray")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_LIGHT_GRAY = new ColoredGrassBlock(MaterialColor.LIGHT_GRAY, "colored_grass_light_gray");
    @ObjectHolder("coloredgrass:colored_grass_cyan")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_CYAN = new ColoredGrassBlock(MaterialColor.CYAN, "colored_grass_cyan");
    @ObjectHolder("coloredgrass:colored_grass_purple")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_PURPLE = new ColoredGrassBlock(MaterialColor.PURPLE, "colored_grass_purple");
    @ObjectHolder("coloredgrass:colored_grass_blue")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_BLUE = new ColoredGrassBlock(MaterialColor.BLUE, "colored_grass_blue");
    @ObjectHolder("coloredgrass:colored_grass_brown")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_BROWN= new ColoredGrassBlock(MaterialColor.BROWN, "colored_grass_brown");
    @ObjectHolder("coloredgrass:colored_grass_green")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_GREEN = new ColoredGrassBlock(MaterialColor.GREEN, "colored_grass_green");
    @ObjectHolder("coloredgrass:colored_grass_red")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_RED = new ColoredGrassBlock(MaterialColor.RED, "colored_grass_red");
    @ObjectHolder("coloredgrass:colored_grass_black")
    public static ColoredGrassBlock COLORED_GRASS_BLOCK_BLACK = new ColoredGrassBlock(MaterialColor.BLACK, "colored_grass_black");

    @ObjectHolder("coloredgrass:colored_grass_white")
    public static ColoredGrassItem COLORED_GRASS_ITEM_WHITE = new ColoredGrassItem(COLORED_GRASS_BLOCK_WHITE);
    @ObjectHolder("coloredgrass:colored_grass_orange")
    public static ColoredGrassItem COLORED_GRASS_ITEM_ORANGE = new ColoredGrassItem(COLORED_GRASS_BLOCK_ORANGE);
    @ObjectHolder("coloredgrass:colored_grass_magenta")
    public static ColoredGrassItem COLORED_GRASS_ITEM_MAGENTA = new ColoredGrassItem(COLORED_GRASS_BLOCK_MAGENTA);
    @ObjectHolder("coloredgrass:colored_grass_light_blue")
    public static ColoredGrassItem COLORED_GRASS_ITEM_LIGHT_BLUE = new ColoredGrassItem(COLORED_GRASS_BLOCK_LIGHT_BLUE);
    @ObjectHolder("coloredgrass:colored_grass_yellow")
    public static ColoredGrassItem COLORED_GRASS_ITEM_YELLOW = new ColoredGrassItem(COLORED_GRASS_BLOCK_YELLOW);
    @ObjectHolder("coloredgrass:colored_grass_lime")
    public static ColoredGrassItem COLORED_GRASS_ITEM_LIME = new ColoredGrassItem(COLORED_GRASS_BLOCK_LIME);
    @ObjectHolder("coloredgrass:colored_grass_pink")
    public static ColoredGrassItem COLORED_GRASS_ITEM_PINK = new ColoredGrassItem(COLORED_GRASS_BLOCK_PINK);
    @ObjectHolder("coloredgrass:colored_grass_gray")
    public static ColoredGrassItem COLORED_GRASS_ITEM_GRAY = new ColoredGrassItem(COLORED_GRASS_BLOCK_GRAY);
    @ObjectHolder("coloredgrass:colored_grass_light_gray")
    public static ColoredGrassItem COLORED_GRASS_ITEM_LIGHT_GRAY = new ColoredGrassItem(COLORED_GRASS_BLOCK_LIGHT_GRAY);
    @ObjectHolder("coloredgrass:colored_grass_cyan")
    public static ColoredGrassItem COLORED_GRASS_ITEM_CYAN = new ColoredGrassItem(COLORED_GRASS_BLOCK_CYAN);
    @ObjectHolder("coloredgrass:colored_grass_purple")
    public static ColoredGrassItem COLORED_GRASS_ITEM_PURPLE = new ColoredGrassItem(COLORED_GRASS_BLOCK_PURPLE);
    @ObjectHolder("coloredgrass:colored_grass_blue")
    public static ColoredGrassItem COLORED_GRASS_ITEM_BLUE = new ColoredGrassItem(COLORED_GRASS_BLOCK_BLUE);
    @ObjectHolder("coloredgrass:colored_grass_brown")
    public static ColoredGrassItem COLORED_GRASS_ITEM_BROWN= new ColoredGrassItem(COLORED_GRASS_BLOCK_BROWN);
    @ObjectHolder("coloredgrass:colored_grass_green")
    public static ColoredGrassItem COLORED_GRASS_ITEM_GREEN = new ColoredGrassItem(COLORED_GRASS_BLOCK_GREEN);
    @ObjectHolder("coloredgrass:colored_grass_red")
    public static ColoredGrassItem COLORED_GRASS_ITEM_RED = new ColoredGrassItem(COLORED_GRASS_BLOCK_RED);
    @ObjectHolder("coloredgrass:colored_grass_black")
    public static ColoredGrassItem COLORED_GRASS_ITEM_BLACK = new ColoredGrassItem(COLORED_GRASS_BLOCK_BLACK);

    @SubscribeEvent
    public static void onBlockInit(final RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onItemInt(final RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
    }
}
