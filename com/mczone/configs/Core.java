/*    */ package com.mczone.configs;
/*    */ 
/*    */ import com.mczone.hubcore.HubCore;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.configuration.file.YamlConfiguration;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Core
/*    */ {
/*    */   private static FileConfiguration cConfig;
/*    */   private static File cFile;
/*    */   
/*    */   public void setup() {
/* 19 */     if (!HubCore.getHubcore().getDataFolder().exists()) {
/* 20 */       HubCore.getHubcore().getDataFolder().mkdir();
/*    */     }
/* 22 */     cFile = new File(HubCore.getHubcore().getDataFolder(), "core.yml");
/*    */     
/* 24 */     if (!cFile.exists()) {
/*    */       try {
/* 26 */         cFile.createNewFile();
/* 27 */       } catch (IOException io) {
/* 28 */         io.printStackTrace();
/*    */       } 
/*    */     }
/* 31 */     cConfig = (FileConfiguration)YamlConfiguration.loadConfiguration(cFile);
/*    */     
/* 33 */     cConfig.addDefault("core.spawn.world", null);
/* 34 */     cConfig.addDefault("core.spawn.location", null);
/* 35 */     saveCore();
/*    */   }
/*    */   
/*    */   public void saveCore() {
/*    */     try {
/* 40 */       cConfig.save(cFile);
/* 41 */     } catch (IOException io) {
/* 42 */       io.printStackTrace();
/*    */     } 
/*    */   }
/*    */   
/*    */   public FileConfiguration getCore() {
/* 47 */     return cConfig;
/*    */   }
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/configs/Core.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */