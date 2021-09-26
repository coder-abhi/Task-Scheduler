/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

/**
 *
 * @author AK
 */
public class TaskCard extends javax.swing.JFrame {

    /**
     * Creates new form TaskCard
     */
    public TaskCard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taskCardPanel = new javax.swing.JPanel();
        workProgressBar = new javax.swing.JProgressBar();
        deadlineProgressBar = new javax.swing.JProgressBar();
        lblTaskName = new javax.swing.JLabel();
        lblRequire = new javax.swing.JLabel();
        addSpinner = new javax.swing.JSpinner();
        btnSpinnerSubmit = new javax.swing.JButton();
        lblWork = new javax.swing.JLabel();
        lblDeadline = new javax.swing.JLabel();
        lblTotalDeadline = new javax.swing.JLabel();
        lblTotalWork = new javax.swing.JLabel();
        lblTotalDeadlineAns = new javax.swing.JLabel();
        lblTotalWorkAns = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTaskName.setText("Name of Task");

        lblRequire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRequire.setText("minimum requirement : 1 task / day ");

        btnSpinnerSubmit.setText("Completed");

        lblWork.setText("Work");

        lblDeadline.setText("Deadline");

        lblTotalDeadline.setText("Deadline     : ");

        lblTotalWork.setText("Total Work :");

        javax.swing.GroupLayout taskCardPanelLayout = new javax.swing.GroupLayout(taskCardPanel);
        taskCardPanel.setLayout(taskCardPanelLayout);
        taskCardPanelLayout.setHorizontalGroup(
            taskCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskCardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(taskCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblWork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(taskCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(taskCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(deadlineProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(workProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(taskCardPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblRequire, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(taskCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(taskCardPanelLayout.createSequentialGroup()
                        .addComponent(lblTotalWork)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotalWorkAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(taskCardPanelLayout.createSequentialGroup()
                        .addComponent(lblTotalDeadline)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalDeadlineAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(taskCardPanelLayout.createSequentialGroup()
                        .addComponent(addSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSpinnerSubmit)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        taskCardPanelLayout.setVerticalGroup(
            taskCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskCardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(taskCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalDeadline)
                    .addComponent(lblTotalDeadlineAns))
                .addGap(5, 5, 5)
                .addGroup(taskCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaskName)
                    .addComponent(lblTotalWork)
                    .addComponent(lblTotalWorkAns))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(taskCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(taskCardPanelLayout.createSequentialGroup()
                        .addGroup(taskCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblWork, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(workProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(taskCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deadlineProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                            .addComponent(lblDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(taskCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSpinnerSubmit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addSpinner, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRequire)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(taskCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(taskCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner addSpinner;
    private javax.swing.JButton btnSpinnerSubmit;
    private javax.swing.JProgressBar deadlineProgressBar;
    private javax.swing.JLabel lblDeadline;
    private javax.swing.JLabel lblRequire;
    private javax.swing.JLabel lblTaskName;
    private javax.swing.JLabel lblTotalDeadline;
    private javax.swing.JLabel lblTotalDeadlineAns;
    private javax.swing.JLabel lblTotalWork;
    private javax.swing.JLabel lblTotalWorkAns;
    private javax.swing.JLabel lblWork;
    private javax.swing.JPanel taskCardPanel;
    private javax.swing.JProgressBar workProgressBar;
    // End of variables declaration//GEN-END:variables
}