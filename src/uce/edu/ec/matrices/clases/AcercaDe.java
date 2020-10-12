
package uce.edu.ec.matrices.clases;



public class AcercaDe extends javax.swing.JDialog {

  /**
   * Constructor de la Clase Acerca de...
   * @param parent
   * @param modal 
   */
    public AcercaDe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Acerca de");
        setLocationRelativeTo(null);
        setResizable(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(476, 600));
        setMinimumSize(new java.awt.Dimension(476, 600));
        setPreferredSize(new java.awt.Dimension(476, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PM@XSOFT  PRESENTA:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 30, 150, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/al.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 70, 280, 270);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("sistemas de ecuaciones lineales por varios métodos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 370, 360, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SISTEMA DE ÁLGEBRA LINEAL 1H (SA1H)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 50, 230, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Es un sistema que permite realizar operaciones entre dos");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 330, 360, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("matrices: suma, resta, multiplicación, etc. Además resuelve");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 350, 370, 20);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 3, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Versión del Producto: SA1H 1.0\nVersión Java: 1.8.0\nDesarrollado por: PM@XSOFT\nDesarrolladores: Michael, Erika,\n \t\t Majorie, Alexander\n                 Jairo, Isaac     ");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 410, 360, 120);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 20, 430, 520);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo5.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 480, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
