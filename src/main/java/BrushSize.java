import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;

public class BrushSize {

    public Map<UUID, Integer> brush = new RightClickEvent().getBrush();

    public void setBrushOne(Block b, Player p) {

        try {

            if (p.getInventory().getItem(1).getType().equals(Material.CARROT_ON_A_STICK)) {

                b.setType(p.getInventory().getItem(0).getType());

            } else if (p.getInventory().getItem(1).getType().equals(Material.ARROW)) {

                b.setType(Material.WHITE_CONCRETE);
                Command.location.add(b.getLocation());

            }

        } catch (NullPointerException e) {
            Bukkit.getLogger().log(Level.WARNING, "Something went wrong!");
        }

    }

    public void setBrushTwo(Block b, Player p) {

        try {

            Location location = b.getLocation();
            World world = location.getWorld();
            double locationX = location.getX();
            double locationY = location.getY();
            double locationZ = location.getZ();

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    for (int k = -1; k <= 1; k++) {

                        if ((i + j + k) == -1 || (i + j + k) == 1) {

                            Location l = new Location(world, locationX + i, locationY + j, locationZ + k);

                            if (l.getBlock().getType().equals(Material.WHITE_CONCRETE) || l.getBlock().getType().equals(Material.RED_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.ORANGE_CONCRETE) || l.getBlock().getType().equals(Material.YELLOW_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.LIME_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_BLUE_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.BLUE_CONCRETE) || l.getBlock().getType().equals(Material.PURPLE_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.MAGENTA_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_GRAY_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.BLACK_CONCRETE)) {

                                Block block = l.getBlock();

                                if (p.getInventory().getItem(1).getType().equals(Material.CARROT_ON_A_STICK)) {

                                    block.setType(p.getInventory().getItem(0).getType());
                                    Command.location.add(block.getLocation());

                                } else if (p.getInventory().getItem(1).getType().equals(Material.ARROW)) {

                                    block.setType(Material.WHITE_CONCRETE);

                                }

                            }

                        }

                    }
                }
            }

