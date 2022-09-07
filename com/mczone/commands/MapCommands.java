/*    */ package com.mczone.commands;
/*    */ 
/*    */ import com.mczone.configs.Core;
/*    */ import com.mczone.managers.MapManager;
/*    */ import com.mczone.utils.ChatUtils;
/*    */ import com.mczone.utils.Messages;
/*    */ import com.mczone.utils.Permissions;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MapCommands
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 22 */     MapManager mapManager = new MapManager();
/* 23 */     Messages msgs = new Messages();
/*    */     
/* 25 */     if (cmd.getName().equalsIgnoreCase("load")) {
/* 26 */       if (sender.hasPermission(Permissions.load))
/*    */       
/* 28 */       { if (args.length == 1)
/* 29 */         { String mName = args[0];
/*    */           try {
/* 31 */             mapManager.loadMap(mName);
/* 32 */             sender.sendMessage(msgs.mapLoaded(mName));
/* 33 */           } catch (NullPointerException npe) {
/* 34 */             sender.sendMessage(ChatUtils.format(npe.getMessage()));
/*    */           }  }
/*    */         else
/* 37 */         { sender.sendMessage(msgs.load()); }  }
/* 38 */       else { sender.sendMessage(msgs.needPermission(Permissions.load)); }
/*    */     
/*    */     }
/* 41 */     if (cmd.getName().equalsIgnoreCase("unload")) {
/* 42 */       if (sender.hasPermission(Permissions.unload))
/* 43 */       { if (args.length == 1)
/* 44 */         { String mName = args[0];
/*    */           
/*    */           try {
/* 47 */             mapManager.unloadMap(mName);
/* 48 */             sender.sendMessage(msgs.mapUnloaded(mName));
/* 49 */           } catch (NullPointerException npe) {
/* 50 */             sender.sendMessage(npe.getMessage());
/*    */           }  }
/*    */         else
/* 53 */         { sender.sendMessage(msgs.unload()); }  }
/* 54 */       else { sender.sendMessage(msgs.needPermission(Permissions.unload)); }
/*    */     
/*    */     }
/* 57 */     if (cmd.getName().equalsIgnoreCase("map")) {
/* 58 */       if (sender instanceof Player)
/* 59 */       { Player p = (Player)sender;
/*    */         
/* 61 */         if (p.hasPermission(Permissions.map))
/* 62 */         { if (args.length == 1)
/* 63 */           { String mName = args[0];
/*    */             
/* 65 */             if (Bukkit.getWorld(mName) != null)
/* 66 */             { p.teleport(Bukkit.getWorld(mName).getSpawnLocation());
/* 67 */               p.sendMessage(msgs.wlecome()); }
/* 68 */             else { p.sendMessage(msgs.mapDoesntExist(mName)); }
/*    */              }
/* 70 */           else { p.sendMessage(msgs.map()); }  }
/* 71 */         else { p.sendMessage(msgs.needPermission(Permissions.map)); }  }
/* 72 */       else { sender.sendMessage(msgs.mustBePlayer()); }
/*    */     
/*    */     }
/* 75 */     if (cmd.getName().equalsIgnoreCase("save"))
/* 76 */       if (sender.hasPermission(Permissions.save))
/* 77 */       { if (args.length == 1)
/* 78 */         { String mName = args[0];
/*    */           
/* 80 */           if (Bukkit.getWorld(mName) != null)
/* 81 */           { mapManager.saveMap(mName);
/* 82 */             sender.sendMessage(msgs.mapSaved(mName)); }
/* 83 */           else { sender.sendMessage(msgs.mapDoesntExist(mName)); }
/*    */            }
/* 85 */         else { sender.sendMessage(msgs.save()); }  }
/* 86 */       else { sender.sendMessage(msgs.needPermission(Permissions.save)); }
/*    */        
/* 88 */     return true;
/*    */   }
/*    */   
/* 91 */   private Core core = new Core();
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/commands/MapCommands.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */