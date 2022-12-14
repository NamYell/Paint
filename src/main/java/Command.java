import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.*;

public class Command implements CommandExecutor {

    public static ArrayList<Location> location = new ArrayList<>();
    public static Map<UUID, Boolean> bool = new HashMap<>();

    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {

            Player p = (Player) commandSender;

            if (strings.length == 1) {
                if (strings[0].equalsIgnoreCase("reset")) {

                    for (Location l : location) {
                        l.getBlock().setType(Material.WHITE_CONCRETE);
                    }

                    location.clear();

                    if (bool.containsKey(p.getUniqueId())) {
                        bool.remove(p.getUniqueId());
                    }

                } else if (strings[0].equalsIgnoreCase("set")) {

                    if (!bool.containsKey(p.getUniqueId()) || !bool.get(p.getUniqueId()).equals(true)) {

                        ItemStack itemStackBarrier = new ItemStack(Material.BARRIER, 1);
                        ItemMeta itemMetaBarrier = itemStackBarrier.getItemMeta();
                        itemMetaBarrier.setDisplayName(ChatColor.RED + "선택된 아이템이 없음");
                        itemMetaBarrier.setLore(Arrays.asList(ChatColor.YELLOW + "인벤토리의 블럭을 좌클릭하여 색깔을 지정해주세요."));
                        itemStackBarrier.setItemMeta(itemMetaBarrier);

                        ItemStack itemStackRod = new ItemStack(Material.CARROT_ON_A_STICK, 1);
                        ItemMeta itemMetaRod = itemStackRod.getItemMeta();
                        itemMetaRod.setDisplayName(ChatColor.GOLD + "붓");
                        itemStackRod.setItemMeta(itemMetaRod);

                        ItemStack itemStackRed = new ItemStack(Material.RED_CONCRETE, 1);
                        ItemMeta itemMetaRed = itemStackRed.getItemMeta();
                        itemMetaRed.setDisplayName(ChatColor.RED + "빨강");
                        itemStackRed.setItemMeta(itemMetaRed);

                        ItemStack itemStackOrange = new ItemStack(Material.ORANGE_CONCRETE, 1);
                        ItemMeta itemMetaOrange = itemStackOrange.getItemMeta();
                        itemMetaOrange.setDisplayName(ChatColor.GOLD + "주황");
                        itemStackOrange.setItemMeta(itemMetaOrange);

                        ItemStack itemStackYellow = new ItemStack(Material.YELLOW_CONCRETE, 1);
                        ItemMeta itemMetaYellow = itemStackYellow.getItemMeta();
                        itemMetaYellow.setDisplayName(ChatColor.YELLOW + "노랑");
                        itemStackYellow.setItemMeta(itemMetaYellow);

                        ItemStack itemStackLime = new ItemStack(Material.LIME_CONCRETE, 1);
                        ItemMeta itemMetaLime = itemStackLime.getItemMeta();
                        itemMetaLime.setDisplayName("초록");
                        itemStackLime.setItemMeta(itemMetaLime);

                        ItemStack itemStackLightBlue = new ItemStack(Material.LIGHT_BLUE_CONCRETE, 1);
                        ItemMeta itemMetaLightBlue = itemStackLightBlue.getItemMeta();
                        itemMetaLightBlue.setDisplayName("하늘");
                        itemStackLightBlue.setItemMeta(itemMetaLightBlue);

                        ItemStack itemStackBlue = new ItemStack(Material.BLUE_CONCRETE, 1);
                        ItemMeta itemMetaBlue = itemStackBlue.getItemMeta();
                        itemMetaBlue.setDisplayName("파랑");
                        itemStackBlue.setItemMeta(itemMetaBlue);

                        ItemStack itemStackBook = new ItemStack(Material.BOOK, 1);
                        ItemMeta itemMetaBook = itemStackBook.getItemMeta();
                        itemMetaBook.setDisplayName("다음장으로");
                        itemStackBook.setItemMeta(itemMetaBook);

                        p.getInventory().setItem(0, itemStackBarrier);

                        p.getInventory().setItem(1, itemStackRod);

                        p.getInventory().setItem(2, itemStackRed);
                        p.getInventory().setItem(3, itemStackOrange);
                        p.getInventory().setItem(4, itemStackYellow);
                        p.getInventory().setItem(5, itemStackLime);
                        p.getInventory().setItem(6, itemStackLightBlue);
                        p.getInventory().setItem(7, itemStackBlue);

                        p.getInventory().setItem(8, itemStackBook);

                        if (bool.containsKey(p.getUniqueId())) {
                            bool.replace(p.getUniqueId(), true);
                        } else {
                            bool.put(p.getUniqueId(), true);
                        }

                    }

                }
            }

        }

        return false;
    }

}
