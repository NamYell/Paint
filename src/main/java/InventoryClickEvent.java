import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

public class InventoryClickEvent implements Listener {

    @EventHandler
    public void onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent e) {

        if (Command.bool.containsKey(e.getWhoClicked().getUniqueId())) {
            if (Command.bool.get(e.getWhoClicked().getUniqueId()).equals(true)) {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onInventoryDrag(InventoryDragEvent e) {

        if (Command.bool.containsKey(e.getWhoClicked().getUniqueId())) {
            if (Command.bool.get(e.getWhoClicked().getUniqueId()).equals(true)) {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent e) {

        if (Command.bool.containsKey(e.getPlayer().getUniqueId())) {
            if (Command.bool.get(e.getPlayer().getUniqueId()).equals(true)) {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onInventoryDrop(PlayerDropItemEvent e) {

        if (Command.bool.containsKey(e.getPlayer().getUniqueId())) {
            if (Command.bool.get(e.getPlayer().getUniqueId()).equals(true)) {
                e.setCancelled(true);
            }
        }
    }

}
