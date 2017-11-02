/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.Beans.Cliente;
import controle.ModeloTabela;
import modelo.Connection.Conecta;
import modelo.DAO.ClienteDAO;

/**
 *
 * @author FamiliaPereira
 */
public class TelaClientes extends javax.swing.JFrame {

    Cliente cliente = new Cliente();
    ClienteDAO clienteBD = new ClienteDAO();
    Conecta conexaoBD = new Conecta();
    int flag = 0;

    /**
     * Creates new form Clientes
     */
    public TelaClientes() {
        initComponents();
        preencherTabela("SELECT * from cliente order by nome_cliente");

        jTextFieldNome.setEnabled(false);
        jTextFieldCnpj.setEnabled(false);
        jTextFieldInscricao.setEnabled(false);
        jTextFieldLogradouro.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldNumero.setEnabled(false);
        jTextFieldComplemento.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jTextFieldEmail.setEnabled(false);
        jTextFieldSite.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCnpj = new javax.swing.JTextField();
        jTextFieldInscricao = new javax.swing.JTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jTextFieldSite = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPesquisa = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jButtonCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jButtonAtualizarLista = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 183, 53, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inscrição Estadual:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 180, 130, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Complemento:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(560, 250, 100, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telefone:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 320, 80, 20);

        jTextFieldNome.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldNome);
        jTextFieldNome.setBounds(67, 174, 209, 29);

        jTextFieldCnpj.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldCnpj.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldCnpj);
        jTextFieldCnpj.setBounds(331, 173, 120, 30);

        jTextFieldInscricao.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldInscricao.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldInscricao);
        jTextFieldInscricao.setBounds(600, 170, 140, 30);

        jTextFieldComplemento.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldComplemento.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldComplementoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldComplemento);
        jTextFieldComplemento.setBounds(660, 240, 80, 30);

        jTextFieldSite.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldSite.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldSite);
        jTextFieldSite.setBounds(540, 310, 200, 30);

        jButtonSalvar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/diskette.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvar);
        jButtonSalvar.setBounds(119, 11, 91, 67);

        jButtonSair.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSair);
        jButtonSair.setBounds(675, 431, 91, 80);

        jButtonNovo.setBackground(new java.awt.Color(0, 0, 0));
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/plus.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNovo);
        jButtonNovo.setBounds(10, 10, 91, 70);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 221, 728, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(10, 287, 728, 16);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(10, 360, 728, 10);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pesquisar (Nome do Cliente):");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 110, 200, 22);

        jTextFieldPesquisa.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldPesquisa);
        jTextFieldPesquisa.setBounds(228, 103, 90, 30);

        jButtonEditar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar);
        jButtonEditar.setBounds(230, 10, 91, 67);

        jButtonExcluir.setBackground(new java.awt.Color(0, 0, 0));
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExcluir);
        jButtonExcluir.setBounds(337, 11, 91, 67);

        jButtonPesquisa.setBackground(new java.awt.Color(0, 0, 0));
        jButtonPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/research.png"))); // NOI18N
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisa);
        jButtonPesquisa.setBounds(330, 93, 40, 40);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(10, 153, 725, 10);

        jButtonCancelar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar);
        jButtonCancelar.setBounds(446, 11, 91, 67);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Site:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(510, 320, 50, 17);

        jTextFieldTelefone.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldTelefone);
        jTextFieldTelefone.setBounds(70, 310, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 320, 50, 17);

        jTextFieldEmail.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(290, 310, 209, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Logradouro:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 250, 90, 17);

        jTextFieldLogradouro.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldLogradouro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldLogradouro.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldLogradouro);
        jTextFieldLogradouro.setBounds(90, 240, 80, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Endereço:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(180, 250, 70, 17);

        jTextFieldEndereco.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldEndereco);
        jTextFieldEndereco.setBounds(250, 240, 180, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Numero:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(440, 250, 60, 17);

        jTextFieldNumero.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNumero.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNumero);
        jTextFieldNumero.setBounds(500, 240, 50, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CNPJ:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(290, 180, 59, 17);

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "CNPJ"
            }
        ));
        jScrollPane1.setViewportView(jTableClientes);

        jButtonAtualizarLista.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAtualizarLista.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtualizarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/refresh.png"))); // NOI18N
        jButtonAtualizarLista.setText("Atualizar Lista");
        jButtonAtualizarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAtualizarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtualizarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Relação de Clientes", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(30, 80, 810, 550);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-70, -76, 1250, 760);

        setSize(new java.awt.Dimension(889, 694));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtualizarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarListaActionPerformed
        preencherTabela("SELECT * from cliente order by nome_cliente");
    }//GEN-LAST:event_jButtonAtualizarListaActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(false);
        jTextFieldCnpj.setEnabled(false);
        jTextFieldInscricao.setEnabled(false);
        jTextFieldLogradouro.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldNumero.setEnabled(false);
        jTextFieldComplemento.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jTextFieldEmail.setEnabled(false);
        jTextFieldSite.setEnabled(false);

        jButtonPesquisa.setEnabled(true);
        jTextFieldPesquisa.setEnabled(true);
        jTextFieldPesquisa.setText("");

        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisa.setEnabled(true);

        jTextFieldNome.setText("");
        jTextFieldCnpj.setText("");
        jTextFieldInscricao.setText("");
        jTextFieldLogradouro.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNumero.setText("");
        jTextFieldComplemento.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldEmail.setText("");
        jTextFieldSite.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
        if ("".equals(jTextFieldPesquisa.getText())) {
            JOptionPane.showMessageDialog(null, "O campo de pesquisa não pode ficar vazio.");
        } else {
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            jButtonNovo.setEnabled(false);

            cliente.setPesquisa(jTextFieldPesquisa.getText());
            Cliente modelo = clienteBD.buscaCliente(cliente);
            jTextFieldNome.setText(modelo.getNome());
            jTextFieldCnpj.setText(String.valueOf(modelo.getCnpj()));
            jTextFieldInscricao.setText(String.valueOf(modelo.getInscricaoEstadual()));
            jTextFieldLogradouro.setText(modelo.getLogradouro());
            jTextFieldEndereco.setText(modelo.getEndereco());
            jTextFieldNumero.setText(String.valueOf(modelo.getNumEndereco()));
            jTextFieldComplemento.setText(modelo.getComplemento());
            jTextFieldTelefone.setText(String.valueOf(modelo.getTelefone()));
            jTextFieldEmail.setText(modelo.getEmail());
            jTextFieldSite.setText(modelo.getSite());

        }
    }//GEN-LAST:event_jButtonPesquisaActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;

        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir o objeto?");

        if (resposta == JOptionPane.YES_OPTION) {
            cliente.setNome(jTextFieldNome.getText());
            clienteBD.excluiCliente(cliente);
        }

        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);


        jButtonPesquisa.setEnabled(true);
        jTextFieldPesquisa.setEnabled(true);
        jTextFieldPesquisa.setText("");

        jTextFieldNome.setText("");
        jTextFieldCnpj.setText("");
        jTextFieldInscricao.setText("");
        jTextFieldLogradouro.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNumero.setText("");
        jTextFieldComplemento.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldEmail.setText("");
        jTextFieldSite.setText("");
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

        flag = 2;

        jTextFieldNome.setEnabled(true);
        jTextFieldCnpj.setEnabled(true);
        jTextFieldInscricao.setEnabled(true);
        jTextFieldLogradouro.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldNumero.setEnabled(true);
        jTextFieldComplemento.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldSite.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonPesquisa.setEnabled(false);
        jTextFieldPesquisa.setEnabled(false);
        jButtonEditar.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed

        flag = 1;

        jTextFieldNome.setEnabled(true);
        jTextFieldCnpj.setEnabled(true);
        jTextFieldInscricao.setEnabled(true);
        jTextFieldLogradouro.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldNumero.setEnabled(true);
        jTextFieldComplemento.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldSite.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonPesquisa.setEnabled(false);
        jTextFieldPesquisa.setEnabled(false);

        jTextFieldNome.setText("");
        jTextFieldCnpj.setText("");
        jTextFieldInscricao.setText("");
        jTextFieldLogradouro.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNumero.setText("");
        jTextFieldComplemento.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldEmail.setText("");
        jTextFieldSite.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();

        Principal telaPrincipal = new Principal();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (flag == 1) {
            try {
                cliente.setNome(jTextFieldNome.getText());
                cliente.setCnpj(Long.parseLong(jTextFieldCnpj.getText()));
                cliente.setInscricaoEstadual(Long.parseLong(jTextFieldInscricao.getText()));
                cliente.setLogradouro(jTextFieldLogradouro.getText());
                cliente.setEndereco(jTextFieldEndereco.getText());
                cliente.setNumEndereco(Integer.parseInt(jTextFieldNumero.getText()));
                cliente.setComplemento(jTextFieldComplemento.getText());
                cliente.setTelefone(Long.parseLong(jTextFieldTelefone.getText()));
                cliente.setEmail(jTextFieldEmail.getText());
                cliente.setSite(jTextFieldSite.getText());

                clienteBD.Salvar(cliente);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "não foi possível gravar cliente:" + ex.getMessage());
            }
        } else {
            cliente.setNome(jTextFieldNome.getText());
            cliente.setCnpj(Long.parseLong(jTextFieldCnpj.getText()));
            cliente.setInscricaoEstadual(Long.parseLong(jTextFieldInscricao.getText()));
            cliente.setLogradouro(jTextFieldLogradouro.getText());
            cliente.setEndereco(jTextFieldEndereco.getText());
            cliente.setNumEndereco(Integer.parseInt(jTextFieldNumero.getText()));
            cliente.setComplemento(jTextFieldComplemento.getText());
            cliente.setTelefone(Long.parseLong(jTextFieldTelefone.getText()));
            cliente.setEmail(jTextFieldEmail.getText());
            cliente.setSite(jTextFieldSite.getText());

            clienteBD.editaCliente(cliente);

        }
        jTextFieldNome.setEnabled(false);
        jTextFieldCnpj.setEnabled(false);
        jTextFieldInscricao.setEnabled(false);
        jTextFieldLogradouro.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldNumero.setEnabled(false);
        jTextFieldComplemento.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jTextFieldEmail.setEnabled(false);
        jTextFieldSite.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);


        jButtonPesquisa.setEnabled(true);
        jTextFieldPesquisa.setEnabled(true);
        jTextFieldPesquisa.setText("");

        jTextFieldNome.setText("");
        jTextFieldCnpj.setText("");
        jTextFieldInscricao.setText("");
        jTextFieldLogradouro.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNumero.setText("");
        jTextFieldComplemento.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldEmail.setText("");
        jTextFieldSite.setText("");
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldComplementoActionPerformed

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome", "Cnpj"};
        conexaoBD.conexao();
        conexaoBD.executaSql(sql);

        try {
            conexaoBD.rs.first();
            do {
                dados.add(new Object[]{conexaoBD.rs.getString("nome_cliente"), conexaoBD.rs.getString("cnpj_cliente")});
            } while (conexaoBD.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao carregar tabela");
        }

        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        jTableClientes.setModel(modelo);
        jTableClientes.getColumnModel().getColumn(0).setPreferredWidth(300);
        jTableClientes.getColumnModel().getColumn(0).setResizable(false);
        jTableClientes.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTableClientes.getColumnModel().getColumn(1).setResizable(false);
        jTableClientes.getTableHeader().setReorderingAllowed(false);
        jTableClientes.setAutoResizeMode(jTableClientes.AUTO_RESIZE_OFF);
        jTableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conexaoBD.desconectar();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizarLista;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldCnpj;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldInscricao;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldSite;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables

}