import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin has been enabled.");

        getCommand("paint").setExecutor(new Command());
        Bukkit.getPluginManager().registerEvents(new RightClickEvent(), this);
        Bukkit.getPluginManager().registerEvents(new InventoryClickEvent(), this);
        Bukkit.getPluginManager().registerEvents(new ItemSelect(), this);

    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin has been disabled.");
    }

}
