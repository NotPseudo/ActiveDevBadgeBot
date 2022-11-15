package me.notpseudo.listeners;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.event.interaction.SlashCommandCreateEvent;
import org.javacord.api.interaction.SlashCommand;
import org.javacord.api.interaction.SlashCommandInteraction;
import org.javacord.api.interaction.SlashCommandInteractionOption;
import org.javacord.api.interaction.callback.InteractionOriginalResponseUpdater;
import org.javacord.api.listener.interaction.SlashCommandCreateListener;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CompletionException;

public class BadgeBotCommandListener implements SlashCommandCreateListener {

    private final DiscordApi API;

    public BadgeBotCommandListener(DiscordApi api) {
        API = api;
    }

    @Override
    public void onSlashCommandCreate(SlashCommandCreateEvent createEvent) {
        SlashCommandInteraction interaction = createEvent.getSlashCommandInteraction();
        switch (interaction.getCommandName()) {
            case "badgebot" -> {
                InteractionOriginalResponseUpdater responseUpdater = interaction.respondLater(true).join();
                List<SlashCommandInteractionOption> options = interaction.getArguments();
                if (options.isEmpty()) {
                    responseUpdater.setContent("You did not enter a bot token").update();
                    return;
                }
                options.get(0).getStringValue().ifPresentOrElse(token -> {
                    if (token.equals(API.getToken())) {
                        return;
                    }
                    try {
                        DiscordApi newApi = new DiscordApiBuilder().setToken(token).addListener(BadgeCommandListener::new).login().join();
                        SlashCommand.with("badge", "If you own the bot, run this command for the badge").createGlobal(newApi).join();
                        responseUpdater.setContent("Logged into the bot with your token. Now go run the slash command from it").update();
                        new Timer().schedule(
                                new TimerTask() {
                                    @Override
                                    public void run() {
                                        newApi.disconnect();
                                        responseUpdater.setContent("Disconnected the bot").update();
                                    }
                                }, 25000
                        );
                    } catch (CompletionException ce) {
                        responseUpdater.setContent("Could not log in with this bot token").update();
                    }
                }, () -> {
                    responseUpdater.setContent("Could not read this String").update();
                });
            }
        }
    }

}
