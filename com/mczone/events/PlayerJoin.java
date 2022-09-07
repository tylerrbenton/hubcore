/*    */ package com.mczone.events;
/*    */ 
/*    */ import com.mczone.hubcore.Handler;
/*    */ import com.mczone.utils.Items;
/*    */ import org.bukkit.GameMode;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerJoinEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PlayerJoin
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onJoin(PlayerJoinEvent e) {
/* 18 */     Player p = e.getPlayer();
/*    */     
/* 20 */     p.getInventory().clear();
/* 21 */     p.getInventory().setItem(4, Items.minigameSelector());
/* 22 */     p.setGameMode(GameMode.SURVIVAL);
/*    */ 
/*    */     
/* 25 */     if (this.h.getSpawnLocation() != null) {
/* 26 */       p.teleport(this.h.getSpawnLocation());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/* 31 */   private Handler h = new Handler();
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/events/PlayerJoin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */