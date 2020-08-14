/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

public class AbusoDeArmasVictima extends javax.swing.JFrame {
    
    public AbusoDeArmasVictima () {
        initComponents();
        this.setLocationRelativeTo(null);  // Se ejecuta en el medio de la pantalla
        
        mostrarEstado(false);
        mostrarTipoLesion(false);
        mostrarConsecuenciaLaboral(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelDatosVictima = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelDegrade1 = new javax.swing.JLabel();
        jLabelLogoUNLa = new javax.swing.JLabel();
        jTextFieldNombreApellido = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jLabelDNI = new javax.swing.JLabel();
        jLabelNombreApellido = new javax.swing.JLabel();
        jButtonSiguiente = new javax.swing.JButton();
        jLabelDegrade2 = new javax.swing.JLabel();
        jButtonConfirmarDatos = new javax.swing.JButton();
        jLabelEstadoVictima = new javax.swing.JLabel();
        jRadioButtonConVidaSinLesiones = new javax.swing.JRadioButton();
        jRadioButtonConVidaConLesiones = new javax.swing.JRadioButton();
        jRadioButtonFallecido = new javax.swing.JRadioButton();
        jLabelDegrade3 = new javax.swing.JLabel();
        jLabelDegrade4 = new javax.swing.JLabel();
        jLabelTipoLesion = new javax.swing.JLabel();
        jLabelDegrade5 = new javax.swing.JLabel();
        jComboBoxTipoLesion = new javax.swing.JComboBox<>();
        jLabelDegrade6 = new javax.swing.JLabel();
        jComboBoxConsecuenciaLaboral = new javax.swing.JComboBox<>();
        jLabelDegrade7 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("TFL"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 2, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("DETERMINADOR DE SANCIONES PARA DELITOS CONTRA LAS PERSONAS, EL HONOR Y LA INTEGRIDAD SEXUAL");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 17, 720, 20));

        jLabelDatosVictima.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelDatosVictima.setText("Ingrese los datos de la víctima:");
        getContentPane().add(jLabelDatosVictima, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 20));

        jLabelEdad.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEdad.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelEdad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEdad.setText("Edad:");
        getContentPane().add(jLabelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        jLabelDegrade1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelDegrade1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade1.png"))); // NOI18N
        getContentPane().add(jLabelDegrade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 840, 40));

