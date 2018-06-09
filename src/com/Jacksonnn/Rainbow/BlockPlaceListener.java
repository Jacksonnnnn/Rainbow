package com.Jacksonnn.Rainbow;

import com.Jacksonnn.Rainbow.configuration.Config;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Wool;

import static com.Jacksonnn.Rainbow.configuration.ConfigManager.defaultConfig;

public class BlockPlaceListener implements Listener {

    FileConfiguration config = defaultConfig.get();


    public void onBlockPlace(BlockPlaceEvent event) {
        Block block = event.getBlockPlaced();
        Player player = event.getPlayer();
        String playerName = player.getName();

        Material blockPlaced = block.getType();

        int blockX = block.getX();
        int blockY = block.getY();
        int blockZ = block.getZ();

        World world = player.getWorld();

        if (blockPlaced == Material.WOOL) {
            final Wool wool=(Wool)block.getState().getData();

            DyeColor color = wool.getColor();

            boolean conRed = config.contains("Blocks." + playerName + "." + DyeColor.RED);
            boolean conOrange = config.contains("Blocks." + playerName + "." + DyeColor.ORANGE);
            boolean conYellow = config.contains("Blocks." + playerName + "." + DyeColor.YELLOW);
            boolean conGreen = config.contains("Blocks." + playerName + "." + DyeColor.GREEN);
            boolean conBlue = config.contains("Blocks." + playerName + "." + DyeColor.BLUE);
            boolean conPurple = config.contains("Blocks." + playerName + "." + DyeColor.PURPLE);
            boolean conMagenta = config.contains("Blocks." + playerName + "." + DyeColor.MAGENTA);

            if (color == DyeColor.RED) {

                //DBConnection.sql.modifyQuery("INSERT INTO rainbow_rainbow(player, color, x, y, z) VALUES('" + playerName + "', '" + color + "', '" + blockX + "', '" + blockY + "', '" + blockZ + "');");

                config.addDefault("Blocks." + playerName + "." + color + ".X-Coordinate", blockX);
                config.addDefault("Blocks." + playerName + "." + color + ".Y-Coordinate", blockY);
                config.addDefault("Blocks." + playerName + "." + color + ".Z-Coordinate", blockZ);
                defaultConfig.save();

            } else if (color == DyeColor.ORANGE) {

                //DBConnection.sql.modifyQuery("INSERT INTO rainbow_rainbow(player, color, x, y, z) VALUES('" + playerName + "', '" + color + "', '" + blockX + "', '" + blockY + "', '" + blockZ + "');");

                config.addDefault("Blocks." + playerName + "." + color + ".X-Coordinate", blockX);
                config.addDefault("Blocks." + playerName + "." + color + ".Y-Coordinate", blockY);
                config.addDefault("Blocks." + playerName + "." + color + ".Z-Coordinate", blockZ);
                defaultConfig.save();

            } else if (color == DyeColor.YELLOW) {

                //DBConnection.sql.modifyQuery("INSERT INTO rainbow_rainbow(player, color, x, y, z) VALUES('" + playerName + "', '" + color + "', '" + blockX + "', '" + blockY + "', '" + blockZ + "');");

                config.addDefault("Blocks." + playerName + "." + color + ".X-Coordinate", blockX);
                config.addDefault("Blocks." + playerName + "." + color + ".Y-Coordinate", blockY);
                config.addDefault("Blocks." + playerName + "." + color + ".Z-Coordinate", blockZ);
                defaultConfig.save();

            } else if (color == DyeColor.GREEN) {

                //DBConnection.sql.modifyQuery("INSERT INTO rainbow_rainbow(player, color, x, y, z) VALUES('" + playerName + "', '" + color + "', '" + blockX + "', '" + blockY + "', '" + blockZ + "');");

                config.addDefault("Blocks." + playerName + "." + color + ".X-Coordinate", blockX);
                config.addDefault("Blocks." + playerName + "." + color + ".Y-Coordinate", blockY);
                config.addDefault("Blocks." + playerName + "." + color + ".Z-Coordinate", blockZ);
                defaultConfig.save();

            } else if (color == DyeColor.BLUE) {

                //DBConnection.sql.modifyQuery("INSERT INTO rainbow_rainbow(player, color, x, y, z) VALUES('" + playerName + "', '" + color + "', '" + blockX + "', '" + blockY + "', '" + blockZ + "');");

                config.addDefault("Blocks." + playerName + "." + color + ".X-Coordinate", blockX);
                config.addDefault("Blocks." + playerName + "." + color + ".Y-Coordinate", blockY);
                config.addDefault("Blocks." + playerName + "." + color + ".Z-Coordinate", blockZ);
                defaultConfig.save();

            } else if (color == DyeColor.PURPLE) {

                //DBConnection.sql.modifyQuery("INSERT INTO rainbow_rainbow(player, color, x, y, z) VALUES('" + playerName + "', '" + color + "', '" + blockX + "', '" + blockY + "', '" + blockZ + "');");

                config.addDefault("Blocks." + playerName + "." + color + ".X-Coordinate", blockX);
                config.addDefault("Blocks." + playerName + "." + color + ".Y-Coordinate", blockY);
                config.addDefault("Blocks." + playerName + "." + color + ".Z-Coordinate", blockZ);
                defaultConfig.save();

            } else if (color == DyeColor.MAGENTA) {

                //DBConnection.sql.modifyQuery("INSERT INTO rainbow_rainbow(player, color, x, y, z) VALUES('" + playerName + "', '" + color + "', '" + blockX + "', '" + blockY + "', '" + blockZ + "');");

                config.addDefault("Blocks." + playerName + "." + color + ".X-Coordinate", blockX);
                config.addDefault("Blocks." + playerName + "." + color + ".Y-Coordinate", blockY);
                config.addDefault("Blocks." + playerName + "." + color + ".Z-Coordinate", blockZ);
                defaultConfig.save();

            }

            if (conRed && conOrange && conYellow && conGreen && conBlue && conPurple && conMagenta) {
                    /*
                        RED
                     */
                int redX = config.getInt("Blocks." + playerName + "." + DyeColor.RED + ".X-Coordinate");
                int redY = config.getInt("Blocks." + playerName + "." + DyeColor.RED + ".Y-Coordinate");
                int redZ = config.getInt("Blocks." + playerName + "." + DyeColor.RED + ".Z-Coordinate");

                    /*
                        ORANGE
                     */
                int orangeX = config.getInt("Blocks." + playerName + "." + DyeColor.ORANGE + ".X-Coordinate");
                int orangeY = config.getInt("Blocks." + playerName + "." + DyeColor.ORANGE + ".Y-Coordinate");
                int orangeZ = config.getInt("Blocks." + playerName + "." + DyeColor.ORANGE + ".Z-Coordinate");

                    /*
                        YELLOW
                     */
                int yellowX = config.getInt("Blocks." + playerName + "." + DyeColor.YELLOW + ".X-Coordinate");
                int yellowY = config.getInt("Blocks." + playerName + "." + DyeColor.YELLOW + ".Y-Coordinate");
                int yellowZ = config.getInt("Blocks." + playerName + "." + DyeColor.YELLOW + ".Z-Coordinate");

                    /*
                        GREEN
                     */
                int greenX = config.getInt("Blocks." + playerName + "." + DyeColor.GREEN + ".X-Coordinate");
                int greenY = config.getInt("Blocks." + playerName + "." + DyeColor.GREEN + ".Y-Coordinate");
                int greenZ = config.getInt("Blocks." + playerName + "." + DyeColor.GREEN + ".Z-Coordinate");

                    /*
                        BLUE
                     */
                int blueX = config.getInt("Blocks." + playerName + "." + DyeColor.BLUE + ".X-Coordinate");
                int blueY = config.getInt("Blocks." + playerName + "." + DyeColor.BLUE + ".Y-Coordinate");
                int blueZ = config.getInt("Blocks." + playerName + "." + DyeColor.BLUE + ".Z-Coordinate");

                    /*
                        PURPLE
                     */
                int purpleX = config.getInt("Blocks." + playerName + "." + DyeColor.PURPLE + ".X-Coordinate");
                int purpleY = config.getInt("Blocks." + playerName + "." + DyeColor.PURPLE + ".Y-Coordinate");
                int purpleZ = config.getInt("Blocks." + playerName + "." + DyeColor.PURPLE + ".Z-Coordinate");

                    /*
                        MAGENTA
                     */
                int magentaX = config.getInt("Blocks." + playerName + "." + DyeColor.MAGENTA + ".X-Coordinate");
                int magentaY = config.getInt("Blocks." + playerName + "." + DyeColor.MAGENTA + ".Y-Coordinate");
                int magentaZ = config.getInt("Blocks." + playerName + "." + DyeColor.MAGENTA + ".Z-Coordinate");

                int avgX = (redX + orangeX + yellowX + greenX + blueX + purpleX + magentaX) / 7;
                int avgY = (redY + orangeY + yellowY + greenY + blueY + purpleY + magentaY) / 7;
                int avgZ = (redZ + orangeZ + yellowZ + greenZ + blueZ + purpleZ + magentaZ) / 7;

                world.getBlockAt(avgX,avgY,avgZ).setType(Material.CHEST);

                Block chestBlock = world.getBlockAt(avgX,avgY,avgZ);
                BlockState state = chestBlock.getState();
                Chest chest = (Chest) state;

                chest.getBlockInventory().addItem(new ItemStack(Material.GOLD_INGOT,1728));

                String coords = avgX + ", " + avgY + ", " + avgZ;

                player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.RED + "R" + ChatColor.GOLD + "a" + ChatColor.YELLOW + "i" + ChatColor.GREEN + "n" + ChatColor.BLUE + "b" + ChatColor.DARK_PURPLE + "o" + ChatColor.LIGHT_PURPLE + "w" + ChatColor.DARK_GRAY + "] "  + ChatColor.YELLOW + "We created a pot of gold at " + coords + ".");

                config.addDefault("Blocks." + playerName + "." + DyeColor.RED + ".X-Coordinate", "");
                config.addDefault("Blocks." + playerName + "." + DyeColor.RED + ".Y-Coordinate", "");
                config.addDefault("Blocks." + playerName + "." + DyeColor.RED + ".Z-Coordinate", "");

                config.addDefault("Blocks." + playerName + "." + DyeColor.ORANGE + ".X-Coordinate", "");
                config.addDefault("Blocks." + playerName + "." + DyeColor.ORANGE + ".Y-Coordinate", "");
                config.addDefault("Blocks." + playerName + "." + DyeColor.ORANGE + ".Z-Coordinate", "");

                config.addDefault("Blocks." + playerName + "." + DyeColor.YELLOW + ".X-Coordinate", "");
                config.addDefault("Blocks." + playerName + "." + DyeColor.YELLOW + ".Y-Coordinate", "");
                config.addDefault("Blocks." + playerName + "." + DyeColor.YELLOW + ".Z-Coordinate", "");

                config.addDefault("Blocks." + playerName + "." + DyeColor.GREEN + ".X-Coordinate", "");
                config.addDefault("Blocks." + playerName + "." + DyeColor.GREEN + ".Y-Coordinate", "");
                config.addDefault("Blocks." + playerName + "." + DyeColor.GREEN + ".Z-Coordinate", "");

                config.addDefault("Blocks." + playerName + "." + DyeColor.BLUE + ".X-Coordinate", "");
                config.addDefault("Blocks." + playerName + "." + DyeColor.BLUE + ".Y-Coordinate", "");
                config.addDefault("Blocks." + playerName + "." + DyeColor.BLUE + ".Z-Coordinate", "");

                config.addDefault("Blocks." + playerName + "." + DyeColor.PURPLE + ".X-Coordinate", "");
                config.addDefault("Blocks." + playerName + "." + DyeColor.PURPLE + ".Y-Coordinate", "");
                config.addDefault("Blocks." + playerName + "." + DyeColor.PURPLE + ".Z-Coordinate", "");

                config.addDefault("Blocks." + playerName + "." + DyeColor.MAGENTA + ".X-Coordinate", "");
                config.addDefault("Blocks." + playerName + "." + DyeColor.MAGENTA + ".Y-Coordinate", "");
                config.addDefault("Blocks." + playerName + "." + DyeColor.MAGENTA + ".Z-Coordinate", "");
            }

        }
    }

}
