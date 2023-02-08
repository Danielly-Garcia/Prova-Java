
package controle;

import conexao.ConectarFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Exibicao;


public class ExibicaoDAO {
    private Connection con;
    public ExibicaoDAO(){
    this.con = new ConectarFactory().getConection();
}
    
    public void cadastrarExibicao(Exibicao obj){
        try{
            String sql = "insert into Exibicao (dataInicio, dataFim,Cinema_CodCinema, Filme_codFilme)"
            + "values (?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, obj.getDataI());
            stmt.setString(2, obj.getDataF());
            stmt.setInt(3, obj.getCinema().getCodigo());
            stmt.setInt(4, obj.getFilme().getCodFilme());
           
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao efetuar o cadastro"+ erro);
        }
    }
  public List<Exibicao> listarExibicao(){
        
        try{
            List<Exibicao> lista = new ArrayList<>();
            
            String sql= "select * from Exibicao";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            
            while (rs.next()){
                Exibicao obj = new Exibicao();
                
                //obj.setCod_cine(rs.getInt("Cod_Cine"));
                obj.setCodExibicao(rs.getInt("CodExibicao"));
                obj.setDataI(rs.getString("DataInicio"));
                obj.setDataF(rs.getString("DataFim"));
               
            
        
            lista.add(obj);
        }
            return lista;
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao listar os dados!" +erro);
            return null;
        }
        }
   

public void alterarExibicao (Exibicao obj){
try{
    String sql= "update exibicao set DataInicio=?, DataFim=? where codExibicao=?";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
            stmt.setString(1, obj.getDataI());
            stmt.setString(2, obj.getDataF());
            
            
          
            stmt.setInt(3, obj.getCodExibicao());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao efetuar o cadastro"+ erro);
        }
  
}

public void excluirExibicao(Exibicao obj){
    try{
        String sql= "delete from exibicao where codExibicao=?";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,obj.getCodExibicao());
        
        stmt.execute();
        stmt.close();
        
        JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
    }
    catch (SQLException erro){
        JOptionPane.showMessageDialog(null, "Erro ao efetuar o cadastro" + erro);
    }
}


public List<Exibicao> buscaCinemaPorNome (String DataInicio){
    try{
        List<Exibicao> lista = new ArrayList<>();
        
        String sql = "select * from Exibicao where DataInicio = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString (1,DataInicio);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            Exibicao obj = new Exibicao();
        
                //obj.setCod_cine(rs.getInt("Cod_Cine"));
                obj.setCodExibicao(rs.getInt("CodExibicao"));
                obj.setDataI(rs.getString("DataI"));
                obj.setDataF(rs.getString("DataF"));

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
        