        jLabelLogoUNLa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconUNLa30x30.png"))); // NOI18N
        jLabelLogoUNLa.setText("jLabel1");
        getContentPane().add(jLabelLogoUNLa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jTextFieldNombreApellido.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldNombreApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 270, 30));

        jTextFieldDNI.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIActionPerformed(evt);
            }
        });
        jTextFieldDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDNIKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 100, 30));

        jTextFieldEdad.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEdadKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 90, 30));

        jLabelDNI.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDNI.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelDNI.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDNI.setText("DNI:");
        getContentPane().add(jLabelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jLabelNombreApellido.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombreApellido.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNombreApellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreApellido.setText("Nombre y apellido:");
        getContentPane().add(jLabelNombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jButtonSiguiente.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.setEnabled(false);
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, 150, 50));

        jLabelDegrade2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade2.jpg"))); // NOI18N
        jLabelDegrade2.setText("jLabel1");
        getContentPane().add(jLabelDegrade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 540, 110));

        jButtonConfirmarDatos.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButtonConfirmarDatos.setText("Confirmar datos");
        jButtonConfirmarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 170, 50));

        jLabelEstadoVictima.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelEstadoVictima.setText("Indique el estado de la víctima:");
        getContentPane().add(jLabelEstadoVictima, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 20));

        buttonGroup1.add(jRadioButtonConVidaSinLesiones);
        jRadioButtonConVidaSinLesiones.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRadioButtonConVidaSinLesiones.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonConVidaSinLesiones.setText("Con vida, sin lesiones");
        jRadioButtonConVidaSinLesiones.setContentAreaFilled(false);
        jRadioButtonConVidaSinLesiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonConVidaSinLesionesActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonConVidaSinLesiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        buttonGroup1.add(jRadioButtonConVidaConLesiones);
        jRadioButtonConVidaConLesiones.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRadioButtonConVidaConLesiones.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonConVidaConLesiones.setText("Con vida, con lesiones");
        jRadioButtonConVidaConLesiones.setContentAreaFilled(false);
        jRadioButtonConVidaConLesiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonConVidaConLesionesActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonConVidaConLesiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        buttonGroup1.add(jRadioButtonFallecido);
        jRadioButtonFallecido.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRadioButtonFallecido.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonFallecido.setText("Fallecido");
        jRadioButtonFallecido.setContentAreaFilled(false);
        jRadioButtonFallecido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFallecidoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonFallecido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        jLabelDegrade3.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelDegrade3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade1.png"))); // NOI18N
        getContentPane().add(jLabelDegrade3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 840, 40));

        jLabelDegrade4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade2.jpg"))); // NOI18N
        jLabelDegrade4.setText("jLabel1");
        getContentPane().add(jLabelDegrade4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 500, 30));

        jLabelTipoLesion.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelTipoLesion.setText("Indique la consecuencia que generó la lesión:");
        getContentPane().add(jLabelTipoLesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 20));

        jLabelDegrade5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelDegrade5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade1.png"))); // NOI18N
        getContentPane().add(jLabelDegrade5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 840, 40));

        jComboBoxTipoLesion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBoxTipoLesion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de lesión", "Debilitación permanente de la salud", "Debilitación permanente de un sentido", "Debilitación permanente de un órgano", "Debilitación permanente de un miembro", "Dificultad permanente de la palabra", "Puesta en riesgo de la vida", "Deformación permanente en el rostro", "Enfermedad mental, cierta o probablemente incurable", "Enfermedad corporal, cierta o probablemente incurable", "Pérdida de un sentido", "Pérdida de un órgano", "Pérdida de un miembro", "Pérdida del uso de un órgano o miembro", "Pérdida de la palabra", "Pérdida de la capacidad de engendrar o concebir", "Daño en el cuerpo o en la salud", "Descripción por consecuencia laboral", "Otro daño no mencionado" }));
        jComboBoxTipoLesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoLesionActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTipoLesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 530, -1));

        jLabelDegrade6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade2.jpg"))); // NOI18N
        jLabelDegrade6.setText("jLabel1");
        getContentPane().add(jLabelDegrade6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 550, 50));

        jComboBoxConsecuenciaLaboral.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBoxConsecuenciaLaboral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la consecuencia laboral", "Inutilización laboral por más de un mes", "Inutilidad laboral permanente" }));
        jComboBoxConsecuenciaLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxConsecuenciaLaboralActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxConsecuenciaLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 340, -1));

        jLabelDegrade7.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabelDegrade7.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDegrade7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade2.jpg"))); // NOI18N
        getContentPane().add(jLabelDegrade7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 360, 50));

        jLabelFondo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 740));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarEstado(boolean mostrar) {
        jLabelDegrade3.setVisible(mostrar);
        jLabelEstadoVictima.setVisible(mostrar);
        jLabelDegrade4.setVisible(mostrar);
        jRadioButtonConVidaSinLesiones.setVisible(mostrar);
        jRadioButtonConVidaConLesiones.setVisible(mostrar);
        jRadioButtonFallecido.setVisible(mostrar);
    }

    public void mostrarTipoLesion(boolean mostrar) {
        jLabelDegrade5.setVisible(mostrar);
        jLabelTipoLesion.setVisible(mostrar);
        jLabelDegrade6.setVisible(mostrar);
        jComboBoxTipoLesion.setVisible(mostrar);
    }
    
    public void mostrarConsecuenciaLaboral(boolean mostrar) {
        jLabelDegrade7.setVisible(mostrar);
        jComboBoxConsecuenciaLaboral.setVisible(mostrar);    
    }
    
    public void resetearConsecuenciaLaboral() {
        jComboBoxConsecuenciaLaboral.setSelectedItem("Seleccione la consecuencia laboral");
    }
    
    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        if (jRadioButtonConVidaSinLesiones.isSelected()) { 
            Condena a = new Condena();
            a.setVisible(true);
            this.setVisible(false);
        }
        if (jRadioButtonConVidaConLesiones.isSelected()) {
            AbusoDeArmasLesion a = new AbusoDeArmasLesion();
            a.setVisible(true);
            this.setVisible(false);            
        }
        if (jRadioButtonFallecido.isSelected()) {
            AbusoDeArmasHomicidio a = new AbusoDeArmasHomicidio();
            a.setVisible(true);
            this.setVisible(false);            
        }
        
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jTextFieldNombreApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreApellidoActionPerformed
    
    private void jButtonConfirmarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarDatosActionPerformed

        if ((!jTextFieldNombreApellido.getText().isEmpty()) && (!jTextFieldDNI.getText().isEmpty()) && (!jTextFieldEdad.getText().isEmpty())) {
            jButtonConfirmarDatos.setVisible(false);
            mostrarEstado(true);
            jTextFieldNombreApellido.setEnabled(false);
            jTextFieldDNI.setEnabled(false);
            jTextFieldEdad.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonConfirmarDatosActionPerformed

    private void jRadioButtonConVidaSinLesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonConVidaSinLesionesActionPerformed
        if (jRadioButtonConVidaSinLesiones.isSelected()) {
            jButtonSiguiente.setEnabled(true);
            mostrarTipoLesion(false);
            mostrarConsecuenciaLaboral(false);
            jComboBoxTipoLesion.setSelectedItem("Seleccione el tipo de lesión");
        }
    }//GEN-LAST:event_jRadioButtonConVidaSinLesionesActionPerformed

    private void jRadioButtonConVidaConLesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonConVidaConLesionesActionPerformed
        if (jRadioButtonConVidaConLesiones.isSelected()) {
            mostrarTipoLesion(true);
            jComboBoxTipoLesion.setSelectedItem("Seleccione el tipo de lesión");
            jButtonSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButtonConVidaConLesionesActionPerformed

    private void jRadioButtonFallecidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFallecidoActionPerformed
        if (jRadioButtonFallecido.isSelected()) {
            jButtonSiguiente.setEnabled(true);
            mostrarTipoLesion(false);
            mostrarConsecuenciaLaboral(false);
            jComboBoxTipoLesion.setSelectedItem("Seleccione el tipo de lesión");
        }
    }//GEN-LAST:event_jRadioButtonFallecidoActionPerformed

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void jTextFieldDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNIKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextFieldDNIKeyTyped

    private void jTextFieldEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEdadKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextFieldEdadKeyTyped

    private void jComboBoxTipoLesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoLesionActionPerformed
        if  ((((String)jComboBoxTipoLesion.getSelectedItem() != "Seleccione el tipo de lesión")) &&
            (((String)jComboBoxTipoLesion.getSelectedItem() != "Descripción por consecuencia laboral"))) {
            jButtonSiguiente.setEnabled(true);
            mostrarConsecuenciaLaboral(false);
        }
        if  (((String)jComboBoxTipoLesion.getSelectedItem() == "Descripción por consecuencia laboral")) {
            mostrarConsecuenciaLaboral(true);
            jButtonSiguiente.setEnabled(false);
            resetearConsecuenciaLaboral();
        }
        if  ((jRadioButtonConVidaConLesiones.isSelected()) &&
            ((String)jComboBoxTipoLesion.getSelectedItem() == "Seleccione el tipo de lesión")) {
            jButtonSiguiente.setEnabled(false);            
        }
    }//GEN-LAST:event_jComboBoxTipoLesionActionPerformed

    private void jComboBoxConsecuenciaLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxConsecuenciaLaboralActionPerformed
        if (((String)jComboBoxConsecuenciaLaboral.getSelectedItem() != "Seleccione la consecuencia laboral")) {
            jButtonSiguiente.setEnabled(true);
        }
        if (((String)jComboBoxConsecuenciaLaboral.getSelectedItem() == "Seleccione la consecuencia laboral")) {
            jButtonSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxConsecuenciaLaboralActionPerformed
    
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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }
    
    public static String getNombreApellido() {
        return (String)jTextFieldNombreApellido.getText();
    }
    
    public static int getDNI() {
        return Integer.parseInt(jTextFieldDNI.getText());
    }
    
    public static int getEdad() {
        return Integer.parseInt(jTextFieldEdad.getText());
    }

    public static String getEstado() {
        String resultado = "";
        if (jRadioButtonConVidaSinLesiones.isSelected()) {
            resultado = "Con vida, sin lesiones";
        }
        if (jRadioButtonConVidaConLesiones.isSelected()) {
            resultado = "Con vida, con lesiones";
        }
        if (jRadioButtonFallecido.isSelected()) {
            resultado = "Fallecido";
        }
        return resultado;
    }   

    public static String getTipoLesion() {
        String resultado = "";
        if ((String)jComboBoxTipoLesion.getSelectedItem() != "Seleccione el tipo de lesión") {
            resultado = (String)jComboBoxTipoLesion.getSelectedItem();
        }

        switch (resultado) {   
            case "Debilitación permanente de la salud":
                resultado = "Debilitacion permanente de la salud, de un sentido, de un organo, de un miembro o dificultad permanente de la palabra";
                break;                
            case "Debilitación permanente de un sentido":
                resultado = "Debilitacion permanente de la salud, de un sentido, de un organo, de un miembro o dificultad permanente de la palabra";
                break;                
            case "Debilitación permanente de un órgano":
                resultado = "Debilitacion permanente de la salud, de un sentido, de un organo, de un miembro o dificultad permanente de la palabra";
                break;                
            case "Debilitación permanente de un miembro":
                resultado = "Debilitacion permanente de la salud, de un sentido, de un organo, de un miembro o dificultad permanente de la palabra";
                break;                
            case "Dificultad permanente de la palabra":
                resultado = "Debilitacion permanente de la salud, de un sentido, de un organo, de un miembro o dificultad permanente de la palabra";
                break;   
            case "Enfermedad mental, cierta o probablemente incurable":
                resultado = "Enfermedad mental o corporal, cierta o probablemente incurable";
                break;  
            case "Enfermedad corporal, cierta o probablemente incurable":
                resultado = "Enfermedad mental o corporal, cierta o probablemente incurable";
                break;                  
        
            case "Descripción por consecuencia laboral":
                if ((String)jComboBoxConsecuenciaLaboral.getSelectedItem() == "Inutilización laboral por más de un mes") {
                    resultado = "Inutilizacion laboral por mas de un mes";
                }
                if ((String)jComboBoxConsecuenciaLaboral.getSelectedItem() == "Inutilidad laboral permanente") {
                    resultado = "Inutilidad laboral permanente";
                }                    
                break;                
            
            case "Deformación permanente en el rostro":
                resultado = "Deformacion permanente en el rostro";
                break;                

            case "Pérdida de un sentido":
                resultado = "Perdida de un sentido, de un organo, de un miembro, del uso de un organo o miembro, de la palabra o de la capacidad de engendrar o concebir";
                break;                
            case "Pérdida de un órgano":
                resultado = "Perdida de un sentido, de un organo, de un miembro, del uso de un organo o miembro, de la palabra o de la capacidad de engendrar o concebir";
                break;                
            case "Pérdida de un miembro":
                resultado = "Perdida de un sentido, de un organo, de un miembro, del uso de un organo o miembro, de la palabra o de la capacidad de engendrar o concebir";
                break;                
            case "Pérdida del uso de un órgano o miembro":
                resultado = "Perdida de un sentido, de un organo, de un miembro, del uso de un organo o miembro, de la palabra o de la capacidad de engendrar o concebir";
                break;                
            case "Pérdida de la palabra":
                resultado = "Perdida de un sentido, de un organo, de un miembro, del uso de un organo o miembro, de la palabra o de la capacidad de engendrar o concebir";
                break;                
            case "Pérdida de la capacidad de engendrar o concebir":
                resultado = "Perdida de un sentido, de un organo, de un miembro, del uso de un organo o miembro, de la palabra o de la capacidad de engendrar o concebir";
                break;                

            case "Daño en el cuerpo o en la salud":
                resultado = "Danio en el cuerpo o en la salud";
                break;                
            case "Otro daño no mencionado":
                resultado = "Otro danio no mencionado";
                break;     
                
        }
        return resultado;
    }        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonConfirmarDatos;
    private javax.swing.JButton jButtonSiguiente;
    private static javax.swing.JComboBox<String> jComboBoxConsecuenciaLaboral;
    private static javax.swing.JComboBox<String> jComboBoxTipoLesion;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelDatosVictima;
    private javax.swing.JLabel jLabelDegrade1;
    private javax.swing.JLabel jLabelDegrade2;
    private javax.swing.JLabel jLabelDegrade3;
    private javax.swing.JLabel jLabelDegrade4;
    private javax.swing.JLabel jLabelDegrade5;
    private javax.swing.JLabel jLabelDegrade6;
    private javax.swing.JLabel jLabelDegrade7;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelEstadoVictima;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogoUNLa;
    private javax.swing.JLabel jLabelNombreApellido;
    private javax.swing.JLabel jLabelTipoLesion;
    private javax.swing.JLabel jLabelTitulo;
    private static javax.swing.JRadioButton jRadioButtonConVidaConLesiones;
    private static javax.swing.JRadioButton jRadioButtonConVidaSinLesiones;
    private static javax.swing.JRadioButton jRadioButtonFallecido;
    private static javax.swing.JTextField jTextFieldDNI;
    private static javax.swing.JTextField jTextFieldEdad;
    private static javax.swing.JTextField jTextFieldNombreApellido;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
