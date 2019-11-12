package com.lazynessmind.coloredgrass.proxy;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ServerProxy implements IProxy{

    @Override
    public void init() {

    }

    @Override
    public PlayerEntity getClientEntity() {
        return null;
    }

    @Override
    public World getClientWorld() {
        return null;
    }
}
