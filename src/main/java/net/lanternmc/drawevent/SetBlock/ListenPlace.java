package net.lanternmc.drawevent.SetBlock;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class ListenPlace implements Listener {

    // 区域放置方块识别
    @EventHandler(priority = EventPriority.HIGHEST)
    public void OnPlace(BlockPlaceEvent e) {
        Block bloc = e.getBlock();
        if (bloc.getX() == 65) {
            Material me = bloc.getType();
            if (bloc.getY() > 70 && bloc.getY() < 111 && bloc.getZ() > -40 && bloc.getZ() < 40) {
                bloc.getLocation().add(1,0,0).getBlock().setType(me);
                Fast.init(bloc.getLocation(), e.getPlayer());
            }
        }
    }

    // 区域给予创造与创造判定
    @EventHandler
    public void onChange(PlayerMoveEvent e) {
        //判定
    }

}
