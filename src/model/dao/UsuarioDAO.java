package model.dao;

import connection.ConnectionFactory;
import model.bean.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mirian.rosa
 */
public class UsuarioDAO {
    
    public void create(Usuario usuario){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO usuarios_plataforma (username, passwd, role, permissaoFunc, permissaoForne, permissaoPaga, permissaoContra, permissaoRela, permissaoUsers) VALUES (?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPasswd());
            stmt.setString(3, usuario.getRole());
            stmt.setBoolean(4, usuario.isPermissaoFunc());
            stmt.setBoolean(5, usuario.isPermissaoForne()); 
            stmt.setBoolean(6, usuario.isPermissaoPaga());
            stmt.setBoolean(7, usuario.isPermissaoContra());  
            stmt.setBoolean(8, usuario.isPermissaoRela());  
            stmt.setBoolean(9, usuario.isPermissaoUsers());  
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
              
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
    public List<Usuario> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> listausuarios = new ArrayList<>();
       
        try {
            
            stmt = con.prepareStatement("SELECT * FROM usuarios_plataforma");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Usuario usuario = new Usuario();
                
                usuario.setId(rs.getInt("id"));
                usuario.setUsername(rs.getString("username"));
                usuario.setPasswd(rs.getString("passwd"));
                usuario.setRole(rs.getString("role"));
                usuario.setPermissaoFunc(rs.getBoolean("permissaoFunc"));
                usuario.setPermissaoForne(rs.getBoolean("permissaoForne")); 
                usuario.setPermissaoPaga(rs.getBoolean("permissaoPaga"));
                usuario.setPermissaoContra(rs.getBoolean("permissaoContra"));  
                usuario.setPermissaoRela(rs.getBoolean("permissaoRela"));  
                usuario.setPermissaoUsers(rs.getBoolean("permissaoUsers"));
 
                listausuarios.add(usuario);
          
            }
              
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "erro");

            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt, rs);
            
        }
        
        return listausuarios;
        
    }
    
    public void update(Usuario usuario){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE usuarios_plataforma SET username = ?, passwd = ?, role = ?, permissaoFunc = ?, permissaoForne = ?, permissaoPaga = ?, permissaoContra = ?, permissaoRela = ?, permissaoUsers = ? where id = ?");
            
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPasswd());
            stmt.setString(3, usuario.getRole());
            stmt.setBoolean(4, usuario.isPermissaoFunc());
            stmt.setBoolean(5, usuario.isPermissaoForne()); 
            stmt.setBoolean(6, usuario.isPermissaoPaga());
            stmt.setBoolean(7, usuario.isPermissaoContra());  
            stmt.setBoolean(8, usuario.isPermissaoRela());  
            stmt.setBoolean(9, usuario.isPermissaoUsers());  
            stmt.setInt(10, usuario.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
    public void delete(Usuario usuario){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("DELETE FROM usuarios_plataforma where id = ?");
            
            stmt.setInt(1, usuario.getId());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso.");
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
}
