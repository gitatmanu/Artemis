package me.gitatmanu.artemis.core.arrowParticles;

import me.gitatmanu.artemis.Artemis;
import org.bukkit.Particle;
import org.bukkit.entity.Projectile;
import org.bukkit.scheduler.BukkitRunnable;

public class ArrowParticlesTask extends BukkitRunnable {
    Artemis plugin;

    public ArrowParticlesTask(Artemis plugin) {
        this.plugin = plugin;
    }
    @Override
    public void run() {
        for(Projectile arrow : Artemis.arrows){
            arrow.getWorld().spawnParticle(Particle.CRIT_MAGIC, arrow.getLocation(), 1, 0, 0, 0);
        }
    }
}
