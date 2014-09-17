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


public class MainScreen extends javax.swing.JFrame {

    
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

        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        _TabArea = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        _NewArea = new javax.swing.JLabel();
        _AreaName = new javax.swing.JTextField();
        _AddArea = new javax.swing.JButton();
        _AlertNewArea = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        _AlertNewItem = new javax.swing.JLabel();
        _LblItemPoints = new javax.swing.JLabel();
        _ItemPoints = new javax.swing.JTextField();
        _AddItem = new javax.swing.JButton();
        _ItemName = new javax.swing.JTextField();
        _LblNewItem = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        _NewArea.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _NewArea.setText("New Area");

        _AreaName.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(_NewArea, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(_AreaName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(_AddArea, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 492, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(_AlertNewArea)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(_NewArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_AlertNewArea)
                .addGap(2, 2, 2)
                .addComponent(_AreaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_AddArea)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        _TabArea.addTab("Area", jPanel1);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        _AlertNewItem.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _AlertNewItem.setForeground(new java.awt.Color(255, 51, 51));
        _AlertNewItem.setText("New Item Inserted");

        _LblItemPoints.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _LblItemPoints.setText("Item Points");

        _ItemPoints.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _ItemPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _ItemPointsActionPerformed(evt);
            }
        });

        _AddItem.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _AddItem.setText("Add Item");
        _AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _AddItemActionPerformed(evt);
            }
        });

        _ItemName.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _ItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _ItemNameActionPerformed(evt);
            }
        });

        _LblNewItem.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        _LblNewItem.setText("New Item");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(_AlertNewItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_ItemName)
                    .addComponent(_LblNewItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_LblItemPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_ItemPoints)
                    .addComponent(_AddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                        .addComponent(_AlertNewItem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        _TabArea.addTab("Item", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );

        _TabArea.addTab("Destiny", jPanel3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );

        _TabArea.addTab("Players", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );

        _TabArea.addTab(" Ranking", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_TabArea)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_TabArea, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addContainerGap())
        );

        _TabArea.getAccessibleContext().setAccessibleName("Area");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _AddAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__AddAreaActionPerformed
        // TODO add your handling code here:
        EventController _Controller = new EventController();
        _Controller.AddAreaController(evt, this);
        this.setVisible(false);
    }//GEN-LAST:event__AddAreaActionPerformed

    private void _AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__AddItemActionPerformed
        // TODO add your handling code here:
        EventController _Controller = new EventController();
        _Controller.AddItemController(evt, this);
        this.setVisible(false);
    }//GEN-LAST:event__AddItemActionPerformed

    private void _ItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__ItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__ItemNameActionPerformed

    private void _ItemPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__ItemPointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__ItemPointsActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _AddArea;
    private javax.swing.JButton _AddItem;
    private javax.swing.JLabel _AlertNewArea;
    private javax.swing.JLabel _AlertNewItem;
    private javax.swing.JTextField _AreaName;
    private javax.swing.JTextField _ItemName;
    private javax.swing.JTextField _ItemPoints;
    private javax.swing.JLabel _LblItemPoints;
    private javax.swing.JLabel _LblNewItem;
    private javax.swing.JLabel _NewArea;
    private javax.swing.JTabbedPane _TabArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
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
