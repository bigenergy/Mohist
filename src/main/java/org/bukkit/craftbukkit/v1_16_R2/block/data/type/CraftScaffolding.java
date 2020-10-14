package org.bukkit.craftbukkit.v1_16_R2.block.data.type;

import org.bukkit.block.data.type.Scaffolding;
import org.bukkit.craftbukkit.v1_16_R2.block.data.CraftBlockData;

public abstract class CraftScaffolding extends CraftBlockData implements Scaffolding {

    private static final net.minecraft.state.BooleanProperty BOTTOM = getBoolean("bottom");
    private static final net.minecraft.state.IntegerProperty DISTANCE = getInteger("distance");

    @Override
    public boolean isBottom() {
        return get(BOTTOM);
    }

    @Override
    public void setBottom(boolean bottom) {
        set(BOTTOM, bottom);
    }

    @Override
    public int getDistance() {
        return get(DISTANCE);
    }

    @Override
    public void setDistance(int distance) {
        set(DISTANCE, distance);
    }

    @Override
    public int getMaximumDistance() {
        return getMax(DISTANCE);
    }
}