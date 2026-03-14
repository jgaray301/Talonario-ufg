package com.talonario.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import ch.qos.logback.classic.Level;

public class ConexionMYSQL {



	    private final String user = "usrColectura";        //Su usuario
	    private final String password = "passw0rd";        //Su contraseña
	    private final String url = "jdbc:mysql://localhost:3306/registro"; //Su BDD (registro)
	    private final String driver = "com.mysql.cj.jdbc.Driver"; //Driver de mySQL
	    private Connection con = null;

	    public Connection getConexion() throws SQLException {  //Metodo para devolver la conexion
	        try {
	            Class.forName(driver);
	            con = DriverManager.getConnection(this.url, this.user, this.password);

	        } catch (ClassNotFoundException | SQLException e) {
	            System.out.println(e);
	        }

	        return con;
	    }

	    public void close() {   // metodo para cerrar la conexion
	        try {
	            con.close();
	        } catch (SQLException ex) {
	            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	}

