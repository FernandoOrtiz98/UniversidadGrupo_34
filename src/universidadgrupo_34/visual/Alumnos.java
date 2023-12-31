
package universidadgrupo_34.visual;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidadgrupo_34.accesoAData.AlumnoData;
import universidadgrupo_34.entidades.Alumno;

public class Alumnos extends javax.swing.JInternalFrame {
    private AlumnoData alum= new AlumnoData();
    private Alumno alu=null;
    
    public Alumnos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtDocumento = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jrEstado = new javax.swing.JRadioButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jdCalendario = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Alumno");

        jLabel2.setText("Documento:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Estado");

        jLabel6.setText("Fecha de Nacimiento:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jrEstado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrEstadoStateChanged(evt);
            }
        });
        jrEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jbNuevo)
                        .addGap(37, 37, 37)
                        .addComponent(jbEliminar)
                        .addGap(33, 33, 33)
                        .addComponent(jbGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jrEstado))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbBuscar)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbSalir)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrEstado))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jdCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        try {
            alu=alum.buscarAlumnoDni(Integer.parseInt(jtDocumento.getText()));
            jtApellido.setText(alu.getApellido());
            jtNombre.setText(alu.getNombre());
            jrEstado.setSelected(alu.isEstado());
            jdCalendario.setDate(Date.valueOf(alu.getfNacimiento()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Dni incorrecto");
        } catch (NullPointerException nu){
            JOptionPane.showMessageDialog(this, "No se encontro el alumno");
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jrEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoActionPerformed
        
    }//GEN-LAST:event_jrEstadoActionPerformed

    private void jrEstadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrEstadoStateChanged
        
    }//GEN-LAST:event_jrEstadoStateChanged

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try {
           Integer dni = Integer.parseInt(jtDocumento.getText());
           String nombre = jtNombre.getText();
           String apellido = jtApellido.getText();
           
           LocalDate afecha= jdCalendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
           if(nombre.isEmpty()|| apellido.isEmpty()|| afecha==null){
              JOptionPane.showMessageDialog(this, "No puedo haber campos vacios");
                       return;
           }
           if(alu==null){
               alu= new Alumno(dni,apellido, nombre, afecha, true);
               alum.guardarAlumno(alu);
               limpiarCampos();
           }else{
               
                alu.setDni(Integer.parseInt(jtDocumento.getText()));
               alu.setApellido(jtApellido.getText());
               alu.setNombre(jtNombre.getText());
               alu.setEstado(jrEstado.isSelected());
               alu.setfNacimiento(jdCalendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
               alum.modificarAlumno(alu);
               limpiarCampos();
           }
           
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"Datos incompatible" );
        } catch (NullPointerException ex){
            JOptionPane.showMessageDialog(this,"Completar datos" );
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        try {
            if (jtDocumento.getText()==null) {
                JOptionPane.showMessageDialog(this, "No selecciono ningun alumno");
            }else if(Integer.parseInt(jtDocumento.getText())== alu.getDni()){          
                alum.eliminarAlumno(alu.getIdAlumno());
                JOptionPane.showMessageDialog(this, "Eliminacion exitosa!");
                limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(this, "Dni no registrado!...");
                    } 
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this,"No se pudo Eliminar el alumno");
        }
        
    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdCalendario;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    public void limpiarCampos(){
        jtDocumento.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jrEstado.setSelected(false);
        jdCalendario.setDate(null);
        alu=null;
    }
}
