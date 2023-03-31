package MainPackage;

import static MainPackage.AllDonations.progressbar;
import Product.*;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        pnl_tampon.setVisible(true);
        pnl_food.setVisible(false);
        pnl_clothes.setVisible(false);
        pnl_hygiene.setVisible(false);
        pnl_product.setVisible(false);
        pnl_home.setVisible(true);
        pnl_output.setVisible(false);
        pnl_search.setVisible(false);
        tabbedPane.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        pnl_main = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        pnl_leftside = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btn_home = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        btn_donate = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        btn_output = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        btn_search = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        pnl_dekor = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        ARAMATIMI = new javax.swing.JPanel();
        pnl_tampon = new javax.swing.JPanel();
        pnl_product = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_surname = new javax.swing.JTextField();
        cb_city = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tf_number = new javax.swing.JTextField();
        rb_food = new javax.swing.JRadioButton();
        rb_clothes = new javax.swing.JRadioButton();
        rb_hygiene = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        tf_width = new javax.swing.JTextField();
        tf_height = new javax.swing.JTextField();
        tf_length = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btn_packageinfo = new javax.swing.JButton();
        pnl_cardlayout = new javax.swing.JPanel();
        pnl_food = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_day = new javax.swing.JTextField();
        tf_month = new javax.swing.JTextField();
        tf_year = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_addfood = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        cb_foodtype = new javax.swing.JComboBox<>();
        pnl_hygiene = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cb_category = new javax.swing.JComboBox<>();
        btn_addhygiene = new javax.swing.JButton();
        pnl_clothes = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cb_size = new javax.swing.JComboBox<>();
        rb_man = new javax.swing.JRadioButton();
        rb_woman = new javax.swing.JRadioButton();
        rb_kids = new javax.swing.JRadioButton();
        rb_zeroproduct = new javax.swing.JRadioButton();
        rb_preowned = new javax.swing.JRadioButton();
        cb_clothestype = new javax.swing.JComboBox<>();
        btn_addclothes = new javax.swing.JButton();
        lbl_packageinfo = new javax.swing.JLabel();
        lbl_pic = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        btn_saveAllData = new javax.swing.JButton();
        lbl_savedatawarning = new javax.swing.JLabel();
        tf_forIdCheck = new javax.swing.JTextField();
        lbl_productbackground = new javax.swing.JLabel();
        pnl_output = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_clean = new javax.swing.JButton();
        progressbar = new javax.swing.JProgressBar();
        tabbedPane = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablefood = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableclothes = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablehygienes = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableall = new javax.swing.JTable();
        lbl_outputbackground = new javax.swing.JLabel();
        pnl_search = new javax.swing.JPanel();
        cb_searchcity = new javax.swing.JComboBox<>();
        btn_liststocks = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        lbl_infoo = new javax.swing.JLabel();
        lbl_packagegiphy = new javax.swing.JLabel();
        lbl_information = new javax.swing.JLabel();
        lbl_searchbackground = new javax.swing.JLabel();
        pnl_home = new javax.swing.JPanel();
        lbl_homepic = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lbl_ibanno = new javax.swing.JLabel();
        lbl_homeinfo2 = new javax.swing.JLabel();
        lbl_homeinfo3 = new javax.swing.JLabel();
        lbl_homeinfo4 = new javax.swing.JLabel();
        lbl_ibanpic = new javax.swing.JLabel();
        lbl_homeinfo5 = new javax.swing.JLabel();
        lbl_ibanno1 = new javax.swing.JLabel();
        lbl_ibanno2 = new javax.swing.JLabel();
        lbl_ibanno3 = new javax.swing.JLabel();
        lbl_ibanpic1 = new javax.swing.JLabel();
        lbl_ibanpic2 = new javax.swing.JLabel();
        lbl_ibanpic3 = new javax.swing.JLabel();
        lbl_homebackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(61, 137, 220));
        setMaximumSize(new java.awt.Dimension(1200, 1200));
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));

        pnl_main.setBackground(new java.awt.Color(255, 255, 255));
        pnl_main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pnl_main.setMaximumSize(new java.awt.Dimension(1000, 1000));
        pnl_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(61, 137, 220));
        Panel.setMaximumSize(new java.awt.Dimension(1000, 800));
        Panel.setPreferredSize(new java.awt.Dimension(1000, 800));

        pnl_leftside.setBackground(new java.awt.Color(34, 65, 96));

        jPanel6.setBackground(new java.awt.Color(34, 65, 96));
        jPanel6.setPreferredSize(new java.awt.Dimension(117, 40));

        btn_home.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_home.setText("HOME");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setPreferredSize(new java.awt.Dimension(4, 40));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jPanel12.setBackground(new java.awt.Color(34, 65, 96));
        jPanel12.setPreferredSize(new java.awt.Dimension(117, 40));

        btn_donate.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_donate.setText("DONATE");
        btn_donate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_donateActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(4, 40));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_donate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_donate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(34, 65, 96));
        jPanel14.setPreferredSize(new java.awt.Dimension(117, 40));

        btn_output.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btn_output.setText("ALL DONATIONS");
        btn_output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_outputActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setPreferredSize(new java.awt.Dimension(4, 40));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(btn_output, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(34, 65, 96));
        jPanel16.setPreferredSize(new java.awt.Dimension(117, 40));

        btn_search.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_search.setText("SEARCH");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMinimumSize(new java.awt.Dimension(50, 40));
        jPanel17.setPreferredSize(new java.awt.Dimension(4, 40));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_leftsideLayout = new javax.swing.GroupLayout(pnl_leftside);
        pnl_leftside.setLayout(pnl_leftsideLayout);
        pnl_leftsideLayout.setHorizontalGroup(
            pnl_leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_leftsideLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnl_leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnl_leftsideLayout.setVerticalGroup(
            pnl_leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leftsideLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        pnl_dekor.setBackground(new java.awt.Color(0, 112, 192));
        pnl_dekor.setMaximumSize(new java.awt.Dimension(884, 40));
        pnl_dekor.setPreferredSize(new java.awt.Dimension(884, 40));

        lbl_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Close_22px.png"))); // NOI18N
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_dekorLayout = new javax.swing.GroupLayout(pnl_dekor);
        pnl_dekor.setLayout(pnl_dekorLayout);
        pnl_dekorLayout.setHorizontalGroup(
            pnl_dekorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_dekorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_dekorLayout.setVerticalGroup(
            pnl_dekorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ARAMATIMI.setBackground(new java.awt.Color(61, 137, 220));
        ARAMATIMI.setMaximumSize(new java.awt.Dimension(840, 610));
        ARAMATIMI.setPreferredSize(new java.awt.Dimension(840, 610));

        pnl_tampon.setLayout(new java.awt.CardLayout());

        pnl_product.setBackground(new java.awt.Color(255, 255, 255));
        pnl_product.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID:");
        pnl_product.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 102, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name:");
        pnl_product.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Surname:");
        pnl_product.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 208, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Phone Number:");
        pnl_product.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 248, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CATEGORY:");
        pnl_product.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 62, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("CITY:");
        pnl_product.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        tf_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        tf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idActionPerformed(evt);
            }
        });
        pnl_product.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 100, 123, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("DONATOR:");
        pnl_product.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 135, -1, -1));

        tf_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnl_product.add(tf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 168, 123, -1));

        tf_surname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnl_product.add(tf_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 206, 123, -1));

        cb_city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ankara", "İstanbul", "İzmir", "Elazığ", "Van" }));
        cb_city.setSelectedIndex(-1);
        cb_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_cityActionPerformed(evt);
            }
        });
        pnl_product.add(cb_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 131, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setText("DONATIONS ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_product.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 12, -1, -1));

        tf_number.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnl_product.add(tf_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 246, 123, -1));

        buttonGroup1.add(rb_food);
        rb_food.setText("Food");
        rb_food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_foodActionPerformed(evt);
            }
        });
        pnl_product.add(rb_food, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 59, -1, -1));

        buttonGroup1.add(rb_clothes);
        rb_clothes.setText("Clothes");
        rb_clothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_clothesActionPerformed(evt);
            }
        });
        pnl_product.add(rb_clothes, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 59, -1, -1));

        buttonGroup1.add(rb_hygiene);
        rb_hygiene.setText("Hygiene Product");
        rb_hygiene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_hygieneActionPerformed(evt);
            }
        });
        pnl_product.add(rb_hygiene, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 59, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Package Size: ");
        pnl_product.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 286, -1, -1));

        tf_width.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnl_product.add(tf_width, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 284, 35, -1));

        tf_height.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnl_product.add(tf_height, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 284, 35, -1));

        tf_length.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        tf_length.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_lengthActionPerformed(evt);
            }
        });
        pnl_product.add(tf_length, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 284, 35, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("*");
        pnl_product.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 286, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("*");
        pnl_product.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 286, -1, -1));

        btn_packageinfo.setBackground(new java.awt.Color(163, 206, 239));
        btn_packageinfo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_packageinfo.setText("Click here for package size information");
        btn_packageinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_packageinfoActionPerformed(evt);
            }
        });
        pnl_product.add(btn_packageinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 322, -1, -1));

        pnl_cardlayout.setLayout(new java.awt.CardLayout());

        pnl_food.setBackground(new java.awt.Color(163, 206, 239));
        pnl_food.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("FOOD ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Expire Date Of Food: ");

        tf_day.setBackground(new java.awt.Color(163, 206, 239));
        tf_day.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tf_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dayActionPerformed(evt);
            }
        });

        tf_month.setBackground(new java.awt.Color(163, 206, 239));
        tf_month.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        tf_year.setBackground(new java.awt.Color(163, 206, 239));
        tf_year.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText(":");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText(": ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Day");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Month");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Year");

        btn_addfood.setBackground(new java.awt.Color(204, 0, 0));
        btn_addfood.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_addfood.setText("ADD FOOD ");
        btn_addfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addfoodActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Food Type: ");

        cb_foodtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tea", "Milk", "Pasta", "Oil", "Legumes", "Sugar", "Salt", "Flour", "Water", "Canned Food", "Baby Food" }));
        cb_foodtype.setSelectedIndex(-1);
        cb_foodtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_foodtypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_foodLayout = new javax.swing.GroupLayout(pnl_food);
        pnl_food.setLayout(pnl_foodLayout);
        pnl_foodLayout.setHorizontalGroup(
            pnl_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_foodLayout.createSequentialGroup()
                .addGroup(pnl_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_foodLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_foodLayout.createSequentialGroup()
                                .addGroup(pnl_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_foodLayout.createSequentialGroup()
                                        .addComponent(tf_day, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13))
                                .addGap(1, 1, 1)
                                .addGroup(pnl_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_foodLayout.createSequentialGroup()
                                        .addComponent(tf_month, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_year, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_foodLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15))))
                            .addComponent(cb_foodtype, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_foodLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_foodLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_addfood)
                .addGap(68, 68, 68))
        );
        pnl_foodLayout.setVerticalGroup(
            pnl_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_foodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(4, 4, 4)
                .addGroup(pnl_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(pnl_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cb_foodtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_addfood)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pnl_cardlayout.add(pnl_food, "card2");

        pnl_hygiene.setBackground(new java.awt.Color(163, 206, 239));
        pnl_hygiene.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 153, 0));
        jLabel22.setText("HYGIENE ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(28, 28, 28))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Category: ");

        cb_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mask", "Diaper", "Toothpaste", "Soap", "Shampoo", "Toilet Paper", "Cream" }));
        cb_category.setSelectedIndex(-1);
        cb_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_categoryActionPerformed(evt);
            }
        });

        btn_addhygiene.setBackground(new java.awt.Color(204, 0, 0));
        btn_addhygiene.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_addhygiene.setText("ADD HYGIENE ");
        btn_addhygiene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addhygieneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_hygieneLayout = new javax.swing.GroupLayout(pnl_hygiene);
        pnl_hygiene.setLayout(pnl_hygieneLayout);
        pnl_hygieneLayout.setHorizontalGroup(
            pnl_hygieneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_hygieneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_addhygiene)
                .addGap(27, 27, 27))
            .addGroup(pnl_hygieneLayout.createSequentialGroup()
                .addGroup(pnl_hygieneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_hygieneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23)
                        .addGap(50, 50, 50)
                        .addComponent(cb_category, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_hygieneLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        pnl_hygieneLayout.setVerticalGroup(
            pnl_hygieneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_hygieneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_hygieneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cb_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btn_addhygiene)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pnl_cardlayout.add(pnl_hygiene, "card4");

        pnl_clothes.setBackground(new java.awt.Color(163, 206, 239));
        pnl_clothes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 153, 0));
        jLabel17.setText("CLOTHES ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Size: ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Gender: ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Durableness:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Clothes Type: ");

        cb_size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large", "Extra Large" }));
        cb_size.setSelectedIndex(-1);

        buttonGroup2.add(rb_man);
        rb_man.setText("Man");

        buttonGroup2.add(rb_woman);
        rb_woman.setText("Woman");

        buttonGroup2.add(rb_kids);
        rb_kids.setText("Kids");

        buttonGroup3.add(rb_zeroproduct);
        rb_zeroproduct.setText("Zero Product");

        buttonGroup3.add(rb_preowned);
        rb_preowned.setText("Pre_Owned");

        cb_clothestype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coat", "Top", "Pants", "Sleeping-bag", "Shoes", "Blanket" }));
        cb_clothestype.setSelectedIndex(-1);
        cb_clothestype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_clothestypeActionPerformed(evt);
            }
        });

        btn_addclothes.setBackground(new java.awt.Color(204, 0, 0));
        btn_addclothes.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_addclothes.setText("ADD CLOTHES ");
        btn_addclothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addclothesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_clothesLayout = new javax.swing.GroupLayout(pnl_clothes);
        pnl_clothes.setLayout(pnl_clothesLayout);
        pnl_clothesLayout.setHorizontalGroup(
            pnl_clothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_clothesLayout.createSequentialGroup()
                .addGroup(pnl_clothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_clothesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_addclothes))
                    .addGroup(pnl_clothesLayout.createSequentialGroup()
                        .addGroup(pnl_clothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_clothesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnl_clothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel19)
                                    .addGroup(pnl_clothesLayout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(76, 76, 76)
                                        .addGroup(pnl_clothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnl_clothesLayout.createSequentialGroup()
                                                .addComponent(rb_man)
                                                .addGap(18, 18, 18)
                                                .addComponent(rb_woman)
                                                .addGap(18, 18, 18)
                                                .addComponent(rb_kids))
                                            .addGroup(pnl_clothesLayout.createSequentialGroup()
                                                .addGroup(pnl_clothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(cb_clothestype, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(rb_zeroproduct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addComponent(rb_preowned))))))
                            .addGroup(pnl_clothesLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_clothesLayout.setVerticalGroup(
            pnl_clothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_clothesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_clothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cb_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_clothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(rb_man)
                    .addComponent(rb_woman)
                    .addComponent(rb_kids))
                .addGap(18, 18, 18)
                .addGroup(pnl_clothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(rb_zeroproduct)
                    .addComponent(rb_preowned))
                .addGap(18, 18, 18)
                .addGroup(pnl_clothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cb_clothestype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_addclothes)
                .addContainerGap())
        );

        pnl_cardlayout.add(pnl_clothes, "card3");

        pnl_product.add(pnl_cardlayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 13, -1, -1));

        lbl_packageinfo.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lbl_packageinfo.setText(" ");
        lbl_packageinfo.setMaximumSize(new java.awt.Dimension(5, 50));
        lbl_packageinfo.setMinimumSize(new java.awt.Dimension(4, 40));
        lbl_packageinfo.setPreferredSize(new java.awt.Dimension(4, 50));
        pnl_product.add(lbl_packageinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 200, 23));

        lbl_pic.setMaximumSize(new java.awt.Dimension(260, 260));
        lbl_pic.setMinimumSize(new java.awt.Dimension(260, 260));
        lbl_pic.setPreferredSize(new java.awt.Dimension(260, 260));
        pnl_product.add(lbl_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        lbl.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl.setForeground(new java.awt.Color(204, 0, 0));
        lbl.setText("Please enter");
        pnl_product.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        lbl2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl2.setForeground(new java.awt.Color(204, 0, 0));
        lbl2.setText("a valid number !");
        pnl_product.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        btn_saveAllData.setBackground(new java.awt.Color(204, 0, 0));
        btn_saveAllData.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_saveAllData.setText("SAVE ALL DATA");
        btn_saveAllData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveAllDataActionPerformed(evt);
            }
        });
        pnl_product.add(btn_saveAllData, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, -1, -1));

        lbl_savedatawarning.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl_savedatawarning.setText("Please add all donations, then save all data.");
        pnl_product.add(lbl_savedatawarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 300, -1));

        tf_forIdCheck.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tf_forIdCheck.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnl_product.add(tf_forIdCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 440, -1));

        lbl_productbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/backgound.jpg"))); // NOI18N
        pnl_product.add(lbl_productbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnl_tampon.add(pnl_product, "card2");

        pnl_output.setBackground(new java.awt.Color(255, 255, 255));
        pnl_output.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("LIST ALL DONATIONS ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnl_output.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        btn_clean.setBackground(new java.awt.Color(204, 0, 0));
        btn_clean.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_clean.setText("CLEAN TABLE");
        btn_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cleanActionPerformed(evt);
            }
        });
        pnl_output.add(btn_clean, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        progressbar.setBackground(new java.awt.Color(204, 204, 255));
        progressbar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        progressbar.setForeground(new java.awt.Color(51, 51, 255));
        progressbar.setStringPainted(true);
        pnl_output.add(progressbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 63, 305, 79));

        tabbedPane.setBackground(new java.awt.Color(255, 151, 54));

        jScrollPane2.setBackground(new java.awt.Color(115, 195, 108));

        tablefood.setBackground(new java.awt.Color(255, 151, 54));
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
        tablefood.setRowHeight(20);
        jScrollPane2.setViewportView(tablefood);

        tabbedPane.addTab("FOODS", jScrollPane2);

        jScrollPane3.setBackground(new java.awt.Color(115, 195, 108));

        tableclothes.setBackground(new java.awt.Color(255, 151, 54));
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
        tableclothes.setRowHeight(20);
        jScrollPane3.setViewportView(tableclothes);

        tabbedPane.addTab("CLOTHES", jScrollPane3);

        jScrollPane4.setBackground(new java.awt.Color(115, 195, 108));

        tablehygienes.setBackground(new java.awt.Color(255, 151, 54));
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
        tablehygienes.setRowHeight(20);
        jScrollPane4.setViewportView(tablehygienes);

        tabbedPane.addTab("HYGIENES", jScrollPane4);

        jScrollPane5.setBackground(new java.awt.Color(115, 195, 108));

        tableall.setBackground(new java.awt.Color(255, 151, 54));
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
        tableall.setRowHeight(20);
        jScrollPane5.setViewportView(tableall);

        tabbedPane.addTab("ALL DONATIONS", jScrollPane5);

        pnl_output.add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 680, 219));

        lbl_outputbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/backgound.jpg"))); // NOI18N
        pnl_output.add(lbl_outputbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnl_tampon.add(pnl_output, "card5");

        pnl_search.setBackground(new java.awt.Color(255, 255, 255));
        pnl_search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_searchcity.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cb_searchcity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ankara", "İstanbul", "Elazığ", "İzmir", "Van" }));
        cb_searchcity.setSelectedIndex(-1);
        pnl_search.add(cb_searchcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 118, -1));

        btn_liststocks.setBackground(new java.awt.Color(204, 0, 0));
        btn_liststocks.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_liststocks.setText("LIST STOCKS NOW");
        btn_liststocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_liststocksActionPerformed(evt);
            }
        });
        pnl_search.add(btn_liststocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        pnl_search.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 287, 309, 280));

        lbl_infoo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl_infoo.setText("Click here for to see city donations ");
        pnl_search.add(lbl_infoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        lbl_packagegiphy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/package_giphy.gif"))); // NOI18N
        pnl_search.add(lbl_packagegiphy, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 11, -1, 258));

        lbl_information.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl_information.setText("Please choose the city that you want to see stocks");
        pnl_search.add(lbl_information, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        lbl_searchbackground.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbl_searchbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/backgound.jpg"))); // NOI18N
        pnl_search.add(lbl_searchbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnl_tampon.add(pnl_search, "card4");

        pnl_home.setBackground(new java.awt.Color(255, 255, 255));
        pnl_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_homepic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/home_pic.png"))); // NOI18N
        pnl_home.add(lbl_homepic, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));
        pnl_home.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 310, -1, -1));

        lbl_ibanno.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lbl_ibanno.setForeground(new java.awt.Color(0, 102, 0));
        lbl_ibanno.setText("TÜRKİYE İŞ BANKASI                    : TR16 0006 4000 0014 2990 9890 45");
        pnl_home.add(lbl_ibanno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, -1, -1));

        lbl_homeinfo2.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lbl_homeinfo2.setText("click \"All Donation\" to see all donation products. ");
        pnl_home.add(lbl_homeinfo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        lbl_homeinfo3.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lbl_homeinfo3.setText("Click on the \"Stock Status\" tab to see the stock status. ");
        pnl_home.add(lbl_homeinfo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        lbl_homeinfo4.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lbl_homeinfo4.setText("Also, if you want to donate money, our IBAN information is below. ");
        pnl_home.add(lbl_homeinfo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        lbl_ibanpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/money_circulation_20px.png"))); // NOI18N
        pnl_home.add(lbl_ibanpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, -1, 30));

        lbl_homeinfo5.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lbl_homeinfo5.setText("Welcome to our donation page. Click \"Donate\" to donate products, ");
        pnl_home.add(lbl_homeinfo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        lbl_ibanno1.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lbl_ibanno1.setForeground(new java.awt.Color(0, 102, 0));
        lbl_ibanno1.setText("T.C. ZİRAAT BANKASI                  : TR73 0001 0017 4555 5555 5552 04");
        pnl_home.add(lbl_ibanno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        lbl_ibanno2.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lbl_ibanno2.setForeground(new java.awt.Color(0, 102, 0));
        lbl_ibanno2.setText("TÜRKİYE VAKIFLAR BANKASI       : TR62 0001 5001 5800 7299 3175 99");
        pnl_home.add(lbl_ibanno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

        lbl_ibanno3.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lbl_ibanno3.setForeground(new java.awt.Color(0, 102, 0));
        lbl_ibanno3.setText("TÜRKİYE HALK BANKASI               : TR88 0001 2009 4080 0005 0002 28");
        pnl_home.add(lbl_ibanno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, -1, -1));

        lbl_ibanpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/money_circulation_20px.png"))); // NOI18N
        pnl_home.add(lbl_ibanpic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 30, 30));

        lbl_ibanpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/money_circulation_20px.png"))); // NOI18N
        pnl_home.add(lbl_ibanpic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 20, 30));

        lbl_ibanpic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/money_circulation_20px.png"))); // NOI18N
        pnl_home.add(lbl_ibanpic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 20, 30));

        lbl_homebackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/backgound.jpg"))); // NOI18N
        pnl_home.add(lbl_homebackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 770, -1));

        pnl_tampon.add(pnl_home, "card5");

        javax.swing.GroupLayout ARAMATIMILayout = new javax.swing.GroupLayout(ARAMATIMI);
        ARAMATIMI.setLayout(ARAMATIMILayout);
        ARAMATIMILayout.setHorizontalGroup(
            ARAMATIMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(ARAMATIMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ARAMATIMILayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_tampon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        ARAMATIMILayout.setVerticalGroup(
            ARAMATIMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(ARAMATIMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ARAMATIMILayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_tampon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(pnl_leftside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(ARAMATIMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addComponent(pnl_dekor, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(pnl_dekor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ARAMATIMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_leftside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pnl_main.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rb_clothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_clothesActionPerformed
        pnl_cardlayout.setVisible(true);
        pnl_food.setVisible(false);
        pnl_clothes.setVisible(true);
        pnl_hygiene.setVisible(false);
    }//GEN-LAST:event_rb_clothesActionPerformed

    private void tf_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dayActionPerformed

    private void rb_foodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_foodActionPerformed
        pnl_cardlayout.setVisible(true);
        pnl_food.setVisible(true);
        pnl_clothes.setVisible(false);
        pnl_hygiene.setVisible(false);
    }//GEN-LAST:event_rb_foodActionPerformed

    private void rb_hygieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_hygieneActionPerformed
        pnl_cardlayout.setVisible(true);
        pnl_food.setVisible(false);
        pnl_clothes.setVisible(false);
        pnl_hygiene.setVisible(true);
    }//GEN-LAST:event_rb_hygieneActionPerformed

    private void cb_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_cityActionPerformed


    }//GEN-LAST:event_cb_cityActionPerformed

    private void cb_foodtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_foodtypeActionPerformed
        try {
            if (String.valueOf(cb_foodtype.getSelectedItem()) == "Tea") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/tea.png")));
            } else if (String.valueOf(cb_foodtype.getSelectedItem()) == "Milk") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/milk-box.png")));
            } else if (String.valueOf(cb_foodtype.getSelectedItem()) == "Pasta") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/pasta.png")));
            } else if (String.valueOf(cb_foodtype.getSelectedItem()) == "Oil") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/olive-oil.png")));
            } else if (String.valueOf(cb_foodtype.getSelectedItem()) == "Legumes") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/rice.png")));
            } else if (String.valueOf(cb_foodtype.getSelectedItem()) == "Sugar") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/sugar.png")));
            } else if (String.valueOf(cb_foodtype.getSelectedItem()) == "Salt") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/salt.png")));
            } else if (String.valueOf(cb_foodtype.getSelectedItem()) == "Flour") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/flour.png")));
            } else if (String.valueOf(cb_foodtype.getSelectedItem()) == "Water") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/water-bottle.png")));
            } else if (String.valueOf(cb_foodtype.getSelectedItem()) == "Canned Food") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/canned-food.png")));
            } else if (String.valueOf(cb_foodtype.getSelectedItem()) == "Baby Food") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/baby-food.png")));
            }
        } catch (NullPointerException n) {
            n.printStackTrace();
        }

    }//GEN-LAST:event_cb_foodtypeActionPerformed

    private void cb_clothestypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_clothestypeActionPerformed
        try {
            if (String.valueOf(cb_clothestype.getSelectedItem()) == "Coat") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/coat.png")));
            } else if (String.valueOf(cb_clothestype.getSelectedItem()) == "Top") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/sweater.png")));
            } else if (String.valueOf(cb_clothestype.getSelectedItem()) == "Pants") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/jeans.png")));
            } else if (String.valueOf(cb_clothestype.getSelectedItem()) == "Sleeping-bag") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/sleeping-bag.png")));
            } else if (String.valueOf(cb_clothestype.getSelectedItem()) == "Shoes") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/shoes.png")));
            } else if (String.valueOf(cb_clothestype.getSelectedItem()) == "Blanket") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/blanket.png")));
            }
        } catch (NullPointerException n) {
            n.printStackTrace();
        }
    }//GEN-LAST:event_cb_clothestypeActionPerformed

    private void cb_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_categoryActionPerformed
        try {
            if (String.valueOf(cb_category.getSelectedItem()) == "Mask") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/medical-mask.png")));
            } else if (String.valueOf(cb_category.getSelectedItem()) == "Diaper") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/baby-diaper.png")));
            } else if (String.valueOf(cb_category.getSelectedItem()) == "Toothpaste") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/dental-care.png")));
            } else if (String.valueOf(cb_category.getSelectedItem()) == "Soap") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/soap.png")));
            } else if (String.valueOf(cb_category.getSelectedItem()) == "Shampoo") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/shampoo.png")));
            } else if (String.valueOf(cb_category.getSelectedItem()) == "Toilet Paper") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/toilet-paper.png")));
            } else if (String.valueOf(cb_category.getSelectedItem()) == "Cream") {
                lbl_pic.setIcon(new ImageIcon(getClass().getResource("/Pictures/skincare.png")));
            }
        } catch (NullPointerException n) {
            n.printStackTrace();
        }
    }//GEN-LAST:event_cb_categoryActionPerformed

    private void btn_addfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addfoodActionPerformed
        try {
            InfoClass.readFoodFile();
            InfoClass.readHygieneFile();
            InfoClass.readClothesFile();
            InfoClass.readAllProductsFile();
        } catch (IOException ex) {
            Logger.getLogger(AllDonations.class.getName()).log(Level.SEVERE, null, ex);
        }
        String product_id = tf_id.getText();
        String donator_name = tf_name.getText();
        String donator_surname = tf_surname.getText();
        String donator_phone = tf_number.getText();
        String category = "";
        String city = cb_city.getSelectedItem().toString();
        String expire_date = tf_day.getText() + "." + tf_month.getText() + "." + tf_year.getText();
        String food_type;
        int width = Integer.parseInt(tf_width.getText());
        int height = Integer.parseInt(tf_height.getText());
        int length = Integer.parseInt(tf_length.getText());
        double calculated_volume = (width*height*length)/1000;
        
        if(rb_food.isSelected()){
            category += "Food";
        } else if(rb_clothes.isSelected()) {
            category += "Clothes";
        } else if(rb_hygiene.isSelected()) {
            category += "Hygiene";
        }
        
        food_type = cb_foodtype.getSelectedItem().toString();
        if(InfoClass.checkId(Integer.parseInt(product_id),4)) {
            tf_forIdCheck.setText("This ID is already exists. Please enter another ID number !");
        } else {
            Food food = new Food(product_id,donator_name,donator_surname,donator_phone,category,city,expire_date,food_type,width,height,length,calculated_volume);
            //InfoClass.addFood(food);
            InfoClass.tempAddFood(food);
            tf_id.setText("");
            tf_name.setText("");
            tf_surname.setText("");
            tf_number.setText("");
            tf_width.setText("");
            tf_height.setText("");
            tf_length.setText("");
            tf_day.setText("");
            tf_month.setText("");
            tf_year.setText("");
            tf_forIdCheck.setText("");
            if(cb_foodtype.getSelectedIndex() != -1){
                cb_foodtype.setSelectedIndex(-1);
            }
            if(cb_city.getSelectedIndex() != -1) {
                cb_city.setSelectedIndex(-1);
            }
        
            lbl_packageinfo.setText("");
            tf_forIdCheck.setText("");
            
        }

    }//GEN-LAST:event_btn_addfoodActionPerformed

    private void btn_addclothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addclothesActionPerformed
        try {
            InfoClass.readFoodFile();
            InfoClass.readHygieneFile();
            InfoClass.readClothesFile();
            InfoClass.readAllProductsFile();
        } catch (IOException ex) {
            Logger.getLogger(AllDonations.class.getName()).log(Level.SEVERE, null, ex);
        }
        String product_id = tf_id.getText();
        String donator_name = tf_name.getText();
        String donator_surname = tf_surname.getText();
        String donator_phone = tf_number.getText();
        String category = "";
        String city = cb_city.getSelectedItem().toString();
        int width = Integer.parseInt(tf_width.getText());
        int height = Integer.parseInt(tf_height.getText());
        int length = Integer.parseInt(tf_length.getText());
        double calculated_volume = (width*height*length)/1000;
        String size = cb_size.getSelectedItem().toString();
        String gender = "";
        String durableness = "";
        String clothes_type = cb_clothestype.getSelectedItem().toString();
        
        if(rb_food.isSelected()){
            category += "Food";
        } else if(rb_clothes.isSelected()) {
            category += "Clothes";
        } else if(rb_hygiene.isSelected()) {
            category += "Hygiene";
        }
        
        if(rb_man.isSelected()){
            gender = "Man";
        }
        else if(rb_woman.isSelected()){
            gender = "Woman";
        }
        else if(rb_kids.isSelected()) {
            gender = "Kids";
        }
        if(rb_zeroproduct.isSelected()) {
            durableness = "Zero Product";
        }
        else if(rb_preowned.isSelected()) {
            durableness = "Pre-Owned";
        }
        
        if(InfoClass.checkId(Integer.parseInt(product_id),4)) {
            tf_forIdCheck.setText("This ID is already exists. Please enter another ID number !");
        } else {
            Clothes clothes = new Clothes(product_id,donator_name,donator_surname,donator_phone,category,city,size,gender,durableness,clothes_type,
                width,height,length,calculated_volume);
            //InfoClass.addClothes(clothes);
            InfoClass.tempAddClothes(clothes);
        
            tf_id.setText("");
            tf_name.setText("");
            tf_surname.setText("");
            tf_number.setText("");
            tf_width.setText("");
            tf_height.setText("");
            tf_length.setText("");
            if(cb_city.getSelectedIndex() != -1) {
                cb_city.setSelectedIndex(-1);
            }
            if(cb_size.getSelectedIndex() != -1) {
                cb_size.setSelectedIndex(-1);
            }
            if(cb_clothestype.getSelectedIndex() != -1) {
                cb_clothestype.setSelectedIndex(-1);
            }
            lbl_packageinfo.setText("");
            tf_forIdCheck.setText("");
        }
    }//GEN-LAST:event_btn_addclothesActionPerformed

    private void btn_addhygieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addhygieneActionPerformed
        try {
            InfoClass.readFoodFile();
            InfoClass.readHygieneFile();
            InfoClass.readClothesFile();
            InfoClass.readAllProductsFile();
        } catch (IOException ex) {
            Logger.getLogger(AllDonations.class.getName()).log(Level.SEVERE, null, ex);
        }
        String product_id = tf_id.getText();
        String donator_name = tf_name.getText();
        String donator_surname = tf_surname.getText();
        String donator_phone = tf_number.getText();
        String category = "";
        int width = Integer.parseInt(tf_width.getText());
        int height = Integer.parseInt(tf_height.getText());
        int length = Integer.parseInt(tf_length.getText());
        double calculated_volume = (width*height*length)/1000;
        String city = cb_city.getSelectedItem().toString();
        String h_category = cb_category.getSelectedItem().toString();
        
        if(rb_food.isSelected()){
            category += "Food";
        } else if(rb_clothes.isSelected()) {
            category += "Clothes";
        } else if(rb_hygiene.isSelected()) {
            category += "Hygiene";
        }
        
        if(InfoClass.checkId(Integer.parseInt(product_id),4)) {
            tf_forIdCheck.setText("This ID is already exists. Please enter another ID number !");
        } else {
            Hygiene hygiene = new Hygiene(product_id,donator_name,donator_surname,donator_phone,category,city,h_category,
                width,height,length,calculated_volume);
            //InfoClass.addHygiene(hygiene);
            InfoClass.tempAddHygiene(hygiene);
        
            tf_id.setText("");
            tf_name.setText("");
            tf_surname.setText("");
            tf_number.setText("");
            tf_width.setText("");
            tf_height.setText("");
            tf_length.setText("");
            if(cb_city.getSelectedIndex() != -1) {
                cb_city.setSelectedIndex(-1);
            }
            if(cb_category.getSelectedIndex() != -1) {
                cb_category.setSelectedIndex(-1);
            }
            lbl_packageinfo.setText("");
            tf_forIdCheck.setText("");
        }
    }//GEN-LAST:event_btn_addhygieneActionPerformed

    private void tf_lengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_lengthActionPerformed
        
        
    }//GEN-LAST:event_tf_lengthActionPerformed

    private void btn_packageinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_packageinfoActionPerformed
        int width = Integer.parseInt(tf_width.getText());
        int height = Integer.parseInt(tf_height.getText());
        int length = Integer.parseInt(tf_length.getText());
        double volume = (double)(width*height*length)/1000;
        if(0<volume && volume<30){
            lbl_packageinfo.setText("Small package");
        }
        else if(30<= volume && volume <60) {
            lbl_packageinfo.setText("Medium package");
        }
        else if(60<= volume && volume<110){
            lbl_packageinfo.setText("Large package");
        }
        else if(110<= volume) {
            lbl_packageinfo.setText("Extra Large package");
        }
        else {
            lbl_packageinfo.setText("Invalid numbers");
        }
    }//GEN-LAST:event_btn_packageinfoActionPerformed

    private void btn_donateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_donateActionPerformed
        pnl_tampon.setVisible(true);
        pnl_product.setVisible(true);
        pnl_home.setVisible(false);
        pnl_output.setVisible(false);
        pnl_search.setVisible(false);
    }//GEN-LAST:event_btn_donateActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        pnl_tampon.setVisible(true);
        pnl_home.setVisible(true);
        pnl_product.setVisible(false);
        pnl_output.setVisible(false);
        pnl_search.setVisible(false);

    }//GEN-LAST:event_btn_homeActionPerformed

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        ExitFrame exitFrame = new ExitFrame();
        this.dispose();
        exitFrame.setVisible(true);
        
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void btn_outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_outputActionPerformed
        pnl_tampon.setVisible(true);
        pnl_home.setVisible(false);
        pnl_product.setVisible(false);
        pnl_output.setVisible(true);
        pnl_search.setVisible(false);
    }//GEN-LAST:event_btn_outputActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        pnl_tampon.setVisible(true);
        pnl_home.setVisible(false);
        pnl_product.setVisible(false);
        pnl_output.setVisible(false);
        pnl_search.setVisible(true);
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_liststocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_liststocksActionPerformed
        try {
            InfoClass.readFoodFile();
            InfoClass.readHygieneFile();
            InfoClass.readClothesFile();
            InfoClass.readAllProductsFile();
        } catch (IOException ex) {
            Logger.getLogger(AllDonations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String str = InfoClass.search_city(cb_searchcity.getSelectedItem().toString());
        TextArea.setText(str);
    }//GEN-LAST:event_btn_liststocksActionPerformed

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
                InfoClass.hygieneList.get(index).getH_category()});
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

    private void tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idActionPerformed
        
    }//GEN-LAST:event_tf_idActionPerformed

    private void btn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleanActionPerformed
        DefaultTableModel model1 = (DefaultTableModel)tablefood.getModel();
        DefaultTableModel model2 = (DefaultTableModel)tableclothes.getModel();
        DefaultTableModel model3 = (DefaultTableModel)tablehygienes.getModel();
        DefaultTableModel model4 = (DefaultTableModel)tableall.getModel();
        
        model1.setRowCount(0);
        model2.setRowCount(0);
        model3.setRowCount(0);
        model4.setRowCount(0);

        tabbedPane.setVisible(false);
    }//GEN-LAST:event_btn_cleanActionPerformed

    private void btn_saveAllDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveAllDataActionPerformed
        int size1 = InfoClass.tempProductList.size();
        Product product = null;
        for (int i=0; i<size1; i++) {
            product = InfoClass.tempProductList.get(i);
            InfoClass.productList.add(product);
        }
        
        int size2 = InfoClass.tempFoodList.size();
        Food food = null;
        for(int i=0; i<size2; i++) {
            food = InfoClass.tempFoodList.get(i);
            InfoClass.foodList.add(food);
        }
        
        int size3 = InfoClass.tempClothesList.size();
        Clothes clothes = null;
        for(int i=0; i<size3; i++) {
            clothes = InfoClass.tempClothesList.get(i);
            InfoClass.clothesList.add(clothes);
        }
        
        int size4 = InfoClass.tempHygieneList.size();
        Hygiene hygiene = null;
        for(int i=0; i<size4; i++) {
            hygiene = InfoClass.tempHygieneList.get(i);
            InfoClass.hygieneList.add(hygiene);
        }
        
        InfoClass.updateFoodList();
        InfoClass.updateClothesList();
        InfoClass.updateHygieneList();
        InfoClass.updateAllProductsList();
        
    }//GEN-LAST:event_btn_saveAllDataActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ARAMATIMI;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton btn_addclothes;
    private javax.swing.JButton btn_addfood;
    private javax.swing.JButton btn_addhygiene;
    private javax.swing.JButton btn_clean;
    private javax.swing.JButton btn_donate;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_liststocks;
    private javax.swing.JButton btn_output;
    private javax.swing.JButton btn_packageinfo;
    private javax.swing.JButton btn_saveAllData;
    private javax.swing.JButton btn_search;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cb_category;
    private javax.swing.JComboBox<String> cb_city;
    private javax.swing.JComboBox<String> cb_clothestype;
    private javax.swing.JComboBox<String> cb_foodtype;
    private javax.swing.JComboBox<String> cb_searchcity;
    private javax.swing.JComboBox<String> cb_size;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_homebackground;
    private javax.swing.JLabel lbl_homeinfo2;
    private javax.swing.JLabel lbl_homeinfo3;
    private javax.swing.JLabel lbl_homeinfo4;
    private javax.swing.JLabel lbl_homeinfo5;
    private javax.swing.JLabel lbl_homepic;
    private javax.swing.JLabel lbl_ibanno;
    private javax.swing.JLabel lbl_ibanno1;
    private javax.swing.JLabel lbl_ibanno2;
    private javax.swing.JLabel lbl_ibanno3;
    private javax.swing.JLabel lbl_ibanpic;
    private javax.swing.JLabel lbl_ibanpic1;
    private javax.swing.JLabel lbl_ibanpic2;
    private javax.swing.JLabel lbl_ibanpic3;
    private javax.swing.JLabel lbl_infoo;
    private javax.swing.JLabel lbl_information;
    private javax.swing.JLabel lbl_outputbackground;
    private javax.swing.JLabel lbl_packagegiphy;
    private javax.swing.JLabel lbl_packageinfo;
    private javax.swing.JLabel lbl_pic;
    private javax.swing.JLabel lbl_productbackground;
    private javax.swing.JLabel lbl_savedatawarning;
    private javax.swing.JLabel lbl_searchbackground;
    private javax.swing.JPanel pnl_cardlayout;
    private javax.swing.JPanel pnl_clothes;
    private javax.swing.JPanel pnl_dekor;
    private javax.swing.JPanel pnl_food;
    private javax.swing.JPanel pnl_home;
    private javax.swing.JPanel pnl_hygiene;
    private javax.swing.JPanel pnl_leftside;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JPanel pnl_output;
    private javax.swing.JPanel pnl_product;
    private javax.swing.JPanel pnl_search;
    private javax.swing.JPanel pnl_tampon;
    public static javax.swing.JProgressBar progressbar;
    private javax.swing.JRadioButton rb_clothes;
    private javax.swing.JRadioButton rb_food;
    private javax.swing.JRadioButton rb_hygiene;
    private javax.swing.JRadioButton rb_kids;
    private javax.swing.JRadioButton rb_man;
    private javax.swing.JRadioButton rb_preowned;
    private javax.swing.JRadioButton rb_woman;
    private javax.swing.JRadioButton rb_zeroproduct;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tableall;
    private javax.swing.JTable tableclothes;
    private javax.swing.JTable tablefood;
    private javax.swing.JTable tablehygienes;
    private javax.swing.JTextField tf_day;
    private javax.swing.JTextField tf_forIdCheck;
    private javax.swing.JTextField tf_height;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_length;
    private javax.swing.JTextField tf_month;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_number;
    private javax.swing.JTextField tf_surname;
    private javax.swing.JTextField tf_width;
    private javax.swing.JTextField tf_year;
    // End of variables declaration//GEN-END:variables
}
