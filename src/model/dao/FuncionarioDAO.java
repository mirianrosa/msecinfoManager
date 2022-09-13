package model.dao;

import connection.ConnectionFactory;
import model.bean.Funcionario;
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
public class FuncionarioDAO {
    
    public void create(Funcionario funcionario){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO funcionarios (nome, cpf, endereco, sexo, cargo, salario, admissao, statuspagamento, vencimento) VALUES (?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getEndereco());
            stmt.setString(4, funcionario.getSexo());
            stmt.setString(5, funcionario.getCargo()); 
            stmt.setDouble(6, funcionario.getSalario());
            stmt.setString(7, funcionario.getAdmissao());  
            stmt.setString(8, "NAO PAGO");  
            stmt.setString(9, "5o DIA UTIL");  
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso.");
              
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
    public List<Funcionario> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Funcionario> listafuncionarios = new ArrayList<>();
       
        try {
            
            stmt = con.prepareStatement("SELECT * FROM funcionarios");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Funcionario funcionario = new Funcionario();
                
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setEndereco(rs.getString("endereco"));
                funcionario.setSexo(rs.getString("sexo"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setSalario(rs.getDouble("salario"));
                funcionario.setAdmissao(rs.getString("admissao"));
                listafuncionarios.add(funcionario);
          
            }
              
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "erro");

            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt, rs);
            
        }
        
        return listafuncionarios;
        
    }
    
    public void update(Funcionario funcionario){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE funcionarios SET nome = ?, cpf = ?, endereco = ?, sexo = ?, cargo = ?, salario = ?, admissao = ?, statuspagamento = ?, vencimento = ? where id = ?");
            
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getEndereco());
            stmt.setString(4, funcionario.getSexo());
            stmt.setString(5, funcionario.getCargo()); 
            stmt.setDouble(6, funcionario.getSalario());
            stmt.setString(7, funcionario.getAdmissao());  
            stmt.setString(8, "NAO PAGO");  
            stmt.setString(9, "5o DIA UTIL");  
            stmt.setInt(10, funcionario.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!");
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
    public void delete(Funcionario funcionario){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("DELETE FROM funcionarios where id = ?");
            
            stmt.setInt(1, funcionario.getId());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso.");
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
}
