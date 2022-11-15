package me.notpseudo;

import io.github.cdimascio.dotenv.Dotenv;
import me.notpseudo.listeners.BadgeBotCommandListener;
import me.notpseudo.listeners.BasicCommandListener;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.interaction.SlashCommand;
import org.javacord.api.interaction.SlashCommandOption;
import org.javacord.api.interaction.SlashCommandOptionType;

import java.util.Arrays;
import java.util.concurrent.CompletionException;

/**
 * @author NotPseudo
 */
public class ActiveDevBadgeBot {

    private static final String TOKEN;

    static {
        Dotenv dotenv = Dotenv.load();
        TOKEN = dotenv.get("TOKEN");
    }

    /**
     * main method that will run the Discord Bot
     */
    public static void main(String[] args) {
        if (TOKEN == null) {
            return;
        }
        try {
            DiscordApi api = new DiscordApiBuilder().setToken(TOKEN).addListener(BadgeBotCommandListener::new).addListener(BasicCommandListener::new).login().join();
            SlashCommand.with("badgebot", "Run this command in DMs to temporarily start your bot with a slash command",
                            Arrays.asList(
                                    SlashCommandOption.create(SlashCommandOptionType.STRING, "token", "Your bot token that will activate temporarily", true)
                            )
                    )
                    .createGlobal(api)
                    .join();
            SlashCommand.with("info", "Shows information about what this bot does").createGlobal(api).join();
        } catch (CompletionException ce) {
            System.out.println("\u001B[31mThere was an issue trying to log in to your bot");
        }
    }

}