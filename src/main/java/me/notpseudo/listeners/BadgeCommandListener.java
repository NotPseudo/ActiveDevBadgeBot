package me.notpseudo.listeners;

import org.javacord.api.DiscordApi;
import org.javacord.api.event.interaction.SlashCommandCreateEvent;
import org.javacord.api.interaction.SlashCommandInteraction;
import org.javacord.api.interaction.callback.InteractionOriginalResponseUpdater;
import org.javacord.api.listener.interaction.SlashCommandCreateListener;

import java.util.Timer;
import java.util.TimerTask;

public class BadgeCommandListener implements SlashCommandCreateListener {

    private final DiscordApi API;

    public BadgeCommandListener(DiscordApi api) {
        API = api;
    }

    @Override
    public void onSlashCommandCreate(SlashCommandCreateEvent createEvent) {
        SlashCommandInteraction interaction = createEvent.getSlashCommandInteraction();
        switch (interaction.getCommandName()) {
            case "badge" -> {
                InteractionOriginalResponseUpdater responseUpdater = interaction.respondLater(true).join();
                responseUpdater.setContent("Nice! Now wait about 24 hours for Discord to recognize your global slash command. Then visit https://discord.com/developers/active-developer to claim your badge\nMake sure to reset your bot token in the Discord Developer Portal https://discord.com/developers/applications to make sure nothing else can access your token")
                        .update();
                new Timer().schedule(
                        new TimerTask() {
                            @Override
                            public void run() {
                                API.disconnect();
                            }
                        }, 5000
                );
            }
        }
    }

}