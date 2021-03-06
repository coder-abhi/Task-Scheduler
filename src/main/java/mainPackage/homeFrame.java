/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.ScrollPaneConstants;
import javax.swing.*;
import java.awt.Dimension;
import java.sql.*;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author AK
 */
public class homeFrame extends javax.swing.JFrame {
    SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    database db = new database();
    /**
     * Creates new form HomeFrame
     */
    public homeFrame() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        addTaskCard();
    }
//    public void addTaskCard()
//          JPanel blank = new JPanel();
//          blank.setSize(new Dimension(120,5)); // Dimention(Width,Height)    
    
    
//          TaskCardPanel task_1 = new TaskCardPanel();
//          TaskCardPanel task_2 = new TaskCardPanel();
//          TaskCardPanel task_3 = new TaskCardPanel();
//          view.add(task_1);
//          view.add(blank);
//          view.add(task_2);
//          view.add(blank2);
//          view.add(task_3);
//          view.setLayout(new GridLayout(5,1,5,10)); //int rows, int columns, int hgap, int vgap
//          view.setSize(400,400);
//            view.setLayout(new );
//        TaskCardPanel task_1 = new TaskCardPanel();
//        JScrollPane taskScrollPanel = new JScrollPane(taskPanel,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        taskScrollPanel.setPreferredSize(new Dimension(70,40));
//        taskScrollPanel.setBounds(0,0,720,480);
//        taskScrollPanel.setVisible(true);
//        taskPanel.add(taskScrollPanel);
//        taskPanel.revalidate();

//        task_1.setSize(10,10);
//        task_1.setVisible(true);
//        task_1.setBounds(100, 10, 25, 50);
//        taskScrollPanel.setViewportView(task_1);

//        task_1.setLocationRelativeTo(null);
//        taskScrollPanel.validate();
    public void addTaskCard()
    {
          JPanel view = new JPanel();                  
          JPanel panelList[] = new JPanel[20];
          ResultSet rs =  db.runReadQuery("select * from tasks"); 
          int k = 0;
          try{
          while(rs.next()){
              JPanel blank = new JPanel();
              blank.setSize(new Dimension(120,5));
              TaskCardPanel taskCard = new TaskCardPanel();
//              rs.getI
              int taskId = rs.getInt("id");
              String taskName = rs.getString("task-name");
              String workTarget = rs.getString("work-target");
              String createDate = rs.getString("create-date");
              String deadLineDate = rs.getString("deadline-date");
              String workComplete = rs.getString("work-complete");
              
//              int spinnerValue = taskCard.getAddSpinnerValue();
              
              
              Date dateStart = dateFormate.parse(createDate);
              Date dateEnd = dateFormate.parse(deadLineDate);
              Date today = new Date();
              long diff = dateEnd.getTime() - dateStart.getTime();
              TimeUnit time = TimeUnit.HOURS;
              
              long timeRemainHour = time.convert(diff, TimeUnit.MILLISECONDS);
              long todayDoneHour = time.convert(today.getTime()-dateStart.getTime(),TimeUnit.MILLISECONDS);
              
              
              taskCard.setTaskName(taskName);
              taskCard.setTotalWork(workTarget);
              taskCard.setDeadLine(deadLineDate);
              taskCard.setWorkProgressBar(workTarget);
              taskCard.setWorkProgressBarValue(workComplete);
              taskCard.setDeadLineProgressBar((int)timeRemainHour);  // Upcoming Feature
              taskCard.setDeadLineProgressBarValue((int)todayDoneHour);
              
              
              taskCard.setSpinnerListener(taskId);
                   
              
              
              
              view.add(blank);
              view.add(taskCard);
              
              panelList[k] = taskCard;
              k++;
          }
          JPanel blank = new JPanel();
          blank.setSize(new Dimension(120,5));
          view.add(blank);
          }
          catch(Exception e){
              System.out.println("From AddTasCard Funtion");
              System.out.println(e);
          }
          view.setLayout(new BoxLayout(view, BoxLayout.Y_AXIS));
          JScrollPane ScrollPanel = new JScrollPane(view);
//          btn.setBackground(Color.CYAN);
//          TaskCardPanel task_1 = new TaskCardPanel();
     
          ScrollPanel.setBounds(80,0,taskPanel.getWidth()-80,taskPanel.getHeight());          
          ScrollPanel.setVisible(true);

          taskPanel.add(ScrollPanel);
          taskPanel.revalidate();
          System.out.println("It Works");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainSplitPane = new javax.swing.JSplitPane();
        leftSplit = new javax.swing.JPanel();
        btnProject = new javax.swing.JButton();
        btnTask = new javax.swing.JButton();
        btnSchedule = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        rightSplit = new javax.swing.JLayeredPane();
        projectPanel = new javax.swing.JPanel();
        taskPanel = new javax.swing.JPanel();
        btnTaskAdd = new javax.swing.JButton();
        btnTaskUpdate = new javax.swing.JButton();
        btnTaskDelete = new javax.swing.JButton();
        schedulePanel = new javax.swing.JPanel();
        historyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 680));

        mainSplitPane.setDividerLocation(146);
        mainSplitPane.setPreferredSize(new java.awt.Dimension(1080, 720));

        leftSplit.setBackground(new java.awt.Color(102, 102, 102));

        btnProject.setText("Project");
        btnProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjectActionPerformed(evt);
            }
        });

        btnTask.setText("Task");
        btnTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskActionPerformed(evt);
            }
        });

        btnSchedule.setText("Schedule");
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });

        btnHistory.setText("History");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftSplitLayout = new javax.swing.GroupLayout(leftSplit);
        leftSplit.setLayout(leftSplitLayout);
        leftSplitLayout.setHorizontalGroup(
            leftSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSplitLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(leftSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProject, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(btnSchedule, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(btnTask, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHistory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        leftSplitLayout.setVerticalGroup(
            leftSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSplitLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnProject, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnTask, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        mainSplitPane.setLeftComponent(leftSplit);

        rightSplit.setBackground(new java.awt.Color(255, 255, 255));
        rightSplit.setLayout(new java.awt.CardLayout());

        projectPanel.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout projectPanelLayout = new javax.swing.GroupLayout(projectPanel);
        projectPanel.setLayout(projectPanelLayout);
        projectPanelLayout.setHorizontalGroup(
            projectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        projectPanelLayout.setVerticalGroup(
            projectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        rightSplit.add(projectPanel, "card2");

        taskPanel.setBackground(new java.awt.Color(255, 0, 204));
        taskPanel.setPreferredSize(new java.awt.Dimension(1080, 720));

        btnTaskAdd.setText("Add");
        btnTaskAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskAddActionPerformed(evt);
            }
        });

        btnTaskUpdate.setText("Update");

        btnTaskDelete.setText("Delete");

        javax.swing.GroupLayout taskPanelLayout = new javax.swing.GroupLayout(taskPanel);
        taskPanel.setLayout(taskPanelLayout);
        taskPanelLayout.setHorizontalGroup(
            taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTaskUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTaskAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTaskDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(851, Short.MAX_VALUE))
        );
        taskPanelLayout.setVerticalGroup(
            taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnTaskAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnTaskUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                .addComponent(btnTaskDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        rightSplit.add(taskPanel, "card3");

        schedulePanel.setBackground(new java.awt.Color(204, 255, 51));

        javax.swing.GroupLayout schedulePanelLayout = new javax.swing.GroupLayout(schedulePanel);
        schedulePanel.setLayout(schedulePanelLayout);
        schedulePanelLayout.setHorizontalGroup(
            schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        schedulePanelLayout.setVerticalGroup(
            schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        rightSplit.add(schedulePanel, "card4");

        historyPanel.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout historyPanelLayout = new javax.swing.GroupLayout(historyPanel);
        historyPanel.setLayout(historyPanelLayout);
        historyPanelLayout.setHorizontalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        historyPanelLayout.setVerticalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        rightSplit.add(historyPanel, "card5");

        mainSplitPane.setRightComponent(rightSplit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjectActionPerformed
        // TODO add your handling code here:
        rightSplit.removeAll();
        rightSplit.add(projectPanel);
        rightSplit.repaint();
        rightSplit.revalidate();
    }//GEN-LAST:event_btnProjectActionPerformed

    private void btnTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskActionPerformed
        // TODO add your handling code here:
        rightSplit.removeAll();
        rightSplit.add(taskPanel);
        rightSplit.repaint();
        rightSplit.revalidate();
    }//GEN-LAST:event_btnTaskActionPerformed

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        // TODO add your handling code here:
        rightSplit.removeAll();
        rightSplit.add(schedulePanel);
        rightSplit.repaint();
        rightSplit.revalidate();
    }//GEN-LAST:event_btnScheduleActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        // TODO add your handling code here:
        rightSplit.removeAll();
        rightSplit.add(historyPanel);
        rightSplit.repaint();
        rightSplit.revalidate();
    }//GEN-LAST:event_btnHistoryActionPerformed
    
    private void btnTaskAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskAddActionPerformed
        // TODO add your handling code here:
        AddTaskFrame addFrame = new AddTaskFrame(this);
        addFrame.setLocationRelativeTo(null);
        this.setVisible(false);
        addFrame.setVisible(true);
        addFrame.pack();
    }//GEN-LAST:event_btnTaskAddActionPerformed

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
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnProject;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JButton btnTask;
    private javax.swing.JButton btnTaskAdd;
    private javax.swing.JButton btnTaskDelete;
    private javax.swing.JButton btnTaskUpdate;
    private javax.swing.JPanel historyPanel;
    private javax.swing.JPanel leftSplit;
    private javax.swing.JSplitPane mainSplitPane;
    private javax.swing.JPanel projectPanel;
    private javax.swing.JLayeredPane rightSplit;
    private javax.swing.JPanel schedulePanel;
    private javax.swing.JPanel taskPanel;
    // End of variables declaration//GEN-END:variables
}
