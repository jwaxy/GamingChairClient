# Gaming Chair Client 
[![State-of-the-art Shitcode](https://img.shields.io/static/v1?label=State-of-the-art&message=Shitcode&color=7B5804)](https://github.com/trekhleb/state-of-the-art-shitcode)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/jwaxy/GamingChairClient)
![GitHub lines of code](https://tokei.rs/b1/github/jwaxy/GamingChairClient)
![Minecraft](https://img.shields.io/badge/game-Minecraft-brightgreen)  
A free mixin-based injection hacked-client for Minecraft using Minecraft Forge based on FDP Client that is based on LiquidBounce.

Website: [jwaxy.is-a.dev/GamingChairClient](http://gg.gg/GamingChairClient)  
Latest [github-actions](https://nightly.link/jwaxy/GamingChairClient/workflows/build/main/GamingChairClient.zip)  
Discord: [dsc.gg](https://dsc.gg)


# Below is Information useful for contributing to Gaming Chair Client

## Setting up a Workspace
[Click for intructions](WORKSPACE.md)

## Additional Libraries
### Mixins
Mixins can be used to modify classes at runtime before they are loaded. Gaming Chair Client uses them to inject its code into the Minecraft client. This way, we do not have to ship Mojang's copyrighted code. If you want to learn more about it, check out their [documentation](https://docs.spongepowered.org/5.1.0/en/plugin/internals/mixins.html).

## Contributions
We welcome contributions, but you have to follow the following rules in order for us to merge your pull request.

You can make a pull request [here](https://github.com/jwaxy/GamingChairClient/issues)!

### Language and Code Quality
Your code needs to be able to be built, also please ensure your code has little to no bugs.
You also need to use kotlin features to make coding easier and faster, so please use kotlin and make sure you pass the [Detekt](https://github.com/detekt/detekt) code quality check, if you can, make sure to use kotlin features.

#### Kotlin Features
If applicable please use kotlin since it is more human readable, we have provided an example below of kotlin:

Using kotlin features:
~~~kotlin
Timer().schedule(2000L) { 
    // your code
}
~~~
Not using kotlin features:
~~~kotlin
Timer().schedule(object : TimerTask() {
    override fun run() {
        // your code
    }
}, 2000L)
~~~

### About Skidding
Please use original code if you can and do not directly steal code, however we welcome skidding with a packet logger or anything similar in order to skid from a closed source client, and making the cheating community more open!

### Useless Features
Useless features are features only you think are useful, and/or features that can be added with a config change.  
Like the "Timer" option to InfiniteAura, this feature can be added by binding Timer to the same key as the one in InfiniteAura, or by using the macro system in  Gaming Chair Client.
