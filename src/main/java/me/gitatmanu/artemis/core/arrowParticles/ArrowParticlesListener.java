package me.gitatmanu.artemis.core.arrowParticles;

import me.gitatmanu.artemis.Artemis;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ArrowParticlesListener implements Listener {
    @EventHandler
    public void onEntityShootBow(EntityShootBowEvent e) {
        Artemis.arrows.add((Projectile) e.getProjectile());
    }

    @EventHandler
    public void onProjectileHit(ProjectileHitEvent e) {
        Artemis.arrows.remove(e.getEntity());
    }
}