package roostermc.roostermc.handlers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import roostermc.roostermc.RoosterMC;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlayerKilledHandler implements Listener {
    public PlayerKilledHandler(RoosterMC plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerDeath_Normal(PlayerDeathEvent event){
//        String deathMessage = event.getDeathMessage();
//        Pattern pattern = Pattern.compile("(?<deadPlayer>\\w+) was slain by (?<killer>\\w+)");
//        Matcher matcher = pattern.matcher(deathMessage);
//        if(matcher.find()) {
//            String deadPlayer = matcher.group("deadPlayer");
//            Bukkit.getLogger().info("deadPlayer = " + deadPlayer);
//            String killer = matcher.group("killer");
//            Bukkit.getLogger().info("killer = " + killer);
//            Player killerPlayer = Bukkit.getPlayer(killer);
//            Bukkit.getLogger().info("killerPlayer = " + killerPlayer.getName());
            String deadPlayerName = event.getEntity().getName();
            Player killerPlayer = event.getEntity().getKiller();
            if (deadPlayerName.equals("majodio") && killerPlayer != null && !killerPlayer.getName().equals("majodio")) {
                Bukkit.getLogger().info("Killing Player");
                event.setDeathMessage(deadPlayerName + " was slain, but immediately got revenge on " + killerPlayer.getName());
                killerPlayer.setHealth(0);
            }
//        }
        //Bukkit.getLogger().info("Player Name = " + );
    }
}
