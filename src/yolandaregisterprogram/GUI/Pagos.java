/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package yolandaregisterprogram.GUI;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import yolandaregisterprogram.CrearPDF;
import yolandaregisterprogram.Trabajador;

/**
 *
 * @author arang
 */
public class Pagos extends javax.swing.JFrame {
    DB db;
    private MongoCollection<Document> tabla;
    private Image imagen;
    DefaultTableModel modelo = new DefaultTableModel(); 
    ArrayList<Trabajador> ListaPersona = new ArrayList<Trabajador>();
    
    private Point point;
    public Pagos() {
       MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(uri);
        MongoIterable<String> listDatabaseNames = mongoClient.listDatabaseNames();
        for (String name : listDatabaseNames) {
        System.out.println(name);
        }
      
        MongoDatabase database = mongoClient.getDatabase("Yolanda");
        tabla= database.getCollection("Pagos");
        
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        
        this.setTitle("YolandaRegisterProgram");
        this.setLocationRelativeTo(null);
        modelo.addColumn("nombre");
        modelo.addColumn("apellido");
        modelo.addColumn("cedula");
        modelo.addColumn("salario");
        refrescarTabla();
        
    }

     public void refrescarTabla(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        for (Trabajador x : ListaPersona){
            Object a[]= new Object[4];
            a[0]=x.getNombre();
            a[1]=x.getApellido();
            a[2]=x.getCedula();
            a[3]=x.getPago();
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
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Valor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        Btn_Reg = new javax.swing.JButton();
        Btn_PDF = new javax.swing.JButton();
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
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido");

        Apellido.setBackground(new java.awt.Color(255, 255, 255));
        Apellido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cedula");

        Cedula.setBackground(new java.awt.Color(255, 255, 255));
        Cedula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Valor");

        Valor.setBackground(new java.awt.Color(255, 255, 255));
        Valor.setText("$");
        Valor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        TablaDatos.setBackground(new java.awt.Color(255, 255, 255));
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre ", "Apellido", "Cedula", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(2).setResizable(false);
            TablaDatos.getColumnModel().getColumn(3).setResizable(false);
        }

        Btn_Reg.setBackground(new java.awt.Color(0, 153, 255));
        Btn_Reg.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Reg.setText("Registrar");
        Btn_Reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegActionPerformed(evt);
            }
        });

        Btn_PDF.setBackground(new java.awt.Color(0, 102, 255));
        Btn_PDF.setForeground(new java.awt.Color(255, 255, 255));
        Btn_PDF.setText("Generar Factura");
        Btn_PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(Btn_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_PDF)
                .addGap(85, 85, 85))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jPanel1.add(Btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 150, 30));

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

        Btn_Cuentas.setBackground(new java.awt.Color(0, 153, 255));
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

        Btn_Pagos.setBackground(new java.awt.Color(0, 204, 255));
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
        this.setVisible(false);
        Cuentas ventanaC = new Cuentas();
        ventanaC.setVisible(true);
    }//GEN-LAST:event_Btn_CuentasActionPerformed

    private void Btn_Reg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Reg1ActionPerformed
         this.setVisible(false);
        Registros ventanaR = new Registros();
        ventanaR.setVisible(true);
    }//GEN-LAST:event_Btn_Reg1ActionPerformed

    
    
    private void Btn_PagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PagosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_PagosActionPerformed

    public String getFecha(){
        GregorianCalendar gcal = new GregorianCalendar();
        int dia = gcal.get(Calendar.DAY_OF_MONTH);
        int mes = gcal.get(Calendar.MONTH)+1;
        int anio = gcal.get(Calendar.YEAR);
        return dia + "/" + mes + "/" + anio;
    }
        
    private void Btn_PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PDFActionPerformed
    CrearPDF miPDF =  new CrearPDF(Nombre.getText(),Apellido.getText(),Cedula.getText(),getFecha(), Valor.getText(), this.ListaPersona);
    miPDF.creacion();
    }//GEN-LAST:event_Btn_PDFActionPerformed

    private void Btn_RegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegActionPerformed
        Document documento = new Document(); 
        documento.put("Nombre", Nombre.getText());
        documento.put("Apellido", Apellido.getText());
        documento.put("Cedula", Cedula.getText());
        documento.put("Pago", Valor.getText());
        documento.put("Fecha", getFecha());
        tabla.insertOne(documento);
        
        Trabajador x = new Trabajador();
        x.setNombre(Nombre.getText());
        x.setApellido(Apellido.getText());
        x.setCedula(Cedula.getText());
        x.setPago(Valor.getText());
        ListaPersona.add(x);
        modelo.addRow(new Object[]{x.getNombre(), x.getApellido(), x.getCedula(), x.getPago()});
       refrescarTabla();
    }//GEN-LAST:event_Btn_RegActionPerformed

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
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JButton Btn_Cuentas;
    private javax.swing.JButton Btn_Inicio;
    private javax.swing.JButton Btn_PDF;
    private javax.swing.JButton Btn_Pagos;
    private javax.swing.JButton Btn_Reg;
    private javax.swing.JButton Btn_Reg1;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JTextField Cedula;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JTextField Valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