            if (p.getInventory().getItem(1).getType().equals(Material.CARROT_ON_A_STICK)) {

                b.setType(p.getInventory().getItem(0).getType());

            } else if (p.getInventory().getItem(1).getType().equals(Material.ARROW)) {

                b.setType(Material.WHITE_CONCRETE);

            }

        } catch (NullPointerException e) {
            Bukkit.getLogger().log(Level.WARNING, "Something went wrong!");
        }

    }

    public void setBrushThree(Block b, Player p) {

        try {

            Location location = b.getLocation();
            World world = location.getWorld();
            double locationX = location.getX();
            double locationY = location.getY();
            double locationZ = location.getZ();

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    for (int k = -1; k <= 1; k++) {

                        Location l = new Location(world, locationX + i, locationY + j, locationZ + k);

                        if (l.getBlock().getType().equals(Material.WHITE_CONCRETE) || l.getBlock().getType().equals(Material.RED_CONCRETE) ||
                                l.getBlock().getType().equals(Material.ORANGE_CONCRETE) || l.getBlock().getType().equals(Material.YELLOW_CONCRETE) ||
                                l.getBlock().getType().equals(Material.LIME_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_BLUE_CONCRETE) ||
                                l.getBlock().getType().equals(Material.BLUE_CONCRETE) || l.getBlock().getType().equals(Material.PURPLE_CONCRETE) ||
                                l.getBlock().getType().equals(Material.MAGENTA_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_GRAY_CONCRETE) ||
                                l.getBlock().getType().equals(Material.BLACK_CONCRETE)) {

                            Block block = l.getBlock();

                            if (p.getInventory().getItem(1).getType().equals(Material.CARROT_ON_A_STICK)) {

                                block.setType(p.getInventory().getItem(0).getType());
                                Command.location.add(block.getLocation());

                            } else if (p.getInventory().getItem(1).getType().equals(Material.ARROW)) {

                                block.setType(Material.WHITE_CONCRETE);

                            }

                        }

                    }
                }
            }

        } catch (NullPointerException e) {
            Bukkit.getLogger().log(Level.WARNING, "Something went wrong!");
        }

    }

    public void setBrushFour(Block b, Player p) {

        try {

            Location location = b.getLocation();
            World world = location.getWorld();
            double locationX = location.getX();
            double locationY = location.getY();
            double locationZ = location.getZ();

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    for (int k = -1; k <= 1; k++) {

                        Location l = new Location(world, locationX + i, locationY + j, locationZ + k);

                        if (l.getBlock().getType().equals(Material.WHITE_CONCRETE) || l.getBlock().getType().equals(Material.RED_CONCRETE) ||
                                l.getBlock().getType().equals(Material.ORANGE_CONCRETE) || l.getBlock().getType().equals(Material.YELLOW_CONCRETE) ||
                                l.getBlock().getType().equals(Material.LIME_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_BLUE_CONCRETE) ||
                                l.getBlock().getType().equals(Material.BLUE_CONCRETE) || l.getBlock().getType().equals(Material.PURPLE_CONCRETE) ||
                                l.getBlock().getType().equals(Material.MAGENTA_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_GRAY_CONCRETE) ||
                                l.getBlock().getType().equals(Material.BLACK_CONCRETE)) {

                            Block block = l.getBlock();

                            if (p.getInventory().getItem(1).getType().equals(Material.CARROT_ON_A_STICK)) {

                                block.setType(p.getInventory().getItem(0).getType());
                                Command.location.add(block.getLocation());

                            } else if (p.getInventory().getItem(1).getType().equals(Material.ARROW)) {

                                block.setType(Material.WHITE_CONCRETE);

                            }

                        }

                    }
                }
            }

            for (int i = -2; i <= 2; i++) {
                for (int j = -2; j <= 2; j++) {
                    for (int k = -2; k <= 2; k++) {
                        if ((i == 2 || i == -2) && j == 0 && k == 0) {

                            Location l = new Location(world, locationX + i, locationY + j, locationZ + k);

                            if (l.getBlock().getType().equals(Material.WHITE_CONCRETE) || l.getBlock().getType().equals(Material.RED_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.ORANGE_CONCRETE) || l.getBlock().getType().equals(Material.YELLOW_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.LIME_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_BLUE_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.BLUE_CONCRETE) || l.getBlock().getType().equals(Material.PURPLE_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.MAGENTA_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_GRAY_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.BLACK_CONCRETE)) {

                                Block block = l.getBlock();

                                if (p.getInventory().getItem(1).getType().equals(Material.CARROT_ON_A_STICK)) {

                                    block.setType(p.getInventory().getItem(0).getType());
                                    Command.location.add(block.getLocation());

                                } else if (p.getInventory().getItem(1).getType().equals(Material.ARROW)) {

                                    block.setType(Material.WHITE_CONCRETE);

                                }

                            }

                        } else if ((j == 2 || j == -2) && i == 0 && k == 0) {

                            Location l = new Location(world, locationX + i, locationY + j, locationZ + k);

                            if (l.getBlock().getType().equals(Material.WHITE_CONCRETE) || l.getBlock().getType().equals(Material.RED_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.ORANGE_CONCRETE) || l.getBlock().getType().equals(Material.YELLOW_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.LIME_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_BLUE_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.BLUE_CONCRETE) || l.getBlock().getType().equals(Material.PURPLE_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.MAGENTA_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_GRAY_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.BLACK_CONCRETE)) {

                                Block block = l.getBlock();

                                if (p.getInventory().getItem(1).getType().equals(Material.CARROT_ON_A_STICK)) {

                                    block.setType(p.getInventory().getItem(0).getType());
                                    Command.location.add(block.getLocation());

                                } else if (p.getInventory().getItem(1).getType().equals(Material.ARROW)) {

                                    block.setType(Material.WHITE_CONCRETE);

                                }

                            }

                        } else if ((k == 2 || k == -2) && j == 0 && i == 0) {

                            Location l = new Location(world, locationX + i, locationY + j, locationZ + k);

                            if (l.getBlock().getType().equals(Material.WHITE_CONCRETE) || l.getBlock().getType().equals(Material.RED_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.ORANGE_CONCRETE) || l.getBlock().getType().equals(Material.YELLOW_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.LIME_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_BLUE_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.BLUE_CONCRETE) || l.getBlock().getType().equals(Material.PURPLE_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.MAGENTA_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_GRAY_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.BLACK_CONCRETE)) {

                                Block block = l.getBlock();

                                if (p.getInventory().getItem(1).getType().equals(Material.CARROT_ON_A_STICK)) {

                                    block.setType(p.getInventory().getItem(0).getType());
                                    Command.location.add(block.getLocation());

                                } else if (p.getInventory().getItem(1).getType().equals(Material.ARROW)) {

                                    block.setType(Material.WHITE_CONCRETE);

                                }

                            }

                        }
                    }
                }
            }

        } catch (NullPointerException e) {
            Bukkit.getLogger().log(Level.WARNING, "Something went wrong!");
        }

    }

    public void setBrushFive(Block b, Player p) {

        try {

            Location location = b.getLocation();
            World world = location.getWorld();
            double locationX = location.getX();
            double locationY = location.getY();
            double locationZ = location.getZ();

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    for (int k = -1; k <= 1; k++) {

                        Location l = new Location(world, locationX + i, locationY + j, locationZ + k);

                        if (l.getBlock().getType().equals(Material.WHITE_CONCRETE) || l.getBlock().getType().equals(Material.RED_CONCRETE) ||
                                l.getBlock().getType().equals(Material.ORANGE_CONCRETE) || l.getBlock().getType().equals(Material.YELLOW_CONCRETE) ||
                                l.getBlock().getType().equals(Material.LIME_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_BLUE_CONCRETE) ||
                                l.getBlock().getType().equals(Material.BLUE_CONCRETE) || l.getBlock().getType().equals(Material.PURPLE_CONCRETE) ||
                                l.getBlock().getType().equals(Material.MAGENTA_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_GRAY_CONCRETE) ||
                                l.getBlock().getType().equals(Material.BLACK_CONCRETE)) {

                            Block block = l.getBlock();

                            if (p.getInventory().getItem(1).getType().equals(Material.CARROT_ON_A_STICK)) {

                                block.setType(p.getInventory().getItem(0).getType());
                                Command.location.add(block.getLocation());

                            } else if (p.getInventory().getItem(1).getType().equals(Material.ARROW)) {

                                block.setType(Material.WHITE_CONCRETE);

                            }

                        }

                    }
                }
            }

            for (int i = -2; i <= 2; i++) {
                for (int j = -2; j <= 2; j++) {
                    for (int k = -2; k <= 2; k++) {
                        if ((i == 2 || i == -2) && j == 0 && k == 0) {

                            Location l = new Location(world, locationX + i, locationY + j, locationZ + k);

                            if (l.getBlock().getType().equals(Material.WHITE_CONCRETE) || l.getBlock().getType().equals(Material.RED_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.ORANGE_CONCRETE) || l.getBlock().getType().equals(Material.YELLOW_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.LIME_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_BLUE_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.BLUE_CONCRETE) || l.getBlock().getType().equals(Material.PURPLE_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.MAGENTA_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_GRAY_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.BLACK_CONCRETE)) {

                                Block block = l.getBlock();

                                if (p.getInventory().getItem(1).getType().equals(Material.CARROT_ON_A_STICK)) {

                                    block.setType(p.getInventory().getItem(0).getType());
                                    Command.location.add(block.getLocation());

                                } else if (p.getInventory().getItem(1).getType().equals(Material.ARROW)) {

                                    block.setType(Material.WHITE_CONCRETE);

                                }

                            }

                        } else if ((j == 2 || j == -2) && i == 0 && k == 0) {

                            Location l = new Location(world, locationX + i, locationY + j, locationZ + k);

                            if (l.getBlock().getType().equals(Material.WHITE_CONCRETE) || l.getBlock().getType().equals(Material.RED_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.ORANGE_CONCRETE) || l.getBlock().getType().equals(Material.YELLOW_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.LIME_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_BLUE_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.BLUE_CONCRETE) || l.getBlock().getType().equals(Material.PURPLE_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.MAGENTA_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_GRAY_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.BLACK_CONCRETE)) {

                                Block block = l.getBlock();

                                if (p.getInventory().getItem(1).getType().equals(Material.CARROT_ON_A_STICK)) {

                                    block.setType(p.getInventory().getItem(0).getType());
                                    Command.location.add(block.getLocation());

                                } else if (p.getInventory().getItem(1).getType().equals(Material.ARROW)) {

                                    block.setType(Material.WHITE_CONCRETE);

                                }

                            }

                        } else if ((k == 2 || k == -2) && j == 0 && i == 0) {

                            Location l = new Location(world, locationX + i, locationY + j, locationZ + k);

                            if (l.getBlock().getType().equals(Material.WHITE_CONCRETE) || l.getBlock().getType().equals(Material.RED_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.ORANGE_CONCRETE) || l.getBlock().getType().equals(Material.YELLOW_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.LIME_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_BLUE_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.BLUE_CONCRETE) || l.getBlock().getType().equals(Material.PURPLE_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.MAGENTA_CONCRETE) || l.getBlock().getType().equals(Material.LIGHT_GRAY_CONCRETE) ||
                                    l.getBlock().getType().equals(Material.BLACK_CONCRETE)) {

                                Block block = l.getBlock();

                                if (p.getInventory().getItem(1).getType().equals(Material.CARROT_ON_A_STICK)) {

                                    block.setType(p.getInventory().getItem(0).getType());
                                    Command.location.add(block.getLocation());

                                } else if (p.getInventory().getItem(1).getType().equals(Material.ARROW)) {

                                    block.setType(Material.WHITE_CONCRETE);

                                }

                            }

                        }
                    }
                }
            }

        } catch (NullPointerException e) {
            Bukkit.getLogger().log(Level.WARNING, "Something went wrong!");
        }

    }

}
