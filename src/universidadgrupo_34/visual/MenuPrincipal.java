/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo_34.visual;

/**
 *
 * @author Fer
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmFormularioAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmFMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmManejoInscripciones = new javax.swing.JMenuItem();
        jmManipulacionDeNotas = new javax.swing.JMenuItem();
        jmAlumnoPorMateria = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        jmFormularioAlumno.setText("Formulario de Alumnos");
        jmFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmFormularioAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        jmFMateria.setText("Formulario de Materia");
        jmFMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(jmFMateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");

        jmManejoInscripciones.setText("Manejo de Inscripciones");
        jmManejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManejoInscripcionesActionPerformed(evt);
            }
        });
        jMenu3.add(jmManejoInscripciones);

        jmManipulacionDeNotas.setText("Manipulacion de Notas");
        jmManipulacionDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManipulacionDeNotasActionPerformed(evt);
            }
        });
        jMenu3.add(jmManipulacionDeNotas);

        jMenuBar1.add(jMenu3);

        jmAlumnoPorMateria.setText("Consultas");

        jMenuItem5.setText("Alumnos por Materias");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jmAlumnoPorMateria.add(jMenuItem5);

        jMenuBar1.add(jmAlumnoPorMateria);

        jMenu5.setText("Salir");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioAlumnoActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        Alumnos alumnos= new Alumnos();
        
        Escritorio.add(alumnos);
        Escritorio.moveToFront(alumnos);
        alumnos.setVisible(true);
    }//GEN-LAST:event_jmFormularioAlumnoActionPerformed

    private void jmFMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFMateriaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        Materias materia=new Materias();
        Escritorio.add(materia);
        Escritorio.moveToFront(materia);
        materia.setVisible(true);
    }//GEN-LAST:event_jmFMateriaActionPerformed

    private void jmManejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManejoInscripcionesActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioDeInscripciones fdi = new FormularioDeInscripciones();
        Escritorio.add(fdi);
        Escritorio.moveToFront(fdi);
        fdi.setVisible(true);
    }//GEN-LAST:event_jmManejoInscripcionesActionPerformed

    private void jmManipulacionDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManipulacionDeNotasActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        CargaDeNotas cdn=new CargaDeNotas();
        Escritorio.add(cdn);
        Escritorio.moveToFront(cdn);
        cdn.setVisible(true);
    }//GEN-LAST:event_jmManipulacionDeNotasActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ListadoAlumnosPorMaterias lapm = new ListadoAlumnosPorMaterias();
        Escritorio.add(lapm);
        Escritorio.moveToFront(lapm);
        lapm.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
         this.dispose();
    }//GEN-LAST:event_jMenu5ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu jmAlumnoPorMateria;
    private javax.swing.JMenuItem jmFMateria;
    private javax.swing.JMenuItem jmFormularioAlumno;
    private javax.swing.JMenuItem jmManejoInscripciones;
    private javax.swing.JMenuItem jmManipulacionDeNotas;
    // End of variables declaration//GEN-END:variables
}
