/*    */ package com.mczone.managers;
/*    */ 
/*    */ import com.mczone.configs.Core;
/*    */ import com.mczone.hubcore.Handler;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.WorldCreator;
/*    */ import org.bukkit.entity.Entity;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MapManager
/*    */ {
/*    */   public void loadMap(String mMap) {
/* 16 */     World m = (new WorldCreator(mMap)).createWorld();
/* 17 */     m.setAutoSave(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void unloadMap(String mMap) {
/* 22 */     if (Bukkit.getWorld(mMap) != null)
/* 23 */     { if (Bukkit.getWorld(mMap).getPlayers().size() == 0)
/* 24 */       { Bukkit.unloadWorld(mMap, false); }
/*    */       else
/* 26 */       { throw new NullPointerException("Cannot unload a world if it contains players.."); }  }
/* 27 */     else { throw new NullPointerException(String.format("World %s does not exist..", new Object[] { mMap })); }
/*    */   
/*    */   }
/*    */   
/*    */   public void saveMap(String mName) {
/* 32 */     Bukkit.getWorld(mName).save();
/*    */   }
/*    */ 
/*    */   
/*    */   public void loadSpawn() {
/* 37 */     World m = Bukkit.getWorld(this.core.getCore().getString("core.spawn.world"));
/* 38 */     String[] s = this.core.getCore().getString("core.spawn.location").split(" ");
/*    */     
/* 40 */     if (m != null) {
/*    */       
/* 42 */       this.h.setSpawnLocation(new Location(m, Double.parseDouble(s[0].replaceAll("[^0-9-.]", "")), Double.parseDouble(s[1].replaceAll("[^0-9-.]", "")), 
/* 43 */             Double.parseDouble(s[2].replaceAll("[^0-9-.]", "")), Float.parseFloat(s[3].replaceAll("[^0-9-.]", "")), 
/* 44 */             Float.parseFloat(s[4].replaceAll("[^0-9-.]", ""))));
/*    */     } else {
/*    */       
/* 47 */       loadMap(this.core.getCore().getString("core.spawn.world"));
/*    */       
/* 49 */       this.h.setSpawnLocation(new Location(Bukkit.getWorld(this.core.getCore().getString("core.spawn.world")), Double.parseDouble(s[0].replaceAll("[^0-9-.]", "")), Double.parseDouble(s[1].replaceAll("[^0-9-.]", "")), 
/* 50 */             Double.parseDouble(s[2].replaceAll("[^0-9-.]", "")), Float.parseFloat(s[3].replaceAll("[^0-9-.]", "")), 
/* 51 */             Float.parseFloat(s[4].replaceAll("[^0-9-.]", ""))));
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void removeMobs() {
/* 57 */     for (Entity e : Bukkit.getWorld(this.core.getCore().getString("core.spawn.world")).getEntities()) {
/* 58 */       if (!(e instanceof org.bukkit.entity.Player)) {
/* 59 */         e.remove();
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/* 64 */   private Core core = new Core();
/* 65 */   private Handler h = new Handler();
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/managers/MapManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */