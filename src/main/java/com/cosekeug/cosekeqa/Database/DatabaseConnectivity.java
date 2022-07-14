package com.cosekeug.cosekeqa.Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectivity {
    public static Connection ConnectToDB() throws Exception {
	// DriverManager.registerDriver(new com.mysql.jdbc.Driver()); The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary
	String mysqlUrl = "jdbc:mysql://localhost/infofiledb";
	Connection con = DriverManager.getConnection(mysqlUrl, "root", "Herman000!");
        System.out.println("....... Connection established ......");
	return con;
	}
}
