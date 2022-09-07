/*    */ package com.mczone.utils;
/*    */ 
/*    */ import org.bukkit.permissions.Permission;
/*    */ 
/*    */ 
/*    */ public class Permissions
/*    */ {
/*    */   public static Permission setspawn;
/*    */   public static Permission delspawn;
/*    */   public static Permission load;
/*    */   
/*    */   public void setup() {
/* 13 */     setspawn = new Permission("hubcore.commands.setspawn", "Sets current server spawn.");
/* 14 */     delspawn = new Permission("hubcore.commands.delspawn", "Removes server spawn.");
/* 15 */     load = new Permission("hubcore.commands.load", "Loads specified map.");
/* 16 */     map = new Permission("hubscore.commands.map", "Teleport to specified map.");
/* 17 */     save = new Permission("hubcore.commands.save", "Save changes to map.");
/* 18 */     unload = new Permission("hubcore.commands.unload", "Unload specified map.");
/*    */   }
/*    */   
/*    */   public static Permission map;
/*    */   public static Permission save;
/*    */   public static Permission unload;
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/utils/Permissions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */