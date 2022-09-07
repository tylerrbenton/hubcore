/*    */ package com.mczone.utils;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Items
/*    */ {
/*    */   private static ItemStack item;
/*    */   
/*    */   public static ItemStack minigameSelector() {
/* 20 */     item = new ItemStack(Material.COMPASS, 1);
/* 21 */     ItemMeta meta = item.getItemMeta();
/* 22 */     meta.setDisplayName(ChatUtils.format("&aMinigame Selector.."));
/* 23 */     item.setItemMeta(meta);
/* 24 */     return item;
/*    */   }
/*    */   
/*    */   public static ItemStack hungerGames() {
/* 28 */     item = new ItemStack(Material.FISHING_ROD, 1);
/* 29 */     ItemMeta meta = item.getItemMeta();
/* 30 */     meta.setDisplayName(ChatUtils.format("&eHunger games &6&lNEW"));
/* 31 */     List<String> lore = new ArrayList<>();
/* 32 */     lore.add(ChatUtils.format("&6Solo"));
/* 33 */     meta.setLore(lore);
/* 34 */     item.setItemMeta(meta);
/* 35 */     return item;
/*    */   }
/*    */   
/*    */   public static ItemStack random() {
/* 39 */     item = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
/* 40 */     ItemMeta meta = item.getItemMeta();
/* 41 */     meta.setDisplayName(ChatUtils.format("&8&knull"));
/* 42 */     item.setItemMeta(meta);
/* 43 */     return item;
/*    */   }
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/utils/Items.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */