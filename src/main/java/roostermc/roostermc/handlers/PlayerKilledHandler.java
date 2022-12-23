package roostermc.roostermc.handlers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import roostermc.roostermc.RoosterMC;


public class PlayerKilledHandler implements Listener {
    public PlayerKilledHandler(RoosterMC plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerDeath_Normal(PlayerDeathEvent event){
            String deadPlayerName = event.getEntity().getName();
            Player killerPlayer = event.getEntity().getKiller();
            if (deadPlayerName.equals("majodio") && killerPlayer != null && !killerPlayer.getName().equals("majodio")) {
                Bukkit.getLogger().info("Killing Player");
                event.setDeathMessage(deadPlayerName + " was slain, but immediately got revenge on " + killerPlayer.getName());
                killerPlayer.setHealth(0);
            }
    }
}
