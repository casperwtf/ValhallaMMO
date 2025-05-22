package me.athlaeos.valhallammo.playerstats.profiles.properties;

import me.athlaeos.valhallammo.playerstats.format.StatFormat;

public record StatProperties(
        boolean addWhenMerged,
        boolean shouldPrioritizePositive,
        StatFormat format,
        boolean generatePerkRewards,
        double min,
        double max
) {
    public StatFormat getFormat() {
        return format;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
}