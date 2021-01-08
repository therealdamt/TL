package xyz.damt.tl;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class Tl extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            if (command.getName().equalsIgnoreCase("tl")) {

                int x = (int) player.getLocation().getX();
                int y = (int) player.getLocation().getY();
                int z = (int) player.getLocation().getZ();

                for (Player p : Bukkit.getOnlinePlayers()) {
                    p.sendMessage(ChatColor.GREEN + player.getName() + ChatColor.GRAY + " : " + ChatColor.WHITE + x + ", " + y + ", " + z);
                }

            }
        }

        return false;
    }
}
