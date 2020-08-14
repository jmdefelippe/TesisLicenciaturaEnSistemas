/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

public class Prostitucion extends javax.swing.JFrame {
    
    public Prostitucion () {
        initComponents();
        this.setLocationRelativeTo(null);  // Se ejecuta en el medio de la pantalla

        mostrarDatosVictimario(false);
        mostrarRelacion(false);
        mostrarCircExt(false);
        mostrarDatosVictima(false);
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
        jLabelProcedimiento = new javax.swing.JLabel();
        jLabelDegrade1 = new javax.swing.JLabel();
        jLabelLogoUNLa = new javax.swing.JLabel();
        jComboBoxProcedimientos = new javax.swing.JComboBox<>();
        jLabelDegrade2 = new javax.swing.JLabel();
        jLabelConduccionCircExt = new javax.swing.JLabel();
        jButtonSiguiente = new javax.swing.JButton();
        jLabelDatosVictimario = new javax.swing.JLabel();
        jLabelDegrade3 = new javax.swing.JLabel();
        jLabelNombreApellidoVictimario = new javax.swing.JLabel();
        jTextFieldNombreApellidoVictimario = new javax.swing.JTextField();
        jTextFieldDNIVictimario = new javax.swing.JTextField();
        jLabelDNIVictimario = new javax.swing.JLabel();
        jLabelEdadVictimario = new javax.swing.JLabel();
        jTextFieldEdadVictimario = new javax.swing.JTextField();
        jLabelDegrade4 = new javax.swing.JLabel();
        jButtonConfirmarDatosVictimario = new javax.swing.JButton();
        jLabelRelacionConVictima = new javax.swing.JLabel();
        jLabelDegrade5 = new javax.swing.JLabel();
        jComboBoxRelaciones = new javax.swing.JComboBox<>();
        jLabelDegrade6 = new javax.swing.JLabel();
        jLabelFuncionarioPublico = new javax.swing.JLabel();
        jRadioButtonSi = new javax.swing.JRadioButton();
        jRadioButtonNo = new javax.swing.JRadioButton();
        jLabelDegrade7 = new javax.swing.JLabel();
        jLabelDatosVictima = new javax.swing.JLabel();
        jLabelDegrade8 = new javax.swing.JLabel();
        jLabelDegrade9 = new javax.swing.JLabel();
        jLabelNombreApellidoVictima = new javax.swing.JLabel();
        jTextFieldNombreApellidoVictima = new javax.swing.JTextField();
        jLabelDNIVictima = new javax.swing.JLabel();
        jTextFieldDNIVictima = new javax.swing.JTextField();
        jLabelEdadVictima = new javax.swing.JLabel();
        jTextFieldEdadVictima = new javax.swing.JTextField();
        jLabelDegrade10 = new javax.swing.JLabel();
        jButtonConfirmarDatosVictima = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(850, 700));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("TFL"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 2, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("DETERMINADOR DE SANCIONES PARA DELITOS CONTRA LAS PERSONAS, EL HONOR Y LA INTEGRIDAD SEXUAL");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 17, 720, 20));

        jLabelProcedimiento.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelProcedimiento.setText("Indique el procedimiento mediante el cual se realizó el delito:");
        getContentPane().add(jLabelProcedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 20));

        jLabelDegrade1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelDegrade1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade1.png"))); // NOI18N
        getContentPane().add(jLabelDegrade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 840, 40));

        jLabelLogoUNLa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconUNLa30x30.png"))); // NOI18N
        jLabelLogoUNLa.setText("jLabel1");
        getContentPane().add(jLabelLogoUNLa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jComboBoxProcedimientos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBoxProcedimientos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el procedimiento", "Engaño", "Fraude", "Violencia", "Amenaza", "Abuso de autoridad o de una situación de vulnerabilidad", "Concesión o recepción de pagos o beneficios para obtener el consentimiento de una persona que tenga autoridad sobre la víctima", "Otro medio de intimidación o coerción", "Ninguno de los anteriores" }));
        jComboBoxProcedimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProcedimientosActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxProcedimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabelDegrade2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade2.jpg"))); // NOI18N
        jLabelDegrade2.setText("jLabel1");
        getContentPane().add(jLabelDegrade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 770, 45));

        jLabelConduccionCircExt.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        getContentPane().add(jLabelConduccionCircExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 20));

        jButtonSiguiente.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.setEnabled(false);
        jButtonSiguiente.setMaximumSize(new java.awt.Dimension(39, 29));
        jButtonSiguiente.setMinimumSize(new java.awt.Dimension(39, 29));
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, 150, 50));

        jLabelDatosVictimario.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelDatosVictimario.setText("Ingrese los datos del victimario:");
        getContentPane().add(jLabelDatosVictimario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));

        jLabelDegrade3.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelDegrade3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade1.png"))); // NOI18N
        getContentPane().add(jLabelDegrade3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 840, 40));

        jLabelNombreApellidoVictimario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombreApellidoVictimario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNombreApellidoVictimario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreApellidoVictimario.setText("Nombre y apellido:");
        getContentPane().add(jLabelNombreApellidoVictimario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jTextFieldNombreApellidoVictimario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldNombreApellidoVictimario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreApellidoVictimarioActionPerformed(evt);
            }
        });
        jTextFieldNombreApellidoVictimario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreApellidoVictimarioKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldNombreApellidoVictimario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 270, 30));

        jTextFieldDNIVictimario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldDNIVictimario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIVictimarioActionPerformed(evt);
            }
        });
        jTextFieldDNIVictimario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDNIVictimarioKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldDNIVictimario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 100, 30));

        jLabelDNIVictimario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDNIVictimario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelDNIVictimario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDNIVictimario.setText("DNI:");
        getContentPane().add(jLabelDNIVictimario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jLabelEdadVictimario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEdadVictimario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelEdadVictimario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEdadVictimario.setText("Edad:");
        getContentPane().add(jLabelEdadVictimario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jTextFieldEdadVictimario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldEdadVictimario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEdadVictimarioKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldEdadVictimario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 90, 30));

        jLabelDegrade4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade2.jpg"))); // NOI18N
        jLabelDegrade4.setText("jLabel1");
        getContentPane().add(jLabelDegrade4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 235, 540, 80));

        jButtonConfirmarDatosVictimario.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButtonConfirmarDatosVictimario.setText("Confirmar datos");
        jButtonConfirmarDatosVictimario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarDatosVictimarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarDatosVictimario, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 170, 50));

        jLabelRelacionConVictima.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelRelacionConVictima.setText("Seleccione la relación del victimario con alguna de las víctimas:");
        getContentPane().add(jLabelRelacionConVictima, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 20));

        jLabelDegrade5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelDegrade5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade1.png"))); // NOI18N
        getContentPane().add(jLabelDegrade5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 840, 40));

        jComboBoxRelaciones.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBoxRelaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la relación", "Ascendente/Descendente", "Cónyuge", "Afín en línea recta", "Colateral o conviviente", "Tutor", "Curador", "Autoridad o ministro de cualquier culto reconocido o no", "Encargado de la educación o de la guarda de la víctima", "Otra" }));
        jComboBoxRelaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRelacionesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxRelaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabelDegrade6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade2.jpg"))); // NOI18N
        jLabelDegrade6.setText("jLabel1");
        getContentPane().add(jLabelDegrade6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 465, 50));

        jLabelFuncionarioPublico.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabelFuncionarioPublico.setText("¿El autor es funcionario público o miembro de una fuerza de una fuerza de seguridad, policial o penitenciaria?");
        getContentPane().add(jLabelFuncionarioPublico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, 20));

        buttonGroup1.add(jRadioButtonSi);
        jRadioButtonSi.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRadioButtonSi.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonSi.setText("Si");
        jRadioButtonSi.setContentAreaFilled(false);
        jRadioButtonSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSiActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 60, -1));

        buttonGroup1.add(jRadioButtonNo);
        jRadioButtonNo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRadioButtonNo.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonNo.setText("No");
        jRadioButtonNo.setContentAreaFilled(false);
        jRadioButtonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 60, -1));

        jLabelDegrade7.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelDegrade7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade1.png"))); // NOI18N
        getContentPane().add(jLabelDegrade7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 840, 40));

        jLabelDatosVictima.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelDatosVictima.setText("Ingrese los datos de la víctima:");
        getContentPane().add(jLabelDatosVictima, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, 20));

        jLabelDegrade8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade2.jpg"))); // NOI18N
        jLabelDegrade8.setText("jLabel1");
        getContentPane().add(jLabelDegrade8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 130, 30));

        jLabelDegrade9.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelDegrade9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade1.png"))); // NOI18N
        getContentPane().add(jLabelDegrade9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 840, 40));

        jLabelNombreApellidoVictima.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombreApellidoVictima.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNombreApellidoVictima.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreApellidoVictima.setText("Nombre y apellido:");
        getContentPane().add(jLabelNombreApellidoVictima, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

        jTextFieldNombreApellidoVictima.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldNombreApellidoVictima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreApellidoVictimaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombreApellidoVictima, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 270, 30));

        jLabelDNIVictima.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDNIVictima.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelDNIVictima.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDNIVictima.setText("DNI:");
        getContentPane().add(jLabelDNIVictima, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, -1, -1));

        jTextFieldDNIVictima.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldDNIVictima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIVictimaActionPerformed(evt);
            }
        });
        jTextFieldDNIVictima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDNIVictimaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldDNIVictima, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 100, 30));

        jLabelEdadVictima.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEdadVictima.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelEdadVictima.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEdadVictima.setText("Edad:");
        getContentPane().add(jLabelEdadVictima, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, -1, -1));

        jTextFieldEdadVictima.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldEdadVictima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEdadVictimaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldEdadVictima, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, 90, 30));

        jLabelDegrade10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degrade2.jpg"))); // NOI18N
        jLabelDegrade10.setText("jLabel1");
        getContentPane().add(jLabelDegrade10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 585, 540, 85));

        jButtonConfirmarDatosVictima.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButtonConfirmarDatosVictima.setText("Confirmar datos");
        jButtonConfirmarDatosVictima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarDatosVictimaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarDatosVictima, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 600, 170, 50));

        jLabelFondo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 740));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarDatosVictimario(boolean mostrar) {
        jLabelDegrade3.setVisible(mostrar);
        jLabelDatosVictimario.setVisible(mostrar);
        jLabelDegrade4.setVisible(mostrar);
        jLabelNombreApellidoVictimario.setVisible(mostrar);
        jTextFieldNombreApellidoVictimario.setVisible(mostrar);
        jLabelDNIVictimario.setVisible(mostrar);
        jTextFieldDNIVictimario.setVisible(mostrar);
        jLabelEdadVictimario.setVisible(mostrar);
        jTextFieldEdadVictimario.setVisible(mostrar);
        jButtonConfirmarDatosVictimario.setVisible(mostrar);        
    }
    
    public void mostrarRelacion(boolean mostrar) {
        jLabelDegrade5.setVisible(mostrar);
        jLabelRelacionConVictima.setVisible(mostrar);
        jLabelDegrade6.setVisible(mostrar);
        jComboBoxRelaciones.setVisible(mostrar);        
    }
    
    public void mostrarCircExt(boolean mostrar) {
        jLabelDegrade7.setVisible(mostrar);
        jLabelFuncionarioPublico.setVisible(mostrar);
        jLabelDegrade8.setVisible(mostrar);
        jRadioButtonSi.setVisible(mostrar);
        jRadioButtonNo.setVisible(mostrar);        
    }
    
    public void mostrarDatosVictima(boolean mostrar) {
        jLabelDegrade9.setVisible(mostrar);
        jLabelDatosVictima.setVisible(mostrar);
        jLabelDegrade10.setVisible(mostrar);
        jLabelNombreApellidoVictima.setVisible(mostrar);
        jTextFieldNombreApellidoVictima.setVisible(mostrar);
        jLabelDNIVictima.setVisible(mostrar);
        jTextFieldDNIVictima.setVisible(mostrar);
        jLabelEdadVictima.setVisible(mostrar);
        jTextFieldEdadVictima.setVisible(mostrar);
        jButtonConfirmarDatosVictima.setVisible(mostrar);        
    }
    
    private void jComboBoxProcedimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProcedimientosActionPerformed
        if (((String)jComboBoxProcedimientos.getSelectedItem() != "Seleccione el procedimiento") 
            && (jTextFieldNombreApellidoVictimario.isEnabled())) {
            mostrarDatosVictimario(true);
        }
        if (((String)jComboBoxProcedimientos.getSelectedItem() != "Seleccione el procedimiento") 
            && (!jTextFieldNombreApellidoVictimario.isEnabled())
            && ((String)jComboBoxRelaciones.getSelectedItem() != "Seleccione la relación")
            && ((jRadioButtonSi.isSelected()) || (jRadioButtonNo.isSelected()))
            && (!jTextFieldNombreApellidoVictima.isEnabled())) {
            jButtonSiguiente.setEnabled(true);
        }        
        if ((String)jComboBoxProcedimientos.getSelectedItem() == "Seleccione el procedimiento") {
            jButtonSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxProcedimientosActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        Condena a = new Condena();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jTextFieldNombreApellidoVictimarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreApellidoVictimarioActionPerformed

    }//GEN-LAST:event_jTextFieldNombreApellidoVictimarioActionPerformed

    private void jTextFieldNombreApellidoVictimarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreApellidoVictimarioKeyTyped
        //        char c = evt.getKeyChar();
        //        if ((c<'a' || c>'z' ) && (c<'A' || c>'Z') && (c==' ')) evt.consume();
    }//GEN-LAST:event_jTextFieldNombreApellidoVictimarioKeyTyped

    private void jTextFieldDNIVictimarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIVictimarioActionPerformed

    }//GEN-LAST:event_jTextFieldDNIVictimarioActionPerformed

    private void jTextFieldDNIVictimarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNIVictimarioKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextFieldDNIVictimarioKeyTyped

    private void jTextFieldEdadVictimarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEdadVictimarioKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextFieldEdadVictimarioKeyTyped

    private void jButtonConfirmarDatosVictimarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarDatosVictimarioActionPerformed
        if ((!jTextFieldNombreApellidoVictimario.getText().isEmpty()) && (!jTextFieldDNIVictimario.getText().isEmpty()) && (!jTextFieldEdadVictimario.getText().isEmpty())) {
            mostrarRelacion(true);
            jTextFieldNombreApellidoVictimario.setEnabled(false);
            jTextFieldDNIVictimario.setEnabled(false);
            jTextFieldEdadVictimario.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonConfirmarDatosVictimarioActionPerformed

    private void jComboBoxRelacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRelacionesActionPerformed
        if ((String)jComboBoxRelaciones.getSelectedItem() != "Seleccione la relación") {
            mostrarCircExt(true);
        }
        if (((String)jComboBoxProcedimientos.getSelectedItem() != "Seleccione el procedimiento") 
            && (!jTextFieldNombreApellidoVictimario.isEnabled())
            && ((String)jComboBoxRelaciones.getSelectedItem() != "Seleccione la relación")
            && ((jRadioButtonSi.isSelected()) || (jRadioButtonNo.isSelected()))
            && (!jTextFieldNombreApellidoVictima.isEnabled())) {
            jButtonSiguiente.setEnabled(true);
        }        
        if ((String)jComboBoxRelaciones.getSelectedItem() == "Seleccione la relación") {
            jButtonSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxRelacionesActionPerformed

    private void jTextFieldNombreApellidoVictimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreApellidoVictimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreApellidoVictimaActionPerformed

    private void jTextFieldDNIVictimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIVictimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIVictimaActionPerformed

    private void jButtonConfirmarDatosVictimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarDatosVictimaActionPerformed
        if ((!jTextFieldNombreApellidoVictimario.getText().isEmpty()) && (!jTextFieldDNIVictimario.getText().isEmpty()) && (!jTextFieldEdadVictimario.getText().isEmpty())) {
            jButtonConfirmarDatosVictima.setVisible(false);
            jTextFieldNombreApellidoVictima.setEnabled(false);
            jTextFieldDNIVictima.setEnabled(false);
            jTextFieldEdadVictima.setEnabled(false);
            jButtonSiguiente.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonConfirmarDatosVictimaActionPerformed

    private void jRadioButtonSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSiActionPerformed
        if (jRadioButtonSi.isSelected()) {
            if (jTextFieldNombreApellidoVictima.isEnabled()) {
                mostrarDatosVictima(true);                
            }
        }
    }//GEN-LAST:event_jRadioButtonSiActionPerformed

    private void jRadioButtonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNoActionPerformed
        if (jRadioButtonNo.isSelected()) {
            if (jTextFieldNombreApellidoVictima.isEnabled()) {
                mostrarDatosVictima(true);                
            }
        }
    }//GEN-LAST:event_jRadioButtonNoActionPerformed

    private void jTextFieldDNIVictimaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNIVictimaKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextFieldDNIVictimaKeyTyped

    private void jTextFieldEdadVictimaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEdadVictimaKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextFieldEdadVictimaKeyTyped

     public static String getProcedimiento() {
        String resultado = (String)jComboBoxProcedimientos.getSelectedItem();
        switch (resultado) {    
            case "Engaño":
                resultado = "Enganio";
                break;                
            case "Abuso de autoridad o de una situación de vulnerabilidad":
                resultado = "Abuso de autoridad o de una situacion de vulnerabilidad";
                break;                
            case "Concesión o recepción de pagos o beneficios para obtener el consentimiento de una persona que tenga autoridad sobre la víctima":
                resultado = "Concesion o recepcion de pagos o beneficios para obtener el consentimiento de una persona que tenga autoridad sobre la victima";
                break;                
            case "Otro medio de intimidación o coerción":
                resultado = "Otro medio de intimidacion o coercion";
                break;                
        }
        return resultado;
    }       

    public static String getNombreApellidoVictimario() {
        return (String)jTextFieldNombreApellidoVictimario.getText();
    }
    
    public static int getDNIVictimario() {
        return Integer.parseInt(jTextFieldDNIVictimario.getText());
    }
    
    public static int getEdadVictimario() {
        return Integer.parseInt(jTextFieldEdadVictimario.getText());
    }

    public static String getRol() {
        return "Ejecutor";
    }    
    
    public static String getRelacionConVictima() {
        String resultado = (String)jComboBoxRelaciones.getSelectedItem();
        switch (resultado) {    
            case "Ascendente/Descendente":
                resultado = "Ascendente o descendente";
                break; 
            case "Cónyuge":
                resultado = "Conyuge";
                break; 
            case "Afín en línea recta":
                resultado = "Afin en linea recta";
                break; 
            case "Encargado de la educación o de la guarda de la víctima":
                resultado = "Encargado de la educacion o de la guarda de la victima";
                break;                 
        }
        return resultado;
    }    

    public static String getCircunstanciasExternasDeAtenuacion() {
        String resultado = "";
        if (jRadioButtonSi.isSelected()) {
            resultado = "No";
        }
        if (jRadioButtonNo.isSelected()) {
            resultado = "Si";
        }
        return resultado;
    }    
    
    public static String getNombreApellidoVictima() {
        return (String)jTextFieldNombreApellidoVictima.getText();
    }
    
    public static int getDNIVictima() {
        return Integer.parseInt(jTextFieldDNIVictima.getText());
    }
    
    public static int getEdadVictima() {
        return Integer.parseInt(jTextFieldEdadVictima.getText());
    } 
     
    public static String getTipoDelitoProstitucion() {
        String resultado = "";
        if (Index.getTipoDelitoContraLaIntegridadSexual() == "Promocion o facilitacion de prostitucion / Proxenetismo agravado") {
            if (((String)jComboBoxProcedimientos.getSelectedItem() == "Ninguno de los anteriores")
                && ((String)jComboBoxRelaciones.getSelectedItem() == "Otra")
                && (jRadioButtonNo.isSelected())) {
                resultado = "Promocion o facilitacion de prostitucion";
            }
            if (((String)jComboBoxProcedimientos.getSelectedItem() != "Ninguno de los anteriores")
                || ((String)jComboBoxRelaciones.getSelectedItem() != "Otra")
                || (jRadioButtonSi.isSelected())
                || (Integer.parseInt(jTextFieldEdadVictima.getText()) < 18)) {
                resultado = "Proxenetismo agravado";
            }
        }
        if (Index.getTipoDelitoContraLaIntegridadSexual() == "Rufianeria") {
            resultado = "Rufianeria";
        }
        return resultado;
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonConfirmarDatosVictima;
    private javax.swing.JButton jButtonConfirmarDatosVictimario;
    private javax.swing.JButton jButtonSiguiente;
    private static javax.swing.JComboBox<String> jComboBoxProcedimientos;
    private static javax.swing.JComboBox<String> jComboBoxRelaciones;
    private javax.swing.JLabel jLabelConduccionCircExt;
    private javax.swing.JLabel jLabelDNIVictima;
    private javax.swing.JLabel jLabelDNIVictimario;
    private javax.swing.JLabel jLabelDatosVictima;
    private javax.swing.JLabel jLabelDatosVictimario;
    private javax.swing.JLabel jLabelDegrade1;
    private javax.swing.JLabel jLabelDegrade10;
    private javax.swing.JLabel jLabelDegrade2;
    private javax.swing.JLabel jLabelDegrade3;
    private javax.swing.JLabel jLabelDegrade4;
    private javax.swing.JLabel jLabelDegrade5;
    private javax.swing.JLabel jLabelDegrade6;
    private javax.swing.JLabel jLabelDegrade7;
    private javax.swing.JLabel jLabelDegrade8;
    private javax.swing.JLabel jLabelDegrade9;
    private javax.swing.JLabel jLabelEdadVictima;
    private javax.swing.JLabel jLabelEdadVictimario;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFuncionarioPublico;
    private javax.swing.JLabel jLabelLogoUNLa;
    private javax.swing.JLabel jLabelNombreApellidoVictima;
    private javax.swing.JLabel jLabelNombreApellidoVictimario;
    private javax.swing.JLabel jLabelProcedimiento;
    private javax.swing.JLabel jLabelRelacionConVictima;
    private javax.swing.JLabel jLabelTitulo;
    private static javax.swing.JRadioButton jRadioButtonNo;
    private static javax.swing.JRadioButton jRadioButtonSi;
    private static javax.swing.JTextField jTextFieldDNIVictima;
    private static javax.swing.JTextField jTextFieldDNIVictimario;
    private static javax.swing.JTextField jTextFieldEdadVictima;
    private static javax.swing.JTextField jTextFieldEdadVictimario;
    private static javax.swing.JTextField jTextFieldNombreApellidoVictima;
    private static javax.swing.JTextField jTextFieldNombreApellidoVictimario;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
