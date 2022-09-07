/*    */ package com.mczone.commands;
/*    */ 
/*    */ import com.mczone.configs.Core;
/*    */ import com.mczone.utils.Messages;
/*    */ import com.mczone.utils.Permissions;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SpawnCommands
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 18 */     Messages messages = new Messages();
/*    */ 
/*    */     
/* 21 */     if (cmd.getName().equalsIgnoreCase("setspawn")) {
/* 22 */       if (sender instanceof Player)
/* 23 */       { Player p = (Player)sender;
/* 24 */         if (!p.hasPermission(Permissions.setspawn)) {
/* 25 */           p.sendMessage(messages.needPermission(Permissions.setspawn));
/*    */         }
/* 27 */         if (args.length != 0) {
/* 28 */           p.sendMessage(messages.setSpawn());
/*    */         } else {
/* 30 */           setSpawn(p);
/* 31 */           p.sendMessage(messages.spawnSet());
/*    */         }  }
/* 33 */       else { sender.sendMessage(messages.mustBePlayer()); }
/*    */     
/*    */     }
/*    */     
/* 37 */     if (cmd.getName().equalsIgnoreCase("delspawn")) {
/* 38 */       if (!sender.hasPermission(Permissions.delspawn)) {
/* 39 */         sender.sendMessage(messages.needPermission(Permissions.delspawn));
/*    */       }
/* 41 */       if (args.length != 0) {
/* 42 */         sender.sendMessage(messages.delSpawn());
/*    */       }
/* 44 */       if (!isSet()) {
/* 45 */         sender.sendMessage(messages.noSpawn());
/*    */       } else {
/* 47 */         removeSpawn();
/* 48 */         sender.sendMessage(messages.spawnRemoved());
/*    */       } 
/*    */     } 
/* 51 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   private void setSpawn(Player p) {
/* 56 */     this.core.getCore().set("core.spawn.world", p.getWorld().getName());
/* 57 */     this.core.getCore().set("core.spawn.location", String.format("X:%.2f, Y:%d, Z:%.2f, Yaw:%.2f, Pitch:%.2f", new Object[] { Double.valueOf(p.getLocation().getBlockX() + 0.5D), Integer.valueOf(p.getLocation().getBlockY()), Double.valueOf(p.getLocation().getBlockZ() + 0.5D), 
/* 58 */             Float.valueOf(p.getLocation().getYaw()), Float.valueOf(p.getLocation().getPitch()) }));
/* 59 */     this.core.saveCore();
/*    */   }
/*    */ 
/*    */   
/*    */   private boolean isSet() {
/* 64 */     if (this.core.getCore().get("core.spawn.world") != null || this.core.getCore().get("core.spawn.location") != null)
/* 65 */       return true; 
/* 66 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   private void removeSpawn() {
/* 71 */     this.core.getCore().set("core.spawn.world", null);
/* 72 */     this.core.getCore().set("core.spawn.location", null);
/* 73 */     this.core.saveCore();
/*    */   }
/*    */   
/* 76 */   private Core core = new Core();
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/commands/SpawnCommands.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */