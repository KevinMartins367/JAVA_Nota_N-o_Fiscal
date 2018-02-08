package Telas;

import Bean.CategoriaBean;
import Bean.DespesasBean;
import Bean.FinanceiroBean;
import Bean.LucrosBean;
import Bean.ServicosBean;
import Controller.CategoriaController;
import Controller.DespesasController;
import Controller.FinanceiroController;
import Controller.ServicosController;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Bean.ClienteBean;
import Bean.RelacaoBean;
import Controller.ClienteController;
import Controller.LucrosController;
import Controller.RelacaoController;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import javax.swing.DefaultComboBoxModel;

public class Inicio extends javax.swing.JFrame {

    Talao_Pedido info;

    public Inicio() {
        initComponents();

        CategoriaController cac = new CategoriaController();
        cac.CategoriaControllerTable(TBL_Cat);
        List<CategoriaBean> lca = cac.CategoriaControllerList();
        CBOX_Cat.setModel(new DefaultComboBoxModel(lca.toArray()));
        CBOX_Cat2.setModel(new DefaultComboBoxModel(lca.toArray()));

        ServicosController sc = new ServicosController();
        sc.ServicosControllerTable(TBL_Servico);
        sc.ServicosControllerTableCategoria(TBL_Catalogo, CBOX_Cat2.getSelectedItem().toString());
        List<ServicosBean> ls = sc.ServicosControllerTodos();

        CBOX_Servico_1.setModel(new DefaultComboBoxModel(ls.toArray()));
        CBOX_Servico_2.setModel(new DefaultComboBoxModel(ls.toArray()));
        CBOX_Servico_3.setModel(new DefaultComboBoxModel(ls.toArray()));
        CBOX_Servico_4.setModel(new DefaultComboBoxModel(ls.toArray()));

        ClienteController cc = new ClienteController();
        cc.ClienteControllerTable(Table_Cliente);
        List<ClienteBean> lc = cc.ClienteControllerSelecionarTodos();

        CBOX_Dr.setModel(new DefaultComboBoxModel(lc.toArray()));
        CBOX_Dentista.setModel(new DefaultComboBoxModel(lc.toArray()));
        CBOX_Dentista1.setModel(new DefaultComboBoxModel(lc.toArray()));
        CBOX_Dentista2.setModel(new DefaultComboBoxModel(lc.toArray()));

        RelacaoController rc = new RelacaoController();
        rc.RelacaoControllerTable(TBL_Trabs_Mes, mesN(String.valueOf((CBOX_Mes.getSelectedIndex() + 1)) + "/" + CBOX_Ano.getYear()));

        CBOX_Dentista1.setModel(new DefaultComboBoxModel(lc.toArray()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TXT_Cliente = new javax.swing.JTextField();
        LBL_Preco = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXT_Requisicao = new javax.swing.JTextArea();
        TXT_Cor = new javax.swing.JTextField();
        BTN_Salvar_Trab = new javax.swing.JButton();
        CBOX_Desconto = new javax.swing.JComboBox();
        CBOX_Tipo_S_I = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        CBOX_Servico_1 = new javax.swing.JComboBox();
        CBOX_Servico_2 = new javax.swing.JComboBox();
        CBOX_Servico_3 = new javax.swing.JComboBox();
        CBOX_Qtd_Servico_1 = new javax.swing.JComboBox();
        CBOX_Qtd_Servico_2 = new javax.swing.JComboBox();
        CBOX_Qtd_Servico_3 = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        Date_Saida = new com.toedter.calendar.JDateChooser();
        TXT_Entrada = new javax.swing.JTextField();
        CBOX_Dentista = new javax.swing.JComboBox<>();
        CBOX_Qtd_Servico_4 = new javax.swing.JComboBox();
        CBOX_Servico_4 = new javax.swing.JComboBox();
        CBOX_Urg1 = new javax.swing.JCheckBox();
        CBOX_Urg2 = new javax.swing.JCheckBox();
        CBOX_Urg3 = new javax.swing.JCheckBox();
        CBOX_Urg4 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TXT_Nome_Dentista = new javax.swing.JTextField();
        TXT_End = new javax.swing.JTextField();
        TXT_CRO = new javax.swing.JTextField();
        TXT_Secretaria = new javax.swing.JTextField();
        BTN_Salvar_Dent = new javax.swing.JButton();
        BTN_Editar_Dent = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        CBOX_Dentista2 = new javax.swing.JComboBox<>();
        BTN_Procurar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        CBOX_Tipo_Dent = new javax.swing.JComboBox();
        TXT_Tel = new javax.swing.JTextField();
        TXT_Cel = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        TXT_Saldo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBL_Trabs_Mes = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        CBOX_Ano = new com.toedter.calendar.JYearChooser();
        CBOX_Mes = new javax.swing.JComboBox<>();
        BTN_Excluir_Rela = new javax.swing.JButton();
        BTN_ImpriTrab = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        Table_Cliente = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        BTN_Excluir = new javax.swing.JButton();
        BTN_ImpriCli = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        CBOX_Cat2 = new javax.swing.JComboBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        TBL_Catalogo = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        TXT_Categoria = new javax.swing.JTextField();
        TXT_Servico = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        CBOX_Cat = new javax.swing.JComboBox();
        jScrollPane7 = new javax.swing.JScrollPane();
        TBL_Servico = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        TBL_Cat = new javax.swing.JTable();
        BTN_Add_Cat = new javax.swing.JButton();
        BTN_Excluir_Cat = new javax.swing.JButton();
        BTN_Add_Servico = new javax.swing.JButton();
        BTN_Excluir_Servico = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        TXT_Preco = new javax.swing.JTextField();
        BTN_Alterar = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TBL_Pagamento = new javax.swing.JTable();
        CBOX_Dr = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        LBL_Dentista = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        LBL_Valor2 = new javax.swing.JLabel();
        BTN_Salvar_Pag = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel65 = new javax.swing.JLabel();
        LBL_Consultorio = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        LBL_Valor = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        LBL_Dia1 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        LBL_Ano1 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        LBL_Dia2 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        LBL_Mes = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        LBL_Ano2 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel90 = new javax.swing.JLabel();
        TXT_Valor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        LBL_Ano3 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        LBL_Mes3 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        CBOX_Tipo_Pag = new javax.swing.JComboBox();
        jLabel64 = new javax.swing.JLabel();
        LBL_id = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        TXT_Produto1 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        BTN_Add_Produto1 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        TBL_Lucros = new javax.swing.JTable();
        jLabel71 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        CBOX_Tipo1 = new javax.swing.JComboBox<>();
        TXT_Preco_Prod1 = new javax.swing.JTextField();
        LBL_TotalLucro = new javax.swing.JLabel();
        BTN_ImpriDes1 = new javax.swing.JButton();
        CBOX_Mes4 = new javax.swing.JComboBox<>();
        CBOX_Ano4 = new com.toedter.calendar.JYearChooser();
        BTN_Excluir_Lucros = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        TXT_Produto = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        BTN_Add_Produto = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        TBL_Despesas = new javax.swing.JTable();
        jLabel61 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        CBOX_Tipo = new javax.swing.JComboBox<>();
        TXT_Preco_Prod = new javax.swing.JTextField();
        LBL_TotalDes = new javax.swing.JLabel();
        BTN_ImpriDes = new javax.swing.JButton();
        CBOX_Mes5 = new javax.swing.JComboBox<>();
        CBOX_Ano5 = new com.toedter.calendar.JYearChooser();
        BTN_Excluir_Despesas = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        BTN_Fechar_Mes = new javax.swing.JButton();
        Date_Inicio = new com.toedter.calendar.JDateChooser();
        Data_Final = new com.toedter.calendar.JDateChooser();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TBL_Total = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        CBOX_Ano1 = new com.toedter.calendar.JYearChooser();
        CBOX_Mes1 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TBL_P_Dentista = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        CBOX_Ano2 = new com.toedter.calendar.JYearChooser();
        CBOX_Dentista1 = new javax.swing.JComboBox<>();
        CBOX_Mes2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        TBL_CLiente_P = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        CBOX_Ano3 = new com.toedter.calendar.JYearChooser();
        CBOX_Mes3 = new javax.swing.JComboBox<>();
        BTN_ImpriPREV = new javax.swing.JButton();
        LBL_Total = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jTabbedPane2.setFont(new java.awt.Font("Century751 BT", 0, 18)); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Entrada");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Saída");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Dr.(a)");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Paciente");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Observações");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Cor");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Total");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 130, -1));

        TXT_Cliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel3.add(TXT_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 340, -1));

        LBL_Preco.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        LBL_Preco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Preco.setText("*");
        jPanel3.add(LBL_Preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 130, 40));

        TXT_Requisicao.setColumns(20);
        TXT_Requisicao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TXT_Requisicao.setRows(5);
        TXT_Requisicao.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TXT_RequisicaoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(TXT_Requisicao);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 340, 140));

        TXT_Cor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel3.add(TXT_Cor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 140, -1));

        BTN_Salvar_Trab.setBackground(new java.awt.Color(204, 204, 204));
        BTN_Salvar_Trab.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Salvar_Trab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Add Cad 48x48.png"))); // NOI18N
        BTN_Salvar_Trab.setText("Salvar");
        BTN_Salvar_Trab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Salvar_TrabActionPerformed(evt);
            }
        });
        jPanel3.add(BTN_Salvar_Trab, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, -1, -1));

        CBOX_Desconto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Desconto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Desconto (%)", "0", "5", "10", "15", "20", "25", "30" }));
        CBOX_Desconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_DescontoActionPerformed(evt);
            }
        });
        jPanel3.add(CBOX_Desconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 140, -1));

        CBOX_Tipo_S_I.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Tipo_S_I.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo (Sup/Inf)", "Sup", "Inf", "sup\\inf" }));
        jPanel3.add(CBOX_Tipo_S_I, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 140, -1));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel32.setText("Serviços");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        CBOX_Servico_1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Servico_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Servico_1ActionPerformed(evt);
            }
        });
        jPanel3.add(CBOX_Servico_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 410, -1));

        CBOX_Servico_2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Servico_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Servico_2ActionPerformed(evt);
            }
        });
        jPanel3.add(CBOX_Servico_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 410, -1));

        CBOX_Servico_3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Servico_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Servico_3ActionPerformed(evt);
            }
        });
        jPanel3.add(CBOX_Servico_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 410, -1));

        CBOX_Qtd_Servico_1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Qtd_Servico_1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        CBOX_Qtd_Servico_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Qtd_Servico_1ActionPerformed(evt);
            }
        });
        jPanel3.add(CBOX_Qtd_Servico_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 70, -1));

        CBOX_Qtd_Servico_2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Qtd_Servico_2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        CBOX_Qtd_Servico_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Qtd_Servico_2ActionPerformed(evt);
            }
        });
        jPanel3.add(CBOX_Qtd_Servico_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 70, -1));

        CBOX_Qtd_Servico_3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Qtd_Servico_3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        CBOX_Qtd_Servico_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Qtd_Servico_3ActionPerformed(evt);
            }
        });
        jPanel3.add(CBOX_Qtd_Servico_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 70, -1));

        jLabel37.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel37.setText("QTD.");
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        Date_Saida.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Date_Saida.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Date_SaidaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel3.add(Date_Saida, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 150, 30));

        TXT_Entrada.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TXT_Entrada.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TXT_EntradaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel3.add(TXT_Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 30));

        CBOX_Dentista.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel3.add(CBOX_Dentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 340, -1));

        CBOX_Qtd_Servico_4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Qtd_Servico_4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        CBOX_Qtd_Servico_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Qtd_Servico_4ActionPerformed(evt);
            }
        });
        jPanel3.add(CBOX_Qtd_Servico_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 70, -1));

        CBOX_Servico_4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Servico_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Servico_4ActionPerformed(evt);
            }
        });
        jPanel3.add(CBOX_Servico_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 410, -1));

        CBOX_Urg1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CBOX_Urg1.setText("Urgência");
        CBOX_Urg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Urg1ActionPerformed(evt);
            }
        });
        jPanel3.add(CBOX_Urg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, 90, -1));

        CBOX_Urg2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CBOX_Urg2.setText("Urgência");
        CBOX_Urg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Urg2ActionPerformed(evt);
            }
        });
        jPanel3.add(CBOX_Urg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 110, 90, -1));

        CBOX_Urg3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CBOX_Urg3.setText("Urgência");
        CBOX_Urg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Urg3ActionPerformed(evt);
            }
        });
        jPanel3.add(CBOX_Urg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 150, 90, -1));

        CBOX_Urg4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CBOX_Urg4.setText("Urgência");
        CBOX_Urg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Urg4ActionPerformed(evt);
            }
        });
        jPanel3.add(CBOX_Urg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, 90, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fundo.jpg"))); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 460));

        jTabbedPane2.addTab("Trabalho", new javax.swing.ImageIcon(getClass().getResource("/IMG/Trab 32x32.png")), jPanel3); // NOI18N

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Nome");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Endereço");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Telefone");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Celular");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("C.R.O");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setText("Saldo");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 80, -1));

        TXT_Nome_Dentista.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel4.add(TXT_Nome_Dentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 200, -1));

        TXT_End.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel4.add(TXT_End, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 390, -1));

        TXT_CRO.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel4.add(TXT_CRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 150, -1));

        TXT_Secretaria.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel4.add(TXT_Secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 200, -1));

        BTN_Salvar_Dent.setBackground(new java.awt.Color(204, 204, 204));
        BTN_Salvar_Dent.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Salvar_Dent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Add Cad 48x48.png"))); // NOI18N
        BTN_Salvar_Dent.setText("Salvar");
        BTN_Salvar_Dent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Salvar_DentActionPerformed(evt);
            }
        });
        jPanel4.add(BTN_Salvar_Dent, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, -1, -1));

        BTN_Editar_Dent.setBackground(new java.awt.Color(204, 204, 204));
        BTN_Editar_Dent.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Editar_Dent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Editar Cad 48x48.png"))); // NOI18N
        BTN_Editar_Dent.setText("<html>Salvar <br> Edição </html>");
        BTN_Editar_Dent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Editar_DentActionPerformed(evt);
            }
        });
        jPanel4.add(BTN_Editar_Dent, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setText("Procurar");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, 30));

        CBOX_Dentista2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel4.add(CBOX_Dentista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 340, -1));

        BTN_Procurar.setBackground(new java.awt.Color(204, 204, 204));
        BTN_Procurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Lupa 24x24.png"))); // NOI18N
        BTN_Procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ProcurarActionPerformed(evt);
            }
        });
        jPanel4.add(BTN_Procurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 70, 50, 30));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel16.setText("Cadastro de Dentista");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        CBOX_Tipo_Dent.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Tipo_Dent.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo", "Dentista", "Protético" }));
        jPanel4.add(CBOX_Tipo_Dent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 140, -1));

        TXT_Tel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel4.add(TXT_Tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 110, -1));

        TXT_Cel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel4.add(TXT_Cel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 110, -1));

        jLabel49.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel49.setText("Secretaria");
        jPanel4.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        TXT_Saldo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel4.add(TXT_Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 150, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fundo.jpg"))); // NOI18N
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 460));

        jTabbedPane2.addTab("Dentista", new javax.swing.ImageIcon(getClass().getResource("/IMG/Dentistas 32x32.png")), jPanel4); // NOI18N

        jTabbedPane1.addTab("Cadastros", new javax.swing.ImageIcon(getClass().getResource("/IMG/Cad.png")), jTabbedPane2); // NOI18N

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBL_Trabs_Mes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TBL_Trabs_Mes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Entrada", "Dr.(a)", "Paciente", "Trabalho", "Tipo", "Saída", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBL_Trabs_Mes.getTableHeader().setReorderingAllowed(false);
        TBL_Trabs_Mes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_Trabs_MesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TBL_Trabs_Mes);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1060, 340));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel25.setText("Trabalhos Mensais");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, 50));
        jPanel7.add(CBOX_Ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 60, 40));

        CBOX_Mes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        CBOX_Mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_MesActionPerformed(evt);
            }
        });
        jPanel7.add(CBOX_Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 40));

        BTN_Excluir_Rela.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Excluir_Rela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Delete.png"))); // NOI18N
        BTN_Excluir_Rela.setText("Excluir");
        BTN_Excluir_Rela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Excluir_RelaActionPerformed(evt);
            }
        });
        jPanel7.add(BTN_Excluir_Rela, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 450, -1, -1));

        BTN_ImpriTrab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BTN_ImpriTrab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Imprimir.png"))); // NOI18N
        BTN_ImpriTrab.setText("Imprimir");
        BTN_ImpriTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ImpriTrabActionPerformed(evt);
            }
        });
        jPanel7.add(BTN_ImpriTrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 210, 50));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fundo.jpg"))); // NOI18N
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 510));

        jTabbedPane1.addTab("Trabalhos", new javax.swing.ImageIcon(getClass().getResource("/IMG/CheckList 32x32.png")), jPanel7); // NOI18N

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Nome", "Endereço", "Celular", "Telefone", "Secretaria", "CRO", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_Cliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(Table_Cliente);

        jPanel11.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1030, 320));

        jLabel56.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel56.setText("Clientes");
        jPanel11.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        BTN_Excluir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Delete.png"))); // NOI18N
        BTN_Excluir.setText("Excluir");
        BTN_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ExcluirActionPerformed(evt);
            }
        });
        jPanel11.add(BTN_Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, -1, -1));

        BTN_ImpriCli.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BTN_ImpriCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Imprimir.png"))); // NOI18N
        BTN_ImpriCli.setText("Imprimir");
        BTN_ImpriCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ImpriCliActionPerformed(evt);
            }
        });
        jPanel11.add(BTN_ImpriCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 210, 50));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fundo.jpg"))); // NOI18N
        jPanel11.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 510));

        jTabbedPane1.addTab("Clientes", new javax.swing.ImageIcon(getClass().getResource("/IMG/Dentistas 32x32.png")), jPanel11); // NOI18N

        jTabbedPane3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CBOX_Cat2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Cat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Cat2ActionPerformed(evt);
            }
        });
        jPanel1.add(CBOX_Cat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 260, -1));

        TBL_Catalogo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TBL_Catalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Serviço", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBL_Catalogo.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(TBL_Catalogo);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 900, 310));

        jLabel34.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel34.setText("Categoria");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fundo.jpg"))); // NOI18N
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 460));

        jTabbedPane3.addTab("Catálogo", new javax.swing.ImageIcon(getClass().getResource("/IMG/Tabela.png")), jPanel1); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel66.setText("Categoria");
        jPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel67.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel67.setText("Serviço");
        jPanel2.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, -1, -1));

        jLabel68.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel68.setText("Preço");
        jPanel2.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, -1, -1));

        TXT_Categoria.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(TXT_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 320, -1));

        TXT_Servico.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(TXT_Servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 320, -1));

        jLabel70.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel70.setText("Categoria");
        jPanel2.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        CBOX_Cat.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(CBOX_Cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 230, -1));

        TBL_Servico.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TBL_Servico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Categoria", "Serviço", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBL_Servico.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(TBL_Servico);

        jPanel2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 600, 130));

        TBL_Cat.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TBL_Cat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Categoria"
            }
        ));
        TBL_Cat.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(TBL_Cat);

        jPanel2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 330, 130));

        BTN_Add_Cat.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Add_Cat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Add.png"))); // NOI18N
        BTN_Add_Cat.setText("Adicionar");
        BTN_Add_Cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Add_CatActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Add_Cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        BTN_Excluir_Cat.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Excluir_Cat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Delete.png"))); // NOI18N
        BTN_Excluir_Cat.setText("Excluir");
        BTN_Excluir_Cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Excluir_CatActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Excluir_Cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 130, -1));

        BTN_Add_Servico.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Add_Servico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Add.png"))); // NOI18N
        BTN_Add_Servico.setText("Adicionar");
        BTN_Add_Servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Add_ServicoActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Add_Servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 140, -1));

        BTN_Excluir_Servico.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Excluir_Servico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Delete.png"))); // NOI18N
        BTN_Excluir_Servico.setText("Excluir");
        BTN_Excluir_Servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Excluir_ServicoActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Excluir_Servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 140, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 20, 460));

        jLabel63.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel63.setText("R$");
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 20, 20));

        TXT_Preco.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(TXT_Preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 80, -1));

        BTN_Alterar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Check2.png"))); // NOI18N
        BTN_Alterar.setText("Alterar");
        BTN_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AlterarActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 150, 40));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fundo.jpg"))); // NOI18N
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 460));

        jTabbedPane3.addTab("Adicionar Serviço", new javax.swing.ImageIcon(getClass().getResource("/IMG/Add_Prodd.png")), jPanel2); // NOI18N

        jTabbedPane1.addTab("<html>Tabela<br>de Preços</html>", new javax.swing.ImageIcon(getClass().getResource("/IMG/Preços 48x48.png")), jTabbedPane3); // NOI18N

        jTabbedPane5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Century Gothic", 0, 32)); // NOI18N
        jLabel45.setText("Pagamentos");
        jPanel9.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        TBL_Pagamento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TBL_Pagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dr.(a)", "Periodo", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBL_Pagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_PagamentoMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(TBL_Pagamento);

        jPanel9.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 610, 310));

        CBOX_Dr.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Dr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_DrActionPerformed(evt);
            }
        });
        jPanel9.add(CBOX_Dr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel9.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 20, 460));

        jLabel38.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel38.setText("Dr.(a)");
        jPanel9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel47.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel47.setText("Data");
        jPanel9.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel48.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel48.setText("Dr.(a):");
        jPanel9.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

        LBL_Dentista.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Dentista.setText("Nome");
        jPanel9.add(LBL_Dentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, -1, -1));

        jLabel62.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel62.setText("Valor");
        jPanel9.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, -1));

        LBL_Valor2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Valor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Valor2.setText("000,00");
        jPanel9.add(LBL_Valor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 60, -1));

        BTN_Salvar_Pag.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Salvar_Pag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Check.png"))); // NOI18N
        BTN_Salvar_Pag.setText("Salvar");
        BTN_Salvar_Pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Salvar_PagActionPerformed(evt);
            }
        });
        jPanel9.add(BTN_Salvar_Pag, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, -1, 50));

        jDateChooser2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDateChooser2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jDateChooser2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel9.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 130, 30));

        jLabel65.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel65.setText("R$");
        jPanel9.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, -1, -1));

        LBL_Consultorio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        LBL_Consultorio.setText("*");
        jPanel9.add(LBL_Consultorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 210, 20));

        jLabel78.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel78.setText("O VALOR DE  R$");
        jPanel9.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 250, -1, 20));

        jLabel69.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel69.setText("<HTML>EU, SILVANA MAICROVICZ RUIZ, CPF 073.217.868-11, DECLARO TER RECEBIDO DE CONSULTÓRIO</HTML>");
        jPanel9.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 380, 40));

        LBL_Valor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        LBL_Valor.setText("000,00");
        jPanel9.add(LBL_Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 250, 60, 20));

        jLabel80.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel80.setText("REFERENTE A SERVIÇOS LABORATORIAIS PRESTADOS EM");
        jPanel9.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 380, 20));

        LBL_Dia1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        LBL_Dia1.setText("*");
        jPanel9.add(LBL_Dia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 120, 20));

        jLabel82.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel82.setText("DE");
        jPanel9.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, -1, 20));

        LBL_Ano1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        LBL_Ano1.setText("*");
        jPanel9.add(LBL_Ano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 80, 20));

        jLabel84.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel84.setText("Cotia,");
        jPanel9.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, -1, 20));

        LBL_Dia2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Dia2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Dia2.setText("*");
        jPanel9.add(LBL_Dia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 30, 20));

        jLabel86.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel86.setText("de");
        jPanel9.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, -1, 20));

        LBL_Mes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Mes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Mes.setText("*");
        jPanel9.add(LBL_Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 90, 20));

        jLabel88.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel88.setText("de");
        jPanel9.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, -1, 20));

        LBL_Ano2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Ano2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Ano2.setText("*");
        jPanel9.add(LBL_Ano2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, 50, 20));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel9.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 400, 20));

        jLabel90.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel90.setText("Valor Pago R$");
        jPanel9.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, -1, 20));

        TXT_Valor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel9.add(TXT_Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 80, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Ano:");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        LBL_Ano3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Ano3.setText("*");
        jPanel9.add(LBL_Ano3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 80, -1));

        jLabel41.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel41.setText("Mês:");
        jPanel9.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        LBL_Mes3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LBL_Mes3.setText("*");
        jPanel9.add(LBL_Mes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 120, -1));

        jLabel58.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel58.setText("Tipo de Pagamento");
        jPanel9.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, -1, 30));

        CBOX_Tipo_Pag.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CBOX_Tipo_Pag.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Á vista", "Parcelado", "Cheque", "Deposito" }));
        jPanel9.add(CBOX_Tipo_Pag, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 130, -1));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fundo.jpg"))); // NOI18N
        jPanel9.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 460));

        LBL_id.setText("jLabel40");
        jPanel9.add(LBL_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        jTabbedPane5.addTab("Pagamentos", new javax.swing.ImageIcon(getClass().getResource("/IMG/Pagamento.png")), jPanel9); // NOI18N

        jPanel13.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel74.setText("Titulo");
        jPanel13.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        TXT_Produto1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel13.add(TXT_Produto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 320, -1));

        jLabel75.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel75.setText("Preço");
        jPanel13.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        BTN_Add_Produto1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Add_Produto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Add.png"))); // NOI18N
        BTN_Add_Produto1.setText("Adicionar");
        BTN_Add_Produto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Add_Produto1ActionPerformed(evt);
            }
        });
        jPanel13.add(BTN_Add_Produto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 140, -1));

        TBL_Lucros.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TBL_Lucros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Titulo", "Data do pagamento", "Valor", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBL_Lucros.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(TBL_Lucros);

        jPanel13.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 600, 290));

        jLabel71.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel71.setText("R$");
        jPanel13.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 20, 20));

        jLabel43.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel43.setText("Data da Compra");
        jPanel13.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jDateChooser3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDateChooser3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jDateChooser3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel13.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, -1));

        CBOX_Tipo1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Á vista", "Parcelado", "Cheque", "Deposito" }));
        jPanel13.add(CBOX_Tipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, -1));

        TXT_Preco_Prod1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel13.add(TXT_Preco_Prod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 80, -1));

        LBL_TotalLucro.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jPanel13.add(LBL_TotalLucro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 320, 50));

        BTN_ImpriDes1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BTN_ImpriDes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Imprimir.png"))); // NOI18N
        BTN_ImpriDes1.setText("Imprimir");
        BTN_ImpriDes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ImpriDes1ActionPerformed(evt);
            }
        });
        jPanel13.add(BTN_ImpriDes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, 160, 50));

        CBOX_Mes4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Mes4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        CBOX_Mes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Mes4ActionPerformed(evt);
            }
        });
        jPanel13.add(CBOX_Mes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 110, 30));

        CBOX_Ano4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CBOX_Ano4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel13.add(CBOX_Ano4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, -1, 30));

        BTN_Excluir_Lucros.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Excluir_Lucros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Delete.png"))); // NOI18N
        BTN_Excluir_Lucros.setText("Excluir");
        BTN_Excluir_Lucros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Excluir_LucrosActionPerformed(evt);
            }
        });
        jPanel13.add(BTN_Excluir_Lucros, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, -1, 50));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fundo.jpg"))); // NOI18N
        jPanel13.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 460));

        jTabbedPane5.addTab("<html>Pagamentos <br/> Extenos<html>", new javax.swing.ImageIcon(getClass().getResource("/IMG/Produtos.png")), jPanel13); // NOI18N

        jPanel10.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel72.setText("Titulo");
        jPanel10.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        TXT_Produto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel10.add(TXT_Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 320, -1));

        jLabel73.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel73.setText("Preço");
        jPanel10.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        BTN_Add_Produto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Add_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Add.png"))); // NOI18N
        BTN_Add_Produto.setText("Adicionar");
        BTN_Add_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Add_ProdutoActionPerformed(evt);
            }
        });
        jPanel10.add(BTN_Add_Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 140, -1));

        TBL_Despesas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TBL_Despesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Titulo", "Preço", "Data da Compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBL_Despesas.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(TBL_Despesas);

        jPanel10.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 600, 290));

        jLabel61.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel61.setText("R$");
        jPanel10.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 20, 20));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel28.setText("Data da Compra");
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jDateChooser1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDateChooser1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jDateChooser1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel10.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, -1));

        CBOX_Tipo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Particular", "Laboratorio" }));
        jPanel10.add(CBOX_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, -1));

        TXT_Preco_Prod.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel10.add(TXT_Preco_Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 80, -1));

        LBL_TotalDes.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jPanel10.add(LBL_TotalDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 310, 50));

        BTN_ImpriDes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BTN_ImpriDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Imprimir.png"))); // NOI18N
        BTN_ImpriDes.setText("Imprimir");
        BTN_ImpriDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ImpriDesActionPerformed(evt);
            }
        });
        jPanel10.add(BTN_ImpriDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 160, 50));

        CBOX_Mes5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Mes5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        CBOX_Mes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Mes5ActionPerformed(evt);
            }
        });
        jPanel10.add(CBOX_Mes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 110, 30));

        CBOX_Ano5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CBOX_Ano5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel10.add(CBOX_Ano5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, -1, 30));

        BTN_Excluir_Despesas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BTN_Excluir_Despesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Delete.png"))); // NOI18N
        BTN_Excluir_Despesas.setText("Excluir");
        BTN_Excluir_Despesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Excluir_DespesasActionPerformed(evt);
            }
        });
        jPanel10.add(BTN_Excluir_Despesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, -1, 50));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fundo.jpg"))); // NOI18N
        jPanel10.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 460));

        jTabbedPane5.addTab("Despesas", new javax.swing.ImageIcon(getClass().getResource("/IMG/Produtos.png")), jPanel10); // NOI18N

        jPanel8.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel33.setText("Fechamento do Mês");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        BTN_Fechar_Mes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BTN_Fechar_Mes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Check2.png"))); // NOI18N
        BTN_Fechar_Mes.setText("OK");
        BTN_Fechar_Mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Fechar_MesActionPerformed(evt);
            }
        });
        jPanel8.add(BTN_Fechar_Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 120, 50));

        Date_Inicio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel8.add(Date_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 120, 30));

        Data_Final.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel8.add(Data_Final, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 120, 30));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel35.setText("Ínicio do mês");
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 110, 20));

        jLabel36.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel36.setText("Final do Mês");
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 100, 20));

        jLabel39.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel39.setText("Escolha uma data");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fundo.jpg"))); // NOI18N
        jPanel8.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 460));

        jTabbedPane5.addTab("<html>Fechamento <br> do Mês </html>", new javax.swing.ImageIcon(getClass().getResource("/IMG/Fechamento_mes.png")), jPanel8, ""); // NOI18N

        jPanel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBL_Total.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TBL_Total.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ganhos", "Gastos", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBL_Total.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TBL_Total);
        if (TBL_Total.getColumnModel().getColumnCount() > 0) {
            TBL_Total.getColumnModel().getColumn(2).setHeaderValue("Total");
        }

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1060, 370));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel29.setText("Fechamento do Mês");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        CBOX_Ano1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CBOX_Ano1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel5.add(CBOX_Ano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, -1, 30));

        CBOX_Mes1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Mes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        CBOX_Mes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Mes1ActionPerformed(evt);
            }
        });
        jPanel5.add(CBOX_Mes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 110, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fundo.jpg"))); // NOI18N
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 460));

        jTabbedPane5.addTab("Geral", new javax.swing.ImageIcon(getClass().getResource("/IMG/Geral.png")), jPanel5); // NOI18N

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBL_P_Dentista.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TBL_P_Dentista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data de Entrada", "Data de Saída", "Paciente", "Serviço", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBL_P_Dentista.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(TBL_P_Dentista);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1060, 290));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel30.setText("Fechamento do Mês");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        CBOX_Ano2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CBOX_Ano2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel6.add(CBOX_Ano2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1005, 30, 60, 30));

        CBOX_Dentista1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Dentista1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CBOX_Dentista1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        CBOX_Dentista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Dentista1ActionPerformed(evt);
            }
        });
        jPanel6.add(CBOX_Dentista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 30));

        CBOX_Mes2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Mes2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        CBOX_Mes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Mes2ActionPerformed(evt);
            }
        });
        jPanel6.add(CBOX_Mes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 120, 30));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setText("Gerar Relatório");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 150, 60));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fundo.jpg"))); // NOI18N
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 460));

        jTabbedPane5.addTab("Por Dentista", new javax.swing.ImageIcon(getClass().getResource("/IMG/Por Dentista.png")), jPanel6); // NOI18N

        jPanel12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBL_CLiente_P.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TBL_CLiente_P.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Dr.(a)", "Ganho Previsto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBL_CLiente_P.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(TBL_CLiente_P);

        jPanel12.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1060, 290));

        jLabel40.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel40.setText("Previsão de ganhos do Mês");
        jPanel12.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        CBOX_Ano3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CBOX_Ano3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel12.add(CBOX_Ano3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, -1, 30));

        CBOX_Mes3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CBOX_Mes3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        CBOX_Mes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_Mes3ActionPerformed(evt);
            }
        });
        jPanel12.add(CBOX_Mes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 110, 30));

        BTN_ImpriPREV.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BTN_ImpriPREV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Imprimir.png"))); // NOI18N
        BTN_ImpriPREV.setText("Imprimir");
        BTN_ImpriPREV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ImpriPREVActionPerformed(evt);
            }
        });
        jPanel12.add(BTN_ImpriPREV, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, 200, 60));

        LBL_Total.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jPanel12.add(LBL_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 300, 50));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fundo.jpg"))); // NOI18N
        jPanel12.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 460));

        jTabbedPane5.addTab("Previsão", new javax.swing.ImageIcon(getClass().getResource("/IMG/stroke-7_1-2-0_piggy_48_0_000000_none.png")), jPanel12); // NOI18N

        jTabbedPane1.addTab("Financeiro", new javax.swing.ImageIcon(getClass().getResource("/IMG/Financeiro2 32x32.png")), jTabbedPane5); // NOI18N

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 1230, 510));

        jButton12.setBackground(new java.awt.Color(204, 204, 204));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/X.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 50, 30));

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/-.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 50, 30));

        jLabel17.setFont(new java.awt.Font("Baskerville Old Face", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 255));
        jLabel17.setText("Labor Orto São Paulo");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel18.setText("Laboratório de próteses dentárias");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Logo-Labor-Orto.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 120, 150));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background-2076334_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        Object[] options = {"Sair", "Permanecer"};
        int opc = JOptionPane.showOptionDialog(null, "Você tem certeza que quer sair", "Verificação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (opc == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        this.setExtendedState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jButton11ActionPerformed

    private void BTN_Salvar_DentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Salvar_DentActionPerformed

        ClienteBean cb = new ClienteBean();
        cb.setCli_Nome(TXT_Nome_Dentista.getText());
        cb.setCli_Fixo(TXT_Tel.getText());
        cb.setCli_Celular(TXT_Cel.getText());
        cb.setCli_Local(TXT_End.getText());
        cb.setCli_Secretaria(TXT_Secretaria.getText());
        cb.setCli_CRO(TXT_CRO.getText());
        cb.setCli_Tipo(CBOX_Tipo_Dent.getSelectedIndex());

        ClienteController cc = new ClienteController();
        cc.ClienteControllerInserir(cb);
        cc.ClienteControllerTable(Table_Cliente);

        LimparDentista();
        cc.ClienteControllerTable(Table_Cliente);
        List<ClienteBean> lc = cc.ClienteControllerSelecionarTodos();

        CBOX_Dr.setModel(new DefaultComboBoxModel(lc.toArray()));
        CBOX_Dentista.setModel(new DefaultComboBoxModel(lc.toArray()));
        CBOX_Dentista1.setModel(new DefaultComboBoxModel(lc.toArray()));
        CBOX_Dentista2.setModel(new DefaultComboBoxModel(lc.toArray()));


    }//GEN-LAST:event_BTN_Salvar_DentActionPerformed

    private void BTN_ProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ProcurarActionPerformed

        ClienteBean cb = new ClienteBean();
        ClienteController cc = new ClienteController();
        cb = cc.ClienteControllerSelecionar(cb, CBOX_Dentista2.getSelectedItem().toString());

        TXT_Nome_Dentista.setText(cb.getCli_Nome());
        TXT_Tel.setText(cb.getCli_Fixo());
        TXT_Cel.setText(cb.getCli_Celular());
        TXT_End.setText(cb.getCli_Local());
        TXT_Secretaria.setText(cb.getCli_Secretaria());
        TXT_CRO.setText(cb.getCli_CRO());
        CBOX_Tipo_Dent.setSelectedIndex(cb.getCli_Tipo());
        TXT_Saldo.setText(cb.getCli_saldo());


    }//GEN-LAST:event_BTN_ProcurarActionPerformed

    private void BTN_Editar_DentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Editar_DentActionPerformed

        String tel = TXT_Tel.getText();
        String cel = TXT_Cel.getText();
        String end = TXT_End.getText();
        String secre = TXT_Secretaria.getText();
        String saldo = TXT_Saldo.getText();

        ClienteBean cb = new ClienteBean();

        cb.setCli_Fixo(tel);
        cb.setCli_Celular(cel);
        cb.setCli_Local(end);
        cb.setCli_Secretaria(secre);
        cb.setCli_saldo(saldo);

        ClienteController cc = new ClienteController();
        cc.ClienteControllerAlterar(cb, TXT_Nome_Dentista.getText());
        cc.ClienteControllerTable(Table_Cliente);
        
        cc.ClienteControllerTable(Table_Cliente);
        List<ClienteBean> lc = cc.ClienteControllerSelecionarTodos();

        CBOX_Dr.setModel(new DefaultComboBoxModel(lc.toArray()));
        CBOX_Dentista.setModel(new DefaultComboBoxModel(lc.toArray()));
        CBOX_Dentista1.setModel(new DefaultComboBoxModel(lc.toArray()));
        CBOX_Dentista2.setModel(new DefaultComboBoxModel(lc.toArray()));

    }//GEN-LAST:event_BTN_Editar_DentActionPerformed

    private void TXT_EntradaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TXT_EntradaAncestorAdded

        Date hj = new Date();
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String data = formataData.format(hj);
        TXT_Entrada.setText(data);

    }//GEN-LAST:event_TXT_EntradaAncestorAdded

    private void Date_SaidaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Date_SaidaAncestorAdded

        LocalDate hj = LocalDate.now();
        LocalDate saida = hj.plusDays(7);
        DateTimeFormatter fortama = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = fortama.format(saida);
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date_Saida.setDate(formataData.parse(data));
        } catch (ParseException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_Date_SaidaAncestorAdded

    private void BTN_Add_CatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Add_CatActionPerformed

        CategoriaBean cab = new CategoriaBean();
        cab.setCat_Nome(TXT_Categoria.getText());

        CategoriaController cac = new CategoriaController();
        cac.CategoriaControllerInserir(cab);
        cac.CategoriaControllerTable(TBL_Cat);
        List<CategoriaBean> lca = cac.CategoriaControllerList();
        CBOX_Cat.setModel(new DefaultComboBoxModel(lca.toArray()));
        CBOX_Cat2.setModel(new DefaultComboBoxModel(lca.toArray()));

        ServicosController sc = new ServicosController();
        sc.ServicosControllerTable(TBL_Servico);
        sc.ServicosControllerTableCategoria(TBL_Catalogo, CBOX_Cat2.getSelectedItem().toString());
        List<ServicosBean> ls = sc.ServicosControllerTodos();

        CBOX_Servico_1.setModel(new DefaultComboBoxModel(ls.toArray()));
        CBOX_Servico_2.setModel(new DefaultComboBoxModel(ls.toArray()));
        CBOX_Servico_3.setModel(new DefaultComboBoxModel(ls.toArray()));
        CBOX_Servico_4.setModel(new DefaultComboBoxModel(ls.toArray()));

        LimparCategoria();

    }//GEN-LAST:event_BTN_Add_CatActionPerformed

    private void BTN_Add_ServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Add_ServicoActionPerformed

        String pc = TXT_Preco.getText();
        try {

            BigDecimal bg = new BigDecimal(converte(pc)).setScale(2, RoundingMode.HALF_EVEN);
            ServicosBean sb = new ServicosBean();
            sb.setServ_Nome(TXT_Servico.getText());
            sb.setServ_Preco(String.valueOf(bg));
            sb.setServ_id_Cat(CBOX_Cat.getSelectedItem().toString());

            ServicosController sc = new ServicosController();
            sc.ServicosControllerInserir(sb);
            sc.ServicosControllerTable(TBL_Servico);

            sc.ServicosControllerTableCategoria(TBL_Catalogo, CBOX_Cat2.getSelectedItem().toString());
            List<ServicosBean> ls = sc.ServicosControllerTodos();

            CBOX_Servico_1.setModel(new DefaultComboBoxModel(ls.toArray()));
            CBOX_Servico_2.setModel(new DefaultComboBoxModel(ls.toArray()));
            CBOX_Servico_3.setModel(new DefaultComboBoxModel(ls.toArray()));
            CBOX_Servico_4.setModel(new DefaultComboBoxModel(ls.toArray()));
            LimparServico();
        } catch (ParseException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BTN_Add_ServicoActionPerformed

    private void BTN_Salvar_TrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Salvar_TrabActionPerformed

        if (CBOX_Desconto.getSelectedItem().equals("Desconto (%)")) {

            JOptionPane.showMessageDialog(null, "Informe um desconto ou deixe em 0", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            if (CBOX_Tipo_S_I.getSelectedItem().equals("Tipo (Sup/Inf")) {

                JOptionPane.showMessageDialog(null, "Não foi informado o tipo", "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {

                Integer entrega;
                if (CBOX_Urg1.isSelected() || CBOX_Urg2.isSelected() || CBOX_Urg3.isSelected() || CBOX_Urg4.isSelected()) {
                    entrega = 1;
                } else {
                    entrega = 0;
                }

                SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
                String saida = sf.format(Date_Saida.getDate());

                RelacaoBean rb = new RelacaoBean();
                rb.setRela_dt(TXT_Entrada.getText());
                rb.setRela_Entrega(saida);
                rb.setRela_id_Cli(CBOX_Dentista.getSelectedItem().toString());
                rb.setRela_Paciente(TXT_Cliente.getText());
                rb.setRela_Serv(servico(CBOX_Servico_1.getSelectedItem().toString(),
                        CBOX_Servico_2.getSelectedItem().toString(),
                        CBOX_Servico_3.getSelectedItem().toString(),
                        CBOX_Servico_4.getSelectedItem().toString(),
                        CBOX_Qtd_Servico_1.getSelectedIndex(),
                        CBOX_Qtd_Servico_2.getSelectedIndex(),
                        CBOX_Qtd_Servico_3.getSelectedIndex(),
                        CBOX_Qtd_Servico_4.getSelectedIndex()));
                rb.setRela_Obs(TXT_Requisicao.getText());
                rb.setRela_Tipo_Entrega(entrega);
                rb.setRela_Cor(TXT_Cor.getText());
                rb.setRela_Tipo_Serv(CBOX_Tipo_S_I.getSelectedIndex());

                Object[] options = {"Sim", "Não"};
                int opc = JOptionPane.showOptionDialog(null, "Você tem certeza que as informações estão corretas?", "Verificação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

                if (opc == 0) {

                    info = new Talao_Pedido();

                    ServicosBean sb1 = new ServicosBean();
                    ServicosController sc1 = new ServicosController();
                    sc1.ServicosControllerSelecionar(sb1, CBOX_Servico_1.getSelectedItem().toString());

                    Float preco1;
                    if (CBOX_Urg1.isSelected() == true) {
                        if (sb1.getServ_Preco() == null) {
                            preco1 = (Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor"))
                                    + ((Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor")) / 100) * 25));
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

                    ServicosBean sb2 = new ServicosBean();
                    ServicosController sc2 = new ServicosController();
                    sc2.ServicosControllerSelecionar(sb2, CBOX_Servico_2.getSelectedItem().toString());

                    Float preco2;
                    if (CBOX_Urg2.isSelected() == true) {
                        if (sb2.getServ_Preco() == null) {
                            preco2 = (Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor"))
                                    + ((Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor")) / 100) * 25));
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

                    ServicosBean sb3 = new ServicosBean();
                    ServicosController sc3 = new ServicosController();
                    sc3.ServicosControllerSelecionar(sb3, CBOX_Servico_3.getSelectedItem().toString());

                    Float preco3;
                    if (CBOX_Urg3.isSelected() == true) {
                        if (sb3.getServ_Preco() == null) {
                            preco3 = (Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor"))
                                    + ((Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor")) / 100) * 25));
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

                    ServicosBean sb4 = new ServicosBean();
                    ServicosController sc4 = new ServicosController();
                    sc4.ServicosControllerSelecionar(sb4, CBOX_Servico_4.getSelectedItem().toString());

                    Float preco4;
                    if (CBOX_Urg4.isSelected() == true) {
                        if (sb4.getServ_Preco() == null) {
                            preco4 = (Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor"))
                                    + ((Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor")) / 100) * 25));
                        } else {
                            preco4 = Float.valueOf(sb4.getServ_Preco()) + ((Float.valueOf(sb4.getServ_Preco()) / 100) * 25);
                        }
                    } else {
                        if (sb4.getServ_Preco() == null) {
                            preco4 = Float.valueOf(JOptionPane.showInputDialog(null, "Informe o valor"));
                        } else {
                            preco4 = Float.valueOf(sb4.getServ_Preco());
                        }
                    }

                    Float subtotal = preco1 * CBOX_Qtd_Servico_1.getSelectedIndex() + preco2 * CBOX_Qtd_Servico_2.getSelectedIndex() + preco3 * CBOX_Qtd_Servico_3.getSelectedIndex() + preco4 * CBOX_Qtd_Servico_4.getSelectedIndex();
                    if (CBOX_Desconto.getSelectedItem().equals("0")) {
                        Float total = subtotal + (subtotal / 100) * 0;
                        DecimalFormat nf = new DecimalFormat("0.00");
                        rb.setRela_Total(String.valueOf(total));
                        info.preencherServ(CBOX_Servico_1.getSelectedItem().toString(),
                                CBOX_Servico_2.getSelectedItem().toString(),
                                CBOX_Servico_3.getSelectedItem().toString(),
                                CBOX_Servico_4.getSelectedItem().toString(),
                                CBOX_Qtd_Servico_1.getSelectedIndex(),
                                CBOX_Qtd_Servico_2.getSelectedIndex(),
                                CBOX_Qtd_Servico_3.getSelectedIndex(),
                                CBOX_Qtd_Servico_4.getSelectedIndex(), preco1, preco2, preco3, preco4, "0", nf.format(subtotal), nf.format(total));

                    } else {
                        Integer taxa = Integer.valueOf(CBOX_Desconto.getSelectedItem().toString());
                        Float total = subtotal - (subtotal / 100) * taxa;
                        DecimalFormat nf = new DecimalFormat("0.00");
                        rb.setRela_Total(String.valueOf(total));
                        info.preencherServ(CBOX_Servico_1.getSelectedItem().toString(),
                                CBOX_Servico_2.getSelectedItem().toString(),
                                CBOX_Servico_3.getSelectedItem().toString(),
                                CBOX_Servico_4.getSelectedItem().toString(),
                                CBOX_Qtd_Servico_1.getSelectedIndex(),
                                CBOX_Qtd_Servico_2.getSelectedIndex(),
                                CBOX_Qtd_Servico_3.getSelectedIndex(),
                                CBOX_Qtd_Servico_4.getSelectedIndex(), preco1, preco2, preco3, preco4, "-" + String.valueOf(taxa), nf.format(subtotal), nf.format(total));
                    }

                    RelacaoController rc = new RelacaoController();
                    rc.RelacaoControllerInserir(rb);
                    rc.RelacaoControllerTable(TBL_Trabs_Mes, mesN(String.valueOf((CBOX_Mes.getSelectedIndex() + 1)) + "/" + CBOX_Ano.getYear()));

                    info.setVisible(true);
                    info.preencher(TXT_Entrada.getText(), saida, CBOX_Dentista.getSelectedItem().toString(), TXT_Cliente.getText(),
                            TXT_Requisicao.getText(), entrega, TXT_Cor.getText(), CBOX_Tipo_S_I.getSelectedItem().toString());
                    LimparTrabalho();
                }
            }
        }
    }//GEN-LAST:event_BTN_Salvar_TrabActionPerformed

    private void CBOX_Cat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Cat2ActionPerformed

        ServicosController sc = new ServicosController();
        sc.ServicosControllerTableCategoria(TBL_Catalogo, CBOX_Cat2.getSelectedItem().toString());

    }//GEN-LAST:event_CBOX_Cat2ActionPerformed

    private void BTN_Excluir_CatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Excluir_CatActionPerformed

        CategoriaBean cab = new CategoriaBean();
        cab.setCat_Nome(TBL_Cat.getValueAt(TBL_Cat.getSelectedRow(), 0).toString());

        CategoriaController cac = new CategoriaController();
        cac.CategoriaControllerExcluir(cab);
        cac.CategoriaControllerTable(TBL_Cat);
        List<CategoriaBean> lca = cac.CategoriaControllerList();
        CBOX_Cat.setModel(new DefaultComboBoxModel(lca.toArray()));
        CBOX_Cat2.setModel(new DefaultComboBoxModel(lca.toArray()));

        ServicosController sc = new ServicosController();
        sc.ServicosControllerTable(TBL_Servico);
        sc.ServicosControllerTableCategoria(TBL_Catalogo, CBOX_Cat2.getSelectedItem().toString());
        List<ServicosBean> ls = sc.ServicosControllerTodos();

        CBOX_Servico_1.setModel(new DefaultComboBoxModel(ls.toArray()));
        CBOX_Servico_2.setModel(new DefaultComboBoxModel(ls.toArray()));
        CBOX_Servico_3.setModel(new DefaultComboBoxModel(ls.toArray()));
        CBOX_Servico_4.setModel(new DefaultComboBoxModel(ls.toArray()));

    }//GEN-LAST:event_BTN_Excluir_CatActionPerformed

    private void BTN_Excluir_ServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Excluir_ServicoActionPerformed

        ServicosBean sb = new ServicosBean();
        sb.setCodServ(Integer.valueOf(TBL_Servico.getValueAt(TBL_Servico.getSelectedRow(), 0).toString()));

        ServicosController sc = new ServicosController();
        sc.ServicosControllerDeletar(sb);
        sc.ServicosControllerTable(TBL_Servico);

        CategoriaController cac = new CategoriaController();
        cac.CategoriaControllerTable(TBL_Cat);
        List<CategoriaBean> lca = cac.CategoriaControllerList();
        CBOX_Cat.setModel(new DefaultComboBoxModel(lca.toArray()));
        CBOX_Cat2.setModel(new DefaultComboBoxModel(lca.toArray()));

        sc.ServicosControllerTable(TBL_Servico);
        sc.ServicosControllerTableCategoria(TBL_Catalogo, CBOX_Cat2.getSelectedItem().toString());
        List<ServicosBean> ls = sc.ServicosControllerTodos();

        CBOX_Servico_1.setModel(new DefaultComboBoxModel(ls.toArray()));
        CBOX_Servico_2.setModel(new DefaultComboBoxModel(ls.toArray()));
        CBOX_Servico_3.setModel(new DefaultComboBoxModel(ls.toArray()));
        CBOX_Servico_4.setModel(new DefaultComboBoxModel(ls.toArray()));

    }//GEN-LAST:event_BTN_Excluir_ServicoActionPerformed

    private void BTN_Salvar_PagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Salvar_PagActionPerformed

        String pc = TXT_Valor.getText();
        try {
            BigDecimal bg = new BigDecimal(converte(pc)).setScale(2, RoundingMode.HALF_EVEN);
            LucrosBean lb = new LucrosBean();

            Date hj = new Date();
            SimpleDateFormat formataData = new SimpleDateFormat("MM/yyyy");
            String data = formataData.format(hj);

            ClienteBean cb = new ClienteBean();
            ClienteController cc = new ClienteController();
            cc.ClienteControllerSelecionarSaldo(cb, TBL_Pagamento.getValueAt(TBL_Pagamento.getSelectedRow(), 0).toString());

            if(Objects.equals(Float.valueOf(pc), Float.valueOf(LBL_Valor2.getText()))){
                
                cb.setCli_saldo(String.valueOf(0));
                cc.ClienteControllerAlterarSaldo(cb, LBL_Dentista.getText());
                
            } else {
                
                Float sobra = Float.valueOf(pc) - Float.valueOf(LBL_Valor2.getText());
                cb.setCli_saldo(String.valueOf(sobra));
                cc.ClienteControllerAlterarSaldo(cb, LBL_Dentista.getText());
                
            }
            
            lb.setLcs_id_Cli(LBL_id.getText());
            lb.setLcs_dt(data);
            lb.setLcs_Tipo(CBOX_Tipo_Pag.getSelectedItem().toString());
            lb.setLcs_Vlr(String.valueOf(bg));
            lb.setLcs_Titulo("Pagaento");

            LBL_Valor.setText(TXT_Valor.getText());
            LucrosController lc = new LucrosController();
            lc.LucrosControllerInserir(lb);

            Recibo rcb = new Recibo();
            rcb.preencher(LBL_Dentista.getText(), LBL_Valor2.getText(), LBL_Valor.getText(), 
                    CBOX_Tipo_Pag.getSelectedItem().toString(),
                    LBL_Mes.getText(), LBL_Ano1.getText(), LBL_Dia2.getText());
            rcb.setVisible(true);
            LimparLucro();
        } catch (ParseException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BTN_Salvar_PagActionPerformed

    private void CBOX_Qtd_Servico_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Qtd_Servico_1ActionPerformed
        total(CBOX_Servico_1.getSelectedItem().toString(),
                CBOX_Servico_2.getSelectedItem().toString(),
                CBOX_Servico_3.getSelectedItem().toString(),
                CBOX_Servico_4.getSelectedItem().toString(),
                CBOX_Qtd_Servico_1.getSelectedIndex(),
                CBOX_Qtd_Servico_2.getSelectedIndex(),
                CBOX_Qtd_Servico_3.getSelectedIndex(),
                CBOX_Qtd_Servico_4.getSelectedIndex());

    }//GEN-LAST:event_CBOX_Qtd_Servico_1ActionPerformed

    private void CBOX_Qtd_Servico_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Qtd_Servico_2ActionPerformed
        total(CBOX_Servico_1.getSelectedItem().toString(),
                CBOX_Servico_2.getSelectedItem().toString(),
                CBOX_Servico_3.getSelectedItem().toString(),
                CBOX_Servico_4.getSelectedItem().toString(),
                CBOX_Qtd_Servico_1.getSelectedIndex(),
                CBOX_Qtd_Servico_2.getSelectedIndex(),
                CBOX_Qtd_Servico_3.getSelectedIndex(),
                CBOX_Qtd_Servico_4.getSelectedIndex());
    }//GEN-LAST:event_CBOX_Qtd_Servico_2ActionPerformed

    private void CBOX_Qtd_Servico_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Qtd_Servico_3ActionPerformed
        total(CBOX_Servico_1.getSelectedItem().toString(),
                CBOX_Servico_2.getSelectedItem().toString(),
                CBOX_Servico_3.getSelectedItem().toString(),
                CBOX_Servico_4.getSelectedItem().toString(),
                CBOX_Qtd_Servico_1.getSelectedIndex(),
                CBOX_Qtd_Servico_2.getSelectedIndex(),
                CBOX_Qtd_Servico_3.getSelectedIndex(),
                CBOX_Qtd_Servico_4.getSelectedIndex());
    }//GEN-LAST:event_CBOX_Qtd_Servico_3ActionPerformed

    private void CBOX_Qtd_Servico_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Qtd_Servico_4ActionPerformed
        total(CBOX_Servico_1.getSelectedItem().toString(),
                CBOX_Servico_2.getSelectedItem().toString(),
                CBOX_Servico_3.getSelectedItem().toString(),
                CBOX_Servico_4.getSelectedItem().toString(),
                CBOX_Qtd_Servico_1.getSelectedIndex(),
                CBOX_Qtd_Servico_2.getSelectedIndex(),
                CBOX_Qtd_Servico_3.getSelectedIndex(),
                CBOX_Qtd_Servico_4.getSelectedIndex());
    }//GEN-LAST:event_CBOX_Qtd_Servico_4ActionPerformed

    private void CBOX_Servico_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Servico_4ActionPerformed
        total(CBOX_Servico_1.getSelectedItem().toString(),
                CBOX_Servico_2.getSelectedItem().toString(),
                CBOX_Servico_3.getSelectedItem().toString(),
                CBOX_Servico_4.getSelectedItem().toString(),
                CBOX_Qtd_Servico_1.getSelectedIndex(),
                CBOX_Qtd_Servico_2.getSelectedIndex(),
                CBOX_Qtd_Servico_3.getSelectedIndex(),
                CBOX_Qtd_Servico_4.getSelectedIndex());
    }//GEN-LAST:event_CBOX_Servico_4ActionPerformed

    private void CBOX_Servico_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Servico_3ActionPerformed
        total(CBOX_Servico_1.getSelectedItem().toString(),
                CBOX_Servico_2.getSelectedItem().toString(),
                CBOX_Servico_3.getSelectedItem().toString(),
                CBOX_Servico_4.getSelectedItem().toString(),
                CBOX_Qtd_Servico_1.getSelectedIndex(),
                CBOX_Qtd_Servico_2.getSelectedIndex(),
                CBOX_Qtd_Servico_3.getSelectedIndex(),
                CBOX_Qtd_Servico_4.getSelectedIndex());
    }//GEN-LAST:event_CBOX_Servico_3ActionPerformed

    private void CBOX_Servico_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Servico_1ActionPerformed
        total(CBOX_Servico_1.getSelectedItem().toString(),
                CBOX_Servico_2.getSelectedItem().toString(),
                CBOX_Servico_3.getSelectedItem().toString(),
                CBOX_Servico_4.getSelectedItem().toString(),
                CBOX_Qtd_Servico_1.getSelectedIndex(),
                CBOX_Qtd_Servico_2.getSelectedIndex(),
                CBOX_Qtd_Servico_3.getSelectedIndex(),
                CBOX_Qtd_Servico_4.getSelectedIndex());
    }//GEN-LAST:event_CBOX_Servico_1ActionPerformed

    private void CBOX_Servico_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Servico_2ActionPerformed
        total(CBOX_Servico_1.getSelectedItem().toString(),
                CBOX_Servico_2.getSelectedItem().toString(),
                CBOX_Servico_3.getSelectedItem().toString(),
                CBOX_Servico_4.getSelectedItem().toString(),
                CBOX_Qtd_Servico_1.getSelectedIndex(),
                CBOX_Qtd_Servico_2.getSelectedIndex(),
                CBOX_Qtd_Servico_3.getSelectedIndex(),
                CBOX_Qtd_Servico_4.getSelectedIndex());
    }//GEN-LAST:event_CBOX_Servico_2ActionPerformed

    private void CBOX_DescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_DescontoActionPerformed
        total(CBOX_Servico_1.getSelectedItem().toString(),
                CBOX_Servico_2.getSelectedItem().toString(),
                CBOX_Servico_3.getSelectedItem().toString(),
                CBOX_Servico_4.getSelectedItem().toString(),
                CBOX_Qtd_Servico_1.getSelectedIndex(),
                CBOX_Qtd_Servico_2.getSelectedIndex(),
                CBOX_Qtd_Servico_3.getSelectedIndex(),
                CBOX_Qtd_Servico_4.getSelectedIndex());
    }//GEN-LAST:event_CBOX_DescontoActionPerformed

    private void BTN_Add_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Add_ProdutoActionPerformed

        String pc = TXT_Preco_Prod.getText();
        try {
            BigDecimal bg = new BigDecimal(converte(pc)).setScale(2, RoundingMode.HALF_EVEN);
            SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
            String data = sf.format(jDateChooser1.getDate());

            DespesasBean db = new DespesasBean();
            db.setDesp_Tipo(CBOX_Tipo.getSelectedItem().toString());
            db.setDesp_Titulo(TXT_Produto.getText());
            db.setDesp_Preco(String.valueOf(bg));
            db.setDesp_dt(data);

            DespesasController dc = new DespesasController();
            dc.DespesasControllerInserir(db);
            dc.DespesasControllerTable(TBL_Despesas, data.substring(3, 10));

            LimparProduto();

        } catch (ParseException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BTN_Add_ProdutoActionPerformed

    private void jDateChooser1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jDateChooser1AncestorAdded
        Date hj = new Date();
        jDateChooser1.setDate(hj);

    }//GEN-LAST:event_jDateChooser1AncestorAdded

    private void CBOX_DrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_DrActionPerformed

        SimpleDateFormat sf = new SimpleDateFormat("MM/yyyy");
        String data = sf.format(jDateChooser2.getDate());
        
        SimpleDateFormat sf1 = new SimpleDateFormat("dd/MM/yyyy");
        String data1 = sf1.format(jDateChooser2.getDate());

        RelacaoController rc = new RelacaoController();
        rc.RelacaoControllerTablePagamento(TBL_Pagamento, CBOX_Dr.getSelectedItem().toString(), data);

        LBL_Dia2.setText(data1.substring(0, 2));
        LBL_Dia1.setText(mes(data1.substring(3, 5)));
        LBL_Mes.setText(mes(data1.substring(3, 5)));
        LBL_Ano1.setText(data1.substring(6, 10));
        LBL_Ano2.setText(data1.substring(6, 10));

    }//GEN-LAST:event_CBOX_DrActionPerformed

    private void TBL_PagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_PagamentoMouseClicked

        RelacaoBean rb = new RelacaoBean();
        ClienteBean cb = new ClienteBean();

        SimpleDateFormat sf = new SimpleDateFormat("MM/yyyy");
        String data = sf.format(jDateChooser2.getDate());
        RelacaoController rc = new RelacaoController();
        rc.RelacaoControllerSelecionar(rb, cb, TBL_Pagamento.getValueAt(TBL_Pagamento.getSelectedRow(), 0).toString(), data);

        ClienteController cc = new ClienteController();
        cc.ClienteControllerSelecionarSaldo(cb, TBL_Pagamento.getValueAt(TBL_Pagamento.getSelectedRow(), 0).toString());

        Float total = Float.valueOf(rb.getTotal());
        
        if (cb.getCli_saldo() == null) {
            
            
            LBL_id.setText(String.valueOf(cb.getCodCli()));
            LBL_Ano3.setText(rb.getRela_dt().substring(6, 10));
            LBL_Mes3.setText(mes(rb.getRela_dt().substring(3, 5)));
            LBL_Dentista.setText(cb.getCli_Nome());
            LBL_Consultorio.setText(cb.getCli_Nome());
            LBL_Valor2.setText(rb.getTotal());
            LBL_Valor.setText(rb.getTotal());
            
        } else {
            Float saldo = Float.valueOf(cb.getCli_saldo());
            if ( saldo == 0) {
                
                Float divida = total - saldo;

                LBL_id.setText(String.valueOf(cb.getCodCli()));
                LBL_Ano3.setText(rb.getRela_dt().substring(6, 10));
                LBL_Mes3.setText(mes(rb.getRela_dt().substring(3, 5)));
                LBL_Dentista.setText(cb.getCli_Nome());
                LBL_Consultorio.setText(cb.getCli_Nome());
                LBL_Valor2.setText(String.valueOf(divida));
                LBL_Valor.setText(rb.getTotal());
                
            } else {
                Float divida = total - saldo;

                LBL_id.setText(String.valueOf(cb.getCodCli()));
                LBL_Ano3.setText(rb.getRela_dt().substring(6, 10));
                LBL_Mes3.setText(mes(rb.getRela_dt().substring(3, 5)));
                LBL_Dentista.setText(cb.getCli_Nome());
                LBL_Consultorio.setText(cb.getCli_Nome());
                LBL_Valor2.setText(String.valueOf(divida));
                LBL_Valor.setText(rb.getTotal());
            }

        }
        System.out.println(rb.getRela_dt().substring(3, 5));
    }//GEN-LAST:event_TBL_PagamentoMouseClicked

    private void BTN_Fechar_MesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Fechar_MesActionPerformed

        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sf1 = new SimpleDateFormat("MM/yyyy");
        String inicio = sf.format(Date_Inicio.getDate());
        String inicio1 = sf1.format(Date_Inicio.getDate());
        String fim = sf.format(Data_Final.getDate());

        LucrosBean lb = new LucrosBean();
        DespesasBean db = new DespesasBean();

        LucrosController lc = new LucrosController();
        DespesasController dc = new DespesasController();

        lc.LucroCotrollerLucroTotal(lb, inicio1);
        dc.DespesasControllerTotal(db, inicio, fim);
        Float lucro = Float.valueOf(lb.getLcs_Vlr());
        Float despesas = Float.valueOf(db.getDesp_Preco());
        FinanceiroBean fb = new FinanceiroBean();
        fb.setFin_renda_pos(lb.getLcs_Vlr());
        fb.setFin_renda_neg(db.getDesp_Preco());
        fb.setFin_renda_Total(String.valueOf(lucro - despesas));
        fb.setFin_Mes(fim.substring(3, 5));
        fb.setFin_Ano(Integer.valueOf(fim.substring(6, 10)));

        FinanceiroController fc = new FinanceiroController();
        fc.FinaceiroControllerInserir(fb);


    }//GEN-LAST:event_BTN_Fechar_MesActionPerformed

    private void CBOX_Ano2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CBOX_Ano2AncestorAdded
        RelacaoController rc = new RelacaoController();
        rc.RelacaoControllerTableFechamento(TBL_P_Dentista, CBOX_Dentista1.getSelectedItem().toString(), mesN(String.valueOf((CBOX_Mes2.getSelectedIndex() + 1)) + "/" + CBOX_Ano2.getYear()));
        
    }//GEN-LAST:event_CBOX_Ano2AncestorAdded

    private void CBOX_Dentista1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CBOX_Dentista1AncestorAdded
        RelacaoController rc = new RelacaoController();
        rc.RelacaoControllerTableFechamento(TBL_P_Dentista, CBOX_Dentista1.getSelectedItem().toString(), mesN(String.valueOf((CBOX_Mes2.getSelectedIndex() + 1)) + "/" + CBOX_Ano2.getYear()));
                
    }//GEN-LAST:event_CBOX_Dentista1AncestorAdded

    private void CBOX_Ano1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CBOX_Ano1AncestorAdded
        FinanceiroController fc = new FinanceiroController();
        fc.FinanceiroControllerTable(TBL_Total, Integer.valueOf(mesN(String.valueOf(CBOX_Mes1.getSelectedIndex() + 1))), String.valueOf(CBOX_Ano1.getYear()));
    }//GEN-LAST:event_CBOX_Ano1AncestorAdded

    private void CBOX_MesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_MesActionPerformed
        RelacaoController rc = new RelacaoController();
        rc.RelacaoControllerTable(TBL_Trabs_Mes, mesN(String.valueOf(CBOX_Mes.getSelectedIndex() + 1)) + "/" + CBOX_Ano.getYear());
    }//GEN-LAST:event_CBOX_MesActionPerformed

    private void BTN_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ExcluirActionPerformed
        ClienteBean cb = new ClienteBean();

        Integer tipo;
        if (Table_Cliente.getValueAt(Table_Cliente.getSelectedRow(), 0).toString().equals("Dentista")) {
            tipo = 1;

            cb.setCli_Tipo(tipo);
            cb.setCli_Nome(Table_Cliente.getValueAt(Table_Cliente.getSelectedRow(), 1).toString());
            cb.setCli_Fixo(Table_Cliente.getValueAt(Table_Cliente.getSelectedRow(), 5).toString());

            ClienteController cc = new ClienteController();

            cc.ClienteControllerExcluir(cb);
            cc.ClienteControllerTable(Table_Cliente);
        } else if (Table_Cliente.getValueAt(Table_Cliente.getSelectedRow(), 0).toString().equals("Protético")) {
            tipo = 2;

            cb.setCli_Tipo(tipo);
            cb.setCli_Nome(Table_Cliente.getValueAt(Table_Cliente.getSelectedRow(), 1).toString());
            cb.setCli_Fixo(Table_Cliente.getValueAt(Table_Cliente.getSelectedRow(), 5).toString());

            ClienteController cc = new ClienteController();

            cc.ClienteControllerExcluir(cb);
            cc.ClienteControllerTable(Table_Cliente);
        }


    }//GEN-LAST:event_BTN_ExcluirActionPerformed

    private void BTN_Excluir_RelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Excluir_RelaActionPerformed
        RelacaoBean rb = new RelacaoBean();
        rb.setRela_dt(TBL_Trabs_Mes.getValueAt(TBL_Trabs_Mes.getSelectedRow(), 0).toString());
        rb.setRela_Paciente(TBL_Trabs_Mes.getValueAt(TBL_Trabs_Mes.getSelectedRow(), 2).toString());
        rb.setRela_Serv(TBL_Trabs_Mes.getValueAt(TBL_Trabs_Mes.getSelectedRow(), 3).toString());
        rb.setRela_id_Cli(TBL_Trabs_Mes.getValueAt(TBL_Trabs_Mes.getSelectedRow(), 1).toString());

        RelacaoController rc = new RelacaoController();
        rc.RelacaoControllerExcluir(rb);
        rc.RelacaoControllerTable(TBL_Trabs_Mes, mesN(String.valueOf(CBOX_Mes.getSelectedIndex() + 1)) + "/" + CBOX_Ano.getYear());
    }//GEN-LAST:event_BTN_Excluir_RelaActionPerformed

    private void CBOX_Mes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Mes1ActionPerformed
        FinanceiroController fc = new FinanceiroController();
        fc.FinanceiroControllerTable(TBL_Total, Integer.valueOf(mesN(String.valueOf(CBOX_Mes1.getSelectedIndex() + 1))), String.valueOf(CBOX_Ano1.getYear()));
    }//GEN-LAST:event_CBOX_Mes1ActionPerformed

    private void CBOX_Mes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Mes2ActionPerformed
        RelacaoController rc = new RelacaoController();
        rc.RelacaoControllerTableFechamento(TBL_P_Dentista, CBOX_Dentista1.getSelectedItem().toString(), mesN(String.valueOf(CBOX_Mes2.getSelectedIndex() + 1)) + "/" + CBOX_Ano2.getYear());
        
    }//GEN-LAST:event_CBOX_Mes2ActionPerformed

    private void BTN_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AlterarActionPerformed

        ServicosBean sb = new ServicosBean();
        String nome = TBL_Servico.getValueAt(TBL_Servico.getSelectedRow(), 2).toString();
        String valor = TBL_Servico.getValueAt(TBL_Servico.getSelectedRow(), 3).toString();
        sb.setServ_Preco(valor);
        sb.setServ_Nome(nome);

        ServicosController sc = new ServicosController();
        sc.ServicosControllerAlterar(sb, TBL_Servico.getValueAt(TBL_Servico.getSelectedRow(), 0).toString());
        sc.ServicosControllerTable(TBL_Servico);

    }//GEN-LAST:event_BTN_AlterarActionPerformed

    private void TBL_Trabs_MesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_Trabs_MesMouseClicked

        RelacaoBean rb = new RelacaoBean();
        RelacaoController rc = new RelacaoController();
        rc.RelacaoControllerSelecionarAl(rb, TBL_Trabs_Mes.getValueAt(TBL_Trabs_Mes.getSelectedRow(), 1).toString(),
                TBL_Trabs_Mes.getValueAt(TBL_Trabs_Mes.getSelectedRow(), 2).toString(),
                TBL_Trabs_Mes.getValueAt(TBL_Trabs_Mes.getSelectedRow(), 3).toString(),
                TBL_Trabs_Mes.getValueAt(TBL_Trabs_Mes.getSelectedRow(), 0).toString());

        Editar_Serviço es = new Editar_Serviço();
        es.setVisible(true);
        es.Mudardata(rb.getCodRela(), rb.getRela_dt(), rb.getRela_Paciente(), rb.getRela_Entrega());

    }//GEN-LAST:event_TBL_Trabs_MesMouseClicked

    private void CBOX_Urg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Urg1ActionPerformed
        total(CBOX_Servico_1.getSelectedItem().toString(),
                CBOX_Servico_2.getSelectedItem().toString(),
                CBOX_Servico_3.getSelectedItem().toString(),
                CBOX_Servico_4.getSelectedItem().toString(),
                CBOX_Qtd_Servico_1.getSelectedIndex(),
                CBOX_Qtd_Servico_2.getSelectedIndex(),
                CBOX_Qtd_Servico_3.getSelectedIndex(),
                CBOX_Qtd_Servico_4.getSelectedIndex());
    }//GEN-LAST:event_CBOX_Urg1ActionPerformed

    private void CBOX_Urg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Urg2ActionPerformed
        total(CBOX_Servico_1.getSelectedItem().toString(),
                CBOX_Servico_2.getSelectedItem().toString(),
                CBOX_Servico_3.getSelectedItem().toString(),
                CBOX_Servico_4.getSelectedItem().toString(),
                CBOX_Qtd_Servico_1.getSelectedIndex(),
                CBOX_Qtd_Servico_2.getSelectedIndex(),
                CBOX_Qtd_Servico_3.getSelectedIndex(),
                CBOX_Qtd_Servico_4.getSelectedIndex());
    }//GEN-LAST:event_CBOX_Urg2ActionPerformed

    private void CBOX_Urg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Urg3ActionPerformed
        total(CBOX_Servico_1.getSelectedItem().toString(),
                CBOX_Servico_2.getSelectedItem().toString(),
                CBOX_Servico_3.getSelectedItem().toString(),
                CBOX_Servico_4.getSelectedItem().toString(),
                CBOX_Qtd_Servico_1.getSelectedIndex(),
                CBOX_Qtd_Servico_2.getSelectedIndex(),
                CBOX_Qtd_Servico_3.getSelectedIndex(),
                CBOX_Qtd_Servico_4.getSelectedIndex());
    }//GEN-LAST:event_CBOX_Urg3ActionPerformed

    private void CBOX_Urg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Urg4ActionPerformed
        total(CBOX_Servico_1.getSelectedItem().toString(),
                CBOX_Servico_2.getSelectedItem().toString(),
                CBOX_Servico_3.getSelectedItem().toString(),
                CBOX_Servico_4.getSelectedItem().toString(),
                CBOX_Qtd_Servico_1.getSelectedIndex(),
                CBOX_Qtd_Servico_2.getSelectedIndex(),
                CBOX_Qtd_Servico_3.getSelectedIndex(),
                CBOX_Qtd_Servico_4.getSelectedIndex());
    }//GEN-LAST:event_CBOX_Urg4ActionPerformed

    private void TXT_RequisicaoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TXT_RequisicaoAncestorAdded
        TXT_Requisicao.setLineWrap(true);
    }//GEN-LAST:event_TXT_RequisicaoAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Document doc = new Document(PageSize.A4);

        String FONT = "resources/fonts/FreeSans.ttf";
        RelacaoController rc = new RelacaoController();
        RelacaoBean rb = new RelacaoBean();
        ClienteBean cb = new ClienteBean();
        String nome = System.getProperty("user.name");
        
        rc.RelacaoControllerRelatorio(rb, cb, CBOX_Dentista1.getSelectedItem().toString(), mesN(String.valueOf(CBOX_Mes2.getSelectedIndex() + 1)) + "/" + CBOX_Ano2.getYear());

        List<RelacaoBean> lrb2 = rc.RelacaoControllerdt(CBOX_Dentista1.getSelectedItem().toString(), mesN(String.valueOf(CBOX_Mes2.getSelectedIndex() + 1)) + "/" + CBOX_Ano2.getYear());

        Date hj = new Date();
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String data = formataData.format(hj);
        File local = new File("C:\\Users\\"+nome+"\\OneDrive\\Backup\\Relatorios\\"
                +CBOX_Mes2.getSelectedItem().toString()+" "+String.valueOf(CBOX_Ano2.getYear()));

        if(!local.exists()){
            local.mkdirs();
        }
        try {
                        
            PdfWriter.getInstance(doc, new FileOutputStream(local+"\\"
                    + "Backup_Mes" + cb.getCli_Nome()+CBOX_Mes2.getSelectedItem().toString()+".pdf"));
            Font f = FontFactory.getFont(FONT, BaseFont.WINANSI, BaseFont.EMBEDDED, 5);
            
            doc.open();
            
            PdfPTable table = new PdfPTable(5);
            PdfPCell titulo = new PdfPCell(new Paragraph("Labor Orto São Paulo          Silvana M. Ruiz - C.R.O SP T.P.D. 9897", f));
            titulo.setColspan(5);
            titulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell info_Sil = new PdfPCell(new Paragraph("Relatorio Mensal de Trabalhos", f));
            info_Sil.setColspan(5);
            info_Sil.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell espaco = new PdfPCell(new Paragraph("  ", f));
            espaco.setColspan(5);
            PdfPCell header1 = new PdfPCell(new Paragraph("Emissão: " + data, f));
            header1.setColspan(5);
            PdfPCell header2 = new PdfPCell(new Paragraph("Mês: " + CBOX_Mes2.getSelectedItem().toString()+"/"+String.valueOf(CBOX_Ano2.getYear()), f));
            header2.setColspan(5);
            PdfPCell header3 = new PdfPCell(new Paragraph("Dr.(a): " + cb.getCli_Nome(), f));
            header3.setColspan(5);
            PdfPCell header4 = new PdfPCell(new Paragraph("End: " + cb.getCli_Local()+"     Tel: " + cb.getCli_Fixo(), f));
            header4.setColspan(5);
            PdfPCell celula1 = new PdfPCell(new Paragraph("Entrada:", f));
            PdfPCell celula2 = new PdfPCell(new Paragraph("Saída:", f));
            PdfPCell celula3 = new PdfPCell(new Paragraph("Paciente:", f));
            PdfPCell celula4 = new PdfPCell(new Paragraph("Serviço:", f));
            PdfPCell celula5 = new PdfPCell(new Paragraph("Valor:", f));
            
            table.addCell(titulo);
            table.addCell(info_Sil);
            table.addCell(espaco);
            table.addCell(header1);
            table.addCell(header2);
            table.addCell(header3);
            table.addCell(header4);
            table.addCell(celula1);
            table.addCell(celula2);
            table.addCell(celula3);
            table.addCell(celula4);
            table.addCell(celula5);
            for (int i = 0; i < lrb2.size(); i++) {
                String dias[] = lrb2.toArray()[i].toString().split("//");
                PdfPCell infor1 = new PdfPCell(new Paragraph(dias[0], f));
                PdfPCell infor2 = new PdfPCell(new Paragraph(dias[1], f));
                PdfPCell infor3 = new PdfPCell(new Paragraph(dias[2], f));
                PdfPCell infor4 = new PdfPCell(new Paragraph(dias[3], f));
                PdfPCell infor5 = new PdfPCell(new Paragraph(dias[4], f));
                
                table.addCell(infor1);
                table.addCell(infor2);
                table.addCell(infor3);
                table.addCell(infor4);
                table.addCell(infor5);
            }
            PdfPCell stotal = new PdfPCell(new Paragraph("Subtotal: R$ " + rb.getTotal(), f));
            stotal.setColspan(5);
            stotal.setHorizontalAlignment(Element.ALIGN_RIGHT);
            
            table.addCell(stotal);
            table.addCell(espaco);
            
            ClienteController cc = new ClienteController();
            cc.ClienteControllerSelecionarSaldo(cb, cb.getCli_Nome());

            Float total1 = Float.valueOf(rb.getTotal());
            if (cb.getCli_saldo() == null || cb.getCli_saldo().equals("0.00")) {
                DecimalFormat df = new DecimalFormat("0.00");
                PdfPCell total = new PdfPCell(new Paragraph("Total: R$ " + df.format(total1), f));
                total.setColspan(5);
                total.setHorizontalAlignment(Element.ALIGN_RIGHT);
                table.addCell(total);
            } else {
                if(Float.valueOf(cb.getCli_saldo())> 0){

                    Float divida = total1 - Float.valueOf(cb.getCli_saldo());
                    PdfPCell resto = new PdfPCell(new Paragraph("Haver: R$ " + cb.getCli_saldo(), f));
                    resto.setColspan(5);
                    resto.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    table.addCell(resto);

                    table.addCell(espaco);
                    DecimalFormat df = new DecimalFormat("0.00");
                    PdfPCell total = new PdfPCell(new Paragraph("Total: R$ " + df.format(divida), f));
                    total.setColspan(5);
                    total.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    table.addCell(total);
                }else if (Float.valueOf(cb.getCli_saldo()) < 0){
                    Float divida = total1 - Float.valueOf(cb.getCli_saldo());

                    PdfPCell resto = new PdfPCell(new Paragraph("Debito: R$ " + cb.getCli_saldo(), f));
                    resto.setColspan(5);
                    resto.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    table.addCell(resto);

                    table.addCell(espaco);
                    System.out.println(divida);
                    DecimalFormat df = new DecimalFormat("0.00");
                    PdfPCell total = new PdfPCell(new Paragraph("Total: R$ " + df.format(divida), f));
                    total.setColspan(5);
                    total.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    table.addCell(total);
                }
                    
                

            }
            Paragraph espaco1 = new Paragraph(" ", f);
            
            doc.add(table);
            doc.add(espaco1);
            doc.add(espaco1);
            doc.add(table);

        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Error:" + ex);
            JOptionPane.showMessageDialog(null,"Error: "+ex+"");
        } finally {
            doc.close();
        }

        try {
            rc.RelacaoControllerRelatorio(rb, cb, CBOX_Dentista1.getSelectedItem().toString(), String.valueOf((CBOX_Mes2.getSelectedIndex() + 1) + "/" + CBOX_Ano2.getYear()));

            Desktop.getDesktop().open(new File(local+"\\"+"Backup_Mes" + cb.getCli_Nome()+CBOX_Mes2.getSelectedItem().toString()+".pdf"));
        } catch (IOException ex) {
            System.out.println("Error:" + ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDateChooser2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jDateChooser2AncestorAdded
        Date hj = new Date();
        jDateChooser2.setDate(hj);

        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        String data = sf.format(jDateChooser2.getDate());

        RelacaoController rc = new RelacaoController();
        rc.RelacaoControllerTablePagamento(TBL_Pagamento, CBOX_Dr.getSelectedItem().toString(), data);

        LBL_Dia2.setText(data.substring(0, 2));
        LBL_Dia1.setText(mes(data.substring(3, 5)));
        LBL_Mes.setText(mes(data.substring(3, 5)));
        LBL_Ano1.setText(data.substring(6, 10));
        LBL_Ano2.setText(data.substring(6, 10));
    }//GEN-LAST:event_jDateChooser2AncestorAdded

    private void CBOX_Dentista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Dentista1ActionPerformed
        RelacaoController rc = new RelacaoController();
        rc.RelacaoControllerTableFechamento(TBL_P_Dentista, CBOX_Dentista1.getSelectedItem().toString(), mesN(String.valueOf(CBOX_Mes2.getSelectedIndex() + 1)) + "/" + CBOX_Ano2.getYear());
         
    }//GEN-LAST:event_CBOX_Dentista1ActionPerformed

    private void CBOX_Mes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Mes3ActionPerformed
        RelacaoController rc = new RelacaoController();
        rc.RelacaoControllerTableprevia(TBL_CLiente_P, mesN(String.valueOf(CBOX_Mes3.getSelectedIndex() + 1)) + "/" + CBOX_Ano3.getYear());
        
        Double Orcamento = 0.0;
        for ( int i = 0; i < TBL_CLiente_P.getRowCount(); i++){
            Orcamento += Double.parseDouble( TBL_CLiente_P.getValueAt(i, 1).toString());
        }
        
        DecimalFormat df = new DecimalFormat("0.00");
        LBL_Total.setText(df.format(Orcamento));

    }//GEN-LAST:event_CBOX_Mes3ActionPerformed

    private void CBOX_Ano3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CBOX_Ano3AncestorAdded
        RelacaoController rc = new RelacaoController();
        rc.RelacaoControllerTableprevia(TBL_CLiente_P, mesN(String.valueOf(CBOX_Mes3.getSelectedIndex() + 1)) + "/" + CBOX_Ano3.getYear()); 
    }//GEN-LAST:event_CBOX_Ano3AncestorAdded

    private void BTN_ImpriDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ImpriDesActionPerformed
        
        Document doc = new Document(PageSize.A4);

        String FONT = "resources/fonts/FreeSans.ttf";
        DespesasController dc = new DespesasController();
        
        
        String nome = System.getProperty("user.name");
        List<DespesasBean> ldb2 = dc.DespesasControllerList(mesN(String.valueOf(CBOX_Mes5.getSelectedIndex() + 1)) + "/" + CBOX_Ano5.getYear());

        Date hj = new Date();
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String data = formataData.format(hj);
        File local = new File("C:\\Users\\"+nome+"\\OneDrive\\Backup\\Despesas\\"
                +CBOX_Mes5.getSelectedItem().toString()+" "+CBOX_Ano5.getYear());

        if(!local.exists()){
            local.mkdirs();
        }
        try {
                        
            PdfWriter.getInstance(doc, new FileOutputStream(local+"\\"
                    + "Backup_Mes " + CBOX_Mes5.getSelectedItem().toString()+".pdf"));
            Font f = FontFactory.getFont(FONT, BaseFont.WINANSI, BaseFont.EMBEDDED, 5);
            
            doc.open();
            
            PdfPTable table = new PdfPTable(4);
            PdfPCell titulo = new PdfPCell(new Paragraph("Labor Orto São Paulo          Silvana M. Ruiz - C.R.O SP T.P.D. 9897", f));
            titulo.setColspan(4);
            titulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell info_Sil = new PdfPCell(new Paragraph("Relatorio Mensal de Despesas", f));
            info_Sil.setColspan(4);
            info_Sil.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell espaco = new PdfPCell(new Paragraph("  ", f));
            espaco.setColspan(4);
            PdfPCell header1 = new PdfPCell(new Paragraph("Emissão: " + data, f));
            header1.setColspan(4);
            PdfPCell header2 = new PdfPCell(new Paragraph("Mês: " + CBOX_Mes5.getSelectedItem().toString()+"/"+String.valueOf(CBOX_Ano5.getYear()), f));
            header2.setColspan(4);
            PdfPCell celula1 = new PdfPCell(new Paragraph("Tipo:", f));
            PdfPCell celula2 = new PdfPCell(new Paragraph("Descrição:", f));
            PdfPCell celula3 = new PdfPCell(new Paragraph("Valor:", f));
            PdfPCell celula4 = new PdfPCell(new Paragraph("Data:", f));
            
            table.addCell(titulo);
            table.addCell(info_Sil);
            table.addCell(espaco);
            table.addCell(header1);
            table.addCell(header2);
            table.addCell(celula1);
            table.addCell(celula2);
            table.addCell(celula3);
            table.addCell(celula4);
            for (int i = 0; i < ldb2.size(); i++) {
                String dias[] = ldb2.toArray()[i].toString().split("//");
                PdfPCell infor1 = new PdfPCell(new Paragraph(dias[0], f));
                PdfPCell infor2 = new PdfPCell(new Paragraph(dias[1], f));
                PdfPCell infor3 = new PdfPCell(new Paragraph(dias[2], f));
                PdfPCell infor4 = new PdfPCell(new Paragraph(dias[3], f));
                
                table.addCell(infor1);
                table.addCell(infor2);
                table.addCell(infor3);
                table.addCell(infor4);
            }
            PdfPCell stotal = new PdfPCell(new Paragraph("Total: R$ " + LBL_TotalDes.getText(), f));
            stotal.setColspan(4);
            stotal.setHorizontalAlignment(Element.ALIGN_RIGHT);
            
            table.addCell(stotal);
            
            doc.add(table);

        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Error:" + ex);
            JOptionPane.showMessageDialog(null,"Error: "+ex+"");
        } finally {
            doc.close();
        }

        try {
            
            Desktop.getDesktop().open(new File(local+"\\"+"Backup_Mes " + CBOX_Mes5.getSelectedItem().toString()+".pdf"));
        } catch (IOException ex) {
            System.out.println("Error:" + ex);
        }

    }//GEN-LAST:event_BTN_ImpriDesActionPerformed

    private void BTN_ImpriTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ImpriTrabActionPerformed
        
        Document doc = new Document(PageSize.A4);

        String nome = System.getProperty("user.name");
        String FONT = "resources/fonts/FreeSans.ttf";
        
        Date hj = new Date();
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String data = formataData.format(hj);
        File local = new File("C:\\Users\\"+nome+"\\OneDrive\\Backup\\Trabalhos\\"
                +CBOX_Mes.getSelectedItem().toString()+" "+String.valueOf(CBOX_Ano.getYear()));

        if(!local.exists()){
            local.mkdirs();
        }
        try {
                        
            PdfWriter.getInstance(doc, new FileOutputStream(local+"\\"
                    + "Backup_Mes" + CBOX_Mes.getSelectedItem().toString()+".pdf"));
            Font f = FontFactory.getFont(FONT, BaseFont.WINANSI, BaseFont.EMBEDDED, 7);
            
            doc.open();
            
            PdfPTable table = new PdfPTable(7);
            PdfPCell titulo = new PdfPCell(new Paragraph("Labor Orto São Paulo          Silvana M. Ruiz - C.R.O SP T.P.D. 9897", f));
            titulo.setColspan(7);
            titulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell info_Sil = new PdfPCell(new Paragraph("Relatorio Mensal de Trabalhos", f));
            info_Sil.setColspan(7);
            info_Sil.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell espaco = new PdfPCell(new Paragraph("  ", f));
            espaco.setColspan(7);
            PdfPCell header1 = new PdfPCell(new Paragraph("Emissão: " + data, f));
            header1.setColspan(7);
            PdfPCell header2 = new PdfPCell(new Paragraph("Mês: " + CBOX_Mes.getSelectedItem().toString()+"/"+String.valueOf(CBOX_Ano.getYear()), f));
            header2.setColspan(7);
            PdfPCell celula1 = new PdfPCell(new Paragraph("Entrada:", f));
            PdfPCell celula2 = new PdfPCell(new Paragraph("Dr:", f));
            PdfPCell celula3 = new PdfPCell(new Paragraph("Paciente:", f));
            PdfPCell celula4 = new PdfPCell(new Paragraph("Serviço:", f));
            PdfPCell celula5 = new PdfPCell(new Paragraph("Tipo:", f));
            PdfPCell celula6 = new PdfPCell(new Paragraph("Saida:", f));
            PdfPCell celula7 = new PdfPCell(new Paragraph("Valor:", f));
            
            table.addCell(titulo);
            table.addCell(info_Sil);
            table.addCell(espaco);
            table.addCell(header1);
            table.addCell(header2);
            table.addCell(celula1);
            table.addCell(celula2);
            table.addCell(celula3);
            table.addCell(celula4);
            table.addCell(celula5);
            table.addCell(celula6);
            table.addCell(celula7);
            
            double Orcamento = 0.0;
            
            for (int i = 0; i < TBL_Trabs_Mes.getRowCount(); i++) {
                
                Orcamento += Double.parseDouble( TBL_Trabs_Mes.getValueAt(i, 6).toString());
                
                String cel1;
                String cel2;
                String cel3;
                String cel4;
                String cel5;
                String cel6;
                String cel7;
                         
                if(TBL_Trabs_Mes.getValueAt(i, 0) != null){
                    cel1 = TBL_Trabs_Mes.getValueAt(i, 0).toString();
                }else{
                    cel1 ="--";
                }
                if(TBL_Trabs_Mes.getValueAt(i, 1) != null){
                    cel2 = TBL_Trabs_Mes.getValueAt(i, 1).toString();
                }else{
                    cel2 ="--";
                }
                if(TBL_Trabs_Mes.getValueAt(i, 2) != null){
                    cel3 = TBL_Trabs_Mes.getValueAt(i, 2).toString();
                }else{
                    cel3 ="--";
                }
                if(TBL_Trabs_Mes.getValueAt(i, 3) != null){
                    cel4 = TBL_Trabs_Mes.getValueAt(i, 3).toString();
                }else{
                    cel4 ="--";
                }
                if(TBL_Trabs_Mes.getValueAt(i, 4) != null){
                    cel5 = TBL_Trabs_Mes.getValueAt(i, 4).toString();
                }else{
                    cel5 ="--";
                }
                if(TBL_Trabs_Mes.getValueAt(i, 5) != null){
                    cel6  = TBL_Trabs_Mes.getValueAt(i, 5).toString();
                }else{
                    cel6 ="--";
                }                
                if(TBL_Trabs_Mes.getValueAt(i, 6) != null){
                    cel7 = TBL_Trabs_Mes.getValueAt(i, 6).toString();
                }else{
                    cel7 ="--";
                }
                
                
                PdfPCell infor1 = new PdfPCell(new Paragraph(cel1, f));;
                PdfPCell infor2 = new PdfPCell(new Paragraph(cel2, f));
                PdfPCell infor3 = new PdfPCell(new Paragraph(cel3, f));
                PdfPCell infor4 = new PdfPCell(new Paragraph(cel4, f));
                PdfPCell infor5 = new PdfPCell(new Paragraph(cel5, f));
                PdfPCell infor6 = new PdfPCell(new Paragraph(cel6, f));
                PdfPCell infor7 = new PdfPCell(new Paragraph(cel7, f));
                
                table.addCell(infor1);
                table.addCell(infor2);
                table.addCell(infor3);
                table.addCell(infor4);
                table.addCell(infor5);
                table.addCell(infor6);
                table.addCell(infor7);
                  
            }
            DecimalFormat df = new DecimalFormat("0.00");
            
            PdfPCell stotal = new PdfPCell(new Paragraph("Total: R$ " + df.format(Orcamento), f));
            stotal.setColspan(7);
            stotal.setHorizontalAlignment(Element.ALIGN_RIGHT);         
            
            table.addCell(stotal);
            doc.add(table);

        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Error:" + ex);
            JOptionPane.showMessageDialog(null,"Error: "+ex+"");
        } finally {
            doc.close();
        }

        try {
            
            Desktop.getDesktop().open(new File(local+"\\"+"Backup_Mes" + CBOX_Mes.getSelectedItem().toString()+".pdf"));
        } catch (IOException ex) {
            System.out.println("Error:" + ex);
        }        
        
    }//GEN-LAST:event_BTN_ImpriTrabActionPerformed

    private void BTN_Add_Produto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Add_Produto1ActionPerformed
        
        String pc = TXT_Preco_Prod1.getText();
        try {
            BigDecimal bg = new BigDecimal(converte(pc)).setScale(2, RoundingMode.HALF_EVEN);
            LucrosBean lb = new LucrosBean();

            Date hj = new Date();
            SimpleDateFormat formataData = new SimpleDateFormat("MM/yyyy");
            String data = formataData.format(hj);

            lb.setLcs_id_Cli("58");
            lb.setLcs_dt(data);
            lb.setLcs_Tipo(CBOX_Tipo1.getSelectedItem().toString());
            lb.setLcs_Vlr(String.valueOf(bg));
            lb.setLcs_Titulo(TXT_Produto1.getText());

            LucrosController lc = new LucrosController();
            lc.LucrosControllerInserir(lb);

            LimparLucro();
        } catch (ParseException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_Add_Produto1ActionPerformed

    private void jDateChooser3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jDateChooser3AncestorAdded
        Date hj = new Date();
        jDateChooser3.setDate(hj);
    }//GEN-LAST:event_jDateChooser3AncestorAdded

    private void BTN_ImpriDes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ImpriDes1ActionPerformed
        
        Document doc = new Document(PageSize.A4);

        String nome = System.getProperty("user.name");
        String FONT = "resources/fonts/FreeSans.ttf";
        
        Date hj = new Date();
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String data = formataData.format(hj);
        File local = new File("C:\\Users\\"+nome+"\\OneDrive\\Backup\\Lucros\\"
                +CBOX_Mes4.getSelectedItem().toString()+" "+String.valueOf(CBOX_Ano4.getYear()));

        if(!local.exists()){
            local.mkdirs();
        }
        try {
                        
            PdfWriter.getInstance(doc, new FileOutputStream(local+"\\"
                    + "Backup_Mes " + CBOX_Mes4.getSelectedItem().toString()+".pdf"));
            Font f = FontFactory.getFont(FONT, BaseFont.WINANSI, BaseFont.EMBEDDED, 5);
            
            doc.open();
            
            PdfPTable table = new PdfPTable(5);
            PdfPCell titulo = new PdfPCell(new Paragraph("Labor Orto São Paulo          Silvana M. Ruiz - C.R.O SP T.P.D. 9897", f));
            titulo.setColspan(5);
            titulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell info_Sil = new PdfPCell(new Paragraph("Relatorio Mensal de Lucros", f));
            info_Sil.setColspan(5);
            info_Sil.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell espaco = new PdfPCell(new Paragraph("  ", f));
            espaco.setColspan(5);
            PdfPCell header1 = new PdfPCell(new Paragraph("Emissão: " + data, f));
            header1.setColspan(5);
            PdfPCell header2 = new PdfPCell(new Paragraph("Mês: " + CBOX_Mes4.getSelectedItem().toString()+"/"+String.valueOf(CBOX_Ano4.getYear()), f));
            header2.setColspan(5);
            PdfPCell celula1 = new PdfPCell(new Paragraph("Cliente:", f));
            PdfPCell celula2 = new PdfPCell(new Paragraph("Titulo:", f));
            PdfPCell celula3 = new PdfPCell(new Paragraph("Data de Pagamento:", f));
            PdfPCell celula4 = new PdfPCell(new Paragraph("Valor:", f));
            PdfPCell celula5 = new PdfPCell(new Paragraph("Tipo:", f));
            
            table.addCell(titulo);
            table.addCell(info_Sil);
            table.addCell(espaco);
            table.addCell(header1);
            table.addCell(header2);
            table.addCell(celula1);
            table.addCell(celula2);
            table.addCell(celula3);
            table.addCell(celula4);
            table.addCell(celula5);
            
            double Orcamento = 0.0;
            for (int i = 0; i < TBL_Lucros.getRowCount(); i++) {
                
                Orcamento += Double.parseDouble( TBL_Lucros.getValueAt(i, 3).toString());

                PdfPCell infor1 = new PdfPCell(new Paragraph(TBL_Lucros.getValueAt(i, 0).toString(), f));
                PdfPCell infor2 = new PdfPCell(new Paragraph(TBL_Lucros.getValueAt(i, 1).toString(), f));
                PdfPCell infor3 = new PdfPCell(new Paragraph(TBL_Lucros.getValueAt(i, 2).toString(), f));
                PdfPCell infor4 = new PdfPCell(new Paragraph(TBL_Lucros.getValueAt(i, 3).toString(), f));
                PdfPCell infor5 = new PdfPCell(new Paragraph(TBL_Lucros.getValueAt(i, 4).toString(), f));
                
                table.addCell(infor1);
                table.addCell(infor2);
                table.addCell(infor3);
                table.addCell(infor4);
                table.addCell(infor5);
                  
            }
            DecimalFormat df = new DecimalFormat("0.00");
            
            PdfPCell stotal = new PdfPCell(new Paragraph("Total: R$ " + df.format(Orcamento), f));
            stotal.setColspan(5);
            stotal.setHorizontalAlignment(Element.ALIGN_RIGHT);         
            
            table.addCell(stotal);
            doc.add(table);

        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Error:" + ex);
            JOptionPane.showMessageDialog(null,"Error: "+ex+"");
        } finally {
            doc.close();
        }

        try {
            
            Desktop.getDesktop().open(new File(local+"\\"+"Backup_Mes " + CBOX_Mes4.getSelectedItem().toString()+".pdf"));
        } catch (IOException ex) {
            System.out.println("Error:" + ex);
        }

    }//GEN-LAST:event_BTN_ImpriDes1ActionPerformed

    private void CBOX_Mes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Mes4ActionPerformed
        
        LucrosController lc = new LucrosController();
        lc.RelacaoControllerTable(TBL_Lucros, mesN(String.valueOf(CBOX_Mes4.getSelectedIndex() + 1)) + "/" + CBOX_Ano4.getYear());
        Double Orcamento = 0.0;
        for ( int i = 0; i < TBL_Lucros.getRowCount(); i++){
            Orcamento += Double.parseDouble( TBL_Lucros.getValueAt(i, 3).toString());
        }
        
        DecimalFormat df = new DecimalFormat("0.00");
        LBL_TotalLucro.setText(df.format(Orcamento));
        
    }//GEN-LAST:event_CBOX_Mes4ActionPerformed

    private void CBOX_Ano4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CBOX_Ano4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_CBOX_Ano4AncestorAdded

    private void CBOX_Mes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_Mes5ActionPerformed
        
        DespesasController dc = new DespesasController();
        dc.DespesasControllerTable(TBL_Despesas, mesN(String.valueOf(CBOX_Mes5.getSelectedIndex() + 1)) + "/" + CBOX_Ano5.getYear());
        Double Orcamento = 0.0;
        for ( int i = 0; i < TBL_Despesas.getRowCount(); i++){
            Orcamento += Double.parseDouble( TBL_Despesas.getValueAt(i, 2).toString());
        }
        
        DecimalFormat df = new DecimalFormat("0.00");
        LBL_TotalDes.setText(df.format(Orcamento));
    }//GEN-LAST:event_CBOX_Mes5ActionPerformed

    private void CBOX_Ano5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CBOX_Ano5AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_CBOX_Ano5AncestorAdded

    private void BTN_Excluir_LucrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Excluir_LucrosActionPerformed
        
        LucrosBean lb = new LucrosBean();
        
        lb.setLcs_Vlr(TBL_Lucros.getValueAt(TBL_Lucros.getSelectedRow(), 3).toString());
        lb.setLcs_dt(TBL_Lucros.getValueAt(TBL_Lucros.getSelectedRow(), 2).toString());
        lb.setLcs_Titulo(TBL_Lucros.getValueAt(TBL_Lucros.getSelectedRow(), 1).toString());
        lb.setLcs_id_Cli(TBL_Lucros.getValueAt(TBL_Lucros.getSelectedRow(), 0).toString());
        
        LucrosController lc = new LucrosController();
        lc.LucrosControllerExcluir(lb);
        
        lc.RelacaoControllerTable(TBL_Lucros, mesN(String.valueOf(CBOX_Mes4.getSelectedIndex() + 1)) + "/" + CBOX_Ano4.getYear());
        Double Orcamento = 0.0;
        for ( int i = 0; i < TBL_Lucros.getRowCount(); i++){
            Orcamento += Double.parseDouble( TBL_Lucros.getValueAt(i, 3).toString());
        }
        
        DecimalFormat df = new DecimalFormat("0.00");
        LBL_TotalLucro.setText(df.format(Orcamento));
        
    }//GEN-LAST:event_BTN_Excluir_LucrosActionPerformed

    private void BTN_Excluir_DespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Excluir_DespesasActionPerformed
        
        DespesasBean db = new DespesasBean();
        
        db.setDesp_Titulo(TBL_Despesas.getValueAt(TBL_Despesas.getSelectedRow(), 1).toString());
        db.setDesp_Preco(TBL_Despesas.getValueAt(TBL_Despesas.getSelectedRow(), 2).toString());
        db.setDesp_dt(TBL_Despesas.getValueAt(TBL_Despesas.getSelectedRow(), 3).toString());
        
        DespesasController dc = new DespesasController();
        dc.DespesasControllerExcluir(db);
        
        dc.DespesasControllerTable(TBL_Despesas, mesN(String.valueOf(CBOX_Mes5.getSelectedIndex() + 1)) + "/" + CBOX_Ano5.getYear());
        Double Orcamento = 0.0;
        for ( int i = 0; i < TBL_Despesas.getRowCount(); i++){
            Orcamento += Double.parseDouble( TBL_Despesas.getValueAt(i, 2).toString());
        }
        
        DecimalFormat df = new DecimalFormat("0.00");
        LBL_TotalDes.setText(df.format(Orcamento));
    }//GEN-LAST:event_BTN_Excluir_DespesasActionPerformed

    private void BTN_ImpriCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ImpriCliActionPerformed
        
        Document doc = new Document(PageSize.A4);

        String nome = System.getProperty("user.name");
        String FONT = "resources/fonts/FreeSans.ttf";
        
        Date hj = new Date();
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String data = formataData.format(hj);
        File local = new File("C:\\Users\\"+nome+"\\OneDrive\\Backup\\Clientes\\");

        if(!local.exists()){
            local.mkdirs();
        }
        try {
                        
            PdfWriter.getInstance(doc, new FileOutputStream(local+"\\" + "Backup.pdf"));
            Font f = FontFactory.getFont(FONT, BaseFont.WINANSI, BaseFont.EMBEDDED, 7);
            
            doc.open();
            
            PdfPTable table = new PdfPTable(8);
            PdfPCell titulo = new PdfPCell(new Paragraph("Labor Orto São Paulo          Silvana M. Ruiz - C.R.O SP T.P.D. 9897", f));
            titulo.setColspan(8);
            titulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell info_Sil = new PdfPCell(new Paragraph("Listagem dos Clientes", f));
            info_Sil.setColspan(8);
            info_Sil.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell espaco = new PdfPCell(new Paragraph("  ", f));
            espaco.setColspan(8);
            PdfPCell header1 = new PdfPCell(new Paragraph("Emissão: " + data, f));
            header1.setColspan(8);
            PdfPCell celula1 = new PdfPCell(new Paragraph("Tipo:", f));
            PdfPCell celula2 = new PdfPCell(new Paragraph("Nome:", f));
            PdfPCell celula3 = new PdfPCell(new Paragraph("Endereço:", f));
            PdfPCell celula4 = new PdfPCell(new Paragraph("Celular:", f));
            PdfPCell celula5 = new PdfPCell(new Paragraph("Telefone:", f));
            PdfPCell celula6 = new PdfPCell(new Paragraph("Secretaria:", f));
            PdfPCell celula7 = new PdfPCell(new Paragraph("CRO:", f));
            PdfPCell celula8 = new PdfPCell(new Paragraph("Saldo:", f));
            
            table.addCell(titulo);
            table.addCell(info_Sil);
            table.addCell(espaco);
            table.addCell(header1);
            table.addCell(celula1);
            table.addCell(celula2);
            table.addCell(celula3);
            table.addCell(celula4);
            table.addCell(celula5);
            table.addCell(celula6);
            table.addCell(celula7);
            table.addCell(celula8);
                        
            for (int i = 0; i < Table_Cliente.getRowCount(); i++) {
                                
                String cel1;
                String cel2;
                String cel3;
                String cel4;
                String cel5;
                String cel6;
                String cel7;
                String cel8;
                         
                if(Table_Cliente.getValueAt(i, 0) != null){
                    cel1 = Table_Cliente.getValueAt(i, 0).toString();
                }else{
                    cel1 ="--";
                }
                if(Table_Cliente.getValueAt(i, 1) != null){
                    cel2 = Table_Cliente.getValueAt(i, 1).toString();
                }else{
                    cel2 ="--";
                }
                if(Table_Cliente.getValueAt(i, 2) != null){
                    cel3 = Table_Cliente.getValueAt(i, 2).toString();
                }else{
                    cel3 ="--";
                }
                if(Table_Cliente.getValueAt(i, 3) != null){
                    cel4 = Table_Cliente.getValueAt(i, 3).toString();
                }else{
                    cel4 ="--";
                }
                if(Table_Cliente.getValueAt(i, 4) != null){
                    cel5 = Table_Cliente.getValueAt(i, 4).toString();
                }else{
                    cel5 ="--";
                }
                if(Table_Cliente.getValueAt(i, 5) != null){
                    cel6  = Table_Cliente.getValueAt(i, 5).toString();
                }else{
                    cel6 ="--";
                }                
                if(Table_Cliente.getValueAt(i, 6) != null){
                    cel7 = Table_Cliente.getValueAt(i, 6).toString();
                }else{
                    cel7 ="--";
                }              
                if(Table_Cliente.getValueAt(i, 7) != null){
                    cel8 = Table_Cliente.getValueAt(i, 7).toString();
                }else{
                    cel8 ="--";
                }
                
                PdfPCell infor1 = new PdfPCell(new Paragraph(cel1, f));
                PdfPCell infor2 = new PdfPCell(new Paragraph(cel2, f));
                PdfPCell infor3 = new PdfPCell(new Paragraph(cel3, f));
                PdfPCell infor4 = new PdfPCell(new Paragraph(cel4, f));
                PdfPCell infor5 = new PdfPCell(new Paragraph(cel5, f));
                PdfPCell infor6 = new PdfPCell(new Paragraph(cel6, f));
                PdfPCell infor7 = new PdfPCell(new Paragraph(cel7, f));
                PdfPCell infor8 = new PdfPCell(new Paragraph(cel8, f));
                
                table.addCell(infor1);
                table.addCell(infor2);
                table.addCell(infor3);
                table.addCell(infor4);
                table.addCell(infor5);
                table.addCell(infor6);
                table.addCell(infor7);
                table.addCell(infor8);
                  
            }        
            
            doc.add(table);

        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Error:" + ex);
            JOptionPane.showMessageDialog(null,"Error: "+ex+"");
        } finally {
            doc.close();
        }

        try {
            
            Desktop.getDesktop().open(new File(local+"\\"+"Backup.pdf"));
        } catch (IOException ex) {
            System.out.println("Error:" + ex);
        }        
        
    }//GEN-LAST:event_BTN_ImpriCliActionPerformed

    private void BTN_ImpriPREVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ImpriPREVActionPerformed
        
        Document doc = new Document(PageSize.A4);

        String nome = System.getProperty("user.name");
        String FONT = "resources/fonts/FreeSans.ttf";
        
        Date hj = new Date();
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String data = formataData.format(hj);
        File local = new File("C:\\Users\\"+nome+"\\OneDrive\\Backup\\Previsão\\"
                +CBOX_Mes3.getSelectedItem().toString()+" "+String.valueOf(CBOX_Ano3.getYear()));

        if(!local.exists()){
            local.mkdirs();
        }
        try {
                        
            PdfWriter.getInstance(doc, new FileOutputStream(local+"\\"
                    + "Backup_Mes " + CBOX_Mes3.getSelectedItem().toString()+".pdf"));
            Font f = FontFactory.getFont(FONT, BaseFont.WINANSI, BaseFont.EMBEDDED, 5);
            
            doc.open();
            
            PdfPTable table = new PdfPTable(2);
            PdfPCell titulo = new PdfPCell(new Paragraph("Labor Orto São Paulo          Silvana M. Ruiz - C.R.O SP T.P.D. 9897", f));
            titulo.setColspan(2);
            titulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell info_Sil = new PdfPCell(new Paragraph("Previsão Mensal de Lucros", f));
            info_Sil.setColspan(2);
            info_Sil.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell espaco = new PdfPCell(new Paragraph("  ", f));
            espaco.setColspan(2);
            PdfPCell header1 = new PdfPCell(new Paragraph("Emissão: " + data, f));
            header1.setColspan(2);
            PdfPCell header2 = new PdfPCell(new Paragraph("Mês: " + CBOX_Mes3.getSelectedItem().toString()+"/"+String.valueOf(CBOX_Ano3.getYear()), f));
            header2.setColspan(2);
            PdfPCell celula1 = new PdfPCell(new Paragraph("Dr.(a):", f));
            PdfPCell celula2 = new PdfPCell(new Paragraph("Ganho Previsto:", f));
            
            table.addCell(titulo);
            table.addCell(info_Sil);
            table.addCell(espaco);
            table.addCell(header1);
            table.addCell(header2);
            table.addCell(celula1);
            table.addCell(celula2);
            
            double Orcamento = 0.0;
            for (int i = 0; i < TBL_CLiente_P.getRowCount(); i++) {
                
                Orcamento += Double.parseDouble( TBL_CLiente_P.getValueAt(i, 1).toString());

                PdfPCell infor1 = new PdfPCell(new Paragraph(TBL_CLiente_P.getValueAt(i, 0).toString(), f));
                PdfPCell infor2 = new PdfPCell(new Paragraph(TBL_CLiente_P.getValueAt(i, 1).toString(), f));
                
                table.addCell(infor1);
                table.addCell(infor2);
                  
            }
            DecimalFormat df = new DecimalFormat("0.00");
            
            PdfPCell stotal = new PdfPCell(new Paragraph("Total: R$ " + df.format(Orcamento), f));
            stotal.setColspan(2);
            stotal.setHorizontalAlignment(Element.ALIGN_RIGHT);         
            
            table.addCell(stotal);
            doc.add(table);

        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Error:" + ex);
            JOptionPane.showMessageDialog(null,"Error: "+ex+"");
        } finally {
            doc.close();
        }

        try {
            
            Desktop.getDesktop().open(new File(local+"\\"+"Backup_Mes " + CBOX_Mes3.getSelectedItem().toString()+".pdf"));
        } catch (IOException ex) {
            System.out.println("Error:" + ex);
        }

    }//GEN-LAST:event_BTN_ImpriPREVActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    private void LimparLucro() {
        LBL_Dentista.setText("");
        LBL_Ano3.setText("");
        LBL_Mes3.setText("");
        LBL_Valor2.setText("000,00");
        LBL_Valor.setText("000,00");
        CBOX_Tipo_Pag.setSelectedIndex(0);
    }

    private void LimparDentista() {
        CBOX_Tipo_Dent.setSelectedIndex(0);
        TXT_Nome_Dentista.setText("");
        TXT_Tel.setText("");
        TXT_Cel.setText("");
        TXT_End.setText("");
        TXT_Secretaria.setText("");
        TXT_CRO.setText("");
    }

    private void LimparTrabalho() {
        CBOX_Dentista.setSelectedIndex(0);
        TXT_Cliente.setText("");
        TXT_Requisicao.setText("");
        CBOX_Servico_1.setSelectedIndex(0);
        CBOX_Servico_2.setSelectedIndex(0);
        CBOX_Servico_3.setSelectedIndex(0);
        CBOX_Servico_4.setSelectedIndex(0);
        CBOX_Qtd_Servico_1.setSelectedIndex(0);
        CBOX_Qtd_Servico_2.setSelectedIndex(0);
        CBOX_Qtd_Servico_3.setSelectedIndex(0);
        CBOX_Qtd_Servico_4.setSelectedIndex(0);
        CBOX_Desconto.setSelectedIndex(0);
        CBOX_Tipo_S_I.setSelectedIndex(0);
        TXT_Cor.setText("");
        LBL_Preco.setText("*");
    }

    private void LimparCategoria() {
        TXT_Categoria.setText("");
    }

    private void LimparServico() {
        TXT_Servico.setText("");
        TXT_Preco.setText("");
        CBOX_Cat.setSelectedIndex(0);
    }

    private void LimparProduto() {
        TXT_Produto.setText("");
        TXT_Preco_Prod.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Add_Cat;
    private javax.swing.JButton BTN_Add_Produto;
    private javax.swing.JButton BTN_Add_Produto1;
    private javax.swing.JButton BTN_Add_Servico;
    private javax.swing.JButton BTN_Alterar;
    private javax.swing.JButton BTN_Editar_Dent;
    private javax.swing.JButton BTN_Excluir;
    private javax.swing.JButton BTN_Excluir_Cat;
    private javax.swing.JButton BTN_Excluir_Despesas;
    private javax.swing.JButton BTN_Excluir_Lucros;
    private javax.swing.JButton BTN_Excluir_Rela;
    private javax.swing.JButton BTN_Excluir_Servico;
    private javax.swing.JButton BTN_Fechar_Mes;
    private javax.swing.JButton BTN_ImpriCli;
    private javax.swing.JButton BTN_ImpriDes;
    private javax.swing.JButton BTN_ImpriDes1;
    private javax.swing.JButton BTN_ImpriPREV;
    private javax.swing.JButton BTN_ImpriTrab;
    private javax.swing.JButton BTN_Procurar;
    private javax.swing.JButton BTN_Salvar_Dent;
    private javax.swing.JButton BTN_Salvar_Pag;
    private javax.swing.JButton BTN_Salvar_Trab;
    private com.toedter.calendar.JYearChooser CBOX_Ano;
    private com.toedter.calendar.JYearChooser CBOX_Ano1;
    private com.toedter.calendar.JYearChooser CBOX_Ano2;
    private com.toedter.calendar.JYearChooser CBOX_Ano3;
    private com.toedter.calendar.JYearChooser CBOX_Ano4;
    private com.toedter.calendar.JYearChooser CBOX_Ano5;
    private javax.swing.JComboBox CBOX_Cat;
    private javax.swing.JComboBox CBOX_Cat2;
    private javax.swing.JComboBox<String> CBOX_Dentista;
    private javax.swing.JComboBox<String> CBOX_Dentista1;
    private javax.swing.JComboBox<String> CBOX_Dentista2;
    private javax.swing.JComboBox CBOX_Desconto;
    private javax.swing.JComboBox CBOX_Dr;
    private javax.swing.JComboBox<String> CBOX_Mes;
    private javax.swing.JComboBox<String> CBOX_Mes1;
    private javax.swing.JComboBox<String> CBOX_Mes2;
    private javax.swing.JComboBox<String> CBOX_Mes3;
    private javax.swing.JComboBox<String> CBOX_Mes4;
    private javax.swing.JComboBox<String> CBOX_Mes5;
    private javax.swing.JComboBox CBOX_Qtd_Servico_1;
    private javax.swing.JComboBox CBOX_Qtd_Servico_2;
    private javax.swing.JComboBox CBOX_Qtd_Servico_3;
    private javax.swing.JComboBox CBOX_Qtd_Servico_4;
    private javax.swing.JComboBox CBOX_Servico_1;
    private javax.swing.JComboBox CBOX_Servico_2;
    private javax.swing.JComboBox CBOX_Servico_3;
    private javax.swing.JComboBox CBOX_Servico_4;
    private javax.swing.JComboBox<String> CBOX_Tipo;
    private javax.swing.JComboBox<String> CBOX_Tipo1;
    private javax.swing.JComboBox CBOX_Tipo_Dent;
    private javax.swing.JComboBox CBOX_Tipo_Pag;
    private javax.swing.JComboBox CBOX_Tipo_S_I;
    private javax.swing.JCheckBox CBOX_Urg1;
    private javax.swing.JCheckBox CBOX_Urg2;
    private javax.swing.JCheckBox CBOX_Urg3;
    private javax.swing.JCheckBox CBOX_Urg4;
    private com.toedter.calendar.JDateChooser Data_Final;
    private com.toedter.calendar.JDateChooser Date_Inicio;
    private com.toedter.calendar.JDateChooser Date_Saida;
    private javax.swing.JLabel LBL_Ano1;
    private javax.swing.JLabel LBL_Ano2;
    private javax.swing.JLabel LBL_Ano3;
    private javax.swing.JLabel LBL_Consultorio;
    private javax.swing.JLabel LBL_Dentista;
    private javax.swing.JLabel LBL_Dia1;
    private javax.swing.JLabel LBL_Dia2;
    private javax.swing.JLabel LBL_Mes;
    private javax.swing.JLabel LBL_Mes3;
    private javax.swing.JLabel LBL_Preco;
    private javax.swing.JLabel LBL_Total;
    private javax.swing.JLabel LBL_TotalDes;
    private javax.swing.JLabel LBL_TotalLucro;
    private javax.swing.JLabel LBL_Valor;
    private javax.swing.JLabel LBL_Valor2;
    private javax.swing.JLabel LBL_id;
    private javax.swing.JTable TBL_CLiente_P;
    private javax.swing.JTable TBL_Cat;
    private javax.swing.JTable TBL_Catalogo;
    private javax.swing.JTable TBL_Despesas;
    private javax.swing.JTable TBL_Lucros;
    private javax.swing.JTable TBL_P_Dentista;
    private javax.swing.JTable TBL_Pagamento;
    private javax.swing.JTable TBL_Servico;
    private javax.swing.JTable TBL_Total;
    private javax.swing.JTable TBL_Trabs_Mes;
    private javax.swing.JTextField TXT_CRO;
    private javax.swing.JTextField TXT_Categoria;
    private javax.swing.JTextField TXT_Cel;
    private javax.swing.JTextField TXT_Cliente;
    private javax.swing.JTextField TXT_Cor;
    private javax.swing.JTextField TXT_End;
    private javax.swing.JTextField TXT_Entrada;
    private javax.swing.JTextField TXT_Nome_Dentista;
    private javax.swing.JTextField TXT_Preco;
    private javax.swing.JTextField TXT_Preco_Prod;
    private javax.swing.JTextField TXT_Preco_Prod1;
    private javax.swing.JTextField TXT_Produto;
    private javax.swing.JTextField TXT_Produto1;
    private javax.swing.JTextArea TXT_Requisicao;
    private javax.swing.JTextField TXT_Saldo;
    private javax.swing.JTextField TXT_Secretaria;
    private javax.swing.JTextField TXT_Servico;
    private javax.swing.JTextField TXT_Tel;
    private javax.swing.JTextField TXT_Valor;
    private javax.swing.JTable Table_Cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane5;
    // End of variables declaration//GEN-END:variables

    private void total(String serv1, String serv2, String serv3, String serv4, Integer qtn1, Integer qtn2, Integer qtn3, Integer qtn4) {

        ServicosBean sb1 = new ServicosBean();
        ServicosController sc1 = new ServicosController();
        sc1.ServicosControllerSelecionar(sb1, serv1);

        Float preco1;
        if (CBOX_Urg1.isSelected() == true) {
            if (sb1.getServ_Preco() == null) {
                preco1 = Float.valueOf(0) + ((Float.valueOf(0) / 100) * 25);
            } else {
                preco1 = Float.valueOf(sb1.getServ_Preco()) + ((Float.valueOf(sb1.getServ_Preco()) / 100) * 25);
            }
        } else {
            if (sb1.getServ_Preco() == null) {
                preco1 = Float.valueOf(0);
            } else {
                preco1 = Float.valueOf(sb1.getServ_Preco());
            }
        }

        ServicosBean sb2 = new ServicosBean();
        ServicosController sc2 = new ServicosController();
        sc2.ServicosControllerSelecionar(sb2, serv2);

        Float preco2;
        if (CBOX_Urg2.isSelected() == true) {
            if (sb2.getServ_Preco() == null) {
                preco2 = Float.valueOf(0) + ((Float.valueOf(0) / 100) * 25);
            } else {
                preco2 = Float.valueOf(sb2.getServ_Preco()) + ((Float.valueOf(sb2.getServ_Preco()) / 100) * 25);
            }
        } else {
            if (sb2.getServ_Preco() == null) {
                preco2 = Float.valueOf(0);
            } else {
                preco2 = Float.valueOf(sb2.getServ_Preco());
            }
        }

        ServicosBean sb3 = new ServicosBean();
        ServicosController sc3 = new ServicosController();
        sc3.ServicosControllerSelecionar(sb3, serv3);

        Float preco3;
        if (CBOX_Urg3.isSelected() == true) {
            if (sb3.getServ_Preco() == null) {
                preco3 = Float.valueOf(0) + ((Float.valueOf(0) / 100) * 25);
            } else {
                preco3 = Float.valueOf(sb3.getServ_Preco()) + ((Float.valueOf(sb3.getServ_Preco()) / 100) * 25);
            }
        } else {
            if (sb3.getServ_Preco() == null) {
                preco3 = Float.valueOf(0);
            } else {
                preco3 = Float.valueOf(sb3.getServ_Preco());
            }
        }

        ServicosBean sb4 = new ServicosBean();
        ServicosController sc4 = new ServicosController();
        sc4.ServicosControllerSelecionar(sb4, serv4);

        Float preco4;
        if (CBOX_Urg4.isSelected() == true) {
            if (sb4.getServ_Preco() == null) {
                preco4 = Float.valueOf(0) + ((Float.valueOf(0) / 100) * 25);
            } else {
                preco4 = Float.valueOf(sb4.getServ_Preco()) + ((Float.valueOf(sb4.getServ_Preco()) / 100) * 25);
            }
        } else {
            if (sb1.getServ_Preco() == null) {
                preco4 = Float.valueOf(0);
            } else {
                preco4 = Float.valueOf(sb4.getServ_Preco());
            }
        }

        Float total = preco1 * qtn1 + preco2 * qtn2 + preco3 * qtn3 + preco4 * qtn4;

        if (CBOX_Desconto.getSelectedItem().equals("Desconto (%)")) {

            DecimalFormat nf = new DecimalFormat("0.00");
            LBL_Preco.setText(String.valueOf(nf.format(total - (total / 100) * 0)));

        } else {
            Integer taxa = Integer.valueOf(CBOX_Desconto.getSelectedItem().toString());
            DecimalFormat nf = new DecimalFormat("0.00");
            LBL_Preco.setText(String.valueOf(nf.format(total - (total / 100) * taxa)));
        }

    }

    private String servico(String serv1, String serv2, String serv3, String serv4, Integer qtn1, Integer qtn2, Integer qtn3, Integer qtn4) {

        if (qtn4 == 0) {
            if (qtn3 == 0) {
                if (qtn2 == 0) {
                    if (qtn1 == 0) {

                    } else {
                        return qtn1 + " " + serv1;
                    }
                } else {
                    return qtn1 + " " + serv1 + " -- "
                            + qtn2 + " " + serv2 ;
                }
            } else {
                return qtn1 + " " + serv1 + " -- "
                        + qtn2 + " " + serv2 + " -- "
                        + qtn3 + " " + serv3;
            }
        } else {
            return qtn1 + " " + serv1 + " --"
                    + qtn2 + " " + serv2 + " -- "
                    + qtn3 + " " + serv3 + " -- "
                    + qtn4 + " " + serv4;
        }

        return null;
    }

    private String mes(String mes) {
        switch (mes) {
            case "1":
                return "Janeiro";
            case "2":
                return "Fevereiro";
            case "3":
                return "Março";
            case "4":
                return "Abril";
            case "5":
                return "Maio";
            case "6":
                return "Junho";
            case "7":
                return "Julho";
            case "8":
                return "Agosto";
            case "9":
                return "Setembro";
            case "01":
                return "Janeiro";
            case "02":
                return "Fevereiro";
            case "03":
                return "Março";
            case "04":
                return "Abril";
            case "05":
                return "Maio";
            case "06":
                return "Junho";
            case "07":
                return "Julho";
            case "08":
                return "Agosto";
            case "09":
                return "Setembro";
            case "10":
                return "Outubro";
            case "11":
                return "Novembro";
            case "12":
                return "Dezembro";
            default:
                break;
        }
        return null;
    }
    
    private String mesN(String mes) {
        switch (mes) {
            case "1":
                return "01";
            case "2":
                return "02";
            case "3":
                return "03";
            case "4":
                return "04";
            case "5":
                return "05";
            case "6":
                return "06";
            case "7":
                return "07";
            case "8":
                return "08";
            case "9":
                return "09";
            case "10":
                return "10";
            case "11":
                return "11";
            case "12":
                return "12";
            default:
                break;
        }
        return null;
    }

    public static double converte(String arg) throws ParseException {
        //obtem um NumberFormat para o Locale default (BR)
        NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));
        //converte um número com vírgulas ex: 2,56 para double
        double number = nf.parse(arg).doubleValue();
        return number;
    }

    public void recarregar() {
        RelacaoController rc = new RelacaoController();
        String mes = String.valueOf((CBOX_Mes.getSelectedIndex() + 1) + "/" + CBOX_Ano.getYear());
        SimpleDateFormat sf = new SimpleDateFormat("MM/yyyy");
        rc.RelacaoControllerTable(TBL_Trabs_Mes, mes);
        System.out.println(mes);

    }
}
