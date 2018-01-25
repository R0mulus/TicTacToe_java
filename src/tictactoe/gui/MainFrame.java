/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author Jozo
 */
public class MainFrame extends javax.swing.JFrame {

    private PlayerType player;
    private boolean gameEnd;
    private List<JButton> buttons = new ArrayList();
            
    public MainFrame() {
        initComponents();
        setTitle("Tic Tac Toe");
        fillButtons();
        player = PlayerType.X;
        gameEnd = false;
        changePlayerLabel();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        lblTurn = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuNew = new javax.swing.JMenuItem();
        menuSwitchPlayer = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuAuthor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        lblTurn.setText(" ");

        jMenu1.setText("Control");

        menuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuNew.setText("New");
        menuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewActionPerformed(evt);
            }
        });
        jMenu1.add(menuNew);

        menuSwitchPlayer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuSwitchPlayer.setText("Switch player");
        menuSwitchPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSwitchPlayerActionPerformed(evt);
            }
        });
        jMenu1.add(menuSwitchPlayer);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");

        menuAuthor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuAuthor.setText("Who created this?");
        menuAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAuthorActionPerformed(evt);
            }
        });
        jMenu2.add(menuAuthor);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTurn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTurn)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        changeBtnTxt(btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        changeBtnTxt(btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        changeBtnTxt(btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        changeBtnTxt(btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        changeBtnTxt(btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        changeBtnTxt(btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        changeBtnTxt(btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        changeBtnTxt(btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        changeBtnTxt(btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void menuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewActionPerformed
        startNewGame();
    }//GEN-LAST:event_menuNewActionPerformed

    private void menuSwitchPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSwitchPlayerActionPerformed
        if(isGameInProgress()){
            JOptionPane.showMessageDialog(null, "Can switch players only at the start of a new game!", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }else{
            changePlayer();
        }
    }//GEN-LAST:event_menuSwitchPlayerActionPerformed

    private void menuAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAuthorActionPerformed
        JOptionPane.showMessageDialog(null, "©J.B. 2018", "My lovely author", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuAuthorActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void changePlayerLabel(){
        switch(player){
            case X:lblTurn.setText("X's turn");break;
            case O:lblTurn.setText("O's turn");break;
            default:lblTurn.setText("");
        }
    }
    
    private boolean isGameInProgress(){
        for(JButton btn:buttons){
            if(!isBtnTxtEmpty(btn)){
                return true;
            }
        }
        return false;
    }
    
    private void startNewGame(){
        gameEnd = false;
        for(JButton btn:buttons){
            btn.setText("");
        }
    }
    
    private void changePlayer(){
        //player == PlayerType.X ? player = PlayerType.O : player = PlayerType.X;
        
        
        checkForWin();
        annouceWinner();
        if(!gameEnd){
            if(player == PlayerType.X){
                player = PlayerType.O;
            }else{
                player = PlayerType.X;
            }
            changePlayerLabel();
        }
    }
    
    private void changeBtnTxt(JButton btn){
        if(isBtnTxtEmpty(btn)){
            if(player == PlayerType.X){
                btn.setText("X");
            }else{
                btn.setText("O");
            }
            changePlayer();
        }
    }
    
    private boolean areAllButtonsUsed(){
        for(JButton btn:buttons){
            if(isBtnTxtEmpty(btn)){
                return false;
            }
        }
        player = PlayerType.N;
        return true;
    }
    
    private boolean isBtnTxtEmpty(JButton btn){
        return btn.getText().trim().isEmpty();
    }
    
    private void fillButtons(){
        buttons.add(btn1);
        buttons.add(btn2);
        buttons.add(btn3);
        buttons.add(btn4);
        buttons.add(btn5);
        buttons.add(btn6);
        buttons.add(btn7);
        buttons.add(btn8);
        buttons.add(btn9);
    }
    
    private void checkForWin(){
        if(btn1.getText().equals(btn2.getText()) &&
           btn1.getText().equals(btn3.getText()) &&
           btn2.getText().equals(btn3.getText()) &&
           !isBtnTxtEmpty(btn1)){
            gameEnd = true;
        }else if(btn4.getText().equals(btn5.getText()) &&
                 btn4.getText().equals(btn6.getText()) &&
                 btn5.getText().equals(btn6.getText()) &&
           !isBtnTxtEmpty(btn4)){
            gameEnd = true;
        }else if(btn7.getText().equals(btn8.getText()) &&
                 btn7.getText().equals(btn9.getText()) &&
                 btn8.getText().equals(btn9.getText()) &&
           !isBtnTxtEmpty(btn7)){
            gameEnd = true;
        }else if(btn1.getText().equals(btn5.getText()) &&
                 btn1.getText().equals(btn9.getText()) &&
                 btn5.getText().equals(btn9.getText()) &&
           !isBtnTxtEmpty(btn1)){
            gameEnd = true;
        }else if(btn1.getText().equals(btn4.getText()) &&
                 btn1.getText().equals(btn7.getText()) &&
                 btn4.getText().equals(btn7.getText()) &&
           !isBtnTxtEmpty(btn1)){
            gameEnd = true;
        }else if(btn2.getText().equals(btn5.getText()) &&
                 btn2.getText().equals(btn8.getText()) &&
                 btn5.getText().equals(btn8.getText()) &&
           !isBtnTxtEmpty(btn2)){
            gameEnd = true;
        }else if(btn3.getText().equals(btn6.getText()) &&
                 btn3.getText().equals(btn9.getText()) &&
                 btn6.getText().equals(btn9.getText()) &&
           !isBtnTxtEmpty(btn3)){
            gameEnd = true;
        }else if(btn3.getText().equals(btn5.getText()) &&
                 btn3.getText().equals(btn7.getText()) &&
                 btn5.getText().equals(btn7.getText()) &&
           !isBtnTxtEmpty(btn3)){
            gameEnd = true;
        }else if(areAllButtonsUsed()){
            gameEnd = true;
        }else{
            gameEnd = false;
        }
    }
    
    private void annouceWinner(){
        if(gameEnd){
            switch(player){
                case X:JOptionPane.showMessageDialog(null, player + " has won!\n\nCongratulations!", "WINNER!", JOptionPane.PLAIN_MESSAGE);break;
                case O:JOptionPane.showMessageDialog(null, player + " has won!\n\nCongratulations!", "WINNER!", JOptionPane.PLAIN_MESSAGE);break;
                default:JOptionPane.showMessageDialog(null, "You both lose!'\nHaha!", "You lost :(", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblTurn;
    private javax.swing.JMenuItem menuAuthor;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuNew;
    private javax.swing.JMenuItem menuSwitchPlayer;
    // End of variables declaration//GEN-END:variables
}
