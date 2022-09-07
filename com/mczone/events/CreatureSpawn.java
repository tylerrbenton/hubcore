/*    */ package com.mczone.events;
/*    */ 
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.CreatureSpawnEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CreatureSpawn
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onSpawn(CreatureSpawnEvent e) {
/* 14 */     e.setCancelled(true);
/*    */   }
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/events/CreatureSpawn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */