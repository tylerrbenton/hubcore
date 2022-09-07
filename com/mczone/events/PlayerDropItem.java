/*    */ package com.mczone.events;
/*    */ 
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerDropItemEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PlayerDropItem
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onDrop(PlayerDropItemEvent e) {
/* 14 */     e.setCancelled(true);
/*    */   }
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/events/PlayerDropItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */