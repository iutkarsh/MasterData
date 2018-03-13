/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master.data;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Utkarsh
 */
public class InputFrame extends javax.swing.JFrame {

    private ArrayList<Holder> h1 = new ArrayList<Holder>();
    private ArrayList<HolderTeacher> h3 = new ArrayList<HolderTeacher>();
    private HolderTeacher ht = new HolderTeacher();
    private Holder h2 = new Holder();
    private DatabaseOperations dbo;
    private Boolean examForm = true;
    
    public InputFrame() {
        dbo = new DatabaseOperations();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        cbSem = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbBranch = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        radioYes = new javax.swing.JRadioButton();
        radioNo = new javax.swing.JRadioButton();
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
        saveStudentInfoBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        tfS1 = new javax.swing.JFormattedTextField();
        tfS2 = new javax.swing.JFormattedTextField();
        tfS4 = new javax.swing.JFormattedTextField();
        tfP1 = new javax.swing.JFormattedTextField();
        tfP3 = new javax.swing.JFormattedTextField();
        tfS3 = new javax.swing.JFormattedTextField();
        tfS5 = new javax.swing.JFormattedTextField();
        tfP2 = new javax.swing.JFormattedTextField();
        tfAtkt = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        tfSgpa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        s1Name = new javax.swing.JTextField();
        s2Name = new javax.swing.JTextField();
        s3Name = new javax.swing.JTextField();
        s4Name = new javax.swing.JTextField();
        s5Name = new javax.swing.JTextField();
        p2Name = new javax.swing.JTextField();
        p1Name = new javax.swing.JTextField();
        p3Name = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        f2Name = new javax.swing.JTextField();
        f3Name = new javax.swing.JTextField();
        f4Name = new javax.swing.JTextField();
        f1Name = new javax.swing.JTextField();
        f5Name = new javax.swing.JTextField();
        saveSubjectInfoBtn = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        cbTeacherSem1 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel30.setText("Faculty 1 Name:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Entry");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Student Details:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, -1, -1));

        jLabel3.setText("Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 67, 59, -1));

        jLabel4.setText("Semester:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 113, -1, -1));
        jPanel1.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 63, 194, -1));

        cbSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem 1", "Sem 2", "Sem 3", "Sem 4", "Sem 5", "Sem 6", "Sem 7", "Sem 8" }));
        cbSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSemActionPerformed(evt);
            }
        });
        jPanel1.add(cbSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 108, 194, -1));

        jLabel5.setText("Branch :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 67, -1, -1));

        cbBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science Engineering", "Mechanical Engineering", "Civil Engineering", "Electronics and Telecommunication Engineering" }));
        jPanel1.add(cbBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 62, 246, -1));

        jLabel6.setText("Exam Form filled:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 158, -1, -1));

        radioYes.setText("Yes");
        radioYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioYesActionPerformed(evt);
            }
        });
        jPanel1.add(radioYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 152, -1, -1));

        radioNo.setText("No");
        radioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoActionPerformed(evt);
            }
        });
        jPanel1.add(radioNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 152, 55, -1));

        jLabel7.setText("ATKT (Y/N):");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 113, -1, -1));

        jLabel8.setText("Marks Details:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 204, -1, -1));

        jLabel9.setText("Subject 1: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 242, -1, -1));

        jLabel10.setText("Subject 2:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 242, -1, -1));

        jLabel11.setText("Subject 3:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 284, -1, -1));

        jLabel12.setText("Subject 4:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 284, -1, -1));

        jLabel13.setText("Subject 5:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 330, -1, -1));

        jLabel14.setText("Practical 1:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 326, -1, -1));

        jLabel15.setText("Practical 2:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 368, -1, -1));

        jLabel16.setText("Practical 3:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 368, -1, -1));

        saveStudentInfoBtn.setText("Save");
        saveStudentInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveStudentInfoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(saveStudentInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 408, 125, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 26, 570, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 210, 566, 10));

        tfS1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfS1.setMinimumSize(new java.awt.Dimension(4, 24));
        tfS1.setPreferredSize(new java.awt.Dimension(4, 24));
        jPanel1.add(tfS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 238, 206, -1));

        tfS2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfS2.setMinimumSize(new java.awt.Dimension(4, 24));
        tfS2.setPreferredSize(new java.awt.Dimension(4, 24));
        jPanel1.add(tfS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 238, 246, -1));

        tfS4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfS4.setMinimumSize(new java.awt.Dimension(4, 24));
        tfS4.setPreferredSize(new java.awt.Dimension(4, 24));
        jPanel1.add(tfS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 280, 246, -1));

        tfP1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfP1.setMinimumSize(new java.awt.Dimension(4, 24));
        tfP1.setPreferredSize(new java.awt.Dimension(4, 24));
        jPanel1.add(tfP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 322, 246, -1));

        tfP3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfP3.setMinimumSize(new java.awt.Dimension(4, 24));
        tfP3.setPreferredSize(new java.awt.Dimension(4, 24));
        jPanel1.add(tfP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 364, 246, -1));

        tfS3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfS3.setMinimumSize(new java.awt.Dimension(4, 24));
        tfS3.setPreferredSize(new java.awt.Dimension(4, 24));
        tfS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfS3ActionPerformed(evt);
            }
        });
        jPanel1.add(tfS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 206, -1));

        tfS5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfS5.setMinimumSize(new java.awt.Dimension(4, 24));
        tfS5.setPreferredSize(new java.awt.Dimension(4, 24));
        jPanel1.add(tfS5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 322, 206, -1));

        tfP2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfP2.setMinimumSize(new java.awt.Dimension(4, 24));
        tfP2.setPreferredSize(new java.awt.Dimension(4, 24));
        jPanel1.add(tfP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 364, 206, -1));
        jPanel1.add(tfAtkt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 240, -1));

        jLabel32.setText("SGPA:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 60, -1));
        jPanel1.add(tfSgpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 240, -1));

        jTabbedPane1.addTab("Students Info", jPanel1);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel17.setText("Subject and Faculty Details:");

        jLabel18.setText("Subject 2 Name: ");

        jLabel19.setText("Subject 3 Name: ");

        jLabel20.setText("Subject 4 Name: ");

        jLabel21.setText("Subject 1 Name: ");

        jLabel22.setText("Subject 5 Name: ");

        jLabel23.setText("Practical 1 Name:");

        jLabel24.setText("Practical 2 Name:");

        jLabel25.setText("Practical 3 Name:");

        jLabel26.setText("Faculty 2 Name:");

        jLabel27.setText("Faculty 1 Name:");

        jLabel28.setText("Faculty 3 Name:");

        jLabel29.setText("Faculty 5 Name:");

        jLabel31.setText("Faculty 4 Name:");

        saveSubjectInfoBtn.setText("Save Details");
        saveSubjectInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSubjectInfoBtnActionPerformed(evt);
            }
        });

        cbTeacherSem1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem 1", "Sem 2", "Sem 3", "Sem 4", "Sem 5", "Sem 6", "Sem 7", "Sem 8" }));
        cbTeacherSem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTeacherSem1ActionPerformed(evt);
            }
        });

        jLabel34.setText("Select Sem:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(s2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(s3Name, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(s4Name, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(s5Name, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(s1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p3Name, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel34))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbTeacherSem1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(f5Name, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(f4Name, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(f3Name, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(f2Name)
                                            .addComponent(f1Name, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(saveSubjectInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(jSeparator5))
                                .addGap(81, 81, 81)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(s1Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(f1Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(s2Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(f2Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(s3Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(f3Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(s4Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(f4Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(s5Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(f5Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(p1Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTeacherSem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(p2Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(saveSubjectInfoBtn))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(p3Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Subject Info", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSemActionPerformed

    private void tfS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfS3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfS3ActionPerformed

    private void saveStudentInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveStudentInfoBtnActionPerformed
        if(!tfName.getText().isEmpty() && !tfAtkt.getText().isEmpty() && !tfS1.getText().isEmpty() && 
                !tfS2.getText().isEmpty() && !tfS3.getText().isEmpty() && !tfS4.getText().isEmpty() &&
                !tfS5.getText().isEmpty() && !tfP1.getText().isEmpty() && !tfP2.getText().isEmpty() &&
                !tfP3.getText().isEmpty() && !tfS3.getText().isEmpty()){
            int outOf = 1;
            int total = Integer.parseInt(tfS1.getText()) + Integer.parseInt(tfS2.getText()) + Integer.parseInt(tfS3.getText()) +
                        Integer.parseInt(tfS4.getText()) + Integer.parseInt(tfS5.getText()) + Integer.parseInt(tfP1.getText()) +
                        Integer.parseInt(tfP2.getText()) + Integer.parseInt(tfP3.getText());
            
            if(Integer.parseInt(tfS5.getText())==0)
                outOf = 100 + 100 + 100 + 100 + 50 + 50 + 50;
            else
                outOf = 100 + 100 + 100 + 100 + 100 + 50 + 50 + 50;
            
            double percent = ((double)total/(double)outOf) * 100.0;
            
            DecimalFormat f = new DecimalFormat("##.00");
            percent = Double.valueOf(f.format(percent));
            String result;
            if( Integer.parseInt(tfS1.getText())<40 || Integer.parseInt(tfS2.getText())<40 || 
                Integer.parseInt(tfS3.getText())<40 || Integer.parseInt(tfS4.getText())<40 ||
                Integer.parseInt(tfS5.getText())<40){
                result = "Fail";
                tfAtkt.setText("N");
            }else{
                result = "Pass";
                tfAtkt.setText("Y");
            }
            h2.setName(tfName.getText());
            
            if(cbBranch.getSelectedItem().toString().equalsIgnoreCase("Computer Science Engineering"))
                h2.setBranch("CSE");
            else if(cbBranch.getSelectedItem().toString().equalsIgnoreCase("Mechanical Engineering"))
                h2.setBranch("MECH");
            else if(cbBranch.getSelectedItem().toString().equalsIgnoreCase("Civil Engineering"))
                h2.setBranch("CIVIL");
            else if(cbBranch.getSelectedItem().toString().equalsIgnoreCase("Electronics and Telecommunication Engineering"))
                h2.setBranch("ETC");
            h2.setS1(Integer.parseInt(tfS1.getText()));
            h2.setS2(Integer.parseInt(tfS2.getText()));
            h2.setS3(Integer.parseInt(tfS3.getText()));
            h2.setS4(Integer.parseInt(tfS4.getText()));
            h2.setS5(Integer.parseInt(tfS5.getText()));
            h2.setP1(Integer.parseInt(tfP1.getText()));
            h2.setP2(Integer.parseInt(tfP2.getText()));
            h2.setP3(Integer.parseInt(tfP3.getText()));
            h2.setAtkt(tfAtkt.getText());
            h2.setSgpa(Double.valueOf(tfSgpa.getText()));
            h2.setSem(cbSem.getSelectedIndex()+1);
            h2.setResult(result);
            h2.setTotal(total);
            h2.setPercent(percent);
            
            try {
                dbo.addStudentRow(h2);
            } catch (SQLException ex) {
                Logger.getLogger(InputFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            System.out.println("Enter all details!");
        }
    }//GEN-LAST:event_saveStudentInfoBtnActionPerformed

    private void radioYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioYesActionPerformed
        if(radioYes.isSelected()){
            examForm = true;
            radioNo.setSelected(false);
        }
    }//GEN-LAST:event_radioYesActionPerformed

    private void radioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoActionPerformed
        if(radioNo.isSelected()){
            examForm = false;
            radioYes.setSelected(false);
        }
    }//GEN-LAST:event_radioNoActionPerformed

    private void saveSubjectInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSubjectInfoBtnActionPerformed
        if(!s1Name.getText().isEmpty() && !s2Name.getText().isEmpty() && !s3Name.getText().isEmpty() && 
                !s4Name.getText().isEmpty() && !f1Name.getText().isEmpty() && !f2Name.getText().isEmpty() &&
                !f3Name.getText().isEmpty() && !f4Name.getText().isEmpty() && !p1Name.getText().isEmpty() &&
                !p1Name.getText().isEmpty() && !p1Name.getText().isEmpty()){
            
            
            ht.setF1(f1Name.getText());
            ht.setF2(f2Name.getText());
            ht.setF3(f3Name.getText());
            ht.setF4(f4Name.getText());
            ht.setF5(f5Name.getText());
            
            ht.setS1(s1Name.getText());
            ht.setS2(s2Name.getText());
            ht.setS3(s3Name.getText());
            ht.setS4(s4Name.getText());
            ht.setS5(s5Name.getText());
            
            ht.setP1(p1Name.getText());
            ht.setP2(p2Name.getText());
            ht.setP3(p3Name.getText());
            ht.setSem(cbTeacherSem1.getSelectedIndex()+1);
            try {
                dbo.addTeacherRow(ht);
            } catch (SQLException ex) {
                Logger.getLogger(InputFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            System.out.println("Enter all details!");
        }
    }//GEN-LAST:event_saveSubjectInfoBtnActionPerformed

    private void cbTeacherSem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTeacherSem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTeacherSem1ActionPerformed

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
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbBranch;
    private javax.swing.JComboBox<String> cbSem;
    private javax.swing.JComboBox<String> cbTeacherSem1;
    private javax.swing.JTextField f1Name;
    private javax.swing.JTextField f2Name;
    private javax.swing.JTextField f3Name;
    private javax.swing.JTextField f4Name;
    private javax.swing.JTextField f5Name;
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
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField p1Name;
    private javax.swing.JTextField p2Name;
    private javax.swing.JTextField p3Name;
    private javax.swing.JRadioButton radioNo;
    private javax.swing.JRadioButton radioYes;
    private javax.swing.JTextField s1Name;
    private javax.swing.JTextField s2Name;
    private javax.swing.JTextField s3Name;
    private javax.swing.JTextField s4Name;
    private javax.swing.JTextField s5Name;
    private javax.swing.JButton saveStudentInfoBtn;
    private javax.swing.JButton saveSubjectInfoBtn;
    private javax.swing.JTextField tfAtkt;
    private javax.swing.JTextField tfName;
    private javax.swing.JFormattedTextField tfP1;
    private javax.swing.JFormattedTextField tfP2;
    private javax.swing.JFormattedTextField tfP3;
    private javax.swing.JFormattedTextField tfS1;
    private javax.swing.JFormattedTextField tfS2;
    private javax.swing.JFormattedTextField tfS3;
    private javax.swing.JFormattedTextField tfS4;
    private javax.swing.JFormattedTextField tfS5;
    private javax.swing.JTextField tfSgpa;
    // End of variables declaration//GEN-END:variables
}
