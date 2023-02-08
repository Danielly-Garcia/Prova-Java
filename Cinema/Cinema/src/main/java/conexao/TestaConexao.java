package conexao;

import javax.swing.JOptionPane;

public class TestaConexao {
    public static void main(String[] args){
        try {
            new ConectarFactory().getConection();
            JOptionPane.showMessageDialog(null,"Conectado com Sucesso");
        } catch (Exception erro){
            JOptionPane.showMessageDialog(null, "Erro na conexão!" + erro);
        }
    }
}
