package com.beez.api.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.beez.api.BeezAPI;

public class SQLConnection {
	
	private Connection connection;
    private String urlbase,host,database,user,pass;
   
    public SQLConnection(String urlbase, String host, String database, String user, String pass) {
        this.urlbase = urlbase;
        this.host = host;
        this.database = database;
        this.user = user;
        this.pass = pass;
    }
   
    public void connect(){
        if(!isConnected()){
            try {
                connection = DriverManager.getConnection(urlbase + host + "/" + database, user, pass);
                BeezAPI.log("La connection à la base SQL a été effectuée avec succès.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
   
    public void disconnect(){
        if(isConnected()){
            try {
                connection.close();
                BeezAPI.log("La déconnection de la base SQL a été effectuée avec succès.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
   
    public boolean isConnected(){
        return connection != null;
    }
}