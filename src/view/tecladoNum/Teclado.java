/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tecladoNum;

import javax.swing.JPanel;

/**
 *
 * @author drofe
 */
public class Teclado extends JPanel {

    public String msg = "";
    
    
    public Teclado() {
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

        btnTeclado7 = new view.tecladoNum.btnTeclado();
        btnTeclado8 = new view.tecladoNum.btnTeclado();
        btnTeclado9 = new view.tecladoNum.btnTeclado();
        btnTeclado4 = new view.tecladoNum.btnTeclado();
        btnTeclado5 = new view.tecladoNum.btnTeclado();
        btnTeclado6 = new view.tecladoNum.btnTeclado();
        btnTeclado1 = new view.tecladoNum.btnTeclado();
        btnTeclado2 = new view.tecladoNum.btnTeclado();
        btnTeclado3 = new view.tecladoNum.btnTeclado();
        btnTeclado00 = new view.tecladoNum.btnTeclado();
        btnBorrar = new view.tecladoNum.btnTeclado();
        btnOk = new view.tecladoNum.btnTeclado();

        setBackground(new java.awt.Color(102, 153, 255));

        btnTeclado7.setText("7");
        btnTeclado7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado7ActionPerformed(evt);
            }
        });

        btnTeclado8.setText("8");
        btnTeclado8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado8ActionPerformed(evt);
            }
        });

        btnTeclado9.setText("9");
        btnTeclado9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado9ActionPerformed(evt);
            }
        });

        btnTeclado4.setText("4");
        btnTeclado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado4ActionPerformed(evt);
            }
        });

        btnTeclado5.setText("5");
        btnTeclado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado5ActionPerformed(evt);
            }
        });

        btnTeclado6.setText("6");
        btnTeclado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado6ActionPerformed(evt);
            }
        });

        btnTeclado1.setText("1");
        btnTeclado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado1ActionPerformed(evt);
            }
        });

        btnTeclado2.setText("2");
        btnTeclado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado2ActionPerformed(evt);
            }
        });

        btnTeclado3.setText("3");
        btnTeclado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado3ActionPerformed(evt);
            }
        });

        btnTeclado00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado00ActionPerformed(evt);
            }
        });

        btnBorrar.setText("BORRAR");
        btnBorrar.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnOk.setText("OK");
        btnOk.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnTeclado7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTeclado8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTeclado9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnTeclado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTeclado5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTeclado6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTeclado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTeclado00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTeclado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTeclado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTeclado7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeclado8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeclado9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTeclado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeclado5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeclado6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTeclado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeclado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeclado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTeclado00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTeclado8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado8ActionPerformed
        // TODO add your handling code here:
        this.msg = this.msg+"8";
    }//GEN-LAST:event_btnTeclado8ActionPerformed

    private void btnTeclado7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado7ActionPerformed
        this.msg = this.msg+"7";
    }//GEN-LAST:event_btnTeclado7ActionPerformed

    private void btnTeclado9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado9ActionPerformed
        this.msg = this.msg+"9";
    }//GEN-LAST:event_btnTeclado9ActionPerformed

    private void btnTeclado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado4ActionPerformed
        this.msg = this.msg+"4";
    }//GEN-LAST:event_btnTeclado4ActionPerformed

    private void btnTeclado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado5ActionPerformed
        this.msg = this.msg+"5";
    }//GEN-LAST:event_btnTeclado5ActionPerformed

    private void btnTeclado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado6ActionPerformed
        this.msg = this.msg+"6";
    }//GEN-LAST:event_btnTeclado6ActionPerformed

    private void btnTeclado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado1ActionPerformed
        this.msg = this.msg+"1";
    }//GEN-LAST:event_btnTeclado1ActionPerformed

    private void btnTeclado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado2ActionPerformed
        this.msg = this.msg+"2";
    }//GEN-LAST:event_btnTeclado2ActionPerformed

    private void btnTeclado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado3ActionPerformed
        this.msg = this.msg+"3";
    }//GEN-LAST:event_btnTeclado3ActionPerformed

    private void btnTeclado00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado00ActionPerformed
        this.msg = this.msg+"0";
    }//GEN-LAST:event_btnTeclado00ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        
    }//GEN-LAST:event_btnOkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.tecladoNum.btnTeclado btnBorrar;
    private view.tecladoNum.btnTeclado btnOk;
    private view.tecladoNum.btnTeclado btnTeclado00;
    private view.tecladoNum.btnTeclado btnTeclado1;
    private view.tecladoNum.btnTeclado btnTeclado2;
    private view.tecladoNum.btnTeclado btnTeclado3;
    private view.tecladoNum.btnTeclado btnTeclado4;
    private view.tecladoNum.btnTeclado btnTeclado5;
    private view.tecladoNum.btnTeclado btnTeclado6;
    private view.tecladoNum.btnTeclado btnTeclado7;
    private view.tecladoNum.btnTeclado btnTeclado8;
    private view.tecladoNum.btnTeclado btnTeclado9;
    // End of variables declaration//GEN-END:variables
}
