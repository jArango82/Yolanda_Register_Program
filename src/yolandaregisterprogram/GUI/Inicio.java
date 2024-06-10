/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package yolandaregisterprogram.GUI;

import java.awt.Point;
import javax.swing.JFrame;


/**
 *
 * @author arang
 */
public class Inicio extends javax.swing.JFrame {

   
    private Point point;
    public Inicio() {
        this.setTitle("YolandaRegisterProgram");
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setSize(738, 559);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Btn_Salir = new javax.swing.JButton();
        Btn_Inicio = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Btn_Cuentas = new javax.swing.JButton();
        Btn_Reg1 = new javax.swing.JButton();
        Titulo2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Pagos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(738, 549));
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

        Btn_Inicio.setBackground(new java.awt.Color(0, 204, 255));
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("y trabajos eléctricos residenciales, comerciales e industriales.");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("transparencia y efectividad");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, 20));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Yolanda Bedoya Bedoya es una empresa contratista de instalaciones");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("En este sentido, la compañia se caracteriza por su nivel de compromiso,");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 20));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Esta tiene como objetivo tramitar los permisos correspondientes y");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, 20));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("trabajar en redes eléctricas y transformadores.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yolandaregisterprogram/resources/10309womanofficeworkerlightskintone_110686.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yolandaregisterprogram/resources/10303manofficeworkerlightskintone_110631.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yolandaregisterprogram/resources/minimizar.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

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

    private void Btn_Reg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Reg1ActionPerformed
        this.setVisible(false);
        Registros ventanaR = new Registros();
        ventanaR.setVisible(true);
    }//GEN-LAST:event_Btn_Reg1ActionPerformed

    private void Btn_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InicioActionPerformed

    }//GEN-LAST:event_Btn_InicioActionPerformed

    private void Btn_CuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CuentasActionPerformed
        this.setVisible(false);
        Cuentas ventanaC = new Cuentas();
        ventanaC.setVisible(true);
    }//GEN-LAST:event_Btn_CuentasActionPerformed

    private void Btn_PagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PagosActionPerformed
       this.setVisible(false); 
        Pagos ventanaP = new Pagos(); 
        ventanaP.setVisible(true);
    }//GEN-LAST:event_Btn_PagosActionPerformed

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

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cuentas;
    private javax.swing.JButton Btn_Inicio;
    private javax.swing.JButton Btn_Pagos;
    private javax.swing.JButton Btn_Reg1;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    // End of variables declaration//GEN-END:variables
}
