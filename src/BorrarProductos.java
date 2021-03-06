
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class BorrarProductos extends javax.swing.JFrame {

    /**
     * Creates new form BorrarProductos
     */
    private VentanaBienvenida parent;
   
   
   
    public BorrarProductos(VentanaBienvenida ett) {
        initComponents();
        parent = ett;
        parent.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        IsbnCaja = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NumSerieCaja = new javax.swing.JTextField();
        RetirarLectorBoton = new javax.swing.JButton();
        RetirarLibroBoton = new javax.swing.JButton();
        AtrasBoton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIBRERIA DIGITAL");

        jLabel1.setText("Si lo que desea es borrar una PUBLICACION DIGITAL...");

        jLabel2.setText("Escriba ISBN: ");

        IsbnCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsbnCajaActionPerformed(evt);
            }
        });

        jLabel3.setText("Si lo que desea es borrar un LECTOR DIGITAL...");

        jLabel4.setText("Numero de serie:");

        RetirarLectorBoton.setText("Retirar lector");
        RetirarLectorBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarLectorBotonActionPerformed(evt);
            }
        });

        RetirarLibroBoton.setText("Retirar publicaci??n");
        RetirarLibroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarLibroBotonActionPerformed(evt);
            }
        });

        AtrasBoton.setText("Salir");
        AtrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasBotonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("BORRAR PRODUCTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AtrasBoton)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IsbnCaja))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NumSerieCaja))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(0, 43, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RetirarLectorBoton)
                            .addComponent(RetirarLibroBoton))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IsbnCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RetirarLibroBoton)
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NumSerieCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RetirarLectorBoton)
                .addGap(18, 18, 18)
                .addComponent(AtrasBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IsbnCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsbnCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IsbnCajaActionPerformed

    private void RetirarLibroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarLibroBotonActionPerformed
        // TODO add your handling code here:
        
        if (this.parent.getGestor().bajaLibro(IsbnCaja.getText())){
        JOptionPane.showMessageDialog(null, " \n Producto retirado con exito.", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        
        BorrarProductos e = new BorrarProductos(parent);
        e.setVisible(true);
        this.setVisible(false);
        }else{
        JOptionPane.showMessageDialog(null, " \n Producto no encontrado.", "INFORMACION", JOptionPane.ERROR_MESSAGE);
        
        BorrarProductos e = new BorrarProductos(parent);
        e.setVisible(true);
        this.setVisible(false);
        }
        
    }//GEN-LAST:event_RetirarLibroBotonActionPerformed

    private void RetirarLectorBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarLectorBotonActionPerformed
        // TODO add your handling code here:
        
        if (this.parent.getGestor().bajaLector(NumSerieCaja.getText())){
        JOptionPane.showMessageDialog(null, " \n Producto retirado con exito.", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        
        BorrarProductos e = new BorrarProductos(parent);
        e.setVisible(true);
        this.setVisible(false);
        }else{
        JOptionPane.showMessageDialog(null, " \n Producto no encontrado.", "INFORMACION", JOptionPane.ERROR_MESSAGE);
        
        BorrarProductos e = new BorrarProductos(parent);
        e.setVisible(true);
        this.setVisible(false);
        
        
        }
        
    }//GEN-LAST:event_RetirarLectorBotonActionPerformed

    private void AtrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasBotonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        VentanaAdmin programa = new VentanaAdmin(this.parent);
        programa.setVisible(true);
    }//GEN-LAST:event_AtrasBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasBoton;
    private javax.swing.JTextField IsbnCaja;
    private javax.swing.JTextField NumSerieCaja;
    private javax.swing.JButton RetirarLectorBoton;
    private javax.swing.JButton RetirarLibroBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
