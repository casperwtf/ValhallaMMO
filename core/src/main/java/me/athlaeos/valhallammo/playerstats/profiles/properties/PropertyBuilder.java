package me.athlaeos.valhallammo.playerstats.profiles.properties;

import me.athlaeos.valhallammo.playerstats.format.StatFormat;

public class PropertyBuilder {
    private boolean addWhenMerged = true;
    private boolean shouldPrioritizePositive = true;
    private StatFormat format = null;
    private boolean generatePerkRewards = false;
    private double min = Double.NaN;
    private double max = Double.NaN;

    public PropertyBuilder mergePrioritizePositive(boolean positive) {
        this.addWhenMerged = false;
        this.shouldPrioritizePositive = positive;
        return this;
    }

    public PropertyBuilder format(StatFormat format) {
        this.format = format;
        return this;
    }

    public PropertyBuilder perkReward() {
        this.generatePerkRewards = true;
        return this;
    }
    public PropertyBuilder min(double min){
        this.min = min;
        return this;
    }

    public PropertyBuilder max(double max){
        this.max = max;
        return this;
    }

    public StatProperties create() {
        return new StatProperties(
                addWhenMerged,
                shouldPrioritizePositive,
                format,
                generatePerkRewards,
                min,
                max
        );
    }
}