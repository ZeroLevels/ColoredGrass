package com.lazynessmind.coloredgrass.proxy;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public interface IProxy {

    void init();
    PlayerEntity getClientEntity();
    World getClientWorld();
}
