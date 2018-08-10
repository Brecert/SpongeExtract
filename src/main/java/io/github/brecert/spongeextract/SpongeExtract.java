package io.github.brecert.spongeextract;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

import io.github.brecert.spongeextract.NbtCommand;

@Plugin(
        id = "sponge-extract",
        name = "Sponge Extract",
        version = "0.0.1",
        description = "A little vanilla extract for your sponge."
)
public class SpongeExtract {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        logger.info("Sponge extract started.");
    }
}
