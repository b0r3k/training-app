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
public class PendingRequestsForm extends javax.swing.JFrame {

    private App model;
    private SportAdvisor sportAdvisor;
    /** Creates new form PendingRequestsForm */
    public PendingRequestsForm() {
        initComponents();
    }
    
    public PendingRequestsForm(App m, SportAdvisor sa) {
        initComponents();
        
        this.model = m;
        this.sportAdvisor = sa;
        this.requestsList.setListData(this.sportAdvisor.ViewRequestsAthletesInfos());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        acceptDeclineButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestsList = new javax.swing.JList<>();
        confirmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        pendingRequestsLabel = new javax.swing.JLabel();
        acceptRadioButton = new javax.swing.JRadioButton();
        declineRadioButton = new javax.swing.JRadioButton();

        jScrollPane1.setViewportView(requestsList);

        confirmButton.setText("Confirm!");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        pendingRequestsLabel.setText("Your pending requests:");

        acceptDeclineButtonGroup.add(acceptRadioButton);
        acceptRadioButton.setText("Accept");

        acceptDeclineButtonGroup.add(declineRadioButton);
        declineRadioButton.setText("Decline");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(confirmButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, backButton)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, pendingRequestsLabel)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(acceptRadioButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(declineRadioButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(backButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(pendingRequestsLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 12, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 145, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(acceptRadioButton)
                    .add(declineRadioButton))
                .add(7, 7, 7)
                .add(confirmButton)
                .add(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        if(this.requestsList.isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "Select a request!");
        }
        else{
            int requestIndex = this.requestsList.getSelectedIndex();
            AvailabilityRequest selectedRequest = this.sportAdvisor.getPendingRequests().get(requestIndex);
            if (acceptRadioButton.isSelected()){    
                Athlete athleteAsking = selectedRequest.getAthleteAsking();
                this.sportAdvisor.AddAthleteToGroup(athleteAsking);
                if(this.sportAdvisor instanceof Coach){
                    athleteAsking.setHasCoach(true);
                }
                else if (this.sportAdvisor instanceof Nutritionist){
                    athleteAsking.setHasNutritionist(true);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Unknown error, this should not happen!");
                }
                this.sportAdvisor.RemoveRequestFromIndex(requestIndex);
                this.requestsList.setListData(this.sportAdvisor.ViewRequestsAthletesInfos());
                JOptionPane.showMessageDialog(this, "Athlete added to your group!");
            }
            else if(declineRadioButton.isSelected()){
                this.sportAdvisor.RemoveRequestFromIndex(requestIndex);
                this.requestsList.setListData(this.sportAdvisor.ViewRequestsAthletesInfos());
                JOptionPane.showMessageDialog(this, "Request declined!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Choose what to do with the request!");
            }
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PendingRequestsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendingRequestsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendingRequestsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendingRequestsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendingRequestsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup acceptDeclineButtonGroup;
    private javax.swing.JRadioButton acceptRadioButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JRadioButton declineRadioButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pendingRequestsLabel;
    private javax.swing.JList<String> requestsList;
    // End of variables declaration//GEN-END:variables

}
