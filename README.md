# LunaGC-4.7.0

[简中](docs/README_zh-CN.md)

My Discord https://discord.gg/8vSyTHVphj

Please contribute actively to this repository

# Setup Guide

This guide is very minimal and contains steps to just get your server and client up and running.
However, if you need a more detailed guide and help with the server please refer to GrassCutter's official repository and discord server.


## You'll need a proxy to connect to the server.
- This tutorial uses fiddler, check this [video tutorial](https://gi2.pmagickline.xyz/other/tutorials/EN/fiddler.mp4) to set it up if you don't know how.
- The script can be found in the docs folder, or by [this link](https://github.com/Kei-Luna/LunaGC_4.7.0/blob/main/docs/fiddlerscript.txt).

## Read the handbook (found at the end of the file)
## Some stuff mentioned here (such as wishing etc.) will not work.

## Main Requirements

- Get [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Get [MongoDB Community Server](https://www.mongodb.com/try/download/community)
- Get [NodeJS](https://nodejs.org/dist/v20.15.0/node-v20.15.0-x64.msi)
- Get game version REL4.7.0 (If you don't have a 4.7.0 client, you can find it here along with the audio files) :


| Download link | Package size | MD5 checksum |
| :---: | :---: | :---: |
| [GenshinImpact_4.7.0.zip.001](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.001) | 10.0 GB | 0790ed842a1732fb9e5530a826828440 |
| [GenshinImpact_4.7.0.zip.002](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.002) | 10.0 GB | 6ac391b6a3a185bc8ab1e431f67ecd25 |
| [GenshinImpact_4.7.0.zip.003](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.003) | 10.0 GB | 36460a467de4901f517f8ed9be6b877c |
| [GenshinImpact_4.7.0.zip.004](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.004) | 10.0 GB | d1c0d81ab7aff5d5fb490cff20b9b87f |
| [GenshinImpact_4.7.0.zip.005](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.005) | 10.0 GB | fec57d6f7f78c04309f16dfc2207cd6f |
| [GenshinImpact_4.7.0.zip.006](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.006) | 6.70 GB | 84135fa7008156965514a6ec99c55c66 |
| [Audio_Chinese_4.7.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/Audio_Chinese_4.7.0.zip) | 13.6 GB | 974bc5df3f7d96de01b68f1aab0371e5 |
| [Audio_English(US)_4.7.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/Audio_English(US)_4.7.0.zip) | 15.9 GB | f577ea4624981b36789e24913d0f3745 |
| [Audio_Japanese_4.7.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/Audio_Japanese_4.7.0.zip) | 17.8 GB | f039da619e670259d7e57c4f5e84be9e |
| [Audio_Korean_4.7.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/Audio_Korean_4.7.0.zip) | 13.4 GB | 58c3fc8782f3d59b324dfd603fa93e6d |


- Make sure to install java and set the environment variables.
- Build the server (refer to "Compile the actual server" in this guide.)
- Put [mhypbase.dll](https://github.com/Kei-Luna/LunaGC_4.7.0/raw/main/path/mhypbase.dll) and [version.dll](https://github.com/Kei-Luna/LunaGC_4.7.0/raw/main/path/version.dll) in the local game root directory
- Put [mihoyonet.dll](https://github.com/Kei-Luna/LunaGC_4.7.0/raw/main/path/mihoyonet.dll) in the GenshinImpact_Data/Plugins/ directory and replace it
- Download the [Resources](https://gi2.pmagickline.xyz/other/game-data/4.7/resources.zip), make a new folder called `resources` in the downloaded LunaGC folder and then extract the resources in that new folder.
- Set useEncryption, Questing and useInRouting to false (it should be false by default, if not then change it)
- Start the server and the game, make sure to also create an account in the LunaGC console!
- Have fun

## Important!
- If you use cultivation and you know what you are doing please disable the automatically patch RSA option in settings! (I recommend to use NotThorny's Cultivation modification if you really want to use Cultivation) Cultivation will automatically patch the game either with a 4.0 or 4.6 patch which is not good because LunaGC is 4.7. So, uncheck automatically patch RSA in settings and then place the rsa patch dll again in the game folder if Cultivation has gotten rid of it.

### Compile the actual Server

**Sidenote**: Make sure to append the right prefix and suffix based on your operating system (./ for linux | .\ for windows | add .bat for windows systems when compiling server JAR/handbook).

**Requirements**:

[Java Development Kit 17 | JDK](https://oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or higher

- **Sidenote**: Handbook generation may fail on some systems. To disable handbook generation, append `-PskipHandbook=1` to the `gradlew jar` command.

- **For Windows**:
```shell
.\gradlew.bat
.\gradlew.bat jar
```
*If you are wondering, the first command is to set up the environment while the 2nd one is for building the server JAR file.*

- **For Linux**:
```bash
chmod +x gradlew
./gradlew jar
```
*If you are wondering, the first command is to make the file executeable and for the rest refer to the windows explanation.*

### You can find the output JAR in the project root folder.

### Manually compile the handbook
```shell
./gradlew generateHandbook
```

## Troubleshooting
- Make sure to set useEncryption and useInRouting both to false otherwise you might encounter errors.
- To use windy make sure that you put your luac files in C:\Windy (make the folder if it doesnt exist)
- If you get an error related to MongoDB connection timeout, check if the mongodb service is running. On windows: Press windows key and r then type `services.msc`, look for mongodb server and if it's not started then start it by right clicking on it and start. On linux, you can do `systemctl status mongod` to see if it's running, if it isn't then type `systemctl start mongod`. However, if you get error 14 on linux change the owner of the mongodb folder and the .sock file (`sudo chown -R mongodb:mongodb /var/lib/mongodb` and `sudo chown mongodb:mongodb /tmp/mongodb-27017.sock` then try to start the service again.)


## How to make or get custom banners?
- Well, you can get pre-made ones from this [github repo](https://github.com/Zhaokugua/Grasscutter_Banners)
- Rename the file you chose to download to Banners.json and replace it with the already-existing one in the data folder.
- The repo also offers a file which contains all of the banners, to use it follow the same procedure mentioned above.
### Making custom banners
- If you want to make a custom banner for a character or weapon, you'll need to know the prefabPath, the titlePath and the character/item IDs.
- Fun fact: You can set any item to be on the rateUp, even if it's a 4* instead of a 5*.

## Handmade Handbook (tested)
- Create accounts: /account <username>
- Get all achievements: /am grantall
- God mode: /prop god 1
- Enter a domain: /dungeon <ID>
- Unlimited stamina: /prop ns 0
- Unlimited energy: /prop UnlimitedEnergy 1
- Recharge energy: /er
- Set constellation for selected character: /setConst <number 1 to 6>
- Get rid of the skill cooldown: /stat cdr 99
- Change weather: /weather <sunny/rain/cloudy/thunderstorm/snow/mist>
- Change talent for selected character: /talent <n/e/q/all> <level> (n - normal attack only) (e - skill only) (q - burst only)
- Give items: /g <itemId|avatarId|all|weapons|mats|avatars> [lv<number>] [r<refinement number>] [x<amount>] [c<constellation number>] [sl<skilllevel>]
- Unlock all: /unlockall
- Change world level: /prop wl <number>
- Change AR: /prop player_level <number between 1 and 60>
- Change the game speed: /gamespeed <0.1|0.2|0.5|0.75|1.0|1.5|2.0|3.0>
- Get 9999 Intertwined fates: /g 223 x9999
- Get 9999 Acquaint fates: /g 224 x9999
- Get 9999 Mora: /g 202 x9999
- Get 9999 Primogems: /g 201 x9999
### Make sure to not include <> or [] in the commands! The stuff in <> means its required and the stuff in [] means its not required.
### How to get all of the stuff maxed out: /g all lv90 r5 c6 c6 sl10 | Then do a separate one for the materials: /g mats x99999
### Ways to TP around the map:

Method 1:

- 1: Unlock the map: /prop um 1
- 2: Open the map
- 3: Use the waypoints

Method 2:

- 1: Open the map
- 2: Place a fishing rod marker (the last one) where you want to teleport and mark it.
### How to get avatar/entity/material etc. IDs?
- Go to [ambr.top](https://ambr.top)
- Search up the material/avatar/enemy and then the ID of it should be in the URL of the site, for example I searched for the pyro hilichurl archer; the link for it is ambr.top/en/archive/monster/21010501/pyro-hilichurl-shooter so the ID for it will be 21010501.


### How to spawn monsters?
- Get the ID from the ambr.top link (above)
- Do /spawn <id> in the in-game chat. You can also find out more arguments that you can use to modify the monster hp etc by doing `/help spawn` or `/spawn` | Example: `/spawn 21010501`, that will spawn a pyro hilichurl. Give it more hp: `/spawn 21010501 hp9999` and you can find more about the arguments trough the method I mentioned above.

### How to use the brand new /uid command?
- Rich text is supported
- How to set custom UID: `/uid set changethistext` | bold: `/uid set <b>changethistext</b>` | italic: `/uid set <i>changethistext</i>` | combined: `/uid set <i><b>changethistext</b></i>` | colored text (you'll need a hex color code, you can easy get and pick one by search hex color picker on google now let's assume that you have done it): `/uid set <color=#698ae8>changethistext</color>`
- You can also include spaces like this: `/uid set <b>B O L D</b>`
- You can combine the bold, italic and colored text
- Restore to server-default UID: `/uid default`

## What doesn't work
- Wishing
- Quests
- Serenitea pot
- Abyss
- Mail
- Battlepass
- Events
- Claiming AR/Commission rewards
- Claiming bosses drops
- City reputation
- Character ascension
- Gadgets
- Forging
- Some inventory stuff
- Weapon refinement
- Registration in-game using the box when logging in for first time (use console to make account instead)
### Even more
