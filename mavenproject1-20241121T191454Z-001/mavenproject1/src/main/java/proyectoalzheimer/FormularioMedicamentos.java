/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoalzheimer;

import javax.swing.*;
public class FormularioMedicamentos extends javax.swing.JFrame {

    public FormularioMedicamentos() {
        initComponents();
        setTitle("Gestión de Medicamentos");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Usamos un layout absoluto para personalizar el diseño.

        // Panel lateral
        JPanel panelLateral = new JPanel();
       
        panelLateral.setBackground(new java.awt.Color(255, 204, 255));
        panelLateral.setLayout(null);
        add(panelLateral);

        // Botones del panel lateral
        JButton btnAgregarMedicamento = new JButton("Agregar Medicamentos");
        btnAgregarMedicamento.setBounds(5, 50, 110, 50);
        panelLateral.add(btnAgregarMedicamento);

        JButton btnVerMedicamentos = new JButton("Ver Medicamentos");
   
        panelLateral.add(btnVerMedicamentos);

        JButton btnControlMedicamentos = new JButton("Control de Medicamentos");
        
        panelLateral.add(btnControlMedicamentos);

        // Panel principal
        JPanel panelPrincipal = new JPanel();
     
        panelPrincipal.setLayout(null);
        add(panelPrincipal);

        // Componentes del panel principal
        JLabel lblTitulo = new JLabel("Agregar Medicamento");
  
        panelPrincipal.add(lblTitulo);

        JLabel lblNombre = new JLabel("Nombre del Medicamento");
      
        panelPrincipal.add(lblNombre);

        JTextField txtNombre = new JTextField();
     
        panelPrincipal.add(txtNombre);

        JLabel lblTipo = new JLabel("Tipo de Medicamento");
 
        panelPrincipal.add(lblTipo);

        JComboBox<String> cmbTipo = new JComboBox<>(new String[]{"Analgésico", "Antibiótico", "Antiinflamatorio"});

        panelPrincipal.add(cmbTipo);

        JLabel lblHoraInicio = new JLabel("Hora de Inicio para Tomar el Medicamento");
  
        panelPrincipal.add(lblHoraInicio);

        JTextField txtHoraInicio = new JTextField();
     
        panelPrincipal.add(txtHoraInicio);

        JLabel lblFrecuencia = new JLabel("¿Cada cuántas horas se debe tomar?");
        
        panelPrincipal.add(lblFrecuencia);

        JTextField txtFrecuencia = new JTextField();
        
        panelPrincipal.add(txtFrecuencia);

        JLabel lblDosis = new JLabel("Dosis");
        
        panelPrincipal.add(lblDosis);

        JTextField txtDosis = new JTextField();

        panelPrincipal.add(txtDosis);

        JLabel lblFormaAdmin = new JLabel("Forma de Administración");

        panelPrincipal.add(lblFormaAdmin);

        JComboBox<String> cmbFormaAdmin = new JComboBox<>(new String[]{"Oral", "Inyección", "Tópico"});

        panelPrincipal.add(cmbFormaAdmin);

        JButton btnGuardar = new JButton("Guardar");

        panelPrincipal.add(btnGuardar);

        // Acción del botón Guardar
        btnGuardar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Se ingresaron los datos correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreMedicamento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbTipoMedicamento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIntervaloHoras = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDosis = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbFormaAdministracion = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        jButton1.setText("<html>Agregar Medicamentos</html>");
        jButton1.setActionCommand("jButton2");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHideActionText(true);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 255));
        jButton2.setText("<html>Ver Medicamentos</html>");

        jButton3.setBackground(new java.awt.Color(255, 204, 255));
        jButton3.setText("<html>Control de Medicamentos</html>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Agregar Medicamento");

        jLabel2.setText("Nombre del Medicamento");

        txtNombreMedicamento.setBackground(new java.awt.Color(255, 204, 255));
        txtNombreMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMedicamentoActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo de Medicamento");

        cbTipoMedicamento.setBackground(new java.awt.Color(255, 204, 255));
        cbTipoMedicamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analgésico", "Antibiótico", "Ansiolítico" }));

        jLabel4.setText("Hora de Inicio para Tomar el Medicamento");

        txtHoraInicio.setForeground(new java.awt.Color(255, 204, 255));

        jLabel5.setText("¿Cada cuantas horas se debe tomar?");

        txtIntervaloHoras.setForeground(new java.awt.Color(255, 204, 255));
        txtIntervaloHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntervaloHorasActionPerformed(evt);
            }
        });

        jLabel6.setText("Dosis");

        txtDosis.setForeground(new java.awt.Color(255, 204, 255));

        jLabel7.setText("Forma de Administracion");

        cbFormaAdministracion.setBackground(new java.awt.Color(255, 204, 255));
        cbFormaAdministracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oral", "Intravenosa" }));

        btnGuardar.setBackground(new java.awt.Color(255, 204, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombreMedicamento)
                                .addComponent(jLabel3)
                                .addComponent(cbTipoMedicamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIntervaloHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(cbFormaAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(62, 62, 62))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbTipoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtIntervaloHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cbFormaAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(93, 93, 93))
        );

        jMenu1.setText("Actividades");
        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 204, 255));
        jMenu2.setForeground(new java.awt.Color(255, 204, 255));
        jMenu2.setText("Tratamiento");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("Prediccion");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Plan alimenticio");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Paciente");
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Dashboard");
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String nombre = txtNombreMedicamento.getText();
        String tipoMedicamento = (String) cbTipoMedicamento.getSelectedItem();
        String horaInicio = txtHoraInicio.getText();
        String intervaloHoras = txtIntervaloHoras.getText();
        String dosis = txtDosis.getText();
        String formaAdministracion = (String) cbFormaAdministracion.getSelectedItem();

        // Aquí podrías agregar la lógica para guardar los datos en una base de datos o mostrar un mensaje de confirmación
        JOptionPane.showMessageDialog(this, "Medicamento guardado exitosamente:\n" +
                "Nombre: " + nombre + "\n" +
                "Tipo: " + tipoMedicamento + "\n" +
                "Hora de Inicio: " + horaInicio + "\n" +
                "Intervalo de Horas: " + intervaloHoras + "\n" +
                "Dosis: " + dosis + "\n" +
                "Forma de Administración: " + formaAdministracion);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIntervaloHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntervaloHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIntervaloHorasActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMedicamentoActionPerformed

    /** 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          SwingUtilities.invokeLater(() -> {
            FormularioMedicamentos formulario = new FormularioMedicamentos();
            formulario.setVisible(true);
        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioMedicamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbFormaAdministracion;
    private javax.swing.JComboBox<String> cbTipoMedicamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDosis;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtIntervaloHoras;
    private javax.swing.JTextField txtNombreMedicamento;
    // End of variables declaration//GEN-END:variables
}