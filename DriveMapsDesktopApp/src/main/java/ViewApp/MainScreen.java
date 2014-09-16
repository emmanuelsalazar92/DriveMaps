////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componentes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
//
// Alumnos: 
//          Emmanuel Salazar
//          Cesar Peralta
//
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
package ViewApp;

import ControllerApp.EventController;
import javax.websocket.ClientEndpoint;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

/**
 *
 * @author Emmanuel
 */
@ClientEndpoint
public class MainScreen extends javax.swing.JFrame {

    EventController _Controller = new EventController();
    @OnOpen
    public void onOpen(Session pSession) 
    {
        System.out.println("Connected to endpoint: " + pSession.getBasicRemote());
    }
 
    @OnMessage
    public void onMessage(String pMessage) 
    {
        _Controller.GetMessage(pMessage);
    }
 
    @OnError
    public void onError(Throwable pTrace) 
    {
        pTrace.printStackTrace();
    }
    public MainScreen() {
        initComponents();
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this._AlertNewArea.setVisible(false);
        this._AlertNewItem.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _AreaName = new javax.swing.JTextField();
        _NewArea = new javax.swing.JLabel();
        _AddArea = new javax.swing.JButton();
        _AlertNewArea = new javax.swing.JLabel();
        _LblNewItem = new javax.swing.JLabel();
        _ItemName = new javax.swing.JTextField();
        _AddItem = new javax.swing.JButton();
        _AlertNewItem = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        _ItemPoints = new javax.swing.JTextField();
        _LblItemPoints = new javax.swing.JLabel();
        _NewMission = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        _AddArea1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        _AreaName.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N

        _NewArea.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _NewArea.setText("New Area");

        _AddArea.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _AddArea.setText("Add Area");
        _AddArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _AddAreaActionPerformed(evt);
            }
        });

        _AlertNewArea.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _AlertNewArea.setForeground(new java.awt.Color(255, 51, 51));
        _AlertNewArea.setText("New Area Inserted");

        _LblNewItem.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _LblNewItem.setText("New Item");

        _ItemName.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _ItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _ItemNameActionPerformed(evt);
            }
        });

        _AddItem.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _AddItem.setText("Add Item");
        _AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _AddItemActionPerformed(evt);
            }
        });

        _AlertNewItem.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _AlertNewItem.setForeground(new java.awt.Color(255, 51, 51));
        _AlertNewItem.setText("New Item Inserted");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        _ItemPoints.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _ItemPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _ItemPointsActionPerformed(evt);
            }
        });

        _LblItemPoints.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _LblItemPoints.setText("Item Points");

        _NewMission.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _NewMission.setText("New Mission");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        _AddArea1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _AddArea1.setText("Add Mission");
        _AddArea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _AddArea1ActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(_AlertNewItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_ItemName)
                    .addComponent(_LblNewItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_LblItemPoints, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(_ItemPoints, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(_AddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(_AddArea, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(_NewArea, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(_AreaName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_AlertNewArea)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(_NewMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(_AddArea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(_LblNewItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_ItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_LblItemPoints)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_ItemPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_AddItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_AlertNewItem))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(_NewArea)
                                .addComponent(_NewMission))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(_AreaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(_AddArea)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(_AlertNewArea)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_AddArea1))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(507, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _AddAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__AddAreaActionPerformed
        // TODO add your handling code here:
        _Controller.AddAreaController(evt, this);
        this.setVisible(false);
    }//GEN-LAST:event__AddAreaActionPerformed

    private void _AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__AddItemActionPerformed
        // TODO add your handling code here:
        _Controller.AddItemController(evt, this);
        this.setVisible(false);
    }//GEN-LAST:event__AddItemActionPerformed

    private void _ItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__ItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__ItemNameActionPerformed

    private void _ItemPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__ItemPointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__ItemPointsActionPerformed

    private void _AddArea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__AddArea1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__AddArea1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _AddArea;
    private javax.swing.JButton _AddArea1;
    private javax.swing.JButton _AddItem;
    private javax.swing.JLabel _AlertNewArea;
    private javax.swing.JLabel _AlertNewItem;
    private javax.swing.JTextField _AreaName;
    private javax.swing.JTextField _ItemName;
    private javax.swing.JTextField _ItemPoints;
    private javax.swing.JLabel _LblItemPoints;
    private javax.swing.JLabel _LblNewItem;
    private javax.swing.JLabel _NewArea;
    private javax.swing.JLabel _NewMission;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JTextField getAreaName()
    {
        return this._AreaName;
    }
    public void setAlertNewArea(boolean pStatus)
    {
        this._AlertNewArea.setVisible(pStatus);
    }
    public void setAlertNewItem(boolean pStatus)
    {
        this._AlertNewItem.setVisible(pStatus);
    } 
    public javax.swing.JTextField getItemName()
    {
        return this._ItemName;
    }
    public javax.swing.JTextField getItemPoints()
    {
        return this._ItemPoints;
    }    
}
