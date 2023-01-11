package net.lanternmc.drawevent;

import lombok.Getter;
import net.lanternstudio.toolsapi.FileManager.ConfigUtil;
import org.bukkit.plugin.java.JavaPlugin;
import sun.security.krb5.Config;

public final class DrawEvent extends JavaPlugin {

    @Getter
    public static DrawEvent ins;

    @Getter
    public ConfigUtil logs;


    @Override
    public void onEnable() {
        ins = this;
        logs = new ConfigUtil(this, "log.yml");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
