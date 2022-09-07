/*    */ package com.mczone.events;
/*    */ 
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntitySpawnEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EntitySpawn
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onSpawn(EntitySpawnEvent e) {
/* 15 */     if (!(e.getEntity() instanceof org.bukkit.entity.Player))
/*    */     {
/* 17 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/events/EntitySpawn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */