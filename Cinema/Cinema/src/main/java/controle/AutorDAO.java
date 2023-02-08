
package controle;

import conexao.ConectarFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Autor;

public class AutorDAO {
    private Connection con;
    public AutorDAO(){
    this.con = new ConectarFactory().getConection();
}
    
    public void cadastrarAutor(Autor obj){
        try{
            String sql = "insert into autor (Nome,nacionalidade,sexo,idade)"
            + "values (?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getNacionalidade());
            stmt.setString(3, obj.getSexo());
            stmt.setString(4, obj.getIdade());
 
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao efetuar o cadastro"+ erro);
        }
    }
  public List<Autor> listarAutor(){
        
        try{
            List<Autor> lista = new ArrayList<>();
            
            String sql= "select * from autor";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            
            while (rs.next()){
                Autor obj = new Autor();
                
                obj.setCodAutor(rs.getInt("CodAutor"));
                obj.setNome(rs.getString("Nome"));
                obj.setNacionalidade(rs.getString("Nacionalidade"));
                obj.setSexo(rs.getString("Sexo"));
                obj.setIdade(rs.getString("Idade"));
                
        
            lista.add(obj);
        }
            return lista;
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao listar os dados!" +erro);
            return null;
        }
        }
   

public void alterarAutor (Autor obj){
try{
    String sql= "update autor set Nome=?, nacionalidade=?, Sexo=?, Idade=? where codAutor=?";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getNacionalidade());
            stmt.setString(3, obj.getSexo());
            stmt.setString(4, obj.getIdade());
       
        
            stmt.setInt(5, obj.getCodAutor());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao efetuar o cadastro"+ erro);
        }
  
}

public void excluirAutor (Autor obj){
    try{
        String sql= "delete from Autor where codAutor=?";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,obj.getCodAutor());
        
        stmt.execute();
        stmt.close();
        
        JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
    }
    catch (SQLException erro){
        JOptionPane.showMessageDialog(null, "Erro ao excluir" + erro);
    }
}


public List<Autor> buscaCinemaPorNome (String nome){
    try{
        List<Autor> lista = new ArrayList<>();
        
        String sql = "select * from autor where nome like?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString (1,nome);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            Autor obj = new Autor();
        

                obj.setCodAutor(rs.getInt("CodAutor"));
                obj.setNome(rs.getString("Nome"));
                obj.setNacionalidade(rs.getString("Nacionalidade"));
                obj.setSexo(rs.getString("Sexo"));
                obj.setIdade(rs.getString("Idade"));
              

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
        
