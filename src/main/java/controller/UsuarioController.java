
package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;
import beans.Usuarios;
import connection.DBConnection;

public class UsuarioController implements IUsuarioController{
    @Override
    public String login(String username, String contrasena){
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM usuarios WHERE username='"+username+"' AND contrasena = '"+contrasena+"'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String email = rs.getString("email");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");
                String tipo_usuario = rs.getString("tipo_usuario");
                int saldo = rs.getInt("saldo");
                Usuarios usuario =new Usuarios(username,  contrasena, email, nombre, apellido,
                        telefono, tipo_usuario, saldo);
                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
        return "false";
    }
    @Override
    public String register(String username, String email, String contrasena, String nombre,
            String apellido,String telefono, String tipo_usuario,
            int saldo) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Insert into usuarios values('" + username + "', '" + contrasena + "', '" + email
                + "', '" + nombre + "', '" + apellido + "', '" + telefono + "', '"+tipo_usuario+"', "+saldo+ ")";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            Usuarios usuario = new Usuarios( username, contrasena,  email, nombre, apellido, telefono, tipo_usuario, saldo);

            st.close();

            return gson.toJson(usuario);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";

    }
}
