package modelo.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Beans.Cliente;
import modelo.Connection.Conecta;

public class ClienteDAO {

    Conecta conexaoBD = new Conecta();
    Cliente cliente = new Cliente();

    public void Salvar(Cliente cliente) {
        conexaoBD.conexao();
        try {

            PreparedStatement pst;
            pst = conexaoBD.con.prepareStatement("INSERT INTO cliente (nome_cliente, cnpj_cliente, inscricao_cliente, logradouro_cliente, endereco_cliente, num_endereco_cliente, complemento_cliente, telefone_cliente, email_cliente, site_cliente) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, cliente.getNome());
            pst.setLong(2, cliente.getCnpj());
            pst.setLong(3, cliente.getInscricaoEstadual());
            pst.setString(4, cliente.getLogradouro());
            pst.setString(5, cliente.getEndereco());
            pst.setInt(6, cliente.getNumEndereco());
            pst.setString(7, cliente.getComplemento());
            pst.setLong(8, cliente.getTelefone());
            pst.setString(9, cliente.getEmail());
            pst.setString(10, cliente.getSite());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados: \n" + ex.getMessage());
        }

        conexaoBD.desconectar();

    }

    public Cliente buscaCliente(Cliente cliente) {
        conexaoBD.conexao();
        conexaoBD.executaSql("SELECT * from cliente where nome_cliente ~* '" + cliente.getPesquisa() + "'");
        try {
            conexaoBD.rs.first();
            cliente.setNome(conexaoBD.rs.getString("nome_cliente"));
            cliente.setCnpj(conexaoBD.rs.getLong("cnpj_cliente"));
            cliente.setInscricaoEstadual(conexaoBD.rs.getLong("inscricao_cliente"));
            cliente.setLogradouro(conexaoBD.rs.getString("logradouro_cliente"));
            cliente.setEndereco(conexaoBD.rs.getString("endereco_cliente"));
            cliente.setNumEndereco(conexaoBD.rs.getInt("num_endereco_cliente"));
            cliente.setComplemento(conexaoBD.rs.getString("complemento_cliente"));
            cliente.setTelefone(conexaoBD.rs.getLong("telefone_cliente"));
            cliente.setEmail(conexaoBD.rs.getString("email_cliente"));
            cliente.setSite(conexaoBD.rs.getString("site_cliente"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto, por favor verifique o conteúdo a ser pesquisado: \n" + ex.getMessage());
        }

        conexaoBD.desconectar();
        return cliente;
    }

    public void editaCliente(Cliente cliente) {
        conexaoBD.conexao();

        try {
            PreparedStatement pst = conexaoBD.con.prepareStatement("UPDATE cliente set nome_cliente=?, cnpj_cliente=?, inscricao_cliente=?, logradouro_cliente=?, endereco_cliente=?, num_endereco_cliente=?, complemento_cliente=?, telefone_cliente=?, email_cliente=?, site_cliente=? WHERE nome_cliente=?");
            pst.setString(1, cliente.getNome());
            pst.setLong(2, cliente.getCnpj());
            pst.setLong(3, cliente.getInscricaoEstadual());
            pst.setString(4, cliente.getLogradouro());
            pst.setString(5, cliente.getEndereco());
            pst.setInt(6, cliente.getNumEndereco());
            pst.setString(7, cliente.getComplemento());
            pst.setLong(8, cliente.getTelefone());
            pst.setString(9, cliente.getEmail());
            pst.setString(10, cliente.getSite());
            pst.setString(11, cliente.getNome());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados: \n" + ex.getMessage());
        }

        conexaoBD.desconectar();
    }
    
        public void excluiCliente(Cliente cliente){
        conexaoBD.conexao();
        try {
            PreparedStatement pst = conexaoBD.con.prepareStatement("DELETE from cliente where nome_cliente=?");
            pst.setString(1, cliente.getNome());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão dos dados: \n"+ex.getMessage());
        }
        conexaoBD.desconectar();
    }
}
