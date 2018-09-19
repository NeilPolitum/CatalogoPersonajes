package catalogo;

public class CatalogoB extends javax.swing.JFrame {

    public CatalogoB() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        humanosLabel = new javax.swing.JLabel();
        numHum = new javax.swing.JTextField();
        orcosLabel = new javax.swing.JLabel();
        numOrc = new javax.swing.JTextField();
        elfosLabel = new javax.swing.JLabel();
        numElf = new javax.swing.JTextField();
        mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        title.setText("Catálogo de Personajes");

        humanosLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        humanosLabel.setText("Ingresar Humanos:");

        numHum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        orcosLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        orcosLabel.setText("Ingresar Orcos:");

        numOrc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        elfosLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        elfosLabel.setText("Ingresar Elfos:");

        numElf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        mostrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(humanosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numHum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(orcosLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(elfosLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numElf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(humanosLabel)
                    .addComponent(numHum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orcosLabel)
                    .addComponent(numOrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elfosLabel)
                    .addComponent(numElf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(mostrar)
                .addContainerGap(461, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        
    }//GEN-LAST:event_mostrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel elfosLabel;
    private javax.swing.JLabel humanosLabel;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField numElf;
    private javax.swing.JTextField numHum;
    private javax.swing.JTextField numOrc;
    private javax.swing.JLabel orcosLabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}