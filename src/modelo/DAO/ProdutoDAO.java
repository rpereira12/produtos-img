
package modelo.DAO;

import modelo.Connection.Conecta;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Beans.Produto;

public class ProdutoDAO {
    Conecta conexaoBD = new Conecta();
    Produto prod = new Produto();
    
    public void Salvar(Produto prod){
        conexaoBD.conexao();
        try {
            
            PreparedStatement pst;
            pst = conexaoBD.con.prepareStatement("INSERT INTO produto (nome_produto, sigla_produto, categoria_produto, descricao_produto, comprimento_produto, largura_produto, altura_produto, preco_produto, imagem_produto) values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, prod.getNomeProd());
            pst.setString(2, prod.getSiglaProd());
            pst.setString(3, prod.getCategoriaProd());
            pst.setString(4, prod.getDescProd());
            pst.setDouble(5, prod.getCompProd());
            pst.setDouble(6, prod.getLargProd());
            pst.setDouble(7, prod.getAltProd());
            pst.setDouble(8, prod.getPrecoProd());
            pst.setBytes(9, prod.getImagem());
            
            pst.execute();           
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados: \n"+ex.getMessage());
        }
        
        conexaoBD.desconectar();
    }
    
    public Produto buscaProduto(Produto prod){
        conexaoBD.conexao();
        conexaoBD.executaSql("SELECT * from produto where sigla_produto ~* '"+prod.getPesquisa()+"'");
        try {
            conexaoBD.rs.first();
            prod.setNomeProd(conexaoBD.rs.getString("nome_produto"));
            prod.setSiglaProd(conexaoBD.rs.getString("sigla_produto"));
            prod.setCategoriaProd(conexaoBD.rs.getString("categoria_produto"));
            prod.setDescProd(conexaoBD.rs.getString("descricao_produto"));
            prod.setCompProd(conexaoBD.rs.getDouble("comprimento_produto"));
            prod.setLargProd(conexaoBD.rs.getDouble("largura_produto"));
            prod.setAltProd(conexaoBD.rs.getDouble("altura_produto"));
            prod.setPrecoProd(conexaoBD.rs.getDouble("preco_produto"));
            prod.setImagem(conexaoBD.rs.getBytes("imagem_produto"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto, por favor verifique o conteúdo a ser pesquisado: \n"+ex.getMessage());
        }
        
        
        conexaoBD.desconectar();
        return prod;
    }
    
    public void editaProduto(Produto prod){
        conexaoBD.conexao();
        
        try {
            PreparedStatement pst = conexaoBD.con.prepareStatement("UPDATE produto set nome_produto=?, sigla_produto=?, categoria_produto=?, descricao_produto=?, comprimento_produto=?, largura_produto=?, altura_produto=?, preco_produto=?, imagem_produto=? WHERE sigla_produto=?");
            pst.setString(1, prod.getNomeProd());
            pst.setString(2, prod.getSiglaProd());
            pst.setString(3, prod.getCategoriaProd());
            pst.setString(4, prod.getDescProd());
            pst.setDouble(5, prod.getCompProd());
            pst.setDouble(6, prod.getLargProd());
            pst.setDouble(7, prod.getAltProd());
            pst.setDouble(8, prod.getPrecoProd());
            pst.setBytes(9, prod.getImagem());
            pst.setString(10, prod.getSiglaProd());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados: \n"+ex.getMessage());
        }
        
        conexaoBD.desconectar();
    }
    
    public void excluiProduto(Produto prod){
        conexaoBD.conexao();
        try {
            PreparedStatement pst = conexaoBD.con.prepareStatement("DELETE from produto where sigla_produto=?");
            pst.setString(1, prod.getSiglaProd());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão dos dados: \n"+ex.getMessage());
        }
        conexaoBD.desconectar();
    }
}
