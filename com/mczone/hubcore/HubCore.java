/*    */ package com.mczone.hubcore;
/*    */ import com.google.common.io.ByteArrayDataInput;
/*    */ import com.google.common.io.ByteStreams;
/*    */ import com.mczone.commands.MapCommands;
/*    */ import com.mczone.commands.SpawnCommands;
/*    */ import com.mczone.configs.Core;
/*    */ import com.mczone.events.BlockBreak;
/*    */ import com.mczone.events.CreatureSpawn;
/*    */ import com.mczone.events.EntityDamage;
/*    */ import com.mczone.events.EntitySpawn;
/*    */ import com.mczone.events.InventoryClick;
/*    */ import com.mczone.events.PlayerInteract;
/*    */ import com.mczone.events.PlayerJoin;
/*    */ import com.mczone.managers.MapManager;
/*    */ import com.mczone.utils.Permissions;
/*    */ import java.util.logging.Logger;
/*    */ import org.bukkit.Difficulty;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.PluginDescriptionFile;
/*    */ import org.bukkit.plugin.PluginManager;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ import org.bukkit.plugin.messaging.PluginMessageListener;
/*    */ 
/*    */ public class HubCore extends JavaPlugin implements PluginMessageListener {
/* 28 */   private Logger logger = getLogger(); private static HubCore hubcore;
/* 29 */   private PluginDescriptionFile pdf = getDescription();
/* 30 */   private PluginManager pluginManager = getServer().getPluginManager();
/*    */ 
/*    */   
/*    */   public void onEnable() {
/* 34 */     this.logger.info(String.format("%s version.%s was successfully enabled.", new Object[] { this.pdf.getName(), this.pdf.getVersion() }));
/* 35 */     hubcore = this;
/* 36 */     this.core.setup();
/* 37 */     this.permissions.setup();
/*    */     
/* 39 */     getServer().getMessenger().registerIncomingPluginChannel((Plugin)this, "BungeeCord", this);
/* 40 */     getServer().getMessenger().registerOutgoingPluginChannel((Plugin)this, "BungeeCord");
/*    */     
/* 42 */     getCommand("setspawn").setExecutor((CommandExecutor)new SpawnCommands());
/* 43 */     getCommand("delspawn").setExecutor((CommandExecutor)new SpawnCommands());
/*    */     
/* 45 */     getCommand("load").setExecutor((CommandExecutor)new MapCommands());
/* 46 */     getCommand("unload").setExecutor((CommandExecutor)new MapCommands());
/* 47 */     getCommand("map").setExecutor((CommandExecutor)new MapCommands());
/* 48 */     getCommand("save").setExecutor((CommandExecutor)new MapCommands());
/*    */     
/* 50 */     this.pluginManager.registerEvents((Listener)new PlayerJoin(), (Plugin)this);
/* 51 */     this.pluginManager.registerEvents((Listener)new InventoryClick(), (Plugin)this);
/* 52 */     this.pluginManager.registerEvents((Listener)new PlayerInteract(), (Plugin)this);
/* 53 */     this.pluginManager.registerEvents((Listener)new BlockBreak(), (Plugin)this);
/* 54 */     this.pluginManager.registerEvents((Listener)new PlayerDropItem(), (Plugin)this);
/* 55 */     this.pluginManager.registerEvents((Listener)new CreatureSpawn(), (Plugin)this);
/* 56 */     this.pluginManager.registerEvents((Listener)new EntitySpawn(), (Plugin)this);
/* 57 */     this.pluginManager.registerEvents((Listener)new EntityDamage(), (Plugin)this);
/*    */     
/* 59 */     this.mapManager.loadSpawn();
/* 60 */     this.mapManager.removeMobs();
/*    */     
/* 62 */     Bukkit.getWorld(this.core.getCore().getString("core.spawn.world")).setDifficulty(Difficulty.PEACEFUL);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onDisable() {
/* 67 */     hubcore = null;
/*    */   }
/*    */   
/*    */   public static HubCore getHubcore() {
/* 71 */     return hubcore;
/*    */   }
/*    */ 
/*    */   
/*    */   public void onPluginMessageReceived(String channel, Player player, byte[] message) {
/* 76 */     if (!channel.equalsIgnoreCase("BungeeCord")) {
/*    */       return;
/*    */     }
/* 79 */     ByteArrayDataInput in = ByteStreams.newDataInput(message);
/* 80 */     String subChannel = in.readUTF();
/* 81 */     if (subChannel.equalsIgnoreCase("Connect"));
/*    */   }
/*    */ 
/*    */   
/* 85 */   private Core core = new Core();
/* 86 */   private MapManager mapManager = new MapManager();
/* 87 */   private Permissions permissions = new Permissions();
/*    */ }


/* Location:              /home/tyler/Downloads/jar files/HubCore.jar!/com/mczone/hubcore/HubCore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */