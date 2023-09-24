
package universidadgrupo_34.visual;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo_34.accesoAData.AlumnoData;
import universidadgrupo_34.accesoAData.InscripcionData;
import universidadgrupo_34.accesoAData.MateriaData;
import universidadgrupo_34.entidades.Alumno;
import universidadgrupo_34.entidades.Materia;


public class ListadoAlumnosPorMaterias extends javax.swing.JInternalFrame {

    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;
    private DefaultTableModel modelo;
    private InscripcionData inscData;
    
    public ListadoAlumnosPorMaterias() {
        initComponents();
        modelo = new DefaultTableModel();
        armarCabecera();
        MateriaData mdata=new MateriaData();
        AlumnoData aData=new AlumnoData();
        listaM = (ArrayList<Materia>) mdata.listarMaterias();
        cargarComboBox();
        inscData = new InscripcionData();
        listaA = (ArrayList<Alumno>) aData.listarAlumnos();
        cargaDatosAlumnos();

        
        

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
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jcbMaterias = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAlum = new javax.swing.JTable();

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

        jButton2.setText("Guardar");

        jtAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre", "FechaNacimiento", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jtAlumnos);

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Listado de Alumnos por Materia");

        jLabel2.setText("Seleccione materia");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtAlum.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtAlum);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSalir)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Materia> jcbMaterias;
    private javax.swing.JTable jtAlum;
    private javax.swing.JTable jtAlumnos;
    // End of variables declaration//GEN-END:variables
private void cargarComboBox() {
        for (Materia item : listaM) {
            jcbMaterias.addItem(item);
        }

    }
private void armarCabecera() {
        ArrayList<Object> filaCabecera= new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Dni");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        filaCabecera.add("Fecha Nacimiento");
        filaCabecera.add("Estado");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtAlum.setModel(modelo);
}
private void cargaDatosAlumnos(){
        Materia selec = (Materia) jcbMaterias.getSelectedItem();
        List <Alumno>lista = (ArrayList) inscData.obtenerAlumnoPorMateria(selec.getIdMateria());
        for(Alumno a: lista){
            modelo.addRow(new Object[] {a.getIdAlumno(),a.getDni(),a.getApellido(),a.getNombre(),a.getfNacimiento(),a.isEstado()});
        }
    }

}
