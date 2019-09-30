# TestModule

This module serves as an example module for the [Pwing Races](https://www.spigotmc.org/resources/67808/) plugin. This is so developers interested in creating modules have a basic example of where to start and how to make them.

Pwing Races comes with a fully-fledged [developer API](https://github.com/Pwing-Minecraft/PwingRaces-API) with documentation and a wiki explaining everything in more detail. So with this being said, you can still develop modules without actually owning the plugin. If you do own the plugin and want to use the actual jar instead of just the API, you do have to manually add it to the maven build path using the command below:

```
mvn install:install-file -Dpackaging=jar -Dfile=[../path/to/jar] -DgroupId=net.pwing.races -DartifactId=PwingRaces -Dversion=[version]
```

The actual code within the plugin does not have documentation, meaning that if you want to use a specific function not present in the API (which is highly unlikely), you will have to figure this out yourself or get support on our [Discord server](https://discord.gg/jn2GAjz). The internal code is structured very similar to the API and should not really need to be used.
