
package test;
import beans.Vehiculos;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
public class OperacionesBD {
    
    public static void main(String[] args) {
        listarVehiculos();
        
    }
    public static void  actualizarVehiculos(int id_residuo,int precio_kg){
        
        DBConnection con = new DBConnection();
        
        String sql="UPDATE Residuos SET precio_kg='"+precio_kg+" ' WHERE id_residuo="+id_residuo;
        
          
        try{
            Statement st =con.getConnection().createStatement();
            st.executeUpdate(sql);       
      } catch (Exception ex){
          System.out.println(ex.getMessage());
      } finally {
            con.desconectar();
        }
    }
    
    
    public static void listarVehiculos(){
        
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM vehiculos";

        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String id_vehiculo = rs.getString("id_vehiculo");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String color = rs.getString("color");
                Vehiculos vehiculos = new Vehiculos(id_vehiculo,marca,modelo,color);
                System.out.println(vehiculos.toString());
            }
            
            st.executeQuery(sql);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

    }
}


