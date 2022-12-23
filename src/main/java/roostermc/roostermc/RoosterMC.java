package roostermc.roostermc;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.material.Torch;
import org.bukkit.plugin.java.JavaPlugin;
import roostermc.roostermc.handlers.PlayerKilledHandler;
import roostermc.roostermc.handlers.TorchHandler;

import java.util.logging.Logger;

public final class RoosterMC extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Logger logger = Bukkit.getLogger();
        logger.info("                   ,~");
        logger.info("                ,-'__ `-,)");
        logger.info("               {,-'  `. }              ,')");
        logger.info("              ,( a )   `-.__         ,',')~,");
        logger.info("             <=.) (         `-.__,==' ' ' '}");
        logger.info("               (   )                      /");
        logger.info("                `-'\\   ,                  )");
        logger.info("                    |  \\        `~.      /");
        logger.info("                    \\   `._        \\    /");
        logger.info("                     \\     `._____,'   /");
        logger.info("                      `-.            ,'");
        logger.info("                         `-.      ,-'");
        logger.info("                            `~~~~'");
        logger.info("                            //_||");
        logger.info("                         __//--'/`");
        logger.info("                       ,--'/`  '");
        logger.info("                          '");
        logger.info("                        Rooster MC");

        //new TorchHandler(this);
        new PlayerKilledHandler(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Shutting down - Matt Ruwe.");
    }
}
