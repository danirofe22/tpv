/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPV.Interfaz;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import TPV.DB.ConsultasDb;
import TPV.Gestion.GestionBlob;
import TPV.Model.Producto;
import TPV.Gestion.Productos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;


public class InterfazUsuario extends javax.swing.JFrame {
    private ArrayList<Producto> listadoCafe;
    private ArrayList<Producto> listadoRefrescos;
    private DefaultTableModel modeloTablaTicket;
    private ConsultasDb cbd;
    private ArrayList<JButton> botonesRefrescos;
    private ArrayList<JButton> botonesCafe;
    private ArrayList<JLabel> labelRefrescos;
    private ArrayList<JLabel> labelCafe;
    private Productos prods;
    private Login loginFrame;
    private GestionBlob blob;
    private DefaultListModel modeloTicket;
    
    /**
     * Creates new form InterfazUsuario
     */
    public InterfazUsuario(){
        this.modeloTablaTicket = new DefaultTableModel();
        this.modeloTicket = new DefaultListModel();
        initComponents();
        this.blob = new GestionBlob();
        this.cbd = new ConsultasDb();
        try {
            this.cargarBotones();
        } catch (SQLException ex) {
            Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void listarBotones() throws SQLException{
        
        this.botonesCafe = new ArrayList<>();
        
        botonesCafe.add(this.btnCafe1);
        botonesCafe.add(this.btnCafe2);
        botonesCafe.add(this.btnCafe3);
        botonesCafe.add(this.btnCafe4);
        botonesCafe.add(this.btnCafe5);
        botonesCafe.add(this.btnCafe6);
        botonesCafe.add(this.btnCafe7);
        botonesCafe.add(this.btnCafe8);
        botonesCafe.add(this.btnCafe9);
        botonesCafe.add(this.btnCafe10);
        botonesCafe.add(this.btnCafe11);
        botonesCafe.add(this.btnCafe12);
        botonesCafe.add(this.btnCafe13);
        botonesCafe.add(this.btnCafe14);
        botonesCafe.add(this.btnCafe15);
        botonesCafe.add(this.btnCafe16);
        
        
        this.labelCafe = new ArrayList<>();
        
        labelCafe.add(this.lblCafe1);
        labelCafe.add(this.lblCafe2);
        labelCafe.add(this.lblCafe3);
        labelCafe.add(this.lblCafe4);
        labelCafe.add(this.lblCafe5);
        labelCafe.add(this.lblCafe6);
        labelCafe.add(this.lblCafe7);
        labelCafe.add(this.lblCafe8);
        labelCafe.add(this.lblCafe9);
        labelCafe.add(this.lblCafe10);
        labelCafe.add(this.lblCafe11);
        labelCafe.add(this.lblCafe12);
        labelCafe.add(this.lblCafe13);
        labelCafe.add(this.lblCafe14);
        labelCafe.add(this.lblCafe15);
        labelCafe.add(this.lblCafe16);
        
        this.botonesRefrescos = new ArrayList<>();
        
        botonesRefrescos.add(this.btnRefresco1);
        botonesRefrescos.add(this.btnRefresco2);
        botonesRefrescos.add(this.btnRefresco3);
        botonesRefrescos.add(this.btnRefresco4);
        botonesRefrescos.add(this.btnRefresco5);
        botonesRefrescos.add(this.btnRefresco6);
        botonesRefrescos.add(this.btnRefresco7);
        botonesRefrescos.add(this.btnRefresco8);
        botonesRefrescos.add(this.btnRefresco9);
        botonesRefrescos.add(this.btnRefresco10);
        botonesRefrescos.add(this.btnRefresco11);
        botonesRefrescos.add(this.btnRefresco12);
        botonesRefrescos.add(this.btnRefresco13);
        botonesRefrescos.add(this.btnRefresco14);
        botonesRefrescos.add(this.btnRefresco15);
        botonesRefrescos.add(this.btnRefresco16);
         
    }
    
    public void cargarBotones() throws SQLException{

        this.listarBotones();

        this.prods = new Productos(cbd.listarProductos());
        this.listadoCafe = new ArrayList<Producto>();
        this.listadoRefrescos = new ArrayList<Producto>();
        
        
        
        for (int i = 0; i < prods.getListadoProductos().size(); i++) {
            if(prods.getListadoProductos().get(i).getTipo().equals("cafe") && prods.getListadoProductos().get(i)!=null ){
                this.listadoCafe.add(prods.getListadoProductos().get(i));
            }else if (prods.getListadoProductos().get(i).getTipo() == "refresco"){
                this.listadoRefrescos.add(this.prods.getListadoProductos().get(i));
            }
        }
        System.out.println(this.listadoCafe);
        
        
        for (int i = 0; i < listadoCafe.size(); i++) {
            this.botonesCafe.get(i).setIcon(blob.getFotoProducto(this.listadoCafe.get(i).getIdProducto()));
            this.labelCafe.get(i).setText(this.listadoCafe.get(i).getNombre());
            
        }
    }
    
    private void pulsarProducto(int id){
        
        
        
        this.listadoCafe = new ArrayList<Producto>();
        this.listadoRefrescos = new ArrayList<Producto>();
        //this.modeloTicket.clear();
        
        
        
        for (int i = 0; i < prods.getListadoProductos().size(); i++) {
            if(prods.getListadoProductos().get(i).getTipo().equals("cafe") && prods.getListadoProductos().get(i)!=null ){
                this.listadoCafe.add(prods.getListadoProductos().get(i));
            }else if (prods.getListadoProductos().get(i).getTipo() == "refresco"){
                this.listadoRefrescos.add(this.prods.getListadoProductos().get(i));
            }
        }
        
            this.modeloTicket.addElement(listadoCafe.get(id).getNombre()+"    |    "+listadoCafe.get(id).getPvp()); 
        
    }
    
    
        
        
        
        
            
            
        
    
    
//    void limpiartabla() {
//
//        int filas = modeloTablaTicket.getRowCount() - 1;
//        for (int i = filas; i >= 0; i--) {
//            modeloTablaTicket.removeRow(model.getRow);
//        }
//    }
//    
//    private agregarAlTicket(){
//        this.listadoProductos = new Productos(this.cbd.listarProductos());
//        limpiartabla();
//        for (int i = 0; i < listadoCafe.size(); i++) {
//            Producto get = listadoCafe.get(i);
//            
//        }
//    }


    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Productos = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        panelCafes = new javax.swing.JPanel();
        btnCafe1 = new javax.swing.JButton();
        lblCafe1 = new javax.swing.JLabel();
        btnCafe2 = new javax.swing.JButton();
        lblCafe2 = new javax.swing.JLabel();
        btnCafe3 = new javax.swing.JButton();
        lblCafe3 = new javax.swing.JLabel();
        btnCafe4 = new javax.swing.JButton();
        lblCafe4 = new javax.swing.JLabel();
        btnCafe5 = new javax.swing.JButton();
        lblCafe5 = new javax.swing.JLabel();
        btnCafe6 = new javax.swing.JButton();
        lblCafe6 = new javax.swing.JLabel();
        btnCafe7 = new javax.swing.JButton();
        lblCafe7 = new javax.swing.JLabel();
        btnCafe8 = new javax.swing.JButton();
        lblCafe8 = new javax.swing.JLabel();
        lblCafe12 = new javax.swing.JLabel();
        btnCafe11 = new javax.swing.JButton();
        btnCafe12 = new javax.swing.JButton();
        btnCafe10 = new javax.swing.JButton();
        btnCafe9 = new javax.swing.JButton();
        lblCafe11 = new javax.swing.JLabel();
        lblCafe9 = new javax.swing.JLabel();
        lblCafe10 = new javax.swing.JLabel();
        lblCafe16 = new javax.swing.JLabel();
        lblCafe15 = new javax.swing.JLabel();
        btnCafe16 = new javax.swing.JButton();
        lblCafe14 = new javax.swing.JLabel();
        lblCafe13 = new javax.swing.JLabel();
        btnCafe15 = new javax.swing.JButton();
        btnCafe14 = new javax.swing.JButton();
        btnCafe13 = new javax.swing.JButton();
        panelCafes1 = new javax.swing.JPanel();
        btnRefresco1 = new javax.swing.JButton();
        lblProducto1 = new javax.swing.JLabel();
        btnRefresco2 = new javax.swing.JButton();
        lblProducto2 = new javax.swing.JLabel();
        btnRefresco3 = new javax.swing.JButton();
        lblProducto3 = new javax.swing.JLabel();
        btnRefresco4 = new javax.swing.JButton();
        lblProducto4 = new javax.swing.JLabel();
        btnRefresco5 = new javax.swing.JButton();
        lblProducto5 = new javax.swing.JLabel();
        btnRefresco6 = new javax.swing.JButton();
        lblProducto6 = new javax.swing.JLabel();
        btnRefresco7 = new javax.swing.JButton();
        lblProducto7 = new javax.swing.JLabel();
        btnRefresco8 = new javax.swing.JButton();
        lblProducto8 = new javax.swing.JLabel();
        lblProducto12 = new javax.swing.JLabel();
        btnRefresco11 = new javax.swing.JButton();
        btnRefresco12 = new javax.swing.JButton();
        btnRefresco10 = new javax.swing.JButton();
        btnRefresco9 = new javax.swing.JButton();
        lblProducto11 = new javax.swing.JLabel();
        lblProducto9 = new javax.swing.JLabel();
        lblProducto10 = new javax.swing.JLabel();
        lblProducto16 = new javax.swing.JLabel();
        lblProducto15 = new javax.swing.JLabel();
        btnRefresco16 = new javax.swing.JButton();
        lblProducto14 = new javax.swing.JLabel();
        lblProducto13 = new javax.swing.JLabel();
        btnRefresco15 = new javax.swing.JButton();
        btnRefresco14 = new javax.swing.JButton();
        btnRefresco13 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        showUser = new javax.swing.JLabel();
        panelTicket = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ticket = new javax.swing.JList<>();
        jPanel11 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn6Teclado = new javax.swing.JButton();
        btn7Teclado = new javax.swing.JButton();
        btn8Teclado = new javax.swing.JButton();
        btn9Teclado = new javax.swing.JButton();
        btn4Teclado = new javax.swing.JButton();
        btn5Teclado = new javax.swing.JButton();
        btn1Teclado = new javax.swing.JButton();
        btn2Teclado = new javax.swing.JButton();
        btn3Teclado = new javax.swing.JButton();
        btn0Teclado = new javax.swing.JButton();
        btnBorrarTeclado = new javax.swing.JButton();
        btnOkTeclado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCafes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCafe1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCafe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafe1ActionPerformed(evt);
            }
        });
        panelCafes.add(btnCafe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 26, 99, 70));

        lblCafe1.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe1.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe1.setOpaque(true);
        panelCafes.add(lblCafe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 102, 99, 25));

        btnCafe2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCafe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafe2ActionPerformed(evt);
            }
        });
        panelCafes.add(btnCafe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 26, 99, 70));

        lblCafe2.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe2.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe2.setOpaque(true);
        panelCafes.add(lblCafe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 102, 99, 25));

        btnCafe3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCafe3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafe3ActionPerformed(evt);
            }
        });
        panelCafes.add(btnCafe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 26, 99, 70));

        lblCafe3.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe3.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe3.setOpaque(true);
        panelCafes.add(lblCafe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 102, 99, 25));

        btnCafe4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes.add(btnCafe4, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 26, 99, 70));

        lblCafe4.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe4.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe4.setOpaque(true);
        panelCafes.add(lblCafe4, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 102, 99, 25));

        btnCafe5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes.add(btnCafe5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 145, 99, 70));

        lblCafe5.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe5.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe5.setOpaque(true);
        panelCafes.add(lblCafe5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 221, 99, 25));

        btnCafe6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes.add(btnCafe6, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 145, 99, 70));

        lblCafe6.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe6.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe6.setOpaque(true);
        panelCafes.add(lblCafe6, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 221, 99, 25));

        btnCafe7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes.add(btnCafe7, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 145, 99, 70));

        lblCafe7.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe7.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe7.setOpaque(true);
        panelCafes.add(lblCafe7, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 221, 99, 25));

        btnCafe8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes.add(btnCafe8, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 145, 99, 70));

        lblCafe8.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe8.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe8.setOpaque(true);
        panelCafes.add(lblCafe8, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 221, 99, 25));

        lblCafe12.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe12.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe12.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe12.setOpaque(true);
        panelCafes.add(lblCafe12, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 340, 99, 25));

        btnCafe11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes.add(btnCafe11, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 264, 99, 70));

        btnCafe12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes.add(btnCafe12, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 264, 99, 70));

        btnCafe10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes.add(btnCafe10, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 264, 99, 70));

        btnCafe9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes.add(btnCafe9, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 264, 99, 70));

        lblCafe11.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe11.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe11.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe11.setOpaque(true);
        panelCafes.add(lblCafe11, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 340, 99, 25));

        lblCafe9.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe9.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe9.setOpaque(true);
        panelCafes.add(lblCafe9, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 340, 99, 25));

        lblCafe10.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe10.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe10.setOpaque(true);
        panelCafes.add(lblCafe10, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 340, 99, 25));

        lblCafe16.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe16.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe16.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe16.setOpaque(true);
        panelCafes.add(lblCafe16, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 459, 99, 25));

        lblCafe15.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe15.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe15.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe15.setOpaque(true);
        panelCafes.add(lblCafe15, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 459, 99, 25));

        btnCafe16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes.add(btnCafe16, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 383, 99, 70));

        lblCafe14.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe14.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe14.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe14.setOpaque(true);
        panelCafes.add(lblCafe14, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 459, 99, 25));

        lblCafe13.setBackground(new java.awt.Color(102, 102, 102));
        lblCafe13.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCafe13.setForeground(new java.awt.Color(255, 255, 255));
        lblCafe13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCafe13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCafe13.setOpaque(true);
        panelCafes.add(lblCafe13, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 459, 99, 25));

        btnCafe15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes.add(btnCafe15, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 383, 99, 70));

        btnCafe14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes.add(btnCafe14, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 383, 99, 70));

        btnCafe13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes.add(btnCafe13, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 383, 99, 70));

        jTabbedPane2.addTab("Cafes", panelCafes);

        panelCafes1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRefresco1.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 26, 99, 70));

        lblProducto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 102, 99, 25));

        btnRefresco2.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 26, 99, 70));

        lblProducto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 102, 99, 25));

        btnRefresco3.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 26, 99, 70));

        lblProducto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 102, 99, 25));

        btnRefresco4.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 26, 99, 70));

        lblProducto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 102, 99, 25));

        btnRefresco5.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 145, 99, 70));

        lblProducto5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 221, 99, 25));

        btnRefresco6.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco6, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 145, 99, 70));

        lblProducto6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 221, 99, 25));

        btnRefresco7.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco7, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 145, 99, 70));

        lblProducto7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 221, 99, 25));

        btnRefresco8.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco8, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 145, 99, 70));

        lblProducto8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 221, 99, 25));

        lblProducto12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto12, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 340, 100, 25));

        btnRefresco11.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco11, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 264, 99, 70));

        btnRefresco12.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco12, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 264, 100, 70));

        btnRefresco10.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco10, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 264, 99, 70));

        btnRefresco9.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco9, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 264, 99, 70));

        lblProducto11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 340, 99, 25));

        lblProducto9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 340, 99, 25));

        lblProducto10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 340, 99, 25));

        lblProducto16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto16, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 459, 99, 25));

        lblProducto15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto15, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 459, 99, 25));

        btnRefresco16.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco16, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 383, 99, 70));

        lblProducto14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto14, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 459, 99, 25));

        lblProducto13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(lblProducto13, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 459, 99, 25));

        btnRefresco15.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco15, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 383, 99, 70));

        btnRefresco14.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco14, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 383, 99, 70));

        btnRefresco13.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresco13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCafes1.add(btnRefresco13, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 383, 99, 70));

        jTabbedPane2.addTab("Refrescos", panelCafes1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        Productos.addTab("Productos", jPanel2);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\drofe\\EIG\\DESARROLLO DE INTERFACES\\tpv\\img\\mesa.png")); // NOI18N
        jLabel1.setText("Mesa1");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\drofe\\EIG\\DESARROLLO DE INTERFACES\\tpv\\img\\mesa.png")); // NOI18N
        jLabel2.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\drofe\\EIG\\DESARROLLO DE INTERFACES\\tpv\\img\\mesa.png")); // NOI18N
        jLabel3.setText("jLabel1");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\drofe\\EIG\\DESARROLLO DE INTERFACES\\tpv\\img\\mesa.png")); // NOI18N
        jLabel4.setText("jLabel1");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\drofe\\EIG\\DESARROLLO DE INTERFACES\\tpv\\img\\mesa.png")); // NOI18N
        jLabel5.setText("jLabel1");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\drofe\\EIG\\DESARROLLO DE INTERFACES\\tpv\\img\\mesa.png")); // NOI18N
        jLabel6.setText("jLabel1");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\drofe\\EIG\\DESARROLLO DE INTERFACES\\tpv\\img\\mesa.png")); // NOI18N
        jLabel7.setText("jLabel1");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\drofe\\EIG\\DESARROLLO DE INTERFACES\\tpv\\img\\mesa.png")); // NOI18N
        jLabel8.setText("jLabel1");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\drofe\\EIG\\DESARROLLO DE INTERFACES\\tpv\\img\\mesa.png")); // NOI18N
        jLabel9.setText("jLabel1");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Mesa 2");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Mesa 1");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Mesa 5");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mesa 3");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Mesa 4");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Mesa 6");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Mesa 8");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Mesa 7");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Mesa 9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Productos.addTab("Mesas", jPanel1);

        getContentPane().add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 500, 560));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setText("Usuario:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(showUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 190, 320));

        panelTicket.setBackground(new java.awt.Color(102, 102, 102));
        panelTicket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTicket.setForeground(new java.awt.Color(102, 102, 102));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("TICKET");

        ticket.setModel(this.modeloTicket);
        jScrollPane2.setViewportView(ticket);

        javax.swing.GroupLayout panelTicketLayout = new javax.swing.GroupLayout(panelTicket);
        panelTicket.setLayout(panelTicketLayout);
        panelTicketLayout.setHorizontalGroup(
            panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        panelTicketLayout.setVerticalGroup(
            panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(panelTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 240));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        btn6Teclado.setBackground(new java.awt.Color(51, 51, 51));
        btn6Teclado.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btn6Teclado.setForeground(new java.awt.Color(204, 204, 204));
        btn6Teclado.setText("6");
        btn6Teclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6TecladoActionPerformed(evt);
            }
        });

        btn7Teclado.setBackground(new java.awt.Color(51, 51, 51));
        btn7Teclado.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btn7Teclado.setForeground(new java.awt.Color(204, 204, 204));
        btn7Teclado.setText("7");
        btn7Teclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7TecladoActionPerformed(evt);
            }
        });

        btn8Teclado.setBackground(new java.awt.Color(51, 51, 51));
        btn8Teclado.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btn8Teclado.setForeground(new java.awt.Color(204, 204, 204));
        btn8Teclado.setText("8");

        btn9Teclado.setBackground(new java.awt.Color(51, 51, 51));
        btn9Teclado.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btn9Teclado.setForeground(new java.awt.Color(204, 204, 204));
        btn9Teclado.setText("9");

        btn4Teclado.setBackground(new java.awt.Color(51, 51, 51));
        btn4Teclado.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btn4Teclado.setForeground(new java.awt.Color(204, 204, 204));
        btn4Teclado.setText("4");

        btn5Teclado.setBackground(new java.awt.Color(51, 51, 51));
        btn5Teclado.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btn5Teclado.setForeground(new java.awt.Color(204, 204, 204));
        btn5Teclado.setText("5");

        btn1Teclado.setBackground(new java.awt.Color(51, 51, 51));
        btn1Teclado.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btn1Teclado.setForeground(new java.awt.Color(204, 204, 204));
        btn1Teclado.setText("1");

        btn2Teclado.setBackground(new java.awt.Color(51, 51, 51));
        btn2Teclado.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btn2Teclado.setForeground(new java.awt.Color(204, 204, 204));
        btn2Teclado.setText("2");

        btn3Teclado.setBackground(new java.awt.Color(51, 51, 51));
        btn3Teclado.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btn3Teclado.setForeground(new java.awt.Color(204, 204, 204));
        btn3Teclado.setText("3");

        btn0Teclado.setBackground(new java.awt.Color(51, 51, 51));
        btn0Teclado.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btn0Teclado.setForeground(new java.awt.Color(204, 204, 204));
        btn0Teclado.setText("0");

        btnBorrarTeclado.setBackground(new java.awt.Color(255, 51, 51));
        btnBorrarTeclado.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnBorrarTeclado.setForeground(new java.awt.Color(102, 102, 102));
        btnBorrarTeclado.setText("BORRAR");
        btnBorrarTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTecladoActionPerformed(evt);
            }
        });

        btnOkTeclado.setBackground(new java.awt.Color(0, 204, 102));
        btnOkTeclado.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnOkTeclado.setForeground(new java.awt.Color(102, 102, 102));
        btnOkTeclado.setText("OK");
        btnOkTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkTecladoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBorrarTeclado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOkTeclado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn0Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn8Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn6Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btn1Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn0Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnBorrarTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOkTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 270, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn7TecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7TecladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn7TecladoActionPerformed

    private void btn6TecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6TecladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6TecladoActionPerformed

    private void btnOkTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkTecladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkTecladoActionPerformed

    private void btnCafe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafe1ActionPerformed
        // TODO add your handling code here:
        pulsarProducto(1);
    }//GEN-LAST:event_btnCafe1ActionPerformed

    private void btnCafe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafe2ActionPerformed
        // TODO add your handling code here:
        pulsarProducto(2);
    }//GEN-LAST:event_btnCafe2ActionPerformed

    private void btnCafe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafe3ActionPerformed
        // TODO add your handling code here:
        pulsarProducto(3);
    }//GEN-LAST:event_btnCafe3ActionPerformed

    private void btnBorrarTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTecladoActionPerformed
        // TODO add your handling code here:
        if(ticket.getSelectedIndex()>=0){
            this.ticket.remove(ticket.getSelectedIndex());
        }
    }//GEN-LAST:event_btnBorrarTecladoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new InterfazUsuario().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Productos;
    private javax.swing.JButton btn0Teclado;
    private javax.swing.JButton btn1Teclado;
    private javax.swing.JButton btn2Teclado;
    private javax.swing.JButton btn3Teclado;
    private javax.swing.JButton btn4Teclado;
    private javax.swing.JButton btn5Teclado;
    private javax.swing.JButton btn6Teclado;
    private javax.swing.JButton btn7Teclado;
    private javax.swing.JButton btn8Teclado;
    private javax.swing.JButton btn9Teclado;
    private javax.swing.JButton btnBorrarTeclado;
    private javax.swing.JButton btnCafe1;
    private javax.swing.JButton btnCafe10;
    private javax.swing.JButton btnCafe11;
    private javax.swing.JButton btnCafe12;
    private javax.swing.JButton btnCafe13;
    private javax.swing.JButton btnCafe14;
    private javax.swing.JButton btnCafe15;
    private javax.swing.JButton btnCafe16;
    private javax.swing.JButton btnCafe2;
    private javax.swing.JButton btnCafe3;
    private javax.swing.JButton btnCafe4;
    private javax.swing.JButton btnCafe5;
    private javax.swing.JButton btnCafe6;
    private javax.swing.JButton btnCafe7;
    private javax.swing.JButton btnCafe8;
    private javax.swing.JButton btnCafe9;
    private javax.swing.JButton btnOkTeclado;
    private javax.swing.JButton btnRefresco1;
    private javax.swing.JButton btnRefresco10;
    private javax.swing.JButton btnRefresco11;
    private javax.swing.JButton btnRefresco12;
    private javax.swing.JButton btnRefresco13;
    private javax.swing.JButton btnRefresco14;
    private javax.swing.JButton btnRefresco15;
    private javax.swing.JButton btnRefresco16;
    private javax.swing.JButton btnRefresco2;
    private javax.swing.JButton btnRefresco3;
    private javax.swing.JButton btnRefresco4;
    private javax.swing.JButton btnRefresco5;
    private javax.swing.JButton btnRefresco6;
    private javax.swing.JButton btnRefresco7;
    private javax.swing.JButton btnRefresco8;
    private javax.swing.JButton btnRefresco9;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblCafe1;
    private javax.swing.JLabel lblCafe10;
    private javax.swing.JLabel lblCafe11;
    private javax.swing.JLabel lblCafe12;
    private javax.swing.JLabel lblCafe13;
    private javax.swing.JLabel lblCafe14;
    private javax.swing.JLabel lblCafe15;
    private javax.swing.JLabel lblCafe16;
    private javax.swing.JLabel lblCafe2;
    private javax.swing.JLabel lblCafe3;
    private javax.swing.JLabel lblCafe4;
    private javax.swing.JLabel lblCafe5;
    private javax.swing.JLabel lblCafe6;
    private javax.swing.JLabel lblCafe7;
    private javax.swing.JLabel lblCafe8;
    private javax.swing.JLabel lblCafe9;
    private javax.swing.JLabel lblProducto1;
    private javax.swing.JLabel lblProducto10;
    private javax.swing.JLabel lblProducto11;
    private javax.swing.JLabel lblProducto12;
    private javax.swing.JLabel lblProducto13;
    private javax.swing.JLabel lblProducto14;
    private javax.swing.JLabel lblProducto15;
    private javax.swing.JLabel lblProducto16;
    private javax.swing.JLabel lblProducto2;
    private javax.swing.JLabel lblProducto3;
    private javax.swing.JLabel lblProducto4;
    private javax.swing.JLabel lblProducto5;
    private javax.swing.JLabel lblProducto6;
    private javax.swing.JLabel lblProducto7;
    private javax.swing.JLabel lblProducto8;
    private javax.swing.JLabel lblProducto9;
    private javax.swing.JPanel panelCafes;
    private javax.swing.JPanel panelCafes1;
    private javax.swing.JPanel panelTicket;
    private javax.swing.JLabel showUser;
    private javax.swing.JList<String> ticket;
    // End of variables declaration//GEN-END:variables
}
