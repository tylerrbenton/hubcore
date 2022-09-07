/*    */ package com.mczone.utils;
/*    */ 
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.inventory.Inventory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GUI
/*    */ {
/*    */   private static Inventory inv;
/*    */   
/*    */   public Inventory getMinigameMenu() {
/* 18 */     inv = Bukkit.createInventory(null, 54, ChatUtils.format("&eMinigame Menu.."));
/* 19 */     for (Integer counter = Integer.valueOf(0); counter.intValue() < inv.getSize(); integer1 = counter, integer2 = counter = Integer.valueOf(counter.intValue() + 1)) {
/* 20 */       Integer integer1, integer2; inv.setItem(counter.intValue(), Items.random());
/*    */     } 
/* 22 */     inv.setItem(22, Items.hungerGames());
/* 23 */     return inv;
/*    */   }
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/utils/GUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */