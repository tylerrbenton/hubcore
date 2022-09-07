/*    */ package com.mczone.utils;
/*    */ 
/*    */ import org.bukkit.permissions.Permission;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Messages
/*    */ {
/*    */   public String mapLoaded(String mName) {
/* 15 */     return String.format(ChatUtils.format(this.chatUtils.consolePrefix() + "&aMap &f%s &awas successfully loaded."), new Object[] { mName });
/*    */   }
/*    */   
/*    */   public String mapSaved(String mName) {
/* 19 */     return String.format(ChatUtils.format(this.chatUtils.consolePrefix() + "&aMap &f%s &awas successfully saved."), new Object[] { mName });
/*    */   }
/*    */   
/*    */   public String mapUnloaded(String mName) {
/* 23 */     return String.format(ChatUtils.format(this.chatUtils.consolePrefix() + "&aMap &f%s &awas successfully unloaded."), new Object[] { mName });
/*    */   }
/*    */   
/*    */   public String spawnSet() {
/* 27 */     return ChatUtils.format(this.chatUtils.consolePrefix() + "&aHub spawn was successfully set.");
/*    */   }
/*    */   
/*    */   public String spawnRemoved() {
/* 31 */     return ChatUtils.format(this.chatUtils.consolePrefix() + "&aHub spawn was successfully removed.");
/*    */   }
/*    */   
/*    */   public String wlecome() {
/* 35 */     return ChatUtils.format(this.chatUtils.consolePrefix() + "&aWelcome...");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String mapDoesntExist(String mName) {
/* 41 */     return String.format(ChatUtils.format(this.chatUtils.errorPrefix() + "&cMap &f%s &cdoes not exist."), new Object[] { mName });
/*    */   }
/*    */   
/*    */   public String mustBePlayer() {
/* 45 */     return ChatUtils.format(this.chatUtils.errorPrefix() + "&cYou must have a player to execute this command.");
/*    */   }
/*    */   
/*    */   public String needPermission(Permission permission) {
/* 49 */     return String.format(ChatUtils.format(this.chatUtils.errorPrefix() + "&cYou must have permission %s to execute this command."), new Object[] { permission.getName() });
/*    */   }
/*    */   
/*    */   public String noSpawn() {
/* 53 */     return ChatUtils.format(this.chatUtils.errorPrefix() + "&cYou have no spawn to remove.");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String delSpawn() {
/* 59 */     return ChatUtils.format(this.chatUtils.errorPrefix() + "&cdelspawn");
/*    */   }
/*    */   
/*    */   public String load() {
/* 63 */     return ChatUtils.format(this.chatUtils.errorPrefix() + "&cload");
/*    */   }
/*    */   
/*    */   public String map() {
/* 67 */     return ChatUtils.format(this.chatUtils.errorPrefix() + "&cmap");
/*    */   }
/*    */   
/*    */   public String save() {
/* 71 */     return ChatUtils.format(this.chatUtils.errorPrefix() + "&csave");
/*    */   }
/*    */   
/*    */   public String setSpawn() {
/* 75 */     return ChatUtils.format(this.chatUtils.errorPrefix() + "&csetspawn");
/*    */   }
/*    */   
/*    */   public String unload() {
/* 79 */     return ChatUtils.format(this.chatUtils.errorPrefix() + "&cunload");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 84 */   private ChatUtils chatUtils = new ChatUtils();
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/utils/Messages.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */