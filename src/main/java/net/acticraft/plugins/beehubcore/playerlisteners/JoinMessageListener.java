package net.acticraft.plugins.beehubcore.playerlisteners;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.awt.*;

public class JoinMessageListener implements Listener {

    @EventHandler
    private void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage(ChatColor.of(new Color(61, 145, 255))+"» "+ChatColor.of(new Color(241, 152, 35))+ p.getDisplayName()+ ChatColor.of(new Color(130, 139, 147))+ " has entered the hub!");
        Location l = p.getWorld().getSpawnLocation();
        p.teleport(l);

    }

    @EventHandler
    private void onLeave(PlayerQuitEvent e1){
        Player p = e1.getPlayer();
        e1.setQuitMessage(ChatColor.of(new Color(0, 141, 183))+"» "+ChatColor.of(new Color(241, 152, 35))+ p.getDisplayName()+ ChatColor.of(new Color(130, 139, 147))+ " left the hub!");
    }
}
