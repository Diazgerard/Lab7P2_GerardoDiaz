/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_gerardodiaz;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gerar
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jf_Sign = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jb_Artista = new javax.swing.JButton();
        jb_Cliente = new javax.swing.JButton();
        jd_signC = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_usuarioC = new javax.swing.JTextField();
        pf_contraC = new javax.swing.JPasswordField();
        jb_GuardarC = new javax.swing.JButton();
        tt_edadC = new javax.swing.JTextField();
        jd_signA = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_usuarioA = new javax.swing.JTextField();
        pf_contraA = new javax.swing.JPasswordField();
        tt_edadA = new javax.swing.JTextField();
        jb_GuardarA = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tf_nombreA = new javax.swing.JTextField();
        jb_spotify = new javax.swing.JLabel();
        jb_pic = new javax.swing.JLabel();
        jb_Sign = new javax.swing.JButton();
        jb_Login = new javax.swing.JButton();

        jf_Sign.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Swis721 Hv BT", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Spotify");

        jb_Artista.setBackground(new java.awt.Color(0, 0, 0));
        jb_Artista.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jb_Artista.setForeground(new java.awt.Color(102, 255, 51));
        jb_Artista.setText("Artista");
        jb_Artista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ArtistaMouseClicked(evt);
            }
        });

        jb_Cliente.setBackground(new java.awt.Color(0, 0, 0));
        jb_Cliente.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jb_Cliente.setForeground(new java.awt.Color(102, 255, 0));
        jb_Cliente.setText("Cliente");
        jb_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jf_SignLayout = new javax.swing.GroupLayout(jf_Sign.getContentPane());
        jf_Sign.getContentPane().setLayout(jf_SignLayout);
        jf_SignLayout.setHorizontalGroup(
            jf_SignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_SignLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_SignLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_Artista, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jf_SignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jf_SignLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jb_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(392, Short.MAX_VALUE)))
        );
        jf_SignLayout.setVerticalGroup(
            jf_SignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_SignLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jb_Artista, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jf_SignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_SignLayout.createSequentialGroup()
                    .addContainerGap(227, Short.MAX_VALUE)
                    .addComponent(jb_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)))
        );

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Swis721 Hv BT", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Spotify");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contrasenia");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Edad");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Usuario");

        tf_usuarioC.setBackground(new java.awt.Color(0, 0, 0));
        tf_usuarioC.setForeground(new java.awt.Color(102, 255, 51));

        pf_contraC.setBackground(new java.awt.Color(0, 0, 0));
        pf_contraC.setForeground(new java.awt.Color(102, 255, 0));

        jb_GuardarC.setBackground(new java.awt.Color(0, 0, 0));
        jb_GuardarC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb_GuardarC.setForeground(new java.awt.Color(102, 255, 51));
        jb_GuardarC.setText("Guardar");
        jb_GuardarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_GuardarCMouseClicked(evt);
            }
        });

        tt_edadC.setBackground(new java.awt.Color(0, 0, 0));
        tt_edadC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tt_edadC.setForeground(new java.awt.Color(153, 255, 51));
        tt_edadC.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jd_signCLayout = new javax.swing.GroupLayout(jd_signC.getContentPane());
        jd_signC.getContentPane().setLayout(jd_signCLayout);
        jd_signCLayout.setHorizontalGroup(
            jd_signCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_signCLayout.createSequentialGroup()
                .addGroup(jd_signCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_signCLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_signCLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jd_signCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_GuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_signCLayout.createSequentialGroup()
                                .addGroup(jd_signCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jd_signCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_usuarioC)
                                    .addComponent(pf_contraC)
                                    .addComponent(tt_edadC, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jd_signCLayout.setVerticalGroup(
            jd_signCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_signCLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jd_signCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_usuarioC)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_signCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pf_contraC, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jd_signCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tt_edadC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_GuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Swis721 Hv BT", 1, 60)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Spotify");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 255, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Usuario");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Contrasenia");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 255, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Edad");

        tf_usuarioA.setBackground(new java.awt.Color(0, 0, 0));
        tf_usuarioA.setForeground(new java.awt.Color(102, 255, 51));
        tf_usuarioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_usuarioAActionPerformed(evt);
            }
        });

        pf_contraA.setBackground(new java.awt.Color(0, 0, 0));
        pf_contraA.setForeground(new java.awt.Color(102, 255, 0));

        tt_edadA.setBackground(new java.awt.Color(0, 0, 0));
        tt_edadA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tt_edadA.setForeground(new java.awt.Color(153, 255, 51));
        tt_edadA.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jb_GuardarA.setBackground(new java.awt.Color(0, 0, 0));
        jb_GuardarA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb_GuardarA.setForeground(new java.awt.Color(102, 255, 51));
        jb_GuardarA.setText("Guardar");
        jb_GuardarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_GuardarAMouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 255, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Nombre Artistico");

        tf_nombreA.setBackground(new java.awt.Color(0, 0, 0));
        tf_nombreA.setForeground(new java.awt.Color(102, 255, 51));
        tf_nombreA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_signALayout = new javax.swing.GroupLayout(jd_signA.getContentPane());
        jd_signA.getContentPane().setLayout(jd_signALayout);
        jd_signALayout.setHorizontalGroup(
            jd_signALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_signALayout.createSequentialGroup()
                .addGroup(jd_signALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_signALayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_signALayout.createSequentialGroup()
                        .addGroup(jd_signALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_signALayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_signALayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_signALayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jd_signALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pf_contraA, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tt_edadA, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_usuarioA, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_nombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_signALayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jb_GuardarA, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jd_signALayout.setVerticalGroup(
            jd_signALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_signALayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_signALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_usuarioA, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_signALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_contraA, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jd_signALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tt_edadA, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jb_GuardarA, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jb_spotify.setBackground(new java.awt.Color(0, 0, 0));
        jb_spotify.setFont(new java.awt.Font("Swis721 Hv BT", 1, 60)); // NOI18N
        jb_spotify.setForeground(new java.awt.Color(51, 255, 0));
        jb_spotify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jb_spotify.setText("Spotify");

        jb_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab7p2_gerardodiaz/Spotify.png"))); // NOI18N
        jb_pic.setText("jLabel2");

        jb_Sign.setBackground(new java.awt.Color(0, 0, 0));
        jb_Sign.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb_Sign.setForeground(new java.awt.Color(102, 255, 51));
        jb_Sign.setText("Sign Up");
        jb_Sign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_SignMouseClicked(evt);
            }
        });
        jb_Sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_SignActionPerformed(evt);
            }
        });

        jb_Login.setBackground(new java.awt.Color(0, 0, 0));
        jb_Login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb_Login.setForeground(new java.awt.Color(102, 255, 0));
        jb_Login.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_spotify, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_Sign, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jb_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_pic)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jb_spotify, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Sign, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_SignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_SignActionPerformed

    private void jb_SignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_SignMouseClicked
        // TODO add your handling code here:
        jf_Sign.setLocationRelativeTo(this);
        jf_Sign.pack();
        jf_Sign.setVisible(true);
    }//GEN-LAST:event_jb_SignMouseClicked

    private void jb_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ClienteMouseClicked
        // TODO add your handling code here:
        jd_signC.setModal(true);
        jd_signC.pack();
        jd_signC.setLocationRelativeTo(this);
        jd_signC.setVisible(true);
        
    }//GEN-LAST:event_jb_ClienteMouseClicked

    private void jb_GuardarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarCMouseClicked
        // TODO add your handling code here:
        Clientes cl = new Clientes();
        administrarUsuarios ap
                = new administrarUsuarios("./Usuarios.txt");
        ap.cargarArchivo();
        String usu, contra, method;
        int edad;
        
        usu = tf_usuarioC.getText();
        cl.setUsermane(usu);
        contra = pf_contraC.getText();
        cl.setContrasenia(contra);
        method = tt_edadC.getText();
        edad = Integer.parseInt(method);
        cl.setEdad(edad);
        
        Clientes c = new Clientes(usu, contra, edad);
        ap.getListaUsuarios().add(c);
        try {
            ap.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
         JOptionPane.showMessageDialog(this,
                "Se guardaron los datos");
        tf_usuarioC.setText("");
        pf_contraC.setText("");
        tt_edadC.setText("");
        jd_signC.dispose();;
        
        
                    
        
    }//GEN-LAST:event_jb_GuardarCMouseClicked

    private void jb_ArtistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ArtistaMouseClicked
        // TODO add your handling code here:
        jd_signA.setModal(true);
        jd_signA.pack();
        jd_signA.setLocationRelativeTo(this);
        jd_signA.setVisible(true);
    }//GEN-LAST:event_jb_ArtistaMouseClicked

    private void tf_usuarioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_usuarioAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_usuarioAActionPerformed

    private void jb_GuardarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarAMouseClicked
        // TODO add your handling code here:
        Artistas ar = new Artistas();
        administrarUsuarios ap
                = new administrarUsuarios("./Usuarios.txt");
        ap.cargarArchivo();
        String usu, contra, method, nombre;
        int edad;
        
        usu = tf_usuarioA.getText();
        ar.setUsermane(usu);
        contra = pf_contraA.getText();
        ar.setContrasenia(contra);
        method = tt_edadA.getText();
        edad = Integer.parseInt(method);
        ar.setEdad(edad);
        nombre = tf_nombreA.getText();
        ar.setNombre(nombre);
        
        
        Artistas a = new Artistas(nombre, usu, contra, edad);
        ap.getListaUsuarios().add(a);
        try {
            ap.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
         JOptionPane.showMessageDialog(this,
                "Se guardaron los datos");
        tf_usuarioA.setText("");
        pf_contraA.setText("");
        tt_edadA.setText("");
        tf_nombreA.setText("");
        jd_signA.dispose();
        
    }//GEN-LAST:event_jb_GuardarAMouseClicked

    private void tf_nombreAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreAActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jb_Artista;
    private javax.swing.JButton jb_Cliente;
    private javax.swing.JButton jb_GuardarA;
    private javax.swing.JButton jb_GuardarC;
    private javax.swing.JButton jb_Login;
    private javax.swing.JButton jb_Sign;
    private javax.swing.JLabel jb_pic;
    private javax.swing.JLabel jb_spotify;
    private javax.swing.JDialog jd_signA;
    private javax.swing.JDialog jd_signC;
    private javax.swing.JFrame jf_Sign;
    private javax.swing.JPasswordField pf_contraA;
    private javax.swing.JPasswordField pf_contraC;
    private javax.swing.JTextField tf_nombreA;
    private javax.swing.JTextField tf_usuarioA;
    private javax.swing.JTextField tf_usuarioC;
    private javax.swing.JTextField tt_edadA;
    private javax.swing.JTextField tt_edadC;
    // End of variables declaration//GEN-END:variables
}
