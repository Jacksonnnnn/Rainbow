package com.Jacksonnn.Rainbow.storage;

import com.Jacksonnn.Rainbow.Rainbow;
import com.Jacksonnn.Rainbow.storage.Database;
import com.Jacksonnn.Rainbow.storage.MySQL;
import com.Jacksonnn.Rainbow.storage.SQLite;

public class DBConnection {

	public static Database sql;

	public static String host;
	public static int port;
	public static String db;
	public static String user;
	public static String pass;
	public static boolean isOpen = false;

	public static void init() {
		if (Rainbow.plugin.getConfig().getString("Storage.engine").equalsIgnoreCase("mysql")) {
			sql = new MySQL(Rainbow.log, "Establishing MySQL Connection...", host, port, user, pass, db);
			if (((MySQL) sql).open() == null) {
				Rainbow.log.severe("Disabling due to database error");
				Rainbow.stopPlugin();
				return;
			}

			isOpen = true;
			Rainbow.log.info("Database connection established.");

			if (!sql.tableExists("rainbow_rainbow")) {
				Rainbow.log.info("Creating rainbow_rainbow table");
				String query = "CREATE TABLE `rainbow_rainbow` (" + "`id` INTEGER NOT NULL," + "`player` varchar(255)," +  "`color` varchar(255)," + "`x` varchar(255)," + "`y` varchar(255)," + "`z` varchar(255)," + " PRIMARY KEY (id));";
				sql.modifyQuery(query, false);
			}
		} else {
			sql = new SQLite(Rainbow.log, "Establishing SQLite Connection.", "Rainbow.db", Rainbow.plugin.getDataFolder().getAbsolutePath());
			if (((SQLite) sql).open() == null) {
				Rainbow.log.severe("Disabling due to database error");
				Rainbow.stopPlugin();
				return;
			}

			isOpen = true;
			Rainbow.log.info("Database connection established.");

			if (!sql.tableExists("rainbow_rainbow")) {
				Rainbow.log.info("Creating rainbow_rainbow table");
				String query = "CREATE TABLE `rainbow_rainbow` (" + "`id` INTEGER NOT NULL," + "`player` varchar(255)," +  "`color` varchar(255)," + "`x` varchar(255)," + "`y` varchar(255)," + "`z` varchar(255)," + " PRIMARY KEY (id));";
				sql.modifyQuery(query, false);
			}
		}
	}

	public static boolean isOpen() {
		return isOpen;
	}
}