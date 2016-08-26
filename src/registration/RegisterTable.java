/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;
import java.sql.*;
import javax.swing.*;
import java.awt.print.*;
import java.text.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Posakya
 */
public class RegisterTable extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form RegisterTable
     */
    public RegisterTable() {
        initComponents();
        conn=JavaConnect.connector1();
        Update_table();
        CurrentDate();
        CurrentTime();
    }
     public void Update_table(){
       try{  String sql="select * from register";
       
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            jregistertable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jregister = new javax.swing.JLabel();
        jid = new javax.swing.JLabel();
        jfirstname = new javax.swing.JLabel();
        jsurname = new javax.swing.JLabel();
        jusername = new javax.swing.JLabel();
        jemail = new javax.swing.JLabel();
        jpassword = new javax.swing.JLabel();
        jdob = new javax.swing.JLabel();
        jaddress = new javax.swing.JLabel();
        jphone = new javax.swing.JLabel();
        jfaculty = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        txt_DOB = new javax.swing.JTextField();
        txt_Address = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_faculty = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jinsert = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jclear = new javax.swing.JButton();
        jprint = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jdate = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        jtime = new javax.swing.JLabel();
        txt_time = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jregistertable = new javax.swing.JTable();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jregister.setBackground(new java.awt.Color(151, 42, 47));
        jregister.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jregister.setText("REGISTER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jregister)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jregister, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jid.setText("  ID");

        jfirstname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfirstname.setText("  First Name");

        jsurname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jsurname.setText("  Sur Name");

        jusername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jusername.setText("  User Name");

        jemail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jemail.setText("  Email");

        jpassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jpassword.setText("  Password");

        jdob.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jdob.setText("  DOB");

        jaddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jaddress.setText("  Address");

        jphone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jphone.setText("  Phone");

        jfaculty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfaculty.setText("  Faculty");

        txt_surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_surnameActionPerformed(evt);
            }
        });

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        txt_faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_facultyActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 255, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jinsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration/save.png"))); // NOI18N
        jinsert.setText("Insert");
        jinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinsertActionPerformed(evt);
            }
        });

        jupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration/update.png"))); // NOI18N
        jupdate.setText("Update");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });

        jdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration/delete.png"))); // NOI18N
        jdelete.setText("Delete");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });

        jclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration/clear.png"))); // NOI18N
        jclear.setText("Clear");
        jclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclearActionPerformed(evt);
            }
        });

        jprint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration/print.png"))); // NOI18N
        jprint.setText("Print");
        jprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprintActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration/xit.png"))); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jinsert, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jclear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdelete, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jinsert, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jclear, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jdate.setText("  Date");

        txt_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dateActionPerformed(evt);
            }
        });

        jtime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtime.setText("  Time");

        jPanel4.setBackground(new java.awt.Color(157, 24, 20));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRATION TABLE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), java.awt.Color.white)); // NOI18N
        jPanel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jregistertable.setModel(new javax.swing.table.DefaultTableModel(
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
        jregistertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jregistertableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jregistertable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(jfirstname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jsurname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jusername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jpassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jaddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jphone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jfaculty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_phone)
                                    .addComponent(txt_faculty)
                                    .addComponent(txt_password)
                                    .addComponent(txt_email)
                                    .addComponent(txt_DOB)
                                    .addComponent(txt_username)
                                    .addComponent(txt_surname)
                                    .addComponent(txt_firstname)
                                    .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(txt_Address)
                                    .addComponent(txt_date)
                                    .addComponent(txt_time))))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jaddress, jdob, jemail, jfirstname, jid, jpassword, jphone, jsurname, jusername});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_Address, txt_DOB, txt_email, txt_faculty, txt_firstname, txt_id, txt_password, txt_phone, txt_surname, txt_username});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jid, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(txt_id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jfirstname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_firstname))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jsurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_surname))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_email))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpassword))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdob)
                            .addComponent(txt_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jaddress)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jphone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_phone))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_time, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGap(11, 19, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jaddress, jdob, jemail, jfirstname, jid, jpassword, jphone, jsurname, jusername});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_DOB, txt_faculty, txt_password});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinsertActionPerformed
        try{
            String sql="insert into register (ID ,First_Name,Sur_Name,User_Name,Email,Password,DOB,Address,Phone,Faculty,Date,Time) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_id.getText());
            pst.setString(2,txt_firstname.getText());
            pst.setString(3,txt_surname.getText());
            pst.setString(4,txt_username.getText());
            pst.setString(5,txt_email.getText());
            pst.setString(6,txt_password.getText());
            pst.setString(7,txt_DOB.getText());
            pst.setString(8,txt_Address.getText());
            pst.setString(9,txt_phone.getText());
            pst.setString(10,txt_faculty.getText());
            pst.setString(11,txt_date.getText());
            pst.setString(12,txt_time.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Date Inserted");
           
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        Update_table();

    }//GEN-LAST:event_jinsertActionPerformed

    private void txt_facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_facultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_facultyActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_surnameActionPerformed

    public void CurrentDate(){
         GregorianCalendar c=new GregorianCalendar();
        int day=c.get(Calendar.DAY_OF_MONTH);
        int month=c.get(Calendar.MONTH);
        int year=c.get(Calendar.YEAR);
        String date = +day+"/"+(month+1)+"/"+year;
        txt_date.setText(String.valueOf(date));
    }
public void CurrentTime(){
         GregorianCalendar c=new GregorianCalendar();
       int second=c.get(Calendar.SECOND);
       int hour=c.get(Calendar.HOUR_OF_DAY);
        int minute=c.get(Calendar.MINUTE);
        String time=+hour+" : "+minute+" : "+second;
        txt_time.setText(String.valueOf(time));
    }
    private void jprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprintActionPerformed
        MessageFormat Header=new MessageFormat("Report Print");
        MessageFormat Footer=new MessageFormat("Page {0,number,integer} ");
        try{
            jregistertable.print(JTable.PrintMode.NORMAL,Header,Footer);
        }catch(java.awt.print.PrinterException e){
            System.err.format("Cannot Print %s%n",e.getMessage());
            
        }
        
    }//GEN-LAST:event_jprintActionPerformed

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
      
   int p = JOptionPane.showConfirmDialog(null,"Do you want to delete?","Delete",JOptionPane.YES_NO_OPTION);
      if (p==0){
          String sql="delete from register where ID=?";
          
          try{
          pst=conn.prepareStatement(sql);
          pst.setString(1,txt_id.getText());
          pst.execute();
          JOptionPane.showMessageDialog(null,"Data Deleted");     
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
          
      }
      Update_table();
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
        String value1=txt_id.getText();
        String value2=txt_firstname.getText();
        String value3=txt_surname.getText();
        String value4=txt_username.getText();
        String value5=txt_email.getText();
        String value6=txt_password.getText();
        String value7=txt_DOB.getText();
        String value8=txt_Address.getText();
        String value9=txt_phone.getText();
        String value10=txt_faculty.getText();
        String value11=txt_date.getText();
        String value12=txt_time.getText();
        
        String sql="update register set ID='"+value1+"',First_Name='"+value2+"',Sur_Name='"+value3+"',User_Name='"+value4+"',Email='"+value5+"',Password='"+value6+"',DOB='"+value7+"',Address='"+value8+"',Phone='"+value9+"',Faculty='"+value10+"',Date='"+value11+"',Time='"+value12+"' where ID='"+value1+"'";
                
         try{
             pst=conn.prepareStatement(sql);
             pst.execute();
             JOptionPane.showMessageDialog(null,"Data Updated");
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }    
         Update_table();
    }//GEN-LAST:event_jupdateActionPerformed

    private void jregistertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jregistertableMouseClicked
       try{
           int row=jregistertable.getSelectedRow();
           String s=(jregistertable.getModel().getValueAt(row,0).toString());
           String sql="select * from register where ID='"+s+"'";
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           if(rs.next()){
               String add1=rs.getString("ID");
               txt_id.setText(add1);
               String add2=rs.getString("First_Name");
               txt_firstname.setText(add2);
               String add3=rs.getString("Sur_Name");
               txt_surname.setText(add3);
               String add4=rs.getString("User_Name");
               txt_username.setText(add4);
               String add5=rs.getString("Email");
               txt_email.setText(add5);
               String add6=rs.getString("Password");
               txt_password.setText(add6);
               String add7=rs.getString("DOB");
               txt_DOB.setText(add7);
               String add8=rs.getString("Address");
               txt_Address.setText(add8);
               String add9=rs.getString("Phone");
               txt_phone.setText(add9);
               String add10=rs.getString("Faculty");
               txt_faculty.setText(add10);
               String add11=rs.getString("Date");
               txt_date.setText(add11);
               String add12=rs.getString("Time");
               txt_time.setText(add12);
               //date auto update  
                GregorianCalendar c=new GregorianCalendar();
       int day=c.get(Calendar.DAY_OF_MONTH);
       int month=c.get(Calendar.MONTH);
       int year=c.get(Calendar.YEAR);
        String date = +day+"/"+(month+1)+"/"+year;
        txt_date.setText(String.valueOf(date));
               //time auto update
       int second=c.get(Calendar.SECOND);
       int hour=c.get(Calendar.HOUR_OF_DAY);
        int minute=c.get(Calendar.MINUTE);
        String time=+hour+" : "+minute+" : "+second;
        txt_time.setText(String.valueOf(time));
           }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
       Update_table();
       
    }//GEN-LAST:event_jregistertableMouseClicked

    private void jclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclearActionPerformed
        txt_id.setText("");
        txt_firstname.setText("");
        txt_surname.setText("");
        txt_username.setText("");
        txt_email.setText("");
        txt_password.setText("");
        txt_DOB.setText("");
        txt_Address.setText("");
        txt_phone.setText("");
        txt_faculty.setText("");
        txt_date.setText("");
        txt_time.setText("");
    }//GEN-LAST:event_jclearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dateActionPerformed
      
    }//GEN-LAST:event_txt_dateActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jaddress;
    private javax.swing.JButton jclear;
    private javax.swing.JLabel jdate;
    private javax.swing.JButton jdelete;
    private javax.swing.JLabel jdob;
    private javax.swing.JLabel jemail;
    private javax.swing.JLabel jfaculty;
    private javax.swing.JLabel jfirstname;
    private javax.swing.JLabel jid;
    private javax.swing.JButton jinsert;
    private javax.swing.JLabel jpassword;
    private javax.swing.JLabel jphone;
    private javax.swing.JButton jprint;
    private javax.swing.JLabel jregister;
    private javax.swing.JTable jregistertable;
    private javax.swing.JLabel jsurname;
    private javax.swing.JLabel jtime;
    private javax.swing.JButton jupdate;
    private javax.swing.JLabel jusername;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_DOB;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_faculty;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_time;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    
}
