/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Métodos_sql;

import java.sql.*;


/**
 *
 * @author on3l7d15h
 */
public class conexiónBD {

    public static String url = "jdbc:mysql://localhost/Admin_app";
    public static String usuario = "root";
    public static String contraseña = "onellrooting";
    public static String clase = "com.mysql.jdbc.Driver";

    public static Connection conectar() {

        Connection conexión = null;

        try {

            Class.forName(clase);
            conexión = (Connection) DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conectado Exitosamente");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error" + e);
        }

        return conexión;
    }

}
