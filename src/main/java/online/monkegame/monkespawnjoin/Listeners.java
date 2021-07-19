package online.monkegame.monkespawnjoin;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Listeners implements Listener {

    private final Location l;

    public Listeners(Location l) {
        this.l = l;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent evt) {
        Player p = evt.getPlayer();
        l.getChunk();
        p.teleportAsync(l);
    }
}
