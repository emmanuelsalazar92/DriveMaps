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
import CommonClassesApp.MessageMain;
import SocketApp.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.Arrays;
import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
import ControllerApp.EventController;
import LogicApp.LogicAccess;
import javax.websocket.ClientEndpoint;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
@ClientEndpoint
public class StartScreen extends javax.swing.JFrame {
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
    
    public StartScreen() {
        initComponents();
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this._LblError.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _LblAdministratorUser = new javax.swing.JLabel();
        _LblPassword = new javax.swing.JLabel();
        _TextUserName = new javax.swing.JTextField();
        _TextUserPassword = new javax.swing.JPasswordField();
        _BtnSignUp = new javax.swing.JButton();
        _LblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        _LblAdministratorUser.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        _LblAdministratorUser.setText("Administrator User");
        _LblAdministratorUser.setToolTipText("");

        _LblPassword.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        _LblPassword.setText("Password");

        _TextUserName.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N

        _TextUserPassword.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N

        _BtnSignUp.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        _BtnSignUp.setText("Sign Up");
        _BtnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _BtnSignUpActionPerformed(evt);
            }
        });

        _LblError.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        _LblError.setForeground(new java.awt.Color(255, 0, 0));
        _LblError.setText("Error: Please check your credentials");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_LblError)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(_TextUserPassword)
                        .addComponent(_LblPassword)
                        .addComponent(_TextUserName)
                        .addComponent(_LblAdministratorUser)
                        .addComponent(_BtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_LblAdministratorUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_TextUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(_LblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_TextUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_BtnSignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_LblError)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _BtnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__BtnSignUpActionPerformed
        // TODO add your handling code here:
        _Controller.StartScreenController(evt, this);
        this.setVisible(false);


    }//GEN-LAST:event__BtnSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _BtnSignUp;
    private javax.swing.JLabel _LblAdministratorUser;
    public javax.swing.JLabel _LblError;
    private javax.swing.JLabel _LblPassword;
    private javax.swing.JTextField _TextUserName;
    private javax.swing.JPasswordField _TextUserPassword;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JPasswordField getTextUserPassword()
    {
        return this._TextUserPassword;
    }
    public javax.swing.JTextField getTextUserNAme()
    {
        return this._TextUserName;
    }
    public void setLblError(boolean pStatus)
    {
        this._LblError.setVisible(pStatus);
    } 
}
