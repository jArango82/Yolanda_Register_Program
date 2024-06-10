/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package yolandaregisterprogram.GUI;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import yolandaregisterprogram.CrearCuenta;

/**
 *
 * @author arang
 */
public class Cuentas extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    private MongoCollection<Document> tabla;

        
    ArrayList<CrearCuenta> Lista = new ArrayList<CrearCuenta>();
    private Point point;
    public Cuentas() {
        MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(uri);
        MongoIterable<String> listDatabaseNames = mongoClient.listDatabaseNames();
        for (String name : listDatabaseNames) {
        System.out.println(name);
        }
      
        MongoDatabase database = mongoClient.getDatabase("Yolanda");
        tabla= database.getCollection("Cuentas");
        
        
        this.setTitle("YolandaRegisterProgram");
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        
         modelo.addColumn("Obra");
        modelo.addColumn("NIT");
        modelo.addColumn("Deudor");
        modelo.addColumn("#Cuenta");
        refrescarTabla();
    }

     public void refrescarTabla(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        for (CrearCuenta x : Lista){
            Object a[]= new Object[4];
            a[0]=x.getObra();
            a[1]=x.obtenerNit();
            a[2]=x.getDeudor((String) Deuda.getSelectedItem());
            a[3]=x.obtenerCuenta();
               modelo.addRow(a);
        }
        TablaDatos.setModel(modelo);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Obra = new javax.swing.JComboBox<>();
        Deuda = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Concepto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Valor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Btn_Salir = new javax.swing.JButton();
        Btn_Inicio = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Btn_Cuentas = new javax.swing.JButton();
        Btn_Reg1 = new javax.swing.JButton();
        Titulo2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Pagos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        Obra.setBackground(new java.awt.Color(255, 255, 255));
        Obra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Santa Rita", "Villa Maria", "Bucares", "Cantabria" }));
        Obra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObraActionPerformed(evt);
            }
        });

        Deuda.setBackground(new java.awt.Color(255, 255, 255));
        Deuda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Juan Manuel Arango", "Yolanda Bedoya" }));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Obras");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Debe a");

        jLabel6.setText("Concepto de");

        Concepto.setBackground(new java.awt.Color(255, 255, 255));
        Concepto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setText("Valor");

        Valor.setBackground(new java.awt.Color(255, 255, 255));
        Valor.setText("$");
        Valor.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Verificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Crear cuenta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(122, 122, 122))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Concepto)
                    .addComponent(Obra, 0, 148, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Deuda, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Valor)))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)
                        .addGap(68, 68, 68)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Obra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deuda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Concepto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaDatos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 550, 500));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yolandaregisterprogram/resources/minimizar.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Salir.setBackground(new java.awt.Color(0, 153, 204));
        Btn_Salir.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Salir.setText("Cerrar Sesión");
        Btn_Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 150, 30));

        Btn_Inicio.setBackground(new java.awt.Color(0, 153, 255));
        Btn_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yolandaregisterprogram/resources/casa.png"))); // NOI18N
        Btn_Inicio.setText("Inicio");
        Btn_Inicio.setBorder(null);
        Btn_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InicioActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 30));

        Titulo.setFont(new java.awt.Font("Poppins", 3, 17)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 51));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Program");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 149, -1));

        Btn_Cuentas.setBackground(new java.awt.Color(0, 204, 255));
        Btn_Cuentas.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Cuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yolandaregisterprogram/resources/contrato.png"))); // NOI18N
        Btn_Cuentas.setText("Cuenta de cobro");
        Btn_Cuentas.setBorder(null);
        Btn_Cuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CuentasActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Cuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 30));

        Btn_Reg1.setBackground(new java.awt.Color(0, 153, 255));
        Btn_Reg1.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Reg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yolandaregisterprogram/resources/nueva-base-de-datos.png"))); // NOI18N
        Btn_Reg1.setText("Registros");
        Btn_Reg1.setBorder(null);
        Btn_Reg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Reg1ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Reg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 150, 30));

        Titulo2.setFont(new java.awt.Font("Poppins", 3, 17)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(255, 255, 51));
        Titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo2.setText("Yolanda Register");
        jPanel1.add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 149, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yolandaregisterprogram/resources/0001 (2).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 10, 250, 140));

        Btn_Pagos.setBackground(new java.awt.Color(0, 153, 255));
        Btn_Pagos.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Pagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yolandaregisterprogram/resources/facturas-de-papel.png"))); // NOI18N
        Btn_Pagos.setText("Pagos");
        Btn_Pagos.setBorder(null);
        Btn_Pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PagosActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        this.setVisible(false);
        LogIn ventanaLog = new LogIn();
        ventanaLog.setVisible(true);
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void Btn_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InicioActionPerformed
         this.setVisible(false);
        Inicio ventanaIni = new Inicio();
        ventanaIni.setVisible(true);
    }//GEN-LAST:event_Btn_InicioActionPerformed

    private void Btn_CuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CuentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_CuentasActionPerformed

    private void Btn_Reg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Reg1ActionPerformed
         this.setVisible(false);
        Registros ventanaR = new Registros();
        ventanaR.setVisible(true);
    }//GEN-LAST:event_Btn_Reg1ActionPerformed

    private void Btn_PagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PagosActionPerformed
        this.setVisible(false);
        Pagos ventanaP = new Pagos();
        ventanaP.setVisible(true);
    }//GEN-LAST:event_Btn_PagosActionPerformed

    private void ObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObraActionPerformed
       
    }//GEN-LAST:event_ObraActionPerformed

    public String getFecha(){
        GregorianCalendar gcal = new GregorianCalendar();
        int dia = gcal.get(Calendar.DAY_OF_MONTH);
        int mes = gcal.get(Calendar.MONTH)+1;
        int anio = gcal.get(Calendar.YEAR);
        return dia + "/" + mes + "/" + anio;
    }
   
   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String Seleccion = (String) Obra.getSelectedItem();
       String SeleccionN = (String) Obra.getSelectedItem();
       String SeleccionD = (String) Deuda.getSelectedItem();
       String SeleccionH = (String) Deuda.getSelectedItem();
       String nombreObra;
       String NIT;
       String deudor;
       String ahorros;
       
       switch(Seleccion){
           case "Santa Rita":
               nombreObra = "Santa Rita \n"
                       + "NIT: 901146955-4";
               break;
           case "Villa Maria":
                nombreObra = "Villa Maria \n"
                       + "NIT: 423453553-4";
                break;
           case "Bucares":
                nombreObra = "Bucares \n"
                       + "NIT: 423456341-4";
           case "Cantabria":
                nombreObra = "Cantabria \n"
                       + "NIT: 868568756-4";
           default:
               nombreObra = "No aplica";
       } 
       
       switch(SeleccionN){
           case "Santa Rita":
               NIT = "NIT: 901146955-4";
               break;
           case "Villa Maria":
                NIT = "NIT: 423453553-4";
                break;
           case "Bucares":
                NIT = "NIT: 423456341-4";
           case "Cantabria":
                NIT =  "NIT: 868568756-4";
           default:
               NIT = "No aplica";
       } 
       
       switch(SeleccionD){
           case "Juan Manuel Arango":
                deudor = "Juan Manuel Arango Bedoya" ;
               break;
           case "Yolanda Bedoya":
                deudor = "Yolanda Bedoya Bedoya" ;
                break;
           default:
               NIT = "No aplica";
       } 
       
       switch(SeleccionH){
           case "Juan Manuel Arango":
                ahorros =  "Ahorros: 54144269881";
               break;
           case "Yolanda Bedoya":
                ahorros =  "Ahorros: 54125920392";
                break;
           default:
               NIT = "No aplica";
       } 
       
        CrearCuenta cuenta = new CrearCuenta(getFecha(), Seleccion, SeleccionN, SeleccionD, SeleccionH, Concepto.getText(), Valor.getText());
        cuenta.Crear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Document documento = new Document(); 
        documento.put("Obra", Obra.getSelectedItem());
        documento.put("Deudor", Deuda.getSelectedItem());
        documento.put("Concepto", Concepto.getText());
        documento.put("Valor", Valor.getText());
        documento.put("Fecha", getFecha());
        tabla.insertOne(documento);
        
        String SeleccionN = (String) Obra.getSelectedItem();
       String SeleccionH = (String) Deuda.getSelectedItem();
       String ahorros;
       String NIT;
         
         switch(SeleccionH){
           case "Juan Manuel Arango":
                ahorros =  "Ahorros: 54144269881";
               break;
           case "Yolanda Bedoya":
                ahorros =  "Ahorros: 54125920392";
                break;
           default:
               ahorros = "No aplica";
       } 
         
        switch(SeleccionN){
           case "Santa Rita":
               NIT = "NIT: 901146955-4";
               break;
           case "Villa Maria":
                NIT = "NIT: 423453553-4";
                break;
           case "Bucares":
                NIT = "NIT: 423456341-4";
           case "Cantabria":
                NIT =  "NIT: 868568756-4";
           default:
               NIT = "No aplica";
       }  
        CrearCuenta x = new CrearCuenta();
        x.setObra((String) Obra.getSelectedItem());
        x.setNit(SeleccionN);
        x.getDeudor((String) Deuda.getSelectedItem());
        x.getAhorros(SeleccionH);
        Lista.add(x);
       refrescarTabla();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       point = evt.getPoint();
        getComponentAt(point);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       int currentX =this.getLocation().x;
        int currentY =this.getLocation().y;
        
        int moveX = (currentX + evt.getX()) - (currentX + point.x);
        int moveY = (currentY + evt.getY()) - (currentY + point.y);
        
        int x = currentX + moveX;
        int y = currentY + moveY;
        
        this.setLocation(x, y);
    }//GEN-LAST:event_formMouseDragged

    public JComboBox<String> getDeuda() {
        return Deuda;
    }

    public JComboBox<String> getObra() {
        return Obra;
    }

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cuentas;
    private javax.swing.JButton Btn_Inicio;
    private javax.swing.JButton Btn_Pagos;
    private javax.swing.JButton Btn_Reg1;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JTextField Concepto;
    private javax.swing.JComboBox<String> Deuda;
    private javax.swing.JComboBox<String> Obra;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JTextField Valor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
