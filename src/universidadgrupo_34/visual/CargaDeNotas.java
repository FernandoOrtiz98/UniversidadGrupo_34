/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo_34.visual;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo_34.accesoAData.AlumnoData;
import universidadgrupo_34.accesoAData.InscripcionData;
import universidadgrupo_34.accesoAData.MateriaData;
import universidadgrupo_34.entidades.Alumno;
import universidadgrupo_34.entidades.Inscripcion;
import universidadgrupo_34.entidades.Materia;

/**
 *
 * @author Fer
 */
public class CargaDeNotas extends javax.swing.JInternalFrame {

    private ArrayList<Alumno> listaA;
    private AlumnoData aData;
    private MateriaData mData;
    private InscripcionData inscData;
    private Materia m;
    private DefaultTableModel modelo= new DefaultTableModel(){
    public boolean isCellEditable(int fila,int columna){
        if(columna==2){
            System.out.println("hla");
            return true;
            
        }else{
        return false;}
    }
    };
    private Alumno selec;

    public CargaDeNotas() {
        aData = new AlumnoData();
        inscData = new InscripcionData();
        Alumno selec = new Alumno();
        m = new Materia();
        
        initComponents();
        listaA = (ArrayList<Alumno>) aData.listarAlumnos();
        cargarComboBox();
        armarCabecera(); 
    }

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
        jLabel3 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jcbAlumnoNotas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtNotas = new javax.swing.JTable();

        jLabel6.setText("Fecha de Nacimiento:");

        jButton1.setText("Buscar");

        jLabel4.setText("materia");

        jLabel5.setText("Estado");

        jButton5.setText("Salir");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Listado de materias");

        jRadioButton3.setText("Materias no inscriptas");

        jRadioButton2.setText("Materias inscriptas");

        jButton3.setText("Anular Inscripcion");

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Seleccione un alumno");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jcbAlumnoNotas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbAlumnoNotasItemStateChanged(evt);
            }
        });
        jcbAlumnoNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoNotasActionPerformed(evt);
            }
        });

        jtNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jtNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtNotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtNotas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGuardar)
                .addGap(60, 60, 60)
                .addComponent(jButton4)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(43, 43, 43)
                                .addComponent(jcbAlumnoNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumnoNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jButton4))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlumnoNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoNotasActionPerformed
        borrarFilas();
        cargaDatosInscriptas();
        
    }//GEN-LAST:event_jcbAlumnoNotasActionPerformed

    private void jcbAlumnoNotasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbAlumnoNotasItemStateChanged
        
    }//GEN-LAST:event_jcbAlumnoNotasItemStateChanged

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       // Alumno selec = (Alumno) jcbAlumnoNotas.getSelectedItem();
//        List <Inscripcion>lista = (ArrayList) inscData.obtenerInscripcionesPorAlumno(selec.getIdAlumno());
//        for(Inscripcion i: lista){ 
//            int nota= (Integer) jtNotas.getValueAt(jtNotas.getSelectedRow(),2);
//            System.out.println("n"+nota);
//         inscData.actualizarNota(i.getAlumno().getIdAlumno(),i.getMateria().getIdMateria(),nota);
//        }
//           // inscData.actualizarNota(i.getAlumno().getIdAlumno(),i.getMateria().getIdMateria(),nota);
//            
//         }
//        System.out.println(jtNotas.getRowCount());
//        System.out.println(jtNotas.getValueAt(0, 2));
//        System.out.println(jtNotas.getValueAt(0, 2));
//        System.out.println(jtNotas.getValueAt(1, 2));
          for (int i = 0; i < jtNotas.getRowCount(); i++) {
           m = (Materia)jtNotas.getValueAt(i,3);
             inscData.actualizarNota(selec.getIdAlumno(),m.getIdMateria(),Integer.parseInt(""+jtNotas.getValueAt(i, 2)));
   
        }
           
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtNotasMouseClicked
        
    }//GEN-LAST:event_jtNotasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<Alumno> jcbAlumnoNotas;
    private javax.swing.JTable jtNotas;
    // End of variables declaration//GEN-END:variables
private void cargarComboBox() {
        for (Alumno item : listaA) {
            jcbAlumnoNotas.addItem(item);
        }

    }

    private void armarCabecera() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo");
        filaCabecera.add("Materia");
        filaCabecera.add("Nota");
        filaCabecera.add("Mat");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtNotas.setModel(modelo);
        jtNotas.getColumnModel().getColumn(3).setPreferredWidth(0);
        jtNotas.getColumnModel().getColumn(3).setMinWidth(0);
        jtNotas.getColumnModel().getColumn(3).setMaxWidth(0);
        

    }
    private void borrarFilas() {
        int f = modelo.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    private void cargaDatosInscriptas(){
        selec = (Alumno) jcbAlumnoNotas.getSelectedItem();
        List <Inscripcion>lista = (ArrayList) inscData.obtenerInscripcionesPorAlumno(selec.getIdAlumno());
        for(Inscripcion i: lista){
            modelo.addRow(new Object[]{i.getIdInscripcion(), i.getMateria().getNombre(), i.getNota(),i.getMateria()});
        }
        
    }
}
