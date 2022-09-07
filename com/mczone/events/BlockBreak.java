/*    */ package com.mczone.events;
/*    */ 
/*    */ import org.bukkit.Effect;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.BlockBreakEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockBreak
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onBreak(BlockBreakEvent e) {
/* 18 */     Block b = e.getBlock();
/* 19 */     Player p = e.getPlayer();
/*    */     
/* 21 */     if (b.getType() != Material.AIR) {
/* 22 */       b.getWorld().playEffect(b.getLocation().add(0.0D, 1.5D, 0.0D), Effect.SMOKE, 4);
/* 23 */       e.setCancelled(true);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/events/BlockBreak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */