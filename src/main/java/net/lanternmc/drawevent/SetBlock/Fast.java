package net.lanternmc.drawevent.SetBlock;


import net.lanternmc.drawevent.DrawEvent;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fast {

    public static void init(Location loc, Player p) {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
        DrawEvent.getIns().getLogs().set(ft.format(dNow)+ "." + loc.getBlockX() + "-" + loc.getBlockY() + "-" + loc.getBlockY(), p.getName());
        DrawEvent.getIns().getLogs().save();
    }

}
