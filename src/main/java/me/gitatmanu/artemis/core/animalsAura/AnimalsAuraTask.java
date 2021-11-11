package me.gitatmanu.artemis.core.animalsAura;

import me.gitatmanu.artemis.Artemis;
import org.bukkit.EntityEffect;
import org.bukkit.entity.Entity;
import org.bukkit.scheduler.BukkitRunnable;

public class AnimalsAuraTask extends BukkitRunnable {
    Artemis plugin;

    public AnimalsAuraTask(Artemis plugin) {
        this.plugin = plugin;
    }
    @Override
    public void run() {
        for (Entity entity: Artemis.nearbyEntities) {
            plugin.getServer().getScheduler().runTaskLaterAsynchronously(this.plugin, () -> {
                entity.playEffect(EntityEffect.LOVE_HEARTS);
            }, (long) Math.floor(Math.random() * (500 - 250)) + 250);
        }
    }
}
