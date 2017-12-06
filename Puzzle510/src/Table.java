
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Faiz Ikhwan
 */
public class Table extends javax.swing.JFrame {

    /**
     * Creates new form Table
     */
    private Position pt = new Position();
    private Data[] q = new Data[5];
    private int j = 0;
    
    public Table() {
        initComponents();
        setInfo();
        showTable();
        icon();
    }

    public Table(int k) {
        initComponents();
        j = k;
        setInfo();
        showTable();
        icon();
    }

    public void setInfo() {
        for (int l = 0; l < q.length; l++) {
            if (j == 0) 
            {
                q[l] = pt.d[l];                
            } else if (j == 1) 
            {
                q[l] = pt.p[l];                
            }
        }
    }
    public void showTable() {

        m11.setText(" "+q[0].Ship);
        m12.setText(" "+q[0].Content);
        m13.setText(" "+q[0].Arrival);
        m14.setText(" "+q[0].Chimney);
        m15.setText(" "+q[0].Destination);
        m21.setText(""+q[1].Ship);
        m22.setText(""+q[1].Content);
        m23.setText(""+q[1].Arrival);
        m24.setText(""+q[1].Chimney);
        m25.setText(""+q[1].Destination);
        m31.setText(""+q[2].Ship);
        m32.setText(""+q[2].Content);
        m33.setText(""+q[2].Arrival);
        m34.setText(""+q[2].Chimney);
        m35.setText(""+q[2].Destination);
        m41.setText("  "+q[3].Ship);
        m42.setText("  "+q[3].Content);
        m43.setText("  "+q[3].Arrival);
        m44.setText("  "+q[3].Chimney);
        m45.setText("  "+q[3].Destination);
        m51.setText(""+q[4].Ship);
        m52.setText(""+q[4].Content);
        m53.setText(""+q[4].Arrival);
        m54.setText(""+q[4].Chimney);
        m55.setText(""+q[4].Destination);

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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        m11 = new javax.swing.JLabel();
        m12 = new javax.swing.JLabel();
        m13 = new javax.swing.JLabel();
        m14 = new javax.swing.JLabel();
        m15 = new javax.swing.JLabel();
        m21 = new javax.swing.JLabel();
        m22 = new javax.swing.JLabel();
        m23 = new javax.swing.JLabel();
        m24 = new javax.swing.JLabel();
        m25 = new javax.swing.JLabel();
        m31 = new javax.swing.JLabel();
        m32 = new javax.swing.JLabel();
        m33 = new javax.swing.JLabel();
        m34 = new javax.swing.JLabel();
        m35 = new javax.swing.JLabel();
        m41 = new javax.swing.JLabel();
        m42 = new javax.swing.JLabel();
        m43 = new javax.swing.JLabel();
        m44 = new javax.swing.JLabel();
        m45 = new javax.swing.JLabel();
        m51 = new javax.swing.JLabel();
        m52 = new javax.swing.JLabel();
        m53 = new javax.swing.JLabel();
        m54 = new javax.swing.JLabel();
        m55 = new javax.swing.JLabel();
        table = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();
        labelTable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trading Ship Puzzle");

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainMenu.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 190, 40, 40);

        jButton2.setText("Show me the ship");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(140, 190, 140, 30);

        m11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        m11.setText("m11");
        jPanel1.add(m11);
        m11.setBounds(30, 40, 70, 13);

        m12.setText("m12");
        jPanel1.add(m12);
        m12.setBounds(30, 60, 70, 14);

        m13.setText("m13");
        jPanel1.add(m13);
        m13.setBounds(30, 80, 70, 14);

        m14.setText("m14");
        jPanel1.add(m14);
        m14.setBounds(30, 100, 70, 14);

        m15.setText("m15");
        jPanel1.add(m15);
        m15.setBounds(30, 120, 70, 14);

        m21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        m21.setText("m21");
        jPanel1.add(m21);
        m21.setBounds(110, 40, 70, 13);

        m22.setText("m22");
        jPanel1.add(m22);
        m22.setBounds(110, 60, 70, 14);

        m23.setText("m23");
        jPanel1.add(m23);
        m23.setBounds(110, 80, 70, 14);

        m24.setText("m24");
        jPanel1.add(m24);
        m24.setBounds(110, 100, 70, 14);

        m25.setText("m25");
        jPanel1.add(m25);
        m25.setBounds(110, 120, 70, 14);

        m31.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        m31.setText("m31");
        jPanel1.add(m31);
        m31.setBounds(190, 40, 70, 13);

        m32.setText("m32");
        jPanel1.add(m32);
        m32.setBounds(190, 60, 70, 14);

        m33.setText("m33");
        jPanel1.add(m33);
        m33.setBounds(190, 80, 70, 14);

        m34.setText("m34");
        jPanel1.add(m34);
        m34.setBounds(190, 100, 70, 14);

        m35.setText("m35");
        jPanel1.add(m35);
        m35.setBounds(190, 120, 70, 14);

        m41.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        m41.setText("m41");
        jPanel1.add(m41);
        m41.setBounds(260, 40, 70, 13);

        m42.setText("m42");
        jPanel1.add(m42);
        m42.setBounds(260, 60, 70, 14);

        m43.setText("m43");
        jPanel1.add(m43);
        m43.setBounds(260, 80, 70, 14);

        m44.setText("m44");
        jPanel1.add(m44);
        m44.setBounds(260, 100, 70, 14);

        m45.setText("m45");
        jPanel1.add(m45);
        m45.setBounds(260, 120, 70, 14);

        m51.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        m51.setText("m51");
        jPanel1.add(m51);
        m51.setBounds(340, 40, 70, 13);

        m52.setText("m52");
        jPanel1.add(m52);
        m52.setBounds(340, 60, 70, 14);

        m53.setText("m53");
        jPanel1.add(m53);
        m53.setBounds(340, 80, 70, 14);

        m54.setText("m54");
        jPanel1.add(m54);
        m54.setBounds(340, 100, 70, 14);

        m55.setText("m55");
        jPanel1.add(m55);
        m55.setBounds(340, 120, 70, 14);

        table.setBackground(new java.awt.Color(102, 255, 255));
        table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/table.png"))); // NOI18N
        jPanel1.add(table);
        table.setBounds(30, 20, 381, 130);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OceanPosition.gif"))); // NOI18N
        jPanel1.add(backgroundImage);
        backgroundImage.setBounds(0, -30, 430, 270);

        labelTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTable.setText("Table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTable)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new GraphicalShip().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void icon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Ship.png")));
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTable;
    private javax.swing.JLabel m11;
    private javax.swing.JLabel m12;
    private javax.swing.JLabel m13;
    private javax.swing.JLabel m14;
    private javax.swing.JLabel m15;
    private javax.swing.JLabel m21;
    private javax.swing.JLabel m22;
    private javax.swing.JLabel m23;
    private javax.swing.JLabel m24;
    private javax.swing.JLabel m25;
    private javax.swing.JLabel m31;
    private javax.swing.JLabel m32;
    private javax.swing.JLabel m33;
    private javax.swing.JLabel m34;
    private javax.swing.JLabel m35;
    private javax.swing.JLabel m41;
    private javax.swing.JLabel m42;
    private javax.swing.JLabel m43;
    private javax.swing.JLabel m44;
    private javax.swing.JLabel m45;
    private javax.swing.JLabel m51;
    private javax.swing.JLabel m52;
    private javax.swing.JLabel m53;
    private javax.swing.JLabel m54;
    private javax.swing.JLabel m55;
    private javax.swing.JLabel table;
    // End of variables declaration//GEN-END:variables
}
