/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticafinalpi;
import Métodos_sql.Métodos_SQL;
import static Métodos_sql.Métodos_SQL.result;
import static Métodos_sql.Métodos_SQL.sent_preparada;
import Métodos_sql.conexiónBD;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author on3l7d15h
 */
public class frm_Crud extends javax.swing.JFrame {
DefaultTableModel model;
    /**
     * Creates new form frm_Crud
     */
    public frm_Crud() {
        initComponents();
        setLocationRelativeTo(null);
        
        String[] titles = {"Id", "Name", "Last", "Location", "Email"};
        model = new DefaultTableModel(null, titles);
        tClients.setModel(model);
        mostrarDatos();
    }
    
    Métodos_SQL método = new Métodos_SQL();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tid = new javax.swing.JTextField();
        tlast = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tClients = new javax.swing.JTable();
        bInsert = new javax.swing.JButton();
        bClean = new javax.swing.JButton();
        bUpd = new javax.swing.JButton();
        bDel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        temail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tloc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        namel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bExit1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(2, 151, 81));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("¡Sign Up!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));

        tid.setBackground(new java.awt.Color(54, 54, 54));
        tid.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        tid.setForeground(new java.awt.Color(2, 151, 81));
        tid.setName("cname"); // NOI18N

        tlast.setBackground(new java.awt.Color(54, 54, 54));
        tlast.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        tlast.setForeground(new java.awt.Color(2, 151, 81));
        tlast.setName("tlast"); // NOI18N

        tClients.setModel(new javax.swing.table.DefaultTableModel(
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
        tClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tClientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tClients);

        bInsert.setBackground(new java.awt.Color(2, 151, 81));
        bInsert.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        bInsert.setForeground(new java.awt.Color(254, 254, 254));
        bInsert.setText("Insert");
        bInsert.setName("cbtn1"); // NOI18N
        bInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInsertActionPerformed(evt);
            }
        });

        bClean.setBackground(new java.awt.Color(2, 151, 81));
        bClean.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        bClean.setForeground(new java.awt.Color(254, 254, 254));
        bClean.setText("Clean");
        bClean.setToolTipText("");
        bClean.setName("cbtn1"); // NOI18N
        bClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCleanActionPerformed(evt);
            }
        });

        bUpd.setBackground(new java.awt.Color(2, 151, 81));
        bUpd.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        bUpd.setForeground(new java.awt.Color(254, 254, 254));
        bUpd.setText("Update");
        bUpd.setName("cbtn1"); // NOI18N
        bUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdActionPerformed(evt);
            }
        });

        bDel.setBackground(new java.awt.Color(2, 151, 81));
        bDel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        bDel.setForeground(new java.awt.Color(254, 254, 254));
        bDel.setText("Delete");
        bDel.setName("cbtn1"); // NOI18N
        bDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDelActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(31, 31, 31));
        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(253, 251, 251));
        jLabel4.setText("Last:");

        jLabel5.setBackground(new java.awt.Color(31, 31, 31));
        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(253, 251, 251));
        jLabel5.setText("Name:");

        temail.setBackground(new java.awt.Color(54, 54, 54));
        temail.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        temail.setForeground(new java.awt.Color(2, 151, 81));
        temail.setName("cname"); // NOI18N

        jLabel6.setBackground(new java.awt.Color(31, 31, 31));
        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(253, 251, 251));
        jLabel6.setText("Email:");

        jLabel8.setBackground(new java.awt.Color(31, 31, 31));
        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(253, 251, 251));
        jLabel8.setText("Location:");

        tloc.setBackground(new java.awt.Color(54, 54, 54));
        tloc.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        tloc.setForeground(new java.awt.Color(2, 151, 81));
        tloc.setName("cname"); // NOI18N

        jLabel9.setBackground(new java.awt.Color(31, 31, 31));
        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(253, 251, 251));
        jLabel9.setText("id:");

        tname.setBackground(new java.awt.Color(54, 54, 54));
        tname.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        tname.setForeground(new java.awt.Color(2, 151, 81));
        tname.setName("cname"); // NOI18N

        jPanel3.setBackground(new java.awt.Color(2, 151, 81));

        jLabel3.setBackground(new java.awt.Color(31, 31, 31));
        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(253, 251, 251));
        jLabel3.setText("Connected User:");

        namel.setBackground(new java.awt.Color(31, 31, 31));
        namel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        namel.setForeground(new java.awt.Color(253, 251, 251));

        jLabel7.setBackground(new java.awt.Color(31, 31, 31));
        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(253, 251, 251));
        jLabel7.setText("Clients Crud");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        bExit1.setBackground(new java.awt.Color(2, 151, 81));
        bExit1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        bExit1.setForeground(new java.awt.Color(254, 254, 254));
        bExit1.setToolTipText("");
        bExit1.setLabel("Exit");
        bExit1.setName("cbtn1"); // NOI18N
        bExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tlast, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tloc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(bInsert)
                        .addGap(14, 14, 14)
                        .addComponent(bUpd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bClean)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bExit1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tlast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tloc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bInsert)
                    .addComponent(bClean)
                    .addComponent(bUpd)
                    .addComponent(bDel)
                    .addComponent(bExit1))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdActionPerformed
        if(tid.getText().trim().isEmpty() != true){
            método.actCliente(Integer.parseInt(tid.getText()), tname.getText(), tlast.getText(), tloc.getText(), temail.getText());
            JOptionPane.showMessageDialog(this, "The Update was Successfully!");
            this.mostrarDatos();
        } else {
            JOptionPane.showMessageDialog(this, "Pls user, the id don't be null or empty");
        }
    }//GEN-LAST:event_bUpdActionPerformed

    private void bDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDelActionPerformed
        if(tid.getText().trim().isEmpty() != true){
            método.deleteCliente(Integer.parseInt(tid.getText()));
            JOptionPane.showMessageDialog(this, "Delete successfully");
            this.mostrarDatos();
        } else {
            JOptionPane.showMessageDialog(this, "Click an user in the table first, and with her/him id, i can delete this of the Database");
        }
    }//GEN-LAST:event_bDelActionPerformed

    private void bCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCleanActionPerformed
        this.limpiar();
    }//GEN-LAST:event_bCleanActionPerformed

    private void bInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertActionPerformed
        if(tname.getText().trim().isEmpty() != true){
            if(tlast.getText().trim().isEmpty() != true){
                if(tloc.getText().trim().isEmpty() != true){
                    if(temail.getText().trim().isEmpty() != true){
                        método.insertarCliente(tname.getText(), tlast.getText(), tloc.getText(), temail.getText());
                        this.mostrarDatos();
                        JOptionPane.showMessageDialog(this, "I did send the data to the database");
                        this.limpiar();
                    } else {
                        JOptionPane.showMessageDialog(this, "Insert an email");
                    }
                } else {
                     JOptionPane.showMessageDialog(this, "Insert a location");
                }
            } else {
                 JOptionPane.showMessageDialog(this, "Insert a surname or last name");
            }
        } else {
             JOptionPane.showMessageDialog(this, "Insert a name");
        }
    }//GEN-LAST:event_bInsertActionPerformed

    private void tClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tClientsMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 1){
            JTable receptor = (JTable) evt.getSource();
            tid.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            tname.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            tlast.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            tloc.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            temail.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tClientsMouseClicked

    private void bExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExit1ActionPerformed
        JOptionPane.showMessageDialog(this, "Closing session...");
        this.dispose();
        frm_Login ventana = new frm_Login();
        ventana.setVisible(true);
    }//GEN-LAST:event_bExit1ActionPerformed

     public void mostrarDatos() {
        
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         
        Connection conexión = null;
        
        try {
            
            conexión = conexiónBD.conectar();
            String sent_mostrarDatos = ("Select * From Clients");
            sent_preparada = conexión.prepareStatement(sent_mostrarDatos);
            result = sent_preparada.executeQuery();
            
            while(result.next()){
                Object[] oUser = {result.getString("id"), result.getString("nombre"), result.getString("apellido"), result.getString("dirección"), result.getString("email")};
                model.addRow(oUser);
            }
            
            conexión.close();
        } catch(Exception e) {
            System.out.println("Error" + e);
        }
        
    }
    
    public void limpiar(){
        tid.setText("");
        tname.setText("");
        tlast.setText("");
        tloc.setText("");
        temail.setText("");
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
            java.util.logging.Logger.getLogger(frm_Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Crud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClean;
    private javax.swing.JButton bDel;
    private javax.swing.JButton bExit1;
    private javax.swing.JButton bInsert;
    private javax.swing.JButton bUpd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel namel;
    private javax.swing.JTable tClients;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tlast;
    private javax.swing.JTextField tloc;
    private javax.swing.JTextField tname;
    // End of variables declaration//GEN-END:variables
}
