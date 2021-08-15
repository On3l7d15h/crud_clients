/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Métodos_sql;


//importes
import java.sql.*;
/**
 *
 * @author on3l7d15h
 */
public class Métodos_SQL {
    
    public static conexiónBD conexión = new conexiónBD();
    public static PreparedStatement sent_preparada;
    public static ResultSet result;
    public static String sql;
    public static int result_num = 0;
    
    public int guardar(String nombre, String apellido, String nom_usuario, String pass){
        int resultado = 0;
        Connection conexión = null;
        
        String sentence_toSave = ("Insert Into User (nombre, apellido, nom_usuario, pass) Values(?,?,?,?)");
        
        try {
            conexión = conexiónBD.conectar();
            sent_preparada = conexión.prepareStatement(sentence_toSave);
            sent_preparada.setString(1, nombre);
            sent_preparada.setString(2, apellido);
            sent_preparada.setString(3, nom_usuario);
            sent_preparada.setString(4, pass);
            
            resultado = sent_preparada.executeUpdate();
            sent_preparada.close();
            conexión.close();
        } catch(Exception e){
            System.out.println(e);
        }
        
        return resultado;
    }
    
    public static String buscarUser(String user){
        
        String buscarUser = null;
        Connection conexión = null;
        
        try {
            
            conexión = conexiónBD.conectar();
            String sentence_b = ("Select nombre, apellido From User Where nom_usuario = '" + user + "'");
            sent_preparada = conexión.prepareStatement(sentence_b);
            result = sent_preparada.executeQuery();
            if(result.next()){
                String name = result.getString("nombre");
                String last = result.getString("apellido");
                buscarUser = (name + " " + last);
            }
            conexión.close();
        } catch(Exception e) {
            System.out.println("Error" + e);
        }
        
        return buscarUser;
    }
    
    public static String buscarUserRegistrado (String user, String pass) {
        
        String buscarUserR = null;
        Connection conexión = null;
        
        try {
            
            conexión = conexiónBD.conectar();
            String sent_c = ("Select nom_usuario, pass From User Where nom_usuario = '" + user + "' And pass = '" + pass + "'");
            sent_preparada = conexión.prepareStatement(sent_c);
            result = sent_preparada.executeQuery();
            if(result.next()){
                buscarUserR = "Usuario Encontrado";
            } else {
                sent_c = ("Select nom_usuario, pass From User Where nom_usuario = '" + user + "' Or pass = '" + pass + "'");
                sent_preparada = conexión.prepareStatement(sent_c);
                result = sent_preparada.executeQuery();
                if(result.next()){
                    buscarUserR = "One of the textfield values exists but other no";
                } else {
                    buscarUserR = "Usuario No Encontrado";
                }
            }
            conexión.close();
        } catch(Exception e) {
            System.out.println("Error" + e);
        }
        
        return buscarUserR;
    }
    
    public int insertarCliente(String name, String last, String location, String email){
        
        int resultado = 0;
        String sen_insertClient;
        Connection conexión = null;
        
        try {
            conexión = conexiónBD.conectar();
            sen_insertClient  = ("Insert Into Clients (id, nombre, apellido, dirección, email) Values(null,?,?,?,?);");
            sent_preparada = conexión.prepareStatement(sen_insertClient);
            sent_preparada.setString(1, name);
            sent_preparada.setString(2, last);
            sent_preparada.setString(3, location);
            sent_preparada.setString(4, email);
            resultado = sent_preparada.executeUpdate();
            sent_preparada.close();
            conexión.close();
        } catch(Exception e){
            System.out.println("Error: " + e);
        }
        
        return 0;
    }
    
      public static String searchClientR (int id) {
        
        String buscarUserR = null;
        Connection conexión = null;
        
        try {
            
            conexión = conexiónBD.conectar();
            String sent_searchClient = ("Select name, last, location, email From Clients Where id = '" + id + "'");
            sent_preparada = conexión.prepareStatement(sent_searchClient);
            result = sent_preparada.executeQuery();
            if(result.next()){
                buscarUserR = "Usuario Encontrado";            
            } else {
                buscarUserR = null;
            }
            conexión.close();
        } catch(Exception e) {
            System.out.println("Error" + e);
        }
        
        return buscarUserR;
    }
      
      public int deleteCliente(int id){
        
        int resultado = 0;
        String sen_delClient;
        Connection conexión = null;
        
        try {
            conexión = conexiónBD.conectar();
            sen_delClient  = ("Delete  From Clients Where id = '" + id + "';");
            sent_preparada = conexión.prepareStatement(sen_delClient);
            resultado = sent_preparada.executeUpdate();
            sent_preparada.close();
            conexión.close();
        } catch(Exception e){
            System.out.println("Error: " + e);
        }
        
        return 0;
    }
      
       public int actCliente(int id, String name, String last, String loc, String email){
        
        int resultado = 0;
        String sen_actClient;
        Connection conexión = null;
        
        try {
            conexión = conexiónBD.conectar();
            sen_actClient  = ("Update Clients Set nombre = '" + name + "', apellido = '" + last + "', dirección = '" + loc + "', email = '" + email + "' Where id = '" + id + "';");
            sent_preparada = conexión.prepareStatement(sen_actClient);
            resultado = sent_preparada.executeUpdate();
            sent_preparada.close();
            conexión.close();
        } catch(Exception e){
            System.out.println("Error: " + e);
        }
        
        return 0;
    }
      
}
