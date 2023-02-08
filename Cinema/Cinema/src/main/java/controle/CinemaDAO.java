
package controle;

import conexao.ConectarFactory;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Cinemas;


public class CinemaDAO {
    
    private Connection con;
    
    public CinemaDAO(){
        this.con = new ConectarFactory().getConection();
    }
    public void cadastrarCinema(Cinemas obj){
        try{
            String sql = "insert into cinema (nomefantasia, rua, cidade, bairro, estado , lotacao)"
            + "values (?,?,?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNomeFantasia());
            stmt.setString(2, obj.getRua());
            stmt.setString(3, obj.getCidade());
            stmt.setString(4, obj.getBairro());
            stmt.setString(5, obj.getEstado());
            stmt.setInt(6, obj.getLotacao());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao efetuar o cadastro"+ erro);
        }
  
    }
    public List<Cinemas> listarCinema(){
        
        try{
            List<Cinemas> lista = new ArrayList<>();
            
            String sql= "select * from cinema";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            
            while (rs.next()){
                Cinemas obj = new Cinemas();
                
                obj.setCodigo(rs.getInt("Codigo"));
                obj.setNomeFantasia(rs.getString("NomeFantasia"));
                obj.setRua(rs.getString("Rua"));
                obj.setCidade(rs.getString("Cidade"));
                obj.setBairro(rs.getString("Bairro"));
                obj.setEstado(rs.getString("Estado"));
                obj.setLotacao(rs.getInt("Lotacao"));
        
            lista.add(obj);
        }
            return lista;
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao listar os dados!" +erro);
            return null;
        }
        }
   



public void alterarCinema (Cinemas obj){
try{
    String sql= "update cinema set nomefantasia=?, rua=?, cidade=?, bairro=? , estado=?, lotacao=? where codigo=?";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
            stmt.setString(1, obj.getNomeFantasia());
            stmt.setString(2, obj.getRua());
            stmt.setString(3, obj.getCidade());
            stmt.setString(4, obj.getBairro());
            stmt.setString(5, obj.getEstado());
            stmt.setInt(6, obj.getLotacao());
            stmt.setInt(7, obj.getCodigo());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao efetuar o cadastro"+ erro);
        }
  
}

public void excluirCinema (Cinemas obj){
    try{
        String sql= "delete from cinema where codigo=?";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,obj.getCodigo());
        
        stmt.execute();
        stmt.close();
        
        JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
    }
    catch (SQLException erro){
        JOptionPane.showMessageDialog(null, "Erro ao efetuar o cadastro" + erro);
    }
}


public List<Cinemas> buscaCinemaPorNome (String nomefantasia){
    try{
        List<Cinemas> lista = new ArrayList<>();
        
        String sql = "select * from cinema where nomefantasia like?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString (1,nomefantasia);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            Cinemas obj = new Cinemas();
        

                obj.setCodigo(rs.getInt("Codigo"));
                obj.setNomeFantasia(rs.getString("NomeFantasia"));
                obj.setRua(rs.getString("Rua"));
                obj.setCidade(rs.getString("Cidade"));
                obj.setBairro(rs.getString("Bairro"));
                obj.setEstado(rs.getString("Estado"));
                obj.setLotacao(rs.getInt("Lotacao"));

                lista.add(obj);
        }

    return lista;
}
catch (SQLException erro){
    JOptionPane.showMessageDialog(null, "Erro ao listar!" +erro);
    return null;
}
}
}