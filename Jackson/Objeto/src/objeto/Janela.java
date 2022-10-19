/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Janela extends javax.swing.JFrame {
    ArrayList<Aluno> lista = new ArrayList<>();
    public Janela() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        campoCpf = new javax.swing.JTextField();
        campoMatricula = new javax.swing.JTextField();
        campoIdade = new javax.swing.JTextField();
        labelTitulo = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        labelIdade = new javax.swing.JLabel();
        btnCadastra = new javax.swing.JButton();
        btnEdita = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        btnExclui = new javax.swing.JButton();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Painel.setBackground(new java.awt.Color(204, 255, 255));
        Painel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Painel.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 300, 40));

        campoCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Painel.add(campoCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 300, 40));

        campoMatricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Painel.add(campoMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 300, 40));

        campoIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdadeActionPerformed(evt);
            }
        });
        Painel.add(campoIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 300, 40));

        labelTitulo.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Cadastro de Alunos");
        Painel.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 560, 35));

        labelNome.setBackground(new java.awt.Color(204, 204, 255));
        labelNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelNome.setText("Nome:");
        Painel.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 70, -1));

        labelCpf.setBackground(new java.awt.Color(204, 204, 255));
        labelCpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelCpf.setText("CPF:");
        Painel.add(labelCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 50, -1));

        labelMatricula.setBackground(new java.awt.Color(204, 204, 255));
        labelMatricula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelMatricula.setText("Matrícula:");
        Painel.add(labelMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        labelIdade.setBackground(new java.awt.Color(204, 204, 255));
        labelIdade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelIdade.setText("Idade:");
        Painel.add(labelIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        btnCadastra.setBackground(new java.awt.Color(204, 255, 255));
        btnCadastra.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCadastra.setText("Cadastrar");
        btnCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraActionPerformed(evt);
            }
        });
        Painel.add(btnCadastra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 120, 40));

        btnEdita.setBackground(new java.awt.Color(204, 255, 255));
        btnEdita.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEdita.setText("Editar");
        btnEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaActionPerformed(evt);
            }
        });
        Painel.add(btnEdita, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 120, 40));

        btnLista.setBackground(new java.awt.Color(204, 255, 255));
        btnLista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLista.setText("Listar");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });
        Painel.add(btnLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 120, 40));

        btnExclui.setBackground(new java.awt.Color(204, 255, 255));
        btnExclui.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnExclui.setText("Excluir");
        btnExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluiActionPerformed(evt);
            }
        });
        Painel.add(btnExclui, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 120, 40));
        Painel.add(labelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraActionPerformed
        cadastraAluno();
    }//GEN-LAST:event_btnCadastraActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        String alunos = "Alunos";
        for (Aluno a : lista) {
            alunos += "\n______\nnome: " + a.getNome() + "\nCPF: " + a.getCpf() + "\nMatrícula: " + a.getMatricula()
                    + "\nIdade: " + a.getIdade();
        }
        JOptionPane.showMessageDialog(this, alunos);
    }//GEN-LAST:event_btnListaActionPerformed

    private void btnEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaActionPerformed
        String mat = JOptionPane.showInputDialog(this, "Digite a matrícula do aluno que deseja editar!");
        String mensagem = "Matrícula não encontrada!";
        for (Aluno a : lista) {
            if (a.getMatricula().equals(mat)) {
                mensagem = "Aluno editado com sucesso!";
                String[] opcoes = {"Nome", "Matrícula", "CPF", "Idade"};
                int escolha = JOptionPane.showOptionDialog(this, "Qual informação deseja editar?", a.getNome(), WIDTH, WIDTH, null, opcoes, opcoes[0]);
                switch (escolha) {
                    case 0:
                        //alterar o nome do aluno
                        a.setNome(JOptionPane.showInputDialog(this, "Digite o novo nome!"));
                        break;
                    case 1:
                        //alterar a matrícula do aluno
                        a.setMatricula(JOptionPane.showInputDialog(this, "Digite a nova matrícula!"));
                        break;
                    case 2:
                        //alterar o CPF do aluno
                        a.setCpf(JOptionPane.showInputDialog(this, "Digite o novo CPF!"));
                        break;
                    case 3:
                        //alterar a idade do aluno
                        try {
                            a.setIdade(Integer.parseInt(JOptionPane.showInputDialog(this, "Digite a nova idade!")));
                        } catch (Exception e) {
                            mensagem = "Idade inválida!";
                        }
                        break;
                }
            }
        }
        JOptionPane.showMessageDialog(this, mensagem);
    }//GEN-LAST:event_btnEditaActionPerformed

    private void btnExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluiActionPerformed
        String mat = JOptionPane.showInputDialog(this, "Qual a matrícula do aluno que você deseja excluir o cadastro?");
        for(Aluno p:lista){
           if(mat.equals(p.getMatricula())){
               lista.remove(p);
               JOptionPane.showMessageDialog(this, "Aluno Excluido com sucesso");
           }
           else{
               JOptionPane.showMessageDialog(this, "Matrícula invalida");
            }
        
        }
    }//GEN-LAST:event_btnExcluiActionPerformed

    private void campoIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdadeActionPerformed
    public void cadastraAluno() {
        try {
            String nome = campoNome.getText();
            int idade = Integer.parseInt(campoIdade.getText());
            String cpf = campoCpf.getText();
            String matricula = campoMatricula.getText();
            Aluno a = new Aluno(matricula, nome, idade, cpf);
            lista.add(a);
            JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
            campoNome.setText("");
            campoIdade.setText("");
            campoCpf.setText("");
            campoMatricula.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Verifique as informações!");
        }

    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel;
    private javax.swing.JButton btnCadastra;
    private javax.swing.JButton btnEdita;
    private javax.swing.JButton btnExclui;
    public javax.swing.JButton btnLista;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoIdade;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
