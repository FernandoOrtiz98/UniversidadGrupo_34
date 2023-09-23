/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo_34.visual;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import universidadgrupo_34.accesoAData.AlumnoData;
import universidadgrupo_34.accesoAData.InscripcionData;
import universidadgrupo_34.entidades.Alumno;
import universidadgrupo_34.entidades.Inscripcion;
import universidadgrupo_34.entidades.Materia;

/**
 *
 * @author Fer
 */
public class FormularioDeInscripciones extends javax.swing.JInternalFrame {
     private DefaultTableModel modelo = new DefaultTableModel();
     AlumnoData al = new AlumnoData();
     ArrayList<Alumno> alumnos = (ArrayList<Alumno>) al.listarAlumnos();
     InscripcionData insc = new InscripcionData();
    /**
     * Creates new form Alumnos
     */
    public FormularioDeInscripciones() {
        initComponents();
        armarCabecera();
        cargarComboBox();
        System.out.println("verificar:"+jcbAlumnos.getItemAt(WIDTH).getIdAlumno());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jrInscriptas = new javax.swing.JRadioButton();
        jrNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();

        jLabel6.setText("Fecha de Nacimiento:");

        jButton1.setText("Buscar");

        jLabel4.setText("materia");

        jLabel5.setText("Estado");

        jButton5.setText("Salir");

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setText("Seleccione un alumno");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Listado de materias");

        jButton2.setText("Inscribir");

        jButton3.setText("Anular Inscripcion");

        jButton4.setText("Salir");

        jrInscriptas.setText("Materias inscriptas");

        jrNoInscriptas.setText("Materias no inscriptas");
        jrNoInscriptas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrNoInscriptasStateChanged(evt);
            }
        });
        jrNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNoInscriptasActionPerformed(evt);
            }
        });

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtMaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(37, 37, 37)
                                .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jrNoInscriptas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrInscriptas)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(58, 58, 58)
                .addComponent(jButton4)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrInscriptas)
                    .addComponent(jrNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNoInscriptasActionPerformed
        jrInscriptas.setSelected(false);
        borrarFilas();
        for(Inscripcion inc:insc.obtenerMateriasNoCursadas(1)){
           modelo.addRow(new Object[]{inc.getIdInscripcion(),inc.getMateria().getNombre(),inc.getMateria().getAnio()});
         }
    }//GEN-LAST:event_jrNoInscriptasActionPerformed

    private void jrNoInscriptasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrNoInscriptasStateChanged
        
    }//GEN-LAST:event_jrNoInscriptasStateChanged
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JRadioButton jrInscriptas;
    private javax.swing.JRadioButton jrNoInscriptas;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables
private void cargarComboBox() {
       
        ArrayList<Alumno> alumnos = (ArrayList<Alumno>) al.listarAlumnos();

        Alumno A = new Alumno();
        for (Iterator<Alumno> it = alumnos.iterator(); it.hasNext();) {
            A = it.next();
            jcbAlumnos.addItem(A);
        }

    }

    private void armarCabecera() {

        modelo.addColumn("ID");
        modelo.addColumn("Materia");
        modelo.addColumn("Año");

        jtMaterias.setModel(modelo);
    }
    private void borrarFilas(){
        int f = jtMaterias.getRowCount()-1;
        for(;f>=0;f--){
            modelo.removeRow(f);
        }
    }
    
}
