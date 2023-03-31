
package MainPackage;

import Product.*;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import java.lang.Runnable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AllDonations extends javax.swing.JFrame {

    public AllDonations() {
        initComponents();
        tabbedPane.setVisible(false);
        progressbar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_alldonations = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablefood = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableclothes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablehygienes = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableall = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btn_goback = new javax.swing.JButton();
        progressbar = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        cb_searchcity = new javax.swing.JComboBox<>();
        btn_updatefoodtxt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_alldonations.setBackground(new java.awt.Color(255, 228, 80));
        pnl_alldonations.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("ALL DONATIONS ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.setBackground(new java.awt.Color(115, 195, 108));

        jScrollPane1.setBackground(new java.awt.Color(115, 195, 108));

        tablefood.setBackground(new java.awt.Color(115, 195, 108));
        tablefood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Donator Name", "Donator Surname", "City", "Expire Date", "Food Type"
            }
        ));
        jScrollPane1.setViewportView(tablefood);

        tabbedPane.addTab("FOODS", jScrollPane1);

        jScrollPane2.setBackground(new java.awt.Color(115, 195, 108));

        tableclothes.setBackground(new java.awt.Color(115, 195, 108));
        tableclothes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname", "City", "Size", "Gender", "Durableness", "Clothes Type"
            }
        ));
        jScrollPane2.setViewportView(tableclothes);

        tabbedPane.addTab("CLOTHES", jScrollPane2);

        jScrollPane3.setBackground(new java.awt.Color(115, 195, 108));

        tablehygienes.setBackground(new java.awt.Color(115, 195, 108));
        tablehygienes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Donator Name", "Donator Surname", "City", "Hygiene Category"
            }
        ));
        jScrollPane3.setViewportView(tablehygienes);

        tabbedPane.addTab("HYGIENES", jScrollPane3);

        jScrollPane4.setBackground(new java.awt.Color(115, 195, 108));

        tableall.setBackground(new java.awt.Color(115, 195, 108));
        tableall.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Donator Name", "Donator Surname", "City", "Main Category"
            }
        ));
        jScrollPane4.setViewportView(tableall);

        tabbedPane.addTab("ALL DONATIONS", jScrollPane4);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("LIST ALL DONATIONS NOW ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_goback.setBackground(new java.awt.Color(204, 0, 0));
        btn_goback.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_goback.setText("GO BACK ");
        btn_goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gobackActionPerformed(evt);
            }
        });

        progressbar.setBackground(new java.awt.Color(204, 204, 255));
        progressbar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        progressbar.setForeground(new java.awt.Color(51, 51, 255));
        progressbar.setStringPainted(true);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("SEARCH ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Click here for to see city donations ");

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane5.setViewportView(TextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5))
        );

        cb_searchcity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ankara", "İstanbul", "Elazığ", "İzmir", "Van" }));
        cb_searchcity.setSelectedIndex(-1);

        btn_updatefoodtxt.setText("UPDATE FOOD TXT ");
        btn_updatefoodtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updatefoodtxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_alldonationsLayout = new javax.swing.GroupLayout(pnl_alldonations);
        pnl_alldonations.setLayout(pnl_alldonationsLayout);
        pnl_alldonationsLayout.setHorizontalGroup(
            pnl_alldonationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alldonationsLayout.createSequentialGroup()
                .addGroup(pnl_alldonationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_alldonationsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE))
                    .addGroup(pnl_alldonationsLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnl_alldonationsLayout.createSequentialGroup()
                .addGroup(pnl_alldonationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_alldonationsLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnl_alldonationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(pnl_alldonationsLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(btn_goback))
                            .addComponent(jButton1)))
                    .addGroup(pnl_alldonationsLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(pnl_alldonationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(pnl_alldonationsLayout.createSequentialGroup()
                                .addComponent(cb_searchcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_updatefoodtxt)))))
                .addGap(80, 80, 80)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        pnl_alldonationsLayout.setVerticalGroup(
            pnl_alldonationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alldonationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_alldonationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_alldonationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_alldonationsLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(pnl_alldonationsLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_goback)
                        .addGap(35, 35, 35)
                        .addGroup(pnl_alldonationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_searchcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_updatefoodtxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)))
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_alldonations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_alldonations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int index=0;
        
        DefaultTableModel model1 = (DefaultTableModel)tablefood.getModel();
        DefaultTableModel model2 = (DefaultTableModel)tableclothes.getModel();
        DefaultTableModel model3 = (DefaultTableModel)tablehygienes.getModel();
        DefaultTableModel model4 = (DefaultTableModel)tableall.getModel();
        
        model1.setRowCount(0);
        model2.setRowCount(0);
        model3.setRowCount(0);
        model4.setRowCount(0);
        
        try {
            InfoClass.readFoodFile();
            InfoClass.readHygieneFile();
            InfoClass.readClothesFile();
            InfoClass.readAllProductsFile();
        } catch (IOException ex) {
            Logger.getLogger(AllDonations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(InfoClass.foodList.size() > index) {
            model1.addRow(new Object[]{InfoClass.foodList.get(index).getProduct_id(),InfoClass.foodList.get(index).getDonator_name(),
                InfoClass.foodList.get(index).getDonator_surname(),InfoClass.foodList.get(index).getCity(),
                InfoClass.foodList.get(index).getExpire_date(),InfoClass.foodList.get(index).getFood_type()});
            index++;
            
        }
        
        index = 0;
        while(InfoClass.clothesList.size() > index) {
            model2.addRow(new Object[]{InfoClass.clothesList.get(index).getProduct_id(),InfoClass.clothesList.get(index).getDonator_name(),
                InfoClass.clothesList.get(index).getDonator_surname(),InfoClass.clothesList.get(index).getCity(),
                InfoClass.clothesList.get(index).getSize(),InfoClass.clothesList.get(index).getGender(),
                InfoClass.clothesList.get(index).getDurableness(),InfoClass.clothesList.get(index).getType()});
            index++;
        }
        
        index = 0;
        while(InfoClass.hygieneList.size() > index) {
            model3.addRow(new Object[]{InfoClass.hygieneList.get(index).getProduct_id(),InfoClass.hygieneList.get(index).getDonator_name(),
                InfoClass.hygieneList.get(index).getDonator_surname(),InfoClass.hygieneList.get(index).getCity(),
                InfoClass.hygieneList.get(index).getCategory()});
            index++;
        }
        
        index = 0;
        while(InfoClass.productList.size() > index) {
            Product product = null;
            int size = InfoClass.productList.size();
            for(int i=0; i<size; i++) {
                product = InfoClass.productList.get(i);
                if(product instanceof Food) {
                    model4.addRow(new Object[]{product.getProduct_id(),((Food) product).getDonator_name(),((Food) product).getDonator_surname(),
                        product.getCity(),((Food) product).getCategory()});
                    index++;
                }
                else if(product instanceof Clothes) {
                    model4.addRow(new Object[]{product.getProduct_id(),((Clothes) product).getDonator_name(),((Clothes) product).getDonator_surname(),
                        product.getCity(),((Clothes) product).getCategory()});
                    index++;
                }
                else if(product instanceof Hygiene) {
                    model4.addRow(new Object[]{product.getProduct_id(),((Hygiene) product).getDonator_name(),((Hygiene) product).getDonator_surname(),
                        product.getCity(),((Hygiene) product).getCategory()});
                    index++;
                }
                
            }
        }
        
        progressbar.setVisible(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<=100; i++) {
                    progressbar.setValue(i);
                    try {
                        Thread.sleep(9);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(AllDonations.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                tabbedPane.setVisible(true);
            }
        });
        t.start();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gobackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_gobackActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String str = InfoClass.search_city(cb_searchcity.getSelectedItem().toString());
        TextArea.setText(str);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_updatefoodtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updatefoodtxtActionPerformed
        InfoClass.updateFoodList();
        InfoClass.updateClothesList();
        InfoClass.updateHygieneList();
        InfoClass.updateAllProductsList();
    }//GEN-LAST:event_btn_updatefoodtxtActionPerformed

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
            java.util.logging.Logger.getLogger(AllDonations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllDonations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllDonations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllDonations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllDonations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton btn_goback;
    private javax.swing.JButton btn_updatefoodtxt;
    private javax.swing.JComboBox<String> cb_searchcity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel pnl_alldonations;
    public static javax.swing.JProgressBar progressbar;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tableall;
    private javax.swing.JTable tableclothes;
    private javax.swing.JTable tablefood;
    private javax.swing.JTable tablehygienes;
    // End of variables declaration//GEN-END:variables
}
