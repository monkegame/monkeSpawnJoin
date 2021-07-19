package online.monkegame.monkespawnjoin;

import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        Location l;
        this.saveDefaultConfig();
        getLogger().info("                _       ___                          _     _              ");
        getLogger().info(" _ __  ___ _ _ | |_____/ __|_ __  __ ___ __ ___ _ _ | |___(_)_ _          ");
        getLogger().info("| '  \\/ _ \\ ' \\| / / -_)__ \\ '_ \\/ _` \\ V  V / ' \\ || / _ \\ | ' \\");
        getLogger().info("|_|_|_\\___/_||_|_\\_\\___|___/ .__/\\__,_|\\_/\\_/|_||_\\__/\\___/_|_||_|");
        if (this.getConfig().getString("spawnlocation.x")==null) {
            l = getServer().getWorlds().get(0).getSpawnLocation();
            getLogger().info("No configured spawn location found, using ");
        } else {
            l = getServer().getWorlds().get(0).getSpawnLocation();
            l.setX((double) this.getConfig().getInt("spawnlocation.x"));
            l.setY((double) this.getConfig().getInt("spawnlocation.y"));
            l.setZ((double) this.getConfig().getInt("spawnlocation.z"));
        }
        getServer().getPluginManager().registerEvents(new Listeners(l), this);
    }

    public void onDisable() {
        getLogger().info("bye!");
    }

}
