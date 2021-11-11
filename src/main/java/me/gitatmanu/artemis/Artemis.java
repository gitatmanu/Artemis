package me.gitatmanu.artemis;

import me.gitatmanu.artemis.core.arrowParticles.ArrowParticlesTask;
import me.gitatmanu.artemis.core.arrowParticles.ArrowParticlesListener;
import me.gitatmanu.artemis.core.commands.ArtemisCommand;
import me.gitatmanu.artemis.core.animalsAura.AnimalsAuraListener;
import me.gitatmanu.artemis.core.animalsAura.AnimalsAuraTask;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Projectile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import java.util.ArrayList;
import java.util.List;

public final class Artemis extends JavaPlugin {
    public static List<Entity> nearbyEntities = new ArrayList<>();
    public static List<Projectile> arrows = new ArrayList<>();

    @Override
    public void onEnable() {
        getCommand("artemis").setExecutor(new ArtemisCommand());

        // Animals aura
        getServer().getPluginManager().registerEvents(new AnimalsAuraListener(),  this);
        BukkitTask AnimalsAuraTask = new AnimalsAuraTask(this).runTaskTimer(this, 10, (long) Math.floor(Math.random() * (500 - 250)) + 250);

        // Arrow particles
        getServer().getPluginManager().registerEvents(new ArrowParticlesListener(),  this);
        BukkitTask arrowParticlesTask = new ArrowParticlesTask(this).runTaskTimer(this, 1, 1);

    }
}