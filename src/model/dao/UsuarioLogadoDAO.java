package model.dao;

import connection.ConnectionFactory;
import model.bean.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mirian.rosa
 */
public class UsuarioLogadoDAO {
    
    public Usuario read(String login, String passwd){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Usuario usuario = new Usuario();
       
        try {
            
            stmt = con.prepareStatement("SELECT * FROM usuarios_plataforma WHERE username = ? AND passwd = ?");
            stmt.setString(1, login);
            stmt.setString(2, passwd);
            rs = stmt.executeQuery();
            
            while (rs.next()){
             
            usuario.setUsername(rs.getString("username"));
            usuario.setRole(rs.getString("role"));
            usuario.setPermissaoFunc(rs.getBoolean("permissaoFunc"));
            usuario.setPermissaoForne(rs.getBoolean("permissaoForne")); 
            usuario.setPermissaoPaga(rs.getBoolean("permissaoPaga"));
            usuario.setPermissaoContra(rs.getBoolean("permissaoContra"));  
            usuario.setPermissaoRela(rs.getBoolean("permissaoRela"));  
            usuario.setPermissaoUsers(rs.getBoolean("permissaoUsers"));
            
            }
       
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioLogadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "SQL Error");
        
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);          
        }
        
        return usuario;
        
    }
}
