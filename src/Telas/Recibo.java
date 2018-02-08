package Telas;

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

public class Recibo extends javax.swing.JFrame implements Printable {

    
    public Recibo() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Recibo = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel52 = new javax.swing.JLabel();
        LBL_Nome_Dr = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        LBL_Mes = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        LBL_Ano2 = new javax.swing.JLabel();
        LBL_Dia2 = new javax.swing.JLabel();
        LBL_Dia1 = new javax.swing.JLabel();
        LBL_Consultorio = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        LBL_Ano1 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        LBL_Valor = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        LBL_Valor2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LBL_Ano3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LBL_Mes3 = new javax.swing.JLabel();
        LBL_Valor_Pag = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        LBL_Tipo_Pag = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Recibo.setBackground(new java.awt.Color(255, 255, 255));
        Recibo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Recibo");
        Recibo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 20));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Labor Orto São Paulo");
        Recibo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, -1));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        Recibo.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 10));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        Recibo.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 10));

        jLabel52.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel52.setText("Dr.(a):");
        Recibo.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        LBL_Nome_Dr.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Nome_Dr.setText("*");
        Recibo.add(LBL_Nome_Dr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 150, -1));

        jLabel84.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel84.setText("Cotia - SP");
        Recibo.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, 20));

        jLabel88.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel88.setText("de");
        Recibo.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, 20));

        LBL_Mes.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Mes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Mes.setText("*");
        Recibo.add(LBL_Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 60, 20));

        jLabel86.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel86.setText("de");
        Recibo.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 20));

        LBL_Ano2.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Ano2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Ano2.setText("*");
        Recibo.add(LBL_Ano2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 40, 20));

        LBL_Dia2.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Dia2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Dia2.setText("*");
        Recibo.add(LBL_Dia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 30, 20));

        LBL_Dia1.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Dia1.setText("*");
        Recibo.add(LBL_Dia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 50, 10));

        LBL_Consultorio.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Consultorio.setText("*");
        Recibo.add(LBL_Consultorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 190, 20));

        jLabel78.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel78.setText("O VALOR DE  R$");
        Recibo.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, 20));

        LBL_Ano1.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Ano1.setText("*");
        Recibo.add(LBL_Ano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 30, 10));

        jLabel69.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel69.setText("<HTML>EU, SILVANA MAICROVICZ RUIZ, DECLARO TER RECEBIDO DE CONSULTÓRIO</HTML>");
        Recibo.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 190, 40));

        LBL_Valor.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Valor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Valor.setText("000,00");
        Recibo.add(LBL_Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 40, 20));

        jLabel82.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel82.setText("DE");
        Recibo.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, 10));

        jLabel80.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel80.setText("<html> REFERENTE A SERVIÇOS LABORATORIAIS PRESTADOS EM  </html>");
        Recibo.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, 20));

        jLabel62.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel62.setText("Debito");
        Recibo.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        jLabel65.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel65.setText("R$");
        Recibo.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        LBL_Valor2.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Valor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Valor2.setText("000,00");
        Recibo.add(LBL_Valor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 40, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel1.setText("Mês:");
        Recibo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        LBL_Ano3.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Ano3.setText("*");
        Recibo.add(LBL_Ano3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 60, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel3.setText("Ano:");
        Recibo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        LBL_Mes3.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Mes3.setText("*");
        Recibo.add(LBL_Mes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, -1));

        LBL_Valor_Pag.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Valor_Pag.setText("*");
        Recibo.add(LBL_Valor_Pag, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 90, -1));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        Recibo.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 10));

        LBL_Tipo_Pag.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        LBL_Tipo_Pag.setText("*");
        Recibo.add(LBL_Tipo_Pag, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 100, -1));

        jLabel58.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel58.setText("Tipo de Pagamento:");
        Recibo.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, 10));

        jLabel90.setFont(new java.awt.Font("Century Gothic", 0, 9)); // NOI18N
        jLabel90.setText("Valor Pago R$");
        Recibo.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        jPanel1.add(Recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 350));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Imprimir.png"))); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

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
                new Recibo().setVisible(true);
            }
        });
    }
    
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

        if (pageIndex > 0) { 
        return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D)graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        Recibo.printAll(g2d);

        return PAGE_EXISTS;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBL_Ano1;
    private javax.swing.JLabel LBL_Ano2;
    private javax.swing.JLabel LBL_Ano3;
    private javax.swing.JLabel LBL_Consultorio;
    private javax.swing.JLabel LBL_Dia1;
    private javax.swing.JLabel LBL_Dia2;
    private javax.swing.JLabel LBL_Mes;
    private javax.swing.JLabel LBL_Mes3;
    private javax.swing.JLabel LBL_Nome_Dr;
    private javax.swing.JLabel LBL_Tipo_Pag;
    private javax.swing.JLabel LBL_Valor;
    private javax.swing.JLabel LBL_Valor2;
    private javax.swing.JLabel LBL_Valor_Pag;
    private javax.swing.JPanel Recibo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables


    public void preencher (String doutor, String valor, String pago, String tipo, String mes, String ano, String dia){
        
        DecimalFormat df = new DecimalFormat("0.00");
        LBL_Nome_Dr.setText(doutor);
        LBL_Consultorio.setText(doutor);
        LBL_Valor2.setText(df.format(Float.valueOf(valor)));
        LBL_Valor_Pag.setText(df.format(Float.valueOf(pago)));
        LBL_Valor.setText(df.format(Float.valueOf(pago)));
        LBL_Tipo_Pag.setText(tipo);
        LBL_Dia1.setText(mes);
        LBL_Mes.setText(mes);
        LBL_Dia2.setText(dia);
        LBL_Ano1.setText(ano);
        LBL_Ano2.setText(ano);
        LBL_Ano3.setText(ano);
        LBL_Mes3.setText(mes);
    }
}
