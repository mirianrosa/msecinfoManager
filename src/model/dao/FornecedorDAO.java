package model.dao;

import connection.ConnectionFactory;
import model.bean.Fornecedor;
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
public class FornecedorDAO {
    
    public void create(Fornecedor fornecedor){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO fornecedores (empresa, cnpj, fornecimento, preco, statuspagamento, vencimento) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, fornecedor.getEmpresa());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getFornecimento());
            stmt.setDouble(4, fornecedor.getPreco());
            stmt.setString(5, "NAO PAGO"); 
            stmt.setString(6, fornecedor.getVencimento());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso.");
              
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
    public List<Fornecedor> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> listafornecedores = new ArrayList<>();
       
        try {
            
            stmt = con.prepareStatement("SELECT * FROM fornecedores");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Fornecedor fornecedor = new Fornecedor();
                
                fornecedor.setId(rs.getInt("id"));
                fornecedor.setEmpresa(rs.getString("empresa"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setFornecimento(rs.getString("fornecimento"));
                fornecedor.setPreco(rs.getDouble("preco"));
                fornecedor.setStatuspagamento(rs.getString("statuspagamento"));
                fornecedor.setVencimento(rs.getString("vencimento"));
                listafornecedores.add(fornecedor);
          
            }
              
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro: " + ex);
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "erro");

            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt, rs);
            
        }
        
        return listafornecedores;
        
    }
    
    public void update(Fornecedor fornecedor){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE fornecedors SET empresa = ?, cnpj = ?, fornecimento = ?, preco = ?, statuspagamento = ?, vencimento = ? where id = ?");
            
            stmt.setString(1, fornecedor.getEmpresa());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getFornecimento());
            stmt.setDouble(4, fornecedor.getPreco());
            stmt.setString(5, fornecedor.getStatuspagamento()); 
            stmt.setString(6, fornecedor.getVencimento()); 
            stmt.setInt(7, fornecedor.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Fornecedor atualizado com sucesso!");
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
    public void updatePaga(Fornecedor fornecedor){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE fornecedores SET statuspagamento where id = ?");
            
            stmt.setString(1, fornecedor.getStatuspagamento()); 
            stmt.setInt(2, fornecedor.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Pagamento do fornecedor atualizado com sucesso!");
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
    public void delete(Fornecedor fornecedor){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("DELETE FROM fornecedores where id = ?");
            
            stmt.setInt(1, fornecedor.getId());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Fornecedor excluído com sucesso.");
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
}
