/**
 * Copyright (c) The openTCS Authors.
 *
 * This program is free software and subject to the MIT license. (For details,
 * see the licensing information (LICENSE.txt) you should have received with
 * this copy of the software.)
 */
package org.opentcs.kernelcontrolcenter;

import java.awt.Frame;
import javax.swing.JDialog;
import org.opentcs.util.Environment;

/**
 * An about dialog.
 *
 * @author Stefan Walter (Fraunhofer IML)
 */
public class AboutDialog
    extends JDialog {

  /**
   * Creates new AboutDialog.
   *
   * @param parent The parent frame.
   * @param modal
   */
  public AboutDialog(Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
  }

  // CHECKSTYLE:OFF
  /**
   * This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    logoPanel = new javax.swing.JPanel();
    opentcsLogoLbl = new javax.swing.JLabel();
    imlLogoLbl = new javax.swing.JLabel();
    ifakLogoLbl = new javax.swing.JLabel();
    contactPanel = new javax.swing.JPanel();
    opentcsContactPanel = new javax.swing.JPanel();
    opentcsLbl = new javax.swing.JLabel();
    versionLbl = new javax.swing.JLabel();
    versionTxtLbl = new javax.swing.JLabel();
    customVersionLbl = new javax.swing.JLabel();
    customVersionTxtLbl = new javax.swing.JLabel();
    homepageLbl = new javax.swing.JLabel();
    homepageTxtLbl = new javax.swing.JLabel();
    emailLbl = new javax.swing.JLabel();
    emailTxtLbl = new javax.swing.JLabel();
    instututesPanel = new javax.swing.JPanel();
    imlPanel = new javax.swing.JPanel();
    fraunhoferImlLbl = new javax.swing.JLabel();
    homepageImlLbl = new javax.swing.JLabel();
    homepageImlTxtLbl = new javax.swing.JLabel();
    emailImlLbl = new javax.swing.JLabel();
    emailImlTxtLbl = new javax.swing.JLabel();
    ifakPanel = new javax.swing.JPanel();
    ifakLbl = new javax.swing.JLabel();
    homepageIfakLbl = new javax.swing.JLabel();
    homepageIfakTxtLbl = new javax.swing.JLabel();
    emailIfakLbl = new javax.swing.JLabel();
    emailIfakTxtLbl = new javax.swing.JLabel();
    fillingLbl = new javax.swing.JLabel();
    closeButton = new javax.swing.JButton();
    fillingLbl2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/opentcs/kernelcontrolcenter/Bundle"); // NOI18N
    setTitle(bundle.getString("AboutDialog.AboutOpenTCS")); // NOI18N
    setResizable(false);
    getContentPane().setLayout(new java.awt.GridBagLayout());

    logoPanel.setBackground(new java.awt.Color(255, 255, 255));
    logoPanel.setLayout(new java.awt.GridBagLayout());

    opentcsLogoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    opentcsLogoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/opentcs/kernelcontrolcenter/res/logos/opentcs.gif"))); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    logoPanel.add(opentcsLogoLbl, gridBagConstraints);

    imlLogoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/opentcs/kernelcontrolcenter/res/logos/fraunhofer-iml-logo.png"))); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
    logoPanel.add(imlLogoLbl, gridBagConstraints);

    ifakLogoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/opentcs/kernelcontrolcenter/res/logos/ifak-logo.png"))); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 5);
    logoPanel.add(ifakLogoLbl, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.ipadx = 6;
    gridBagConstraints.ipady = 6;
    getContentPane().add(logoPanel, gridBagConstraints);

    contactPanel.setLayout(new javax.swing.BoxLayout(contactPanel, javax.swing.BoxLayout.Y_AXIS));

    opentcsContactPanel.setLayout(new java.awt.GridBagLayout());

    opentcsLbl.setFont(opentcsLbl.getFont().deriveFont(opentcsLbl.getFont().getStyle() | java.awt.Font.BOLD));
    opentcsLbl.setText("open Transportation Control System");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
    opentcsContactPanel.add(opentcsLbl, gridBagConstraints);

    versionLbl.setText(bundle.getString("AboutDialog.BaselineVersion")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    opentcsContactPanel.add(versionLbl, gridBagConstraints);

    versionTxtLbl.setText(Environment.getBaselineVersion());
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
    opentcsContactPanel.add(versionTxtLbl, gridBagConstraints);

    customVersionLbl.setText(bundle.getString("AboutDialog.CustomVersion")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    opentcsContactPanel.add(customVersionLbl, gridBagConstraints);

    customVersionTxtLbl.setText(Environment.getCustomizationName() + " " + Environment.getCustomizationVersion());
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
    opentcsContactPanel.add(customVersionTxtLbl, gridBagConstraints);

    homepageLbl.setText(bundle.getString("AboutDialog.HomePage")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    opentcsContactPanel.add(homepageLbl, gridBagConstraints);

    homepageTxtLbl.setText("http://www.opentcs.org/");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
    opentcsContactPanel.add(homepageTxtLbl, gridBagConstraints);

    emailLbl.setText(bundle.getString("AboutDialog.Email")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    opentcsContactPanel.add(emailLbl, gridBagConstraints);

    emailTxtLbl.setText("info@opentcs.org");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
    opentcsContactPanel.add(emailTxtLbl, gridBagConstraints);

    contactPanel.add(opentcsContactPanel);

    instututesPanel.setLayout(new javax.swing.BoxLayout(instututesPanel, javax.swing.BoxLayout.LINE_AXIS));

    imlPanel.setLayout(new java.awt.GridBagLayout());

    fraunhoferImlLbl.setFont(fraunhoferImlLbl.getFont().deriveFont(fraunhoferImlLbl.getFont().getStyle() | java.awt.Font.BOLD));
    fraunhoferImlLbl.setText(bundle.getString("AboutDialog.FraunhoferIML")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
    imlPanel.add(fraunhoferImlLbl, gridBagConstraints);

    homepageImlLbl.setText(bundle.getString("AboutDialog.HomePage")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    imlPanel.add(homepageImlLbl, gridBagConstraints);

    homepageImlTxtLbl.setText("http://www.iml.fraunhofer.de/");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
    imlPanel.add(homepageImlTxtLbl, gridBagConstraints);

    emailImlLbl.setText(bundle.getString("AboutDialog.Email")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    imlPanel.add(emailImlLbl, gridBagConstraints);

    emailImlTxtLbl.setText("stefan.walter@iml.fraunhofer.de");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
    imlPanel.add(emailImlTxtLbl, gridBagConstraints);

    instututesPanel.add(imlPanel);

    ifakPanel.setLayout(new java.awt.GridBagLayout());

    ifakLbl.setFont(ifakLbl.getFont().deriveFont(ifakLbl.getFont().getStyle() | java.awt.Font.BOLD));
    ifakLbl.setText(bundle.getString("AboutDialog.ifak")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
    ifakPanel.add(ifakLbl, gridBagConstraints);

    homepageIfakLbl.setText(bundle.getString("AboutDialog.HomePage")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 7;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    ifakPanel.add(homepageIfakLbl, gridBagConstraints);

    homepageIfakTxtLbl.setText("http://www.ifak.eu/");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 7;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
    ifakPanel.add(homepageIfakTxtLbl, gridBagConstraints);

    emailIfakLbl.setText(bundle.getString("AboutDialog.Email")); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    ifakPanel.add(emailIfakLbl, gridBagConstraints);

    emailIfakTxtLbl.setText("sebastian.naumann@ifak.eu");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
    ifakPanel.add(emailIfakTxtLbl, gridBagConstraints);

    instututesPanel.add(ifakPanel);

    contactPanel.add(instututesPanel);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    getContentPane().add(contactPanel, gridBagConstraints);

    fillingLbl.setText(" ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weighty = 1.0;
    getContentPane().add(fillingLbl, gridBagConstraints);

    closeButton.setText(bundle.getString("AboutDialog.CloseButtonText")); // NOI18N
    closeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        closeButtonActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    getContentPane().add(closeButton, gridBagConstraints);

    fillingLbl2.setText(" ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weighty = 1.0;
    getContentPane().add(fillingLbl2, gridBagConstraints);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
    this.setVisible(false);
  }//GEN-LAST:event_closeButtonActionPerformed
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton closeButton;
  private javax.swing.JPanel contactPanel;
  private javax.swing.JLabel customVersionLbl;
  private javax.swing.JLabel customVersionTxtLbl;
  private javax.swing.JLabel emailIfakLbl;
  private javax.swing.JLabel emailIfakTxtLbl;
  private javax.swing.JLabel emailImlLbl;
  private javax.swing.JLabel emailImlTxtLbl;
  private javax.swing.JLabel emailLbl;
  private javax.swing.JLabel emailTxtLbl;
  private javax.swing.JLabel fillingLbl;
  private javax.swing.JLabel fillingLbl2;
  private javax.swing.JLabel fraunhoferImlLbl;
  private javax.swing.JLabel homepageIfakLbl;
  private javax.swing.JLabel homepageIfakTxtLbl;
  private javax.swing.JLabel homepageImlLbl;
  private javax.swing.JLabel homepageImlTxtLbl;
  private javax.swing.JLabel homepageLbl;
  private javax.swing.JLabel homepageTxtLbl;
  private javax.swing.JLabel ifakLbl;
  private javax.swing.JLabel ifakLogoLbl;
  private javax.swing.JPanel ifakPanel;
  private javax.swing.JLabel imlLogoLbl;
  private javax.swing.JPanel imlPanel;
  private javax.swing.JPanel instututesPanel;
  private javax.swing.JPanel logoPanel;
  private javax.swing.JPanel opentcsContactPanel;
  private javax.swing.JLabel opentcsLbl;
  private javax.swing.JLabel opentcsLogoLbl;
  private javax.swing.JLabel versionLbl;
  private javax.swing.JLabel versionTxtLbl;
  // End of variables declaration//GEN-END:variables
  // CHECKSTYLE:ON
}
