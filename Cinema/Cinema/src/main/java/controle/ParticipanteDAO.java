
package controle;

import conexao.ConectarFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Participantes;

public class ParticipanteDAO {
    private Connection con;
    public ParticipanteDAO(){
    this.con = new ConectarFactory().getConection();
}
    
    public void cadastrarParticipante(Participantes obj){
        try{
            String sql = "insert into ParticipanteFilme (personagem, nome, tituloOriginal,Filme_codFilme,Autor_codAutor)"
            + "values (?,?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, obj.getPersonagem());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getTituloOriginal());
            stmt.setInt(4, obj.getFilme().getCodFilme());
            stmt.setInt(5, obj.getAutor().getCodAutor());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao efetuar o cadastro"+ erro);
        }
    }
  public List<Participantes> listarParticipante(){
        
        try{
            List<Participantes> lista = new ArrayList<>();
            
            String sql= "select * from participanteFilme";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            
            while (rs.next()){
                Participantes obj = new Participantes();
                
                obj.setCodParticipanteFilme(rs.getInt("CodParticipanteFilme"));
                obj.setPersonagem(rs.getString("Personagem"));
                obj.setNome(rs.getString("Nome"));
                obj.setTituloOriginal(rs.getString("TituloOriginal"));
            
        
            lista.add(obj);
        }
            return lista;
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao listar os dados!" +erro);
            return null;
        }
        }
   

public void alterarParticipante (Participantes obj){
try{
    String sql= "update participanteFilme set Personagem=?, Nome=?, TituloOriginal=? where codParticipanteFilme=?";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
            stmt.setString(1, obj.getPersonagem());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getTituloOriginal());
            
          
            stmt.setInt(4, obj.getCodParticipanteFilme());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao efetuar o cadastro"+ erro);
        }
  
}

public void excluirParticipante (Participantes obj){
    try{
        String sql= "delete from Participantefilme where codParticipanteFilme=?";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,obj.getCodParticipanteFilme());
        
        stmt.execute();
        stmt.close();
        
        JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
    }
    catch (SQLException erro){
        JOptionPane.showMessageDialog(null, "Erro ao efetuar o cadastro" + erro);
    }
}


public List<Participantes> buscaCinemaPorNome (String Personagem){
    try{
        List<Participantes> lista = new ArrayList<>();
        
        String sql = "select * from Participantefilme where personagem like?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString (1,Personagem);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            Participantes obj = new Participantes();
        

                obj.setCodParticipanteFilme(rs.getInt("CodParticiánteFilme"));
                obj.setPersonagem(rs.getString("Personagem"));
                obj.setNome(rs.getString("Nome"));
                obj.setTituloOriginal(rs.getString("TituloOriginal"));
                

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
        
