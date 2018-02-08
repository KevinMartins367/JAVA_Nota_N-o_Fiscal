package Telas;

import Bean.ClienteBean;
import Controller.ClienteController;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.standard.PrinterName;

public class Talao_Pedido extends javax.swing.JFrame  implements Printable {

    public Talao_Pedido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        LBL_Total = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        LBL_Taxa = new javax.swing.JLabel();
        LBL_Subtotal = new javax.swing.JLabel();
        LBL_Qtd_1 = new javax.swing.JLabel();
        LBL_Prod_1 = new javax.swing.JLabel();
        LBL_Qtd_2 = new javax.swing.JLabel();
        LBL_Prod_2 = new javax.swing.JLabel();
        LBL_Qtd_3 = new javax.swing.JLabel();
        LBL_Prod_3 = new javax.swing.JLabel();
        LBL_Unit_2 = new javax.swing.JLabel();
        LBL_Unit_1 = new javax.swing.JLabel();
        LBL_Valor_2 = new javax.swing.JLabel();
        LBL_Valor_1 = new javax.swing.JLabel();
        LBL_Cli = new javax.swing.JLabel();
        LBL_dtEntrada = new javax.swing.JLabel();
        LBL_dtSaida = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        LBL_Obs = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        LBL_Prod_4 = new javax.swing.JLabel();
        LBL_Qtd_4 = new javax.swing.JLabel();
        LBL_Unit_3 = new javax.swing.JLabel();
        LBL_Valor_3 = new javax.swing.JLabel();
        LBL_Unit_4 = new javax.swing.JLabel();
        LBL_Valor_4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LBL_tipoServ = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        LBL_Cor = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        LBL_Paciente = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trabalho");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, 10));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Labor Orto São Paulo");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Silvana M. Ruiz - C.R.O SP T.P.D. 9897");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 10));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel4.setText("Dr.(a):");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 20));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel5.setText("Retirada:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel6.setText("Entrega (prevista):");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 10));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Descrição");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 200, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel8.setText("Quant. X Produto");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, 20));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Unit.");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 30, 20));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Valor R$");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 40, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 10));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel11.setText("Total");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 10));

        LBL_Total.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Total.setText("000,00");
        jPanel2.add(LBL_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 40, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 10));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel35.setText("Subtotal");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, 10));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel33.setText("Taxa");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, 20));

        LBL_Taxa.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Taxa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LBL_Taxa.setText("0");
        LBL_Taxa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(LBL_Taxa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 30, 20));

        LBL_Subtotal.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Subtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Subtotal.setText("000,00");
        jPanel2.add(LBL_Subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 40, 10));

        LBL_Qtd_1.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Qtd_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Qtd_1.setText("*");
        jPanel2.add(LBL_Qtd_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 20, -1));

        LBL_Prod_1.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Prod_1.setText("*");
        jPanel2.add(LBL_Prod_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, -1));

        LBL_Qtd_2.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Qtd_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Qtd_2.setText("*");
        jPanel2.add(LBL_Qtd_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 20, -1));

        LBL_Prod_2.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Prod_2.setText("*");
        jPanel2.add(LBL_Prod_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 110, -1));

        LBL_Qtd_3.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Qtd_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Qtd_3.setText("*");
        jPanel2.add(LBL_Qtd_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 20, -1));

        LBL_Prod_3.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Prod_3.setText("*");
        jPanel2.add(LBL_Prod_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, -1));

        LBL_Unit_2.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Unit_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Unit_2.setText("*");
        jPanel2.add(LBL_Unit_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 30, -1));

        LBL_Unit_1.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Unit_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Unit_1.setText("*");
        jPanel2.add(LBL_Unit_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 30, -1));

        LBL_Valor_2.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Valor_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Valor_2.setText("*");
        jPanel2.add(LBL_Valor_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 30, -1));

        LBL_Valor_1.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Valor_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Valor_1.setText("*");
        jPanel2.add(LBL_Valor_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 30, -1));

        LBL_Cli.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Cli.setText("*");
        jPanel2.add(LBL_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 150, 20));

        LBL_dtEntrada.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_dtEntrada.setText("*");
        jPanel2.add(LBL_dtEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 60, 20));

        LBL_dtSaida.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_dtSaida.setText("*");
        jPanel2.add(LBL_dtSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 70, 10));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel18.setText("Obs:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, 20));

        LBL_Obs.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Obs.setText("*");
        jPanel2.add(LBL_Obs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, 30));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel21.setText("R$");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 10, 10));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel22.setText("R$");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, 10));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("%");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 10, 20));

        LBL_Prod_4.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Prod_4.setText("*");
        jPanel2.add(LBL_Prod_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, -1));

        LBL_Qtd_4.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Qtd_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Qtd_4.setText("*");
        jPanel2.add(LBL_Qtd_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 20, -1));

        LBL_Unit_3.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Unit_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Unit_3.setText("*");
        jPanel2.add(LBL_Unit_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 30, -1));

        LBL_Valor_3.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Valor_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Valor_3.setText("*");
        jPanel2.add(LBL_Valor_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 30, -1));

        LBL_Unit_4.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Unit_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Unit_4.setText("*");
        jPanel2.add(LBL_Unit_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 30, 10));

        LBL_Valor_4.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Valor_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Valor_4.setText("*");
        jPanel2.add(LBL_Valor_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 30, 10));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel16.setText("Sup/Inf:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, 20));

        LBL_tipoServ.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_tipoServ.setText("*");
        jPanel2.add(LBL_tipoServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 50, 20));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel19.setText("Cor:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, 10));

        LBL_Cor.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Cor.setText("*");
        jPanel2.add(LBL_Cor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 60, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, 10));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel12.setText("Paciente:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        LBL_Paciente.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Paciente.setText("*");
        jPanel2.add(LBL_Paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 430));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Imprimir.png"))); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 140, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(this);
            job.printDialog();
            job.print();
        } catch (PrinterException ex) {
            Logger.getLogger(PrinterName.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Talao_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Talao_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Talao_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Talao_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Talao_Pedido().setVisible(true);
            }
        });
    }
    
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

        if (pageIndex > 0) { 
        return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D)graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        jPanel2.printAll(graphics);

        return PAGE_EXISTS;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBL_Cli;
    private javax.swing.JLabel LBL_Cor;
    private javax.swing.JLabel LBL_Obs;
    private javax.swing.JLabel LBL_Paciente;
    private javax.swing.JLabel LBL_Prod_1;
    private javax.swing.JLabel LBL_Prod_2;
    private javax.swing.JLabel LBL_Prod_3;
    private javax.swing.JLabel LBL_Prod_4;
    private javax.swing.JLabel LBL_Qtd_1;
    private javax.swing.JLabel LBL_Qtd_2;
    private javax.swing.JLabel LBL_Qtd_3;
    private javax.swing.JLabel LBL_Qtd_4;
    private javax.swing.JLabel LBL_Subtotal;
    private javax.swing.JLabel LBL_Taxa;
    private javax.swing.JLabel LBL_Total;
    private javax.swing.JLabel LBL_Unit_1;
    private javax.swing.JLabel LBL_Unit_2;
    private javax.swing.JLabel LBL_Unit_3;
    private javax.swing.JLabel LBL_Unit_4;
    private javax.swing.JLabel LBL_Valor_1;
    private javax.swing.JLabel LBL_Valor_2;
    private javax.swing.JLabel LBL_Valor_3;
    private javax.swing.JLabel LBL_Valor_4;
    private javax.swing.JLabel LBL_dtEntrada;
    private javax.swing.JLabel LBL_dtSaida;
    private javax.swing.JLabel LBL_tipoServ;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables

    public void preencher(String dtentrada, String dtsaida, String Cli, String pac, String Obs, Integer tipoEn, String Cor, String tipoServ){
        
        LBL_Cli.setText(Cli);
        LBL_Paciente.setText(pac);
        LBL_dtEntrada.setText(dtentrada);
        LBL_dtSaida.setText(dtsaida);
        LBL_Obs.setText(Obs);
        LBL_Cor.setText(Cor);
        ClienteBean cb = new ClienteBean();
        ClienteController cc = new ClienteController();
        cc.ClienteControllerSelecionarEndereco(cb, Cli);
        LBL_tipoServ.setText(tipoServ);
    }
    
    public void preencherServ(String serv1, String serv2, String serv3, String serv4, Integer qtn1, Integer qtn2, Integer qtn3,
            Integer qtn4, Float preco1, Float preco2, Float preco3, Float preco4, String taxa, String subtotal, String total){

        
        DecimalFormat nf = new DecimalFormat("0.00");
        if(qtn4 == 0){
            if(qtn3 == 0){
                if(qtn2 == 0){
                    if(qtn1 == 0){

                    }else{
                        LBL_Qtd_4.setText("");
                        LBL_Qtd_3.setText("");
                        LBL_Qtd_2.setText("");
                        LBL_Qtd_1.setText(String.valueOf(qtn1));
                        LBL_Prod_1.setText(serv1);
                        LBL_Prod_2.setText("");
                        LBL_Prod_3.setText("");
                        LBL_Prod_4.setText("");
                        LBL_Unit_1.setText(nf.format(preco1));
                        LBL_Unit_2.setText("");
                        LBL_Unit_3.setText("");
                        LBL_Unit_4.setText("");
                        LBL_Valor_1.setText(nf.format(qtn1*preco1));
                        LBL_Valor_2.setText("");
                        LBL_Valor_3.setText("");
                        LBL_Valor_4.setText("");
                        LBL_Taxa.setText(taxa);
                        LBL_Subtotal.setText(subtotal);
                        LBL_Total.setText(total);
                    }
                }else{
                    LBL_Qtd_4.setText("");
                    LBL_Qtd_3.setText("");
                    LBL_Qtd_2.setText(String.valueOf(qtn2));
                    LBL_Qtd_1.setText(String.valueOf(qtn1));
                    LBL_Prod_1.setText(serv1);
                    LBL_Prod_2.setText(serv2);
                    LBL_Prod_3.setText("");
                    LBL_Prod_4.setText("");
                    LBL_Unit_1.setText(nf.format(preco1));
                    LBL_Unit_2.setText(nf.format(preco2));
                    LBL_Unit_3.setText("");
                    LBL_Unit_4.setText("");
                    LBL_Valor_1.setText(nf.format(qtn1*preco1));
                    LBL_Valor_2.setText(nf.format(qtn2*preco2));
                    LBL_Valor_3.setText("");
                    LBL_Valor_4.setText("");
                    LBL_Taxa.setText(taxa);
                    LBL_Subtotal.setText(subtotal);
                    LBL_Total.setText(total);
                }
            }else{
                LBL_Qtd_4.setText("");
                LBL_Qtd_3.setText(String.valueOf(qtn3));
                LBL_Qtd_2.setText(String.valueOf(qtn2));
                LBL_Qtd_1.setText(String.valueOf(qtn1));
                LBL_Prod_1.setText(serv1);
                LBL_Prod_2.setText(serv2);
                LBL_Prod_3.setText(serv3);
                LBL_Prod_4.setText("");
                LBL_Unit_1.setText(nf.format(preco1));
                LBL_Unit_2.setText(nf.format(preco2));
                LBL_Unit_3.setText(nf.format(preco3));
                LBL_Unit_4.setText("");
                LBL_Valor_1.setText(nf.format(qtn1*preco1));
                LBL_Valor_2.setText(nf.format(qtn2*preco2));
                LBL_Valor_3.setText(nf.format(qtn3*preco3));
                LBL_Valor_4.setText("");
                LBL_Taxa.setText(taxa);
                LBL_Subtotal.setText(subtotal);
                LBL_Total.setText(total);
            }
        }else{
            LBL_Qtd_4.setText(String.valueOf(qtn4));
            LBL_Qtd_3.setText(String.valueOf(qtn3));
            LBL_Qtd_2.setText(String.valueOf(qtn2));
            LBL_Qtd_1.setText(String.valueOf(qtn1));
            LBL_Prod_1.setText(serv1);
            LBL_Prod_2.setText(serv2);
            LBL_Prod_3.setText(serv3);
            LBL_Prod_4.setText(serv4);
            LBL_Unit_1.setText(nf.format(preco1));
            LBL_Unit_2.setText(nf.format(preco2));
            LBL_Unit_3.setText(nf.format(preco3));
            LBL_Unit_4.setText(nf.format(preco4));
            LBL_Valor_1.setText(nf.format(qtn1*preco1));
            LBL_Valor_2.setText(nf.format(qtn2*preco2));
            LBL_Valor_3.setText(nf.format(qtn3*preco3));
            LBL_Valor_4.setText(nf.format(qtn4*preco4));
            LBL_Taxa.setText(taxa);
            LBL_Subtotal.setText(subtotal);
            LBL_Total.setText(total);
        }
        
    }
    
    public void segundavia(Integer cod){
        
    }
}
