/*    */ package com.mczone.utils;
/*    */ 
/*    */ import com.google.common.io.ByteArrayDataOutput;
/*    */ import com.google.common.io.ByteStreams;
/*    */ import com.mczone.hubcore.HubCore;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BungeeCord
/*    */ {
/*    */   public void connectHungerGames(Player p) {
/* 14 */     ByteArrayDataOutput out = ByteStreams.newDataOutput();
/* 15 */     out.writeUTF("Connect");
/* 16 */     out.writeUTF("US_528");
/*    */     
/* 18 */     p.sendPluginMessage((Plugin)HubCore.getHubcore(), "BungeeCord", out.toByteArray());
/*    */   }
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/utils/BungeeCord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */