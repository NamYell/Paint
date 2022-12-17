import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;

public class RightClickEvent implements Listener {

    private final Map<UUID, Integer> brush = new HashMap<>();

    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {

        Player p = e.getPlayer();

        if (Command.bool.containsKey(p.getUniqueId())) {
            if (Command.bool.get(p.getUniqueId()).equals(true)) {

                try {

                    if (p.getInventory().getItemInMainHand().getType().equals(Material.CARROT_ON_A_STICK) &&
                            p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("붓")) {

                        if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {

                            for (int i = 0; i <= 50; i++) {

                                Block block = p.getTargetBlock(null, i);

                                if (block.getType().equals(Material.WHITE_CONCRETE) || block.getType().equals(Material.RED_CONCRETE) ||
                                        block.getType().equals(Material.ORANGE_CONCRETE) || block.getType().equals(Material.YELLOW_CONCRETE) ||
                                        block.getType().equals(Material.LIME_CONCRETE) || block.getType().equals(Material.LIGHT_BLUE_CONCRETE) ||
                                        block.getType().equals(Material.BLUE_CONCRETE) || block.getType().equals(Material.PURPLE_CONCRETE) ||
                                        block.getType().equals(Material.MAGENTA_CONCRETE) || block.getType().equals(Material.LIGHT_GRAY_CONCRETE) ||
                                        block.getType().equals(Material.BLACK_CONCRETE)) {

                                    e.setCancelled(true);

                                    BrushSize brushSize = new BrushSize();

                                    if (!p.getInventory().getItem(0).getType().equals(Material.BARRIER)) {

                                        if (!brush.containsKey(p.getUniqueId())) {
                                            brushSize.setBrushOne(block, p);
                                        } else {
                                            Integer num = brush.get(p.getUniqueId());

                                            if (num.equals(1)) {
                                                brushSize.setBrushOne(block, p);
                                            } else if (num.equals(2)) {
                                                brushSize.setBrushTwo(block, p);
                                            } else if (num.equals(3)) {
                                                brushSize.setBrushThree(block, p);
                                            } else if (num.equals(4)) {
                                                brushSize.setBrushFour(block, p);
                                            }
                                        }
                                    } else {
                                        p.sendMessage(ChatColor.RED + "붓 색깔을 선택해주세요!");
                                    }

                                    break;

                                }

                            }

                        } else if (e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) {

                            ItemStack itemStackArrow = new ItemStack(Material.ARROW);
                            ItemMeta itemMetaArrow = itemStackArrow.getItemMeta();
                            itemMetaArrow.setDisplayName(ChatColor.GOLD + "지우개");
                            itemStackArrow.setItemMeta(itemMetaArrow);

                            p.getInventory().setItem(1, itemStackArrow);

                        }

                    } else if (p.getInventory().getItemInMainHand().getType().equals(Material.ARROW) &&
                            p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("지우개")) {

                        if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                            for (int i = 0; i <= 50; i++) {

                                Block block = p.getTargetBlock(null, i);

                                if (block.getType().equals(Material.RED_CONCRETE) || block.getType().equals(Material.ORANGE_CONCRETE) ||
                                        block.getType().equals(Material.YELLOW_CONCRETE) || block.getType().equals(Material.LIME_CONCRETE) ||
                                        block.getType().equals(Material.LIGHT_BLUE_CONCRETE) || block.getType().equals(Material.BLUE_CONCRETE) ||
                                        block.getType().equals(Material.PURPLE_CONCRETE) || block.getType().equals(Material.MAGENTA_CONCRETE) ||
                                        block.getType().equals(Material.LIGHT_GRAY_CONCRETE) || block.getType().equals(Material.BLACK_CONCRETE) ||
                                        block.getType().equals(Material.WHITE_CONCRETE)) {

                                    e.setCancelled(true);

                                    BrushSize brushSize = new BrushSize();

                                    if (!brush.containsKey(p.getUniqueId())) {
                                        brushSize.setBrushOne(block, p);
                                    } else {
                                        Integer num = brush.get(p.getUniqueId());

                                        if (num.equals(1)) {
                                            brushSize.setBrushOne(block, p);
                                        } else if (num.equals(2)) {
                                            brushSize.setBrushTwo(block, p);
                                        } else if (num.equals(3)) {
                                            brushSize.setBrushThree(block, p);
                                        } else if (num.equals(4)) {
                                            brushSize.setBrushFour(block, p);
                                        }
                                    }

                                    break;

                                }

                            }

                        } else if (e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) {

                            ItemStack itemStackRod = new ItemStack(Material.CARROT_ON_A_STICK, 1);
                            ItemMeta itemMetaRod = itemStackRod.getItemMeta();
                            itemMetaRod.setDisplayName(ChatColor.GOLD + "붓");
                            itemStackRod.setItemMeta(itemMetaRod);

                            p.getInventory().setItem(1, itemStackRod);

                        }

                    } else if (p.getInventory().getItemInMainHand().getType().equals(Material.BOOK) &&
                            p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("다음장으로")) {

                        if (e.getAction() == Action.LEFT_CLICK_BLOCK || e.getAction() == Action.LEFT_CLICK_AIR ||
                                e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {

                            e.setCancelled(true);

                            ItemStack itemStackPurple = new ItemStack(Material.PURPLE_CONCRETE);
                            ItemMeta itemMetaPurple = itemStackPurple.getItemMeta();
                            itemMetaPurple.setDisplayName("보라");
                            itemStackPurple.setItemMeta(itemMetaPurple);

                            ItemStack itemStackMagenta = new ItemStack(Material.MAGENTA_CONCRETE);
                            ItemMeta itemMetaMagenta = itemStackMagenta.getItemMeta();
                            itemMetaMagenta.setDisplayName("핑크");
                            itemStackMagenta.setItemMeta(itemMetaMagenta);

                            ItemStack itemStackLightGray = new ItemStack(Material.LIGHT_GRAY_CONCRETE);
                            ItemMeta itemMetaLightGray = itemStackLightGray.getItemMeta();
                            itemMetaLightGray.setDisplayName("회색");
                            itemStackLightGray.setItemMeta(itemMetaLightGray);

                            ItemStack itemStackBlack = new ItemStack(Material.BLACK_CONCRETE);
                            ItemMeta itemMetaBlack = itemStackBlack.getItemMeta();
                            itemMetaBlack.setDisplayName("검정");
                            itemStackBlack.setItemMeta(itemMetaBlack);

                            ItemStack itemStackTorch = new ItemStack(Material.TORCH);
                            ItemMeta itemMetaTorch = itemStackTorch.getItemMeta();
                            itemMetaTorch.setDisplayName("두께 줄이기");
                            itemStackTorch.setItemMeta(itemMetaTorch);

                            ItemStack itemStackRedstoneTorch = new ItemStack(Material.REDSTONE_TORCH);
                            ItemMeta itemMetaRedstoneTorch = itemStackRedstoneTorch.getItemMeta();
                            itemMetaRedstoneTorch.setDisplayName("두께 늘리기");
                            itemStackRedstoneTorch.setItemMeta(itemMetaRedstoneTorch);

                            ItemStack itemStackBamboo = new ItemStack(Material.BAMBOO);
                            ItemMeta itemMetaBamboo = itemStackBamboo.getItemMeta();
                            itemMetaBamboo.setDisplayName("이전장으로");
                            itemStackBamboo.setItemMeta(itemMetaBamboo);

                            p.getInventory().setItem(2, itemStackPurple);
                            p.getInventory().setItem(3, itemStackMagenta);
                            p.getInventory().setItem(4, itemStackLightGray);
                            p.getInventory().setItem(5, itemStackBlack);

                            p.getInventory().setItem(6, itemStackTorch);
                            p.getInventory().setItem(7, itemStackRedstoneTorch);

                            p.getInventory().setItem(8, itemStackBamboo);

                        }

                    } else if (p.getInventory().getItemInMainHand().getType().equals(Material.BAMBOO) &&
                            p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("이전장으로")) {

                        if (e.getAction() == Action.LEFT_CLICK_BLOCK || e.getAction() == Action.LEFT_CLICK_AIR ||
                                e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {

                            e.setCancelled(true);

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

                            p.getInventory().setItem(2, itemStackRed);
                            p.getInventory().setItem(3, itemStackOrange);
                            p.getInventory().setItem(4, itemStackYellow);
                            p.getInventory().setItem(5, itemStackLime);
                            p.getInventory().setItem(6, itemStackLightBlue);
                            p.getInventory().setItem(7, itemStackBlue);

                            p.getInventory().setItem(8, itemStackBook);

                        }

                    } else if (p.getInventory().getItemInMainHand().getType().equals(Material.REDSTONE_TORCH) &&
                            p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("두께 늘리기")) {

                        if (e.getAction() == Action.LEFT_CLICK_BLOCK || e.getAction() == Action.LEFT_CLICK_AIR ||
                                e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {

                            e.setCancelled(true);

                            if (!brush.containsKey(p.getUniqueId())) {

                                brush.put(p.getUniqueId(), 2);
                                p.sendMessage(ChatColor.GREEN + "붓 크기를 2(으)로 설정하였습니다!");

                            } else {

                                Integer num = brush.get(p.getUniqueId());
                                if (num < 10) {
                                    num += 1;
                                    brush.replace(p.getUniqueId(), num);
                                    p.sendMessage(ChatColor.GREEN + "붓 크기를 " + num + "(으)로 설정하였습니다!");
                                } else {
                                    p.sendMessage(ChatColor.RED + "붓 크기가 최대입니다!");
                                }

                            }

                        }

                    } else if (p.getInventory().getItemInMainHand().getType().equals(Material.TORCH) &&
                            p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("두께 줄이기")) {

                        if (e.getAction() == Action.LEFT_CLICK_BLOCK || e.getAction() == Action.LEFT_CLICK_AIR ||
                                e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {

                            e.setCancelled(true);

                            if (!brush.containsKey(p.getUniqueId())) {
                                p.sendMessage(ChatColor.RED + "붓 크기가 최소입니다!");
                            } else {

                                Integer num = brush.get(p.getUniqueId());
                                if (num > 1) {
                                    num -= 1;
                                    brush.replace(p.getUniqueId(), num);
                                    p.sendMessage(ChatColor.GREEN + "붓 크기를 " + num + "(으)로 설정하였습니다!");
                                } else {
                                    p.sendMessage(ChatColor.RED + "붓 크기가 최소입니다!");
                                }

                            }

                        }

                    }

                } catch (NullPointerException exception) {

                    Bukkit.getLogger().log(Level.WARNING, "Something went wrong!");

                }

            }
        }

    }

    public Map<UUID, Integer> getBrush() {
        return brush;
    }

}
