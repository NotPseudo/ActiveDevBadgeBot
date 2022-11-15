package me.notpseudo.listeners;

import org.javacord.api.DiscordApi;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.interaction.SlashCommandCreateEvent;
import org.javacord.api.interaction.SlashCommandInteraction;
import org.javacord.api.listener.interaction.SlashCommandCreateListener;

import java.awt.*;

public class BasicCommandListener implements SlashCommandCreateListener {

    public BasicCommandListener(DiscordApi api) {

    }

    @Override
    public void onSlashCommandCreate(SlashCommandCreateEvent createEvent) {
        SlashCommandInteraction interaction = createEvent.getSlashCommandInteraction();
        switch (interaction.getCommandName()) {
            case "info" -> {
                EmbedBuilder embed = new EmbedBuilder()
                        .setAuthor("ActiveDevBadgeBot", "https://discord.com/api/oauth2/authorize?client_id=1041572118111985825&permissions=139586817089&scope=bot", "https://images-ext-2.discordapp.net/external/p1ax2MSNarmXTIlhApODOTtcH3Ma5b5-kc3_0XDuIHc/%3Fsize%3D4096/https/cdn.discordapp.com/avatars/1041572118111985825/cb2ab261f9b17ab1b6e8efef3da53085.png")
                        .setTitle("ActiveDevBadge Info")
                        .setDescription("This is an information panel for the ActiveDevBadge bot and Discord's Active Developer Badge\nA formatted README with images that might be easier to follow can be found on the bot's GitHub repo https://github.com/NotPseudo/ActiveDevBadgeBot")
                        .addField("1. How do I use ActiveDevBadge?", """
                                **Step 1: Set up a new Discord bot token**
                                > a) Visit the Discord Developer Portal https://discord.com/developers/applications and create a New Application.
                                > b) Find the Bot tab and Add Bot. Regenerate and copy the bot token.
                                > c) Go to the OAuth2 URL Generator. Select bot scope and give it any permissions. Copy the URL and paste it to invite the bot to a server

                                **Step 2: Use ActiveDevBadge**
                                > a) Run the /badgebot command and enter the bot token you copied. It should tell you once the bot has started
                                > b) Go to YOUR bot and run the /badge command from it
                                > c) Wait about 24 hours for Discord to recognize the command before visiting the Active Developer Portal https://discord.com/developers/active-developer to claim the badge""")
                        .addField("2. What is the Active Developer Badge?", "The Active Developer Badge is a profile badge that Discord rolled out for all Discord developers that own an active bot. For a bot to be considered active, it must have received a global slash command in the past 30 days. You can read more about it on Discord's article about it here https://support-dev.discord.com/hc/en-us/articles/10113997751447")
                        .addField("3. What is the ActiveDevBadge Bot?", "This bot has a simple command that will help you get your Active Developer Badge. Follow the directions to run the </badgebot:0> command with your bot token to get started on your way to earn the badge")
                        .addField("4. Why does it need my bot token?", "You must own a bot that has received a global slash command in the past 30 days. It needs a bot token that **YOU** own so **YOU** can be detected and earn the badge. The ActiveDevBadge Bot uses your token to temporarily start a bot with a simple badge command. You run this command to meet the requirements")
                        .addField("5. Can I trust it with my token?", "Yes, ActiveDevBadge does not store, track, share, or leak your bot token. It is used only to temporarily start a bot. You can always regenerate the token after you run the commands. If you would like to see the source code, check the GitHub Repo https://github.com/NotPseudo/ActiveDevBadgeBot")
                        .addField("6. What if I still don't trust it?", "That's completely fair, and you should almost never share your token. We do recommend you learn how to actually develop the bot yourself or follow a guide on how to do so. If you would still like to earn the badge, create a Discord bot with a global slash command. If you don't know how to do that, check out this GitHub repo https://github.com/NotPseudo/YourOwnBot and follow the directions. Keep in mind that you will have to compile/run the code yourself if you choose not to use ActiveDevBadge commands")
                        .addField("7. Is this allowed by Discord?", "That's a gray area. This bot is use at your own risk. The requirements Discord set for this bot are very lenient (just own an app that executed a command in the past 30 days), and they don't provide any extra Terms and Conditions. If you are hesitant about using ActiveDevBadge, you can always write a bot yourself or follow the guide repo linked in question 6 above. You can always read the Discord Developer Terms of Service https://discord.com/developers/docs/policies-and-agreements/developer-terms-of-service")
                        .addField("8. Other Info", "GitHub Repo for this Bot: https://github.com/NotPseudo/ActiveDevBadgeBot")
                        .setColor(Color.GREEN)
                        .setThumbnail("https://images-ext-2.discordapp.net/external/p1ax2MSNarmXTIlhApODOTtcH3Ma5b5-kc3_0XDuIHc/%3Fsize%3D4096/https/cdn.discordapp.com/avatars/1041572118111985825/cb2ab261f9b17ab1b6e8efef3da53085.png")
                        .setImage("https://support-dev.discord.com/hc/article_attachments/10113142990487")
                        .setFooter("Made by Yume#0505", "https://images-ext-1.discordapp.net/external/-yHIs8yxbMiU0dFfvwaqA0e5ws_O9oq2XgyTe9Q8h2Q/%3Fsize%3D4096/https/cdn.discordapp.com/avatars/327932250115145739/833dd829b4f0007c54c9ac7fe1da04f3.png");
                interaction.getChannel().ifPresent(c -> c.sendMessage(embed));
            }
        }
    }
}