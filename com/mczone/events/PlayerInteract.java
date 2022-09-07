/*    */ package com.mczone.events;
/*    */ 
/*    */ import com.mczone.utils.GUI;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.Action;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PlayerInteract
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onInteract(PlayerInteractEvent e) {
/* 18 */     Player p = e.getPlayer();
/*    */     
/* 20 */     if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
/* 21 */       p.openInventory(this.gui.getMinigameMenu());
/* 22 */       p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
/*    */     } 
/*    */   }
/*    */   
/* 26 */   private GUI gui = new GUI();
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/events/PlayerInteract.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */