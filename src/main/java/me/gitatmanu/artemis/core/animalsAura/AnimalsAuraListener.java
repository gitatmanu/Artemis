package me.gitatmanu.artemis.core.animalsAura;

import me.gitatmanu.artemis.Artemis;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.List;

public class AnimalsAuraListener implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        List <Entity> nearEntities = e.getPlayer().getNearbyEntities(30, 30, 20);

        for (Entity entity: nearEntities) {
            if(!Artemis.nearbyEntities.contains(entity)) {
                Artemis.nearbyEntities.add(entity);
            }
        }
    }
}
