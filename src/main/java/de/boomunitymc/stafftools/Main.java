package de.boomunitymc.stafftools;

import de.boomunitymc.stafftools.commands.AdminInventoryCommand;
import de.boomunitymc.stafftools.commands.ModInventoryCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main main;

    @Override
    public void onEnable() {
        main = this;
        saveConfig();
        getLogger().info("Plugin Loaded");
        getCommand("adminitems").setExecutor(new AdminInventoryCommand());
        getCommand("moditems").setExecutor(new ModInventoryCommand());
    }

    public static String getPrefix() {
        return ChatColor.GRAY + "[" + ChatColor.BLUE + "Main" + ChatColor.GRAY + "] ";
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
