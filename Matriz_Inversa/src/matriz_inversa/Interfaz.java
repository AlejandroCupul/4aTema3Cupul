/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_inversa;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Arturo
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        lblInstruccion.setVisible(false);
        lblInstruccion1.setVisible(false);
        lblInstruccion2.setVisible(false);
        btnCalcular.setVisible(false);
        lblNota.setVisible(false);
        //SNumerosTF(Tamaño);
        //SNumerosTBL(table);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Tamaño = new java.awt.TextField();
        lblInstruccion = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lblNota = new javax.swing.JLabel();
        lblInstruccion2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableInversa = new javax.swing.JTable();
        lblInstruccion1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese el tamaño de la matriz:");

        lblInstruccion.setText("Ingrese los datos de la matriz en la tabla siguiente:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblNota.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblNota.setForeground(new java.awt.Color(255, 0, 0));
        lblNota.setText("* Nota: Presione enter luego de ingresar cada dato.");

        lblInstruccion2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblInstruccion2.setForeground(new java.awt.Color(0, 0, 153));
        lblInstruccion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstruccion2.setText("MATRIZ INVERSA");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table);

        tableInversa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableInversa);

        lblInstruccion1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblInstruccion1.setForeground(new java.awt.Color(0, 0, 153));
        lblInstruccion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstruccion1.setText("MATRIZ ORIGINAL");

        jMenu1.setText("Matriz Inversa");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblInstruccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(lblInstruccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblNota, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(btnCrear)
                .addGap(6, 6, 6)
                .addComponent(lblInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblInstruccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblInstruccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(lblNota, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCalcular)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     //Generar los llamados KeyListenr para que solo se acepten números :o
    
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        try {
            int n;
            n=Integer.parseInt(Tamaño.getText());
            DefaultTableModel dtm= new DefaultTableModel(n,n);
            final JTable table = new JTable(dtm);
            this.table.getTableHeader().setUI(null);
            this.table.setModel(dtm);
            this.lblInstruccion.setVisible(true);
            this.lblInstruccion1.setVisible(true);
            this.lblInstruccion2.setVisible(true);
            this.btnCalcular.setVisible(true);
            this.lblNota.setVisible(true);
            this.tableInversa.setVisible(false);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "ERROR -> DATO NO VÁLIDO");
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        try {
            Object Datos[][]= new Object[table.getColumnCount()][table.getColumnCount()];
            double Matriz[][]= new double[table.getColumnCount()][table.getColumnCount()];
            Object v;
            String str;
            for(int i=0; i<table.getColumnCount(); i++){
                for(int j=0; j<table.getColumnCount(); j++){
                    Datos[i][j]=table.getValueAt(i, j);
                    //System.out.println(Matriz[i][j]);
                    //this.table.setValueAt(datos[i][j], i, j);
                }
            }

            for(int i=0; i<table.getColumnCount(); i++){
                for(int j=0; j<table.getColumnCount(); j++){
                    v=Datos[i][j];
                    str=v.toString();
                    Matriz[i][j]=Double.valueOf(str).doubleValue();
                    System.out.println(Matriz[i][j]);
                }
            }

            DefaultTableModel tmi= new DefaultTableModel(table.getColumnCount(),table.getColumnCount());
            final JTable table2 = new JTable(tmi);
            this.tableInversa.getTableHeader().setUI(null);
            this.tableInversa.setModel(tmi);
            this.tableInversa.setVisible(true);
            //Inversa inver = new Inversa();
            //double d[][] = inver.inversa(Matriz);
            for(int i=0; i<table.getColumnCount(); i++){
                for(int j=0; j<table.getColumnCount(); j++){
                    //this.tableInversa.setValueAt(d[i][j], i, j);
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "ERROR -> MATRIZ NO VÁLIDA");
        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField Tamaño;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblInstruccion;
    private javax.swing.JLabel lblInstruccion1;
    private javax.swing.JLabel lblInstruccion2;
    private javax.swing.JLabel lblNota;
    private javax.swing.JTable table;
    private javax.swing.JTable tableInversa;
    // End of variables declaration//GEN-END:variables
}
