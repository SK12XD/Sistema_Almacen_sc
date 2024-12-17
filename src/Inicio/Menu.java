/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;
/**
 *
 * @author Chavez
 */
public class Menu extends javax.swing.JFrame {
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        agregarEventos();
    }
    private void agregarEventos() {
        jMenuNuevo.addActionListener(evt -> {
            NuevoProducto nuevoProducto = new NuevoProducto();
            nuevoProducto.setVisible(true);
            this.dispose();
        });

        jMenuAbrir.addActionListener(evt -> {
            AbrirInventario abrirInventario = new AbrirInventario();
            abrirInventario.setVisible(true);
            this.dispose();
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

        jLabel1 = new javax.swing.JLabel();
        JMenuBar = new javax.swing.JMenuBar();
        JMenuPrincipal = new javax.swing.JMenu();
        jMenuNuevo = new javax.swing.JMenuItem();
        jMenuAbrir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("EN PROCESO :)");

        JMenuPrincipal.setText("Principal");

        jMenuNuevo.setText("Nuevo Producto");
        JMenuPrincipal.add(jMenuNuevo);

        jMenuAbrir.setText("Abrir Inventario");
        JMenuPrincipal.add(jMenuAbrir);

        JMenuBar.add(JMenuPrincipal);

        setJMenuBar(JMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JMenu JMenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuAbrir;
    private javax.swing.JMenuItem jMenuNuevo;
    // End of variables declaration//GEN-END:variables
}