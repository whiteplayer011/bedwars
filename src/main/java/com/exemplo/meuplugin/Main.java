package com.exemplo.meuplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Classe principal do plugin de BedWars.
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Código executado quando o plugin é ativado
        getLogger().info("Plugin BedWars ativado!");
    }

    @Override
    public void onDisable() {
        // Código executado quando o plugin é desativado
        getLogger().info("Plugin BedWars desativado!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("bedwars")) {
            sender.sendMessage("Comando BedWars executado!");
            return true;
        }
        return false;
    }
}