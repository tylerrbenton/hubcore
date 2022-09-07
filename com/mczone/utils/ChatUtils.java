/*    */ package com.mczone.utils;
/*    */ 
/*    */ import org.bukkit.ChatColor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ChatUtils
/*    */ {
/*    */   public static String format(String string) {
/* 11 */     return ChatColor.translateAlternateColorCodes('&', string);
/*    */   }
/*    */   
/*    */   public String consolePrefix() {
/* 15 */     return format("&6&l[MC&eZone&6&l] &r");
/*    */   }
/*    */   
/*    */   public String errorPrefix() {
/* 19 */     return format("&c&lERROR ");
/*    */   }
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/utils/ChatUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */