package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {

	private String sServidor = "localhost";
	private String sUsuario = "";//root
	private String sPassword = "";
	private int iPuerto = 3306;
	private String sServer = "";
	private static Connection conexion = null;

	public BD(String BD) {
	//recibimos el nombre de la base de datos
		
		this.sServer = "jdbc:mysql://"+this.sServidor+":"+this.iPuerto+"/"+BD;
		//jdbc:mysql://127.0.0.0:3306/veguita
		
		//registremos el driver mysql
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("error al registrar el driver mysql: "+e);
			System.exit(0);
		}
		
		//conexion a mysql establecida
		try {
			conexion = DriverManager.getConnection(this.sServer,this.sUsuario,this.sPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Error al conectar a Mysql: "+e);
			//Al detectar Error termine el flujo
			System.exit(0);
		}
		System.out.println("No hemos conectado a la Base de Datos: "+ BD);
	}
}
