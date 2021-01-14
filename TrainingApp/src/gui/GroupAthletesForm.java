/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import model.*;
import javax.swing.JOptionPane;
/**
 *
 * @author borek
 */
public class GroupAthletesForm extends javax.swing.JFrame {

    private App model;
    private SportAdvisor sportAdvisor;
    /** Creates new form GroupAthletesForm */
    public GroupAthletesForm() {
        initComponents();
    }
    
    public GroupAthletesForm(App m, SportAdvisor sa) {
        initComponents();
        
        this.model = m;
        this.sportAdvisor = sa;
        this.athletesList.setListData(this.sportAdvisor.ViewGroupAthletesNames());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        athletesList = new javax.swing.JList<>();
        backButton = new javax.swing.JButton();
        openAthleteButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(athletesList);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        openAthleteButton.setText("Open Athlete");
        openAthleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAthleteButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove From Group");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(backButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(openAthleteButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(removeButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .add(backButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(openAthleteButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(removeButton))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 246, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        var newGui = new javax.swing.JFrame();
        if(this.sportAdvisor instanceof Coach){
            newGui = new CoachViewForm(this.model, (Coach)this.sportAdvisor);
        }
        else if(this.sportAdvisor instanceof Nutritionist){
            newGui = new NutritionistViewForm(this.model, (Nutritionist)this.sportAdvisor);
        }
        else{
                JOptionPane.showMessageDialog(this, "Unknown error, this should not happen!");
        }
        newGui.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void openAthleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openAthleteButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        if(this.athletesList.isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "Select an Athlete!");
        }
        else{
            int userIndex = this.athletesList.getSelectedIndex();
            Athlete selectedAthlete = this.sportAdvisor.getGroupAthletes().get(userIndex);
            selectedAthlete.OrderPlans();
            
            var newGui = new javax.swing.JFrame();
            if(this.sportAdvisor instanceof Coach){
                newGui = new WatchAthleteCoachForm(this.model, (Coach)this.sportAdvisor, selectedAthlete);
            }
            else if(this.sportAdvisor instanceof Nutritionist){
                newGui = new WatchAthleteNutrForm(this.model, (Nutritionist)this.sportAdvisor,selectedAthlete );
            }
            else{
                JOptionPane.showMessageDialog(this, "Unknown error, this should not happen!");
            }
            newGui.setVisible(true);
        }
    }//GEN-LAST:event_openAthleteButtonActionPerformed
    
    
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        if(this.athletesList.isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "Select an athlete!");
        }
        else{
            int athleteIndex = this.athletesList.getSelectedIndex();
            this.sportAdvisor.RemoveAthleteFromIndex(athleteIndex);
            this.athletesList.setListData(this.sportAdvisor.ViewGroupAthletesNames());
            JOptionPane.showMessageDialog(this, "Athlete removed!");
        }
    }//GEN-LAST:event_removeButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(GroupAthletesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroupAthletesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroupAthletesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroupAthletesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroupAthletesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> athletesList;
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openAthleteButton;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables

}
