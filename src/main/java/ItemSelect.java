import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ItemSelect implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {

        if (Command.bool.containsKey(e.getPlayer().getUniqueId())) {
            if (Command.bool.get(e.getPlayer().getUniqueId()).equals(true)) {
                if (e.getAction() == Action.LEFT_CLICK_BLOCK ||
                        e.getAction() == Action.LEFT_CLICK_AIR) {

                    Player p = e.getPlayer();

                    e.setCancelled(true);

                    if (!p.getInventory().getItemInMainHand().getType().equals(Material.BARRIER) &&
                    !p.getInventory().getItemInMainHand().getType().equals(Material.CARROT_ON_A_STICK) &&
                    !p.getInventory().getItemInMainHand().getType().equals(Material.ARROW) &&
                    !p.getInventory().getItemInMainHand().getType().equals(Material.BOOK) &&
                    !p.getInventory().getItemInMainHand().getType().equals(Material.BAMBOO) &&
                    !p.getInventory().getItemInMainHand().getType().equals(Material.TORCH) &&
                    !p.getInventory().getItemInMainHand().getType().equals(Material.REDSTONE_TORCH)) {
                        p.getInventory().setItem(0, p.getInventory().getItemInMainHand());
                    }

                }
            }
        }

    }

}
