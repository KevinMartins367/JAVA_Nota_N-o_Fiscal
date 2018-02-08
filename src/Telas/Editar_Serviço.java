package Telas;

import Bean.ClienteBean;
import Bean.RelacaoBean;
import Bean.ServicosBean;
import Controller.RelacaoController;
import Controller.ServicosController;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Editar_Serviço extends javax.swing.JFrame {

    Integer valor;
    Integer impri = 0;
    public Editar_Serviço() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        TXT_Paciente = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LBL_Nome_Dr = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LBL_Obs = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LBL_Serv_1 = new javax.swing.JLabel();
        LBL_Serv_2 = new javax.swing.JLabel();
        LBL_Serv_3 = new javax.swing.JLabel();
        LBL_Serv_4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        LBL_Cor = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        LBL_Tipo = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        LBL_Total = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BTN_Salvar_Alteracao = new javax.swing.JButton();
        CBOX_Desconto = new javax.swing.JComboBox();
        CBOX_Urg1 = new javax.swing.JCheckBox();
        CBOX_Urg4 = new javax.swing.JCheckBox();
        CBOX_Urg3 = new javax.swing.JCheckBox();
        CBOX_Urg2 = new javax.swing.JCheckBox();
        jDateEntrada = new com.toedter.calendar.JDateChooser();
        jDateSaida = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel66.setText("Data de Entrada");
        getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel67.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel67.setText("Paciente");
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        TXT_Paciente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(TXT_Paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, -1));

        jLabel71.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel71.setText("Data de Saída");
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Dr.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        LBL_Nome_Dr.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Nome_Dr.setText("*");
        getContentPane().add(LBL_Nome_Dr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 340, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Obs:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        LBL_Obs.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Obs.setText("*");
        getContentPane().add(LBL_Obs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 340, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("QTD.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Serviços");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Ungência");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));

        LBL_Serv_1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Serv_1.setText("*");
        getContentPane().add(LBL_Serv_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 450, -1));

        LBL_Serv_2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Serv_2.setText("*");
        getContentPane().add(LBL_Serv_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 450, -1));

        LBL_Serv_3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Serv_3.setText("*");
        getContentPane().add(LBL_Serv_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 450, -1));

        LBL_Serv_4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Serv_4.setText("*");
        getContentPane().add(LBL_Serv_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 450, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel21.setText("Cor");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        LBL_Cor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Cor.setText("*");
        getContentPane().add(LBL_Cor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 130, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel23.setText("Desconto (%)");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel25.setText("Tipo");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        LBL_Tipo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Tipo.setText("*");
        getContentPane().add(LBL_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 100, -1));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Total");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 80, -1));

        LBL_Total.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Total.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBL_Total.setText("*");
        getContentPane().add(LBL_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 80, -1));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Imprimir.png"))); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, 160, 60));

        BTN_Salvar_Alteracao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Salvar_Alteracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Check.png"))); // NOI18N
        BTN_Salvar_Alteracao.setText("Salvar");
        BTN_Salvar_Alteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Salvar_AlteracaoActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Salvar_Alteracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 160, 60));

        CBOX_Desconto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Desconto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Desconto (%)", "0", "5", "10", "15", "20", "25", "30" }));
        CBOX_Desconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_DescontoActionPerformed(evt);
            }
        });
        getContentPane().add(CBOX_Desconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 140, -1));

        CBOX_Urg1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CBOX_Urg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Urg1ActionPerformed(evt);
            }
        });
        getContentPane().add(CBOX_Urg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 30, -1));

        CBOX_Urg4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CBOX_Urg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Urg4ActionPerformed(evt);
            }
        });
        getContentPane().add(CBOX_Urg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 130, 30, -1));

        CBOX_Urg3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CBOX_Urg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Urg3ActionPerformed(evt);
            }
        });
        getContentPane().add(CBOX_Urg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, 30, -1));

        CBOX_Urg2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CBOX_Urg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Urg2ActionPerformed(evt);
            }
        });
        getContentPane().add(CBOX_Urg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 30, -1));
        getContentPane().add(jDateEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, -1));
        getContentPane().add(jDateSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background-2076334_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_Salvar_AlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Salvar_AlteracaoActionPerformed
        
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        String entrada = sf.format(jDateEntrada.getDate());
        String saida = sf.format(jDateSaida.getDate());
        String paci = TXT_Paciente.getText();
        Double total = null;
        try {
            total = converte(LBL_Total.getText());
        } catch (ParseException ex) {
            Logger.getLogger(Editar_Serviço.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        RelacaoBean rb = new RelacaoBean();
        rb.setRela_dt(entrada);
        rb.setRela_Entrega(saida);
        rb.setRela_Paciente(paci);
        rb.setRela_Total(String.valueOf(total));

        Integer entrega;
        if (CBOX_Urg1.isSelected() || CBOX_Urg2.isSelected() || CBOX_Urg3.isSelected() || CBOX_Urg4.isSelected()) {
            entrega = 1;
        } else {
            entrega = 0;
        }
        rb.setRela_Tipo_Entrega(entrega);

        RelacaoController rc = new RelacaoController();
        rc.RelacaoControllerAlterar(rb, valor);
    }//GEN-LAST:event_BTN_Salvar_AlteracaoActionPerformed

    private void CBOX_DescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_DescontoActionPerformed
        
        preencherTotal();
    }//GEN-LAST:event_CBOX_DescontoActionPerformed

    private void CBOX_Urg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Urg1ActionPerformed

        preencherTotal();
        
    }//GEN-LAST:event_CBOX_Urg1ActionPerformed

    private void CBOX_Urg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Urg4ActionPerformed
        
        preencherTotal();
    }//GEN-LAST:event_CBOX_Urg4ActionPerformed

    private void CBOX_Urg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Urg3ActionPerformed
       
        preencherTotal();
    }//GEN-LAST:event_CBOX_Urg3ActionPerformed

    private void CBOX_Urg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Urg2ActionPerformed
        
        preencherTotal();
    }//GEN-LAST:event_CBOX_Urg2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        impri = 1;
        preencherTotal();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_Serviço().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Salvar_Alteracao;
    private javax.swing.JComboBox CBOX_Desconto;
    private javax.swing.JCheckBox CBOX_Urg1;
    private javax.swing.JCheckBox CBOX_Urg2;
    private javax.swing.JCheckBox CBOX_Urg3;
    private javax.swing.JCheckBox CBOX_Urg4;
    private javax.swing.JLabel LBL_Cor;
    private javax.swing.JLabel LBL_Nome_Dr;
    private javax.swing.JLabel LBL_Obs;
    private javax.swing.JLabel LBL_Serv_1;
    private javax.swing.JLabel LBL_Serv_2;
    private javax.swing.JLabel LBL_Serv_3;
    private javax.swing.JLabel LBL_Serv_4;
    private javax.swing.JLabel LBL_Tipo;
    private javax.swing.JLabel LBL_Total;
    private javax.swing.JTextField TXT_Paciente;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateEntrada;
    private com.toedter.calendar.JDateChooser jDateSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    public void Mudardata(Integer cod, String entrada, String paci, String saida){
        try {
            valor = cod;
            java.util.Date en = new SimpleDateFormat("dd/MM/yyyy").parse(entrada);
            java.util.Date sa = new SimpleDateFormat("dd/MM/yyyy").parse(saida);
            jDateEntrada.setDate(en);
            jDateSaida.setDate(sa);
            TXT_Paciente.setText(paci);
            
            RelacaoBean rb = new RelacaoBean();
            ClienteBean cb = new ClienteBean();
            RelacaoController rc = new RelacaoController();
            
            
            rc.RelacaoControllerSelecionarAlMod(rb, cb, cod);
            
            LBL_Nome_Dr.setText(cb.getCli_Nome());
            String serv[] = rb.getRela_Serv().split(" -- ");
            
            String vazio = null;
            
            for (int i = 0; i < serv.length; i++) {
                if (serv[i] == null)  {
                    
                }else if(i == 3){
                    LBL_Serv_1.setText(serv[0]);
                    LBL_Serv_2.setText(serv[1]);
                    LBL_Serv_3.setText(serv[2]);
                    LBL_Serv_4.setText(serv[3]);
                }else if(i == 2){
                    LBL_Serv_1.setText(serv[0]);
                    LBL_Serv_2.setText(serv[1]);
                    LBL_Serv_3.setText(serv[2]);
                    LBL_Serv_4.setText(vazio);
                }else if(i == 1){
                    LBL_Serv_1.setText(serv[0]);
                    LBL_Serv_2.setText(serv[1]);
                    LBL_Serv_3.setText(vazio);
                    LBL_Serv_4.setText(vazio);
                }else if(i == 0){
                    LBL_Serv_1.setText(serv[0]);
                    LBL_Serv_2.setText(vazio);
                    LBL_Serv_3.setText(vazio);
                    LBL_Serv_4.setText(vazio);
                }
            }
            
            LBL_Tipo.setText(tipoServ(rb.getRela_Tipo_Serv()));
            LBL_Cor.setText(rb.getRela_Cor());
                rb.getRela_Tipo_Entrega();
            LBL_Obs.setText(rb.getRela_Obs());
            LBL_Total.setText(rb.getRela_Total());
            
        } catch (ParseException ex) {
            Logger.getLogger(Editar_Serviço.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    private String tipoServ(Integer serv){
        if(null == serv){
            return null;
        }else switch (serv) {
            case 1:
                return "Sup";
            case 2:
                return "Inf";
            case 3:
                return "sup\\inf";
            default:
                return null;
        }
    }
    
    private String tipoEntrega(String tipo){
        if(Objects.equals(tipo, "0")){
            return "Normal";
        }else{
            return "Urgência";
        }
    }
    
    public static double converte(String arg) throws ParseException {
        //obtem um NumberFormat para o Locale default (BR)
        NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));
        //converte um número com vírgulas ex: 2,56 para double
        double number = nf.parse(arg).doubleValue();
        return number;
    }
    
     private void total(String serv1, String serv2, String serv3, String serv4, Integer qtn1, Integer qtn2, Integer qtn3, Integer qtn4) {

        ServicosBean sb1 = new ServicosBean();
        ServicosController sc1 = new ServicosController();
        sc1.ServicosControllerSelecionar(sb1, serv1);

        Float preco1;
        Float preco2 = Float.valueOf(0);
        Float preco3 = Float.valueOf(0);
        Float preco4 = Float.valueOf(0);
        Integer taxa = 0;
        
        if (CBOX_Urg1.isSelected() == true) {
            if (sb1.getServ_Preco() == null) {
                preco1 = Float.valueOf(0) + ((Float.valueOf(0) / 100) * 25);
            } else {
                preco1 = Float.valueOf(sb1.getServ_Preco()) + ((Float.valueOf(sb1.getServ_Preco()) / 100) * 25);
            }
        } else {
            if (sb1.getServ_Preco() == null) {
                preco1 = Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor"));
            } else {
                preco1 = Float.valueOf(sb1.getServ_Preco());
            }
        }

        if(serv2.equals(" ")){
            
        }else{
            
            ServicosBean sb2 = new ServicosBean();
            ServicosController sc2 = new ServicosController();
            sc2.ServicosControllerSelecionar(sb2, serv2);

            if (CBOX_Urg2.isSelected() == true) {
                if (sb2.getServ_Preco() == null) {
                    preco2 = Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor")) + 
                            ((Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor")) / 100) * 25);
                } else {
                    preco2 = Float.valueOf(sb2.getServ_Preco()) + ((Float.valueOf(sb2.getServ_Preco()) / 100) * 25);
                }
            } else {
                if (sb2.getServ_Preco() == null) {
                    preco2 = Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor"));
                } else {
                    preco2 = Float.valueOf(sb2.getServ_Preco());
                }
            }
        }
        if(serv3.equals(" ")){
        
        }else{

            ServicosBean sb3 = new ServicosBean();
            ServicosController sc3 = new ServicosController();
            sc3.ServicosControllerSelecionar(sb3, serv3);

            if (CBOX_Urg3.isSelected() == true) {
                if (sb3.getServ_Preco() == null) {
                    preco3 = Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor")) + 
                            ((Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor")) / 100) * 25);
                } else {
                    preco3 = Float.valueOf(sb3.getServ_Preco()) + ((Float.valueOf(sb3.getServ_Preco()) / 100) * 25);
                }
            } else {
                if (sb3.getServ_Preco() == null) {
                    preco3 = Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor"));
                } else {
                    preco3 = Float.valueOf(sb3.getServ_Preco());
                }
            }
        }
        
        if(serv4.equals(" ")){
            
        }else{
            
            ServicosBean sb4 = new ServicosBean();
            ServicosController sc4 = new ServicosController();
            sc4.ServicosControllerSelecionar(sb4, serv4);

            if (CBOX_Urg4.isSelected() == true) {
                if (sb4.getServ_Preco() == null) {
                    preco4 = Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor")) + 
                            ((Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor")) / 100) * 25);
                } else {
                    preco4 = Float.valueOf(sb4.getServ_Preco()) + ((Float.valueOf(sb4.getServ_Preco()) / 100) * 25);
                }
            } else {
                if (sb1.getServ_Preco() == null) {
                    preco4 = Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor"));
                } else {
                    preco4 = Float.valueOf(sb4.getServ_Preco());
                }
            }
        }
        Float Subtotal = preco1 * qtn1 + preco2 * qtn2 + preco3 * qtn3 + preco4 * qtn4;
        if (CBOX_Desconto.getSelectedItem().equals("Desconto (%)")) {

            DecimalFormat nf = new DecimalFormat("0.00");
            LBL_Total.setText(String.valueOf(nf.format(Subtotal - (Subtotal / 100) * 0)));

        } else {
            taxa = Integer.valueOf(CBOX_Desconto.getSelectedItem().toString());
            DecimalFormat nf = new DecimalFormat("0.00");
            LBL_Total.setText(String.valueOf(nf.format(Subtotal - (Subtotal / 100) * taxa)));
        }
        
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        String entrada = sf.format(jDateEntrada.getDate());
        String saida = sf.format(jDateSaida.getDate());
        
        String paci = TXT_Paciente.getText();
        Talao_Pedido tp = new Talao_Pedido();
        
        Integer entrega;
        if (CBOX_Urg1.isSelected() || CBOX_Urg2.isSelected() || CBOX_Urg3.isSelected() || CBOX_Urg4.isSelected()) {
            entrega = 1;
            taxa = 25;
        } else {
            entrega = 0;
        }
        DecimalFormat nf = new DecimalFormat("0.00");
        tp.preencher(entrada, saida,  LBL_Nome_Dr.getText(), paci, LBL_Obs.getText(), entrega, LBL_Cor.getText(), LBL_Tipo.getText());
        tp.preencherServ(serv1, serv2, serv3, serv4, qtn1, qtn2, qtn3, qtn4, preco1, preco2, preco3, preco4, String.valueOf(taxa), 
               String.valueOf(nf.format(Subtotal)) , LBL_Total.getText());
        
        if(impri > 0){
            tp.setVisible(true);
            impri = 0;
        }else{
        }
        
    }
     
    private void preencherTotal(){
        String serv[] = {LBL_Serv_1.getText(), LBL_Serv_2.getText(), LBL_Serv_3.getText(), LBL_Serv_4.getText()};
        
        if (serv[3] !=  null){
            String serv1[] = serv[0].split(" ", 2);
            String serv2[] = serv[1].split(" ", 2);
            String serv3[] = serv[2].split(" ", 2);
            String serv4[] = serv[3].split(" ", 2);

            total(String.valueOf(serv1[1]), String.valueOf(serv2[1]), String.valueOf(serv3[1]), String.valueOf(serv4[1]), 
                    Integer.valueOf(serv1[0]), Integer.valueOf(serv2[0]), Integer.valueOf(serv3[0]), Integer.valueOf(serv4[0]));
        }else if(serv[2] != null){
            String serv1[] = serv[0].split(" ", 2);
            String serv2[] = serv[1].split(" ", 2);
            String serv3[] = serv[2].split(" ", 2);
            total(String.valueOf(serv1[1]), String.valueOf(serv2[1]), String.valueOf(serv3[1]), " ", 
                    Integer.valueOf(serv1[0]), Integer.valueOf(serv2[0]), Integer.valueOf(serv3[0]), 0);
        }else if(serv[1] != null){
            String serv1[] = serv[0].split(" ", 2);
            String serv2[] = serv[1].split(" ", 2);
            total(String.valueOf(serv1[1]), String.valueOf(serv2[1]), " ", " ", 
                    Integer.valueOf(serv1[0]), Integer.valueOf(serv2[0]), 0, 0);
        }else if(serv[0] != null){
            String serv1[] = serv[0].split(" ", 2);

            total(String.valueOf(serv1[1]), " ", " ", " ", 
                    Integer.valueOf(serv1[0]), 0, 0, 0);
        }
        
    }

}
