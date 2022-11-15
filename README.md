# ActiveDevBadge
## [Invite Link](https://discord.com/api/oauth2/authorize?client_id=1041572118111985825&permissions=139586817089&scope=bot)

---

## Discord Active Developer Badge
This bot is a Discord bot written with Java using the [JavaCord](https://javacord.org) library. It provides convenient commands for you to earn the Discord Active Developer Badge without having to write out the code for a Discord bot with slash commands yourself.

![Claimed Active Developer Badge](https://support-dev.discord.com/hc/article_attachments/10113142990487)

---

## How to Use
### Step 1: Preparing Your Bot Token
You will need to own a Discord Bot ready with a token. Do not use a bot you do not own, and do not use a bot that already has another purpose. Try to create a new bot for this.
Visit the [Discord Developer Portal](https://discord.com/developers/applications) to create a New Application

![New App Button](https://imgur.com/8gTE7cp.png)
![Create New App](https://imgur.com/Z3bxJ81.png)
- Find the "Bot" tab on the left side and click "Add Bot"

![Bot Tab](https://imgur.com/eWg0q4p.png)
![Add Bot](https://imgur.com/ZnbHYO3.png)
- In the "Bot" tab, click "Reset Token" and copy it. You will need this to run your bot.

![Reset Token](https://imgur.com/IqFxi8Q.png)
![Copy Token](https://imgur.com/6WbtOFi.png)
- Find the "OAuth2" tab and go to "URL Generator"
- Under "scopes" select "bot"
- Under "bot permissions" you can just select "Administrator"

![OAuth2 Link](https://imgur.com/tmsRmVe.png)
- Copy the Generated URL and open it to invite the bot to a server you manage and feel comfortable having the bot in. You can always kick the bot after you get the badge.

### Step 2: Use the ActiveDevBadge Bot
- Run the /badgebot command with your token you copied. It should tell you once the bot starts

![badgebot command](https://imgur.com/qgCJVFP.png)
![badgebot success](https://imgur.com/CDUmWdn.png)
- Go to your bot and run the /badge command from it. It will let you know if everything's successful

![badge command](https://imgur.com/Wc1IPXb.png)
![badge success](https://imgur.com/nbuSKwW.png)
- Wait about 24 hours for Discord to recognize your bot and global command
- Visit the [Active Developer Badge Page](https://discord.com/developers/active-developer) to claim your badge

---

## What is the Active Developer Badge?
The Active Developer Badge is a profile badge that Discord launched for all Discord developers who own an active application. For an app to be considered active, it must have executed a command in the past 30 days. You can read more about it on [Discord's article](https://support-dev.discord.com/hc/en-us/articles/10113997751447)

---

## What is the ActiveDevBadge Bot?
This bot has simple commands that will help you get your Active Developer Badge. Follow the directions to run the **/badgebot** command with your bot token and get started on your way to earn the badge

---

## Why does it need my bot token?
You must own an app that has executed a command in the past 30 days. It needs a bot token that **YOU** own so **YOU** can be detected and earn the badge. The ActiveDevBadge Bot uses your token to temporarily start a bot with a simple slash command. You run this command to meet the requirements

---

## Can I trust it with my token?
Yes, ActiveDevBadge does not store, track, share, or leak your bot token. It is used only to temporarily start a bot. You can always regenerate the token after you run the commands. If you would like to see the source code, check this current [GitHub Repo](https://github.com/NotPseudo/ActiveDevBadgeBot)

---

## What if I still don't trust it?
That's completely fair, and you should almost never share your token. We do recommend you learn how to actually develop the bot yourself or follow a guide on how to do so. If you would still like to earn the badge, create a Discord bot with a global slash command. If you don't know how to do that, check out this [Guide Repo](https://github.com/NotPseudo/YourOwnBot) and follow the directions. Keep in mind that you will have to compile/run the code yourself if you choose not to use ActiveDevBadge commands

---

## Is this allowed by Discord?
That's a gray area. This bot is use at your own risk. The requirements Discord set for this bot are very lenient (just own an app that executed a command in the past 30 days), and they don't provide any extra Terms and Conditions. If you are hesitant about using ActiveDevBadge, you can always develop a bot yourself or follow the Guide Repo linked in question 6 above. You can always check the [Discord Developer Terms of Service](https://discord.com/developers/docs/policies-and-agreements/developer-terms-of-service)