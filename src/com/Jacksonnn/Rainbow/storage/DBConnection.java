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

			if (!sql.tableExists("Rainbow_Rainbow")) {
				Rainbow.log.info("Creating Rainbow_Rainbow table");
				String query = "CREATE TABLE `Rainbow_Rainbow` (" + "`id` INTEGER NOT NULL," + "`uuid` varchar(255) NOT NULL," + "`player` varchar(255) NOT NULL," + "`block_id` varchar(255)," + "`x_coord` varchar(255)," + "`y_coord` varchar(255)," + "`z_coord` varchar(255)," + " PRIMARY KEY (id));";
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

			if (!sql.tableExists("Rainbow_Rainbow")) {
				Rainbow.log.info("Creating Rainbow_Rainbow table");
				String query = "CREATE TABLE `Rainbow_Rainbow` (" + "`id` INTEGER NOT NULL," + "`uuid` varchar(255) NOT NULL," + "`player` varchar(255) NOT NULL," + "`block_id` varchar(255)," + "`x_coord` varchar(255)," + "`y_coord` varchar(255)," + "`z_coord` varchar(255)," + " PRIMARY KEY (id));";
				sql.modifyQuery(query, false);
			}
		}
	}

	public static boolean isOpen() {
		return isOpen;
	}
}