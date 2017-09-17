/*
 * Copyright (c) 2017 Microchip Technology Inc. and its subsidiaries (Microchip). All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.microchip.mplab.nbide.embedded.arduino.wizard;

import com.microchip.mplab.nbide.embedded.arduino.importer.Platform;
import java.awt.Component;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.IllegalCharsetNameException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.UIResource;
import org.openide.util.NbBundle;
import org.openide.util.NbPreferences;

class ProjectSetupPanel extends JPanel {

    
    private final ProjectSetupStep control;  // R.I.P. Sir John Vincent Hurt (22 January 1940 – 25 January 2017)
    

    public ProjectSetupPanel(ProjectSetupStep control) {
        this.control = control;
        setName( NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.title") );
        initComponents();        
        encodingCombo.setRenderer( new EncodingRenderer() );
        platformCombo.setRenderer( new PlatformRenderer() );
    }

    /**
     * This method is called from within the constructor to initialise the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel sourceProjectLocationLabel = new javax.swing.JLabel();
        sourceProjectLocationField = new javax.swing.JTextField();
        javax.swing.JButton sourceProjectLocationButton = new javax.swing.JButton();
        javax.swing.JLabel targetProjectLocationLabel = new javax.swing.JLabel();
        javax.swing.JButton targetProjectLocationButton = new javax.swing.JButton();
        targetProjectLocationField = new javax.swing.JTextField();
        javax.swing.JLabel arduinoLocationLabel = new javax.swing.JLabel();
        arduinoLocationField = new javax.swing.JTextField();
        javax.swing.JButton arduinoLocationButton = new javax.swing.JButton();
        javax.swing.JLabel platformLabel = new javax.swing.JLabel();
        platformCombo = new javax.swing.JComboBox<>();
        javax.swing.JLabel platformLocationLabel = new javax.swing.JLabel();
        platformLocationField = new javax.swing.JTextField();
        javax.swing.JButton platformLocationButton = new javax.swing.JButton();
        javax.swing.JLabel boardLabel = new javax.swing.JLabel();
        boardCombo = new javax.swing.JComboBox<>();
        javax.swing.JLabel projectNameLabel = new javax.swing.JLabel();
        projectNameField = new javax.swing.JTextField();
        javax.swing.JLabel projectDirectoryLabel = new javax.swing.JLabel();
        projectDirectoryField = new javax.swing.JTextField();
        javax.swing.JLabel encodingLabel = new javax.swing.JLabel();
        encodingCombo = new javax.swing.JComboBox<>();
        javax.swing.JLabel infoLabel = new javax.swing.JLabel();
        copyDependenciesCheckBox = new javax.swing.JCheckBox();
        overwriteCheckBox = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(sourceProjectLocationLabel, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.sourceProjectLocationLabel.text")); // NOI18N

        sourceProjectLocationField.setText(org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.sourceProjectLocationField.text")); // NOI18N
        sourceProjectLocationField.setToolTipText(org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.sourceProjectLocationField.toolTipText")); // NOI18N
        sourceProjectLocationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceProjectLocationFieldActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(sourceProjectLocationButton, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.sourceProjectLocationButton.text")); // NOI18N
        sourceProjectLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceProjectLocationButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(targetProjectLocationLabel, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.targetProjectLocationLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(targetProjectLocationButton, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.targetProjectLocationButton.text")); // NOI18N
        targetProjectLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetProjectLocationButtonActionPerformed(evt);
            }
        });

        targetProjectLocationField.setText(org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.targetProjectLocationField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(arduinoLocationLabel, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.arduinoLocationLabel.text")); // NOI18N

        arduinoLocationField.setText(org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.arduinoLocationField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(arduinoLocationButton, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.arduinoLocationButton.text")); // NOI18N
        arduinoLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arduinoLocationButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(platformLabel, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.platformLabel.text")); // NOI18N

        platformCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                platformComboItemStateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(platformLocationLabel, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.platformLocationLabel.text")); // NOI18N

        platformLocationField.setEditable(false);
        platformLocationField.setText(org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.platformLocationField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(platformLocationButton, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.platformLocationButton.text")); // NOI18N
        platformLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platformLocationButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(boardLabel, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.boardLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(projectNameLabel, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.projectNameLabel.text")); // NOI18N

        projectNameField.setText(org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.projectNameField.text")); // NOI18N
        projectNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                projectNameFieldKeyReleased(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(projectDirectoryLabel, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.projectDirectoryLabel.text")); // NOI18N

        projectDirectoryField.setEditable(false);
        projectDirectoryField.setText(org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.projectDirectoryField.text")); // NOI18N
        projectDirectoryField.setToolTipText(org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.projectDirectoryField.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(encodingLabel, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.encodingLabel.text")); // NOI18N

        infoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/microchip/mplab/nbide/embedded/arduino/wizard/info_48.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(infoLabel, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.infoLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(copyDependenciesCheckBox, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.copyDependenciesCheckBox.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(overwriteCheckBox, org.openide.util.NbBundle.getMessage(ProjectSetupPanel.class, "ProjectSetupPanel.overwriteCheckBox.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(encodingLabel)
                            .addComponent(projectDirectoryLabel)
                            .addComponent(projectNameLabel)
                            .addComponent(boardLabel)
                            .addComponent(platformLocationLabel)
                            .addComponent(platformLabel)
                            .addComponent(arduinoLocationLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(targetProjectLocationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sourceProjectLocationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sourceProjectLocationField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sourceProjectLocationButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(arduinoLocationField)
                                    .addComponent(targetProjectLocationField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(targetProjectLocationButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(arduinoLocationButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(platformCombo, 0, 477, Short.MAX_VALUE)
                            .addComponent(boardCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(platformLocationField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(platformLocationButton))
                            .addComponent(projectNameField)
                            .addComponent(projectDirectoryField)
                            .addComponent(encodingCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(copyDependenciesCheckBox)
                                    .addComponent(overwriteCheckBox))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sourceProjectLocationLabel)
                    .addComponent(sourceProjectLocationButton)
                    .addComponent(sourceProjectLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(targetProjectLocationLabel)
                    .addComponent(targetProjectLocationButton)
                    .addComponent(targetProjectLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arduinoLocationLabel)
                    .addComponent(arduinoLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arduinoLocationButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(platformLabel)
                    .addComponent(platformCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(platformLocationLabel)
                    .addComponent(platformLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(platformLocationButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boardLabel)
                    .addComponent(boardCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectNameLabel)
                    .addComponent(projectNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectDirectoryLabel)
                    .addComponent(projectDirectoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encodingLabel)
                    .addComponent(encodingCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(copyDependenciesCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overwriteCheckBox)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sourceProjectLocationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceProjectLocationFieldActionPerformed
        control.sourceProjectLocationButtonActionPerformed(evt);
    }//GEN-LAST:event_sourceProjectLocationFieldActionPerformed

    private void targetProjectLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetProjectLocationButtonActionPerformed
        control.targetProjectLocationButtonActionPerformed(evt);
    }//GEN-LAST:event_targetProjectLocationButtonActionPerformed

    private void arduinoLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arduinoLocationButtonActionPerformed
        control.arduinoLocationButtonActionPerformed(evt);
    }//GEN-LAST:event_arduinoLocationButtonActionPerformed

    private void sourceProjectLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceProjectLocationButtonActionPerformed
        control.sourceProjectLocationButtonActionPerformed(evt);
    }//GEN-LAST:event_sourceProjectLocationButtonActionPerformed

    private void platformLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platformLocationButtonActionPerformed
        control.platformLocationButtonActionPerformed(evt);
    }//GEN-LAST:event_platformLocationButtonActionPerformed

    private void projectNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_projectNameFieldKeyReleased
        control.projectNameFieldKeyReleased(evt);
    }//GEN-LAST:event_projectNameFieldKeyReleased

    private void platformComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_platformComboItemStateChanged
        control.platformComboItemStateChanged(evt);
    }//GEN-LAST:event_platformComboItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField arduinoLocationField;
    protected javax.swing.JComboBox<String> boardCombo;
    protected javax.swing.JCheckBox copyDependenciesCheckBox;
    protected javax.swing.JComboBox<Charset> encodingCombo;
    protected javax.swing.JCheckBox overwriteCheckBox;
    protected javax.swing.JComboBox<Platform> platformCombo;
    protected javax.swing.JTextField platformLocationField;
    protected javax.swing.JTextField projectDirectoryField;
    protected javax.swing.JTextField projectNameField;
    protected javax.swing.JTextField sourceProjectLocationField;
    protected javax.swing.JTextField targetProjectLocationField;
    // End of variables declaration//GEN-END:variables

    private static class EncodingRenderer extends JLabel implements ListCellRenderer<Charset>, UIResource {

        public EncodingRenderer() {
            setOpaque(true);            
        }

        @Override
        public Component getListCellRendererComponent(JList list, Charset value, int index, boolean isSelected, boolean cellHasFocus) {
            setName("ComboBox.listRenderer"); // NOI18N
            setText( value.displayName() );
            setIcon(null);
            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }
            return this;
        }

        @Override
        public String getName() {
            String name = super.getName();
            return name == null ? "ComboBox.renderer" : name; // NOI18N
        }
    }
    
    
    private static class PlatformRenderer extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel component = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if ( value instanceof Platform ) {
                component.setText( ((Platform) value).getDisplayName() );
            }
            return component;
        }
        
    }

}
