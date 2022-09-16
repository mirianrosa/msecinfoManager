package model.dao;

import connection.ConnectionFactory;
import model.bean.Contrato;
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
public class ContratoDAO {
    
    public void create(Contrato contrato){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO contratosrelatorios (cliente, contrato, tipo, preco, statuspagamento, vencimento, relatorio, feedback) VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1, contrato.getCliente());
            stmt.setString(2, contrato.getContrato());
            stmt.setString(3, contrato.getTipo());
            stmt.setDouble(4, contrato.getPreco());
            stmt.setString(5, "NAO PAGO");
            stmt.setString(6, contrato.getVencimento());
            stmt.setString(7, "Pendente");
            stmt.setString(8, "");
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Contrato cadastrado com sucesso.");
              
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            Logger.getLogger(ContratoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
    public List<Contrato> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Contrato> listacontratos = new ArrayList<>();
       
        try {
            
            stmt = con.prepareStatement("SELECT * FROM contratosrelatorios");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Contrato contrato = new Contrato();
                
                contrato.setId(rs.getInt("id"));
                contrato.setCliente(rs.getString("cliente"));
                contrato.setContrato(rs.getString("contrato"));
                contrato.setTipo(rs.getString("tipo"));
                contrato.setPreco(rs.getDouble("preco"));
                contrato.setStatuspagamento(rs.getString("statuspagamento"));
                contrato.setVencimento(rs.getString("vencimento"));
                contrato.setRelatorio(rs.getString("relatorio"));
                contrato.setFeedback(rs.getString("feedback"));
                listacontratos.add(contrato);
          
            }
              
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro: " + ex);
            Logger.getLogger(ContratoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "erro ao ler");

            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt, rs);
            
        }
        
        return listacontratos;
        
    }
    
    public void update(Contrato contrato){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE contratosrelatorios SET cliente = ?, contrato = ?, tipo = ?, preco = ?, vencimento = ? where id = ?");
            
            stmt.setString(1, contrato.getCliente());
            stmt.setString(2, contrato.getContrato());
            stmt.setString(3, contrato.getTipo());
            stmt.setDouble(4, contrato.getPreco());
            //stmt.setString(5, contrato.getStatuspagamento()); 
            stmt.setString(5, contrato.getVencimento()); 
            stmt.setInt(6, contrato.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Contrato atualizado com sucesso!");
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
            Logger.getLogger(ContratoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
    public void updateRela(Contrato contrato){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE contratosrelatorios SET relatorio = ?, feedback = ? where id = ?");
            
            stmt.setString(1, contrato.getRelatorio()); 
            stmt.setString(2, contrato.getFeedback()); 
            stmt.setInt(3, contrato.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
            Logger.getLogger(ContratoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
    public void updatePaga(Contrato contrato){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE contratosrelatorios SET preco = ?, statuspagamento = ? where id = ?");
            
            stmt.setDouble(1, contrato.getPreco()); 
            stmt.setString(2, contrato.getStatuspagamento()); 
            stmt.setInt(3, contrato.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
            Logger.getLogger(ContratoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
    public void delete(Contrato contrato){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("DELETE FROM contratosrelatorios where id = ?");
            
            stmt.setInt(1, contrato.getId());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Contrato excluído com sucesso.");
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
            Logger.getLogger(ContratoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
}
