# Gaming Chair Client 
[![State-of-the-art Shitcode](https://img.shields.io/static/v1?label=State-of-the-art&message=Shitcode&color=7B5804)](https://github.com/trekhleb/state-of-the-art-shitcode)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/jwaxy/GamingChairClient)
![GitHub lines of code](https://tokei.rs/b1/github/jwaxy/GamingChairClient)
![Minecraft](https://img.shields.io/badge/game-Minecraft-brightgreen)  
A free mixin-based injection hacked-client for Minecraft using Minecraft Forge based on FDP Client that is based on LiquidBounce.

Website: [jwaxy.is-a.dev/GamingChairClient](http://gg.gg/GamingChairClient)  
Latest [github-actions](https://nightly.link/jwaxy/GamingChairClient/workflows/build/main/GamingChairClient.zip)  
Discord: [dsc.gg](https://dsc.gg)

## Setting up a Workspace
Gaming Chair Client uses gradle, so make sure that it is installed properly. Instructions can be found on [Gradle's website](https://gradle.org/install/).
1. Clone the repository using `git clone https://github.com/jwaxy/GamingChairClient.git` (Make sure you have git or Github Desktop installed on your system).
2. CD into the local repository folder.
3. If you are using Intelij run the following command `gradlew --debug setupDevWorkspace idea genIntellijRuns build`
4. Open the folder as a Gradle project in your IDE. (Make sure that your IDE is using Java 8, if not then it will have issues)
5. Select the Forge run configuration.
### Troubleshooting Workspace Errors
If you get a "cannot find forgebin" error, download forge 1.8.9 universal from the forge site and place it in `./Gaming Chair Client-main/.gradle/minecraft`