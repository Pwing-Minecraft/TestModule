package net.pwing.races.module.testmodule;

import net.pwing.races.api.module.RaceModule;

public class TestModule extends RaceModule {

    @Override
    public void onEnable() {
        plugin.getLogger().info("Test module loaded!");
    }

    @Override
    public void onDisable() {
        plugin.getLogger().info("Test module disabled!");
    }
}
