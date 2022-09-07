/*    */ package com.mczone.events;
/*    */ 
/*    */ import com.mczone.utils.BungeeCord;
/*    */ import com.mczone.utils.GUI;
/*    */ import com.mczone.utils.Items;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.inventory.ClickType;
/*    */ import org.bukkit.event.inventory.InventoryClickEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InventoryClick
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onInteract(InventoryClickEvent e) {
/* 19 */     if (e.getWhoClicked() instanceof Player) {
/* 20 */       Player p = (Player)e.getWhoClicked();
/*    */       
/* 22 */       if (e.getCurrentItem().getType() == Items.hungerGames().getType() && e.getClick() == ClickType.LEFT) {
/* 23 */         this.bungeeCord.connectHungerGames(p);
/*    */       }
/* 25 */       e.setCancelled(true);
/*    */     } 
/*    */   }
/*    */   
/* 29 */   private BungeeCord bungeeCord = new BungeeCord();
/* 30 */   private GUI gui = new GUI();
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/events/InventoryClick.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */