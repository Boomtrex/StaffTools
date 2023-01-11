package de.boomunitymc.stafftools.commands;

import de.boomunitymc.stafftools.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AdminInventoryCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if (s instanceof Player){
            Player player =(Player)s;
            Inventory inventory = Bukkit.createInventory(null, 9, "§9Admin Items");
            ItemStack i = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta m = i.getItemMeta();
            m.setUnbreakable(true);
            m.setDisplayName("§cOP-SCHWERT");
            m.addEnchant(Enchantment.DAMAGE_ALL, 100, true);
            m.addEnchant(Enchantment.FIRE_ASPECT, 100, true);
            m.addEnchant(Enchantment.MENDING, 100, true);
            m.addEnchant(Enchantment.DAMAGE_ALL, 100, true);
            m.addEnchant(Enchantment.WATER_WORKER, 2, true);
            i.setItemMeta(m);
            ItemStack i2 = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta m2 = i2.getItemMeta();
            m.setUnbreakable(true);
            m.setDisplayName("§cOp-Bogen");
            m.addEnchant(Enchantment.ARROW_FIRE, 100, true);
            m.addEnchant(Enchantment.ARROW_KNOCKBACK, 100, true);
            m.addEnchant(Enchantment.ARROW_INFINITE, 100, true);
            i2.setItemMeta(m2);
            inventory.setItem(0, i);
            inventory.setItem(1, i2);
            player.openInventory(inventory);
        } else {
            s.sendMessage(Main.getPrefix() + "§cDu musst ein Spieler sein!");
        }
        return false;
    }
}
