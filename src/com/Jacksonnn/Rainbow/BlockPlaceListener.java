package com.Jacksonnn.Rainbow;

import com.Jacksonnn.Rainbow.storage.DBConnection;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.material.Wool;

public class BlockPlaceListener implements Listener {

    public void onBlockPlace(BlockPlaceEvent event) {
        Block block = event.getBlockPlaced();
        Player player = event.getPlayer();
        String playerName = player.getName();

        Material blockPlaced = block.getType();

        if (blockPlaced == Material.WOOL) {
            final Wool wool=(Wool)block.getState().getData();

            DyeColor color = wool.getColor();

            if (color == DyeColor.RED) {

                int blockX = block.getX();
                int blockY = block.getY();
                int blockZ = block.getZ();

                DBConnection.sql.modifyQuery("INSERT INTO rainbow_rainbow(player, color, x, y, z) VALUES('" + playerName + "', '" + color + "', '" + blockX + "', '" + blockY + "', '" + blockZ + "');");

            } else if (color == DyeColor.ORANGE) {

            } else if (color == DyeColor.YELLOW) {

            } else if (color == DyeColor.GREEN) {

            } else if (color == DyeColor.BLUE) {

            } else if (color == DyeColor.PURPLE) {

            } else if (color == DyeColor.MAGENTA) {

            }

        }
    }

}
