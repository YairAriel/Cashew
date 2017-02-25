/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homebudgetmanager;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Yair Ariel
 */
public class TransactionPanel extends javax.swing.JPanel {

    /**
     * Creates new form TransactionPanel
     */
    public TransactionPanel() {
        initComponents();
    }

    public TransactionPanel(final Transaction transaction) {
        initComponents();
        setLabelTransactionIcon(transaction.getTransIcon());
        setLabelTransactionDate(TransactionParser.SIMPLE_DATE_FORMAT.format(transaction.getTransDate().getTime()));
        setLabelTransactionAmount(Double.toString(transaction.getTransAmount()));
        setLabelTransactionDescription(transaction.getTransDescription());
        setId(transaction.getTransID());
        if (transaction instanceof Expense) {
            setBackground(new Color(255, 241, 240));
            getLabelTransactionAmount().setForeground(new Color(255, 00, 00));
            getLabelTransactionIcon().setToolTipText(((Expense) transaction).getExpenseCategory());
        } else if (transaction instanceof Income) {
            setBackground(new Color(242, 255, 240));
            getLabelTransactionAmount().setForeground(new Color(00, 255, 00));
            getLabelTransactionIcon().setToolTipText(((Income) transaction).getIncomeSource());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTransactionIcon = new javax.swing.JLabel();
        labelTransectionDate = new javax.swing.JLabel();
        labelTransactionPaymentMethod = new javax.swing.JLabel();
        labelTransactionDescription = new javax.swing.JLabel();
        labelTransactionAmount = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        buttionTransactionDel = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 241, 240));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 1, 12, 1));
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(1000, 88));
        setMinimumSize(new java.awt.Dimension(880, 88));
        setPreferredSize(new java.awt.Dimension(880, 88));

        labelTransactionIcon.setBorder(null);

        labelTransectionDate.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelTransectionDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTransectionDate.setText("01/01/2017");
        labelTransectionDate.setToolTipText("");
        labelTransectionDate.setBorder(null);

        labelTransactionPaymentMethod.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelTransactionPaymentMethod.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTransactionPaymentMethod.setText("העברה בנקאית");
        labelTransactionPaymentMethod.setToolTipText("");
        labelTransactionPaymentMethod.setBorder(null);

        labelTransactionDescription.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelTransactionDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTransactionDescription.setText("אבגדהוזחטיכלמנסעפצקרשת");
        labelTransactionDescription.setToolTipText("");
        labelTransactionDescription.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        labelTransactionDescription.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        labelTransactionAmount.setBackground(new Color(0,0,0,0));
        labelTransactionAmount.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelTransactionAmount.setForeground(new java.awt.Color(242, 65, 21));
        labelTransactionAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTransactionAmount.setText("2134.67");
        labelTransactionAmount.setToolTipText("");
        labelTransactionAmount.setBorder(null);
        labelTransactionAmount.setOpaque(true);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setMaximumSize(new java.awt.Dimension(3, 64));
        jSeparator1.setPreferredSize(new java.awt.Dimension(3, 64));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setMaximumSize(new java.awt.Dimension(3, 64));
        jSeparator2.setPreferredSize(new java.awt.Dimension(3, 64));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setMaximumSize(new java.awt.Dimension(3, 64));
        jSeparator3.setPreferredSize(new java.awt.Dimension(3, 64));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setMaximumSize(new java.awt.Dimension(3, 64));
        jSeparator4.setPreferredSize(new java.awt.Dimension(3, 64));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setMaximumSize(new java.awt.Dimension(3, 64));
        jSeparator5.setPreferredSize(new java.awt.Dimension(3, 64));

        buttionTransactionDel.setBackground(new Color(0,0,0,0));
        buttionTransactionDel.setForeground(java.awt.Color.red);
        buttionTransactionDel.setText("X");
        buttionTransactionDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttionTransactionDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttionTransactionDel)
                .addGap(8, 8, 8)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(labelTransactionPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelTransactionDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(labelTransactionAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(labelTransactionIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelTransectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTransactionAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(labelTransactionIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttionTransactionDel)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTransactionPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTransactionDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTransectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttionTransactionDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttionTransactionDelActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(MainWindow.program, "האם הנך בטוח\\ה שברצונך למחוק תנועה זו?", "שאילתת מחיקה", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
            TransactionParser.TRANSACTIONS.remove(TransactionParser.indexOfTransactionById(id));
            TransactionParser.fillTransactionsPanel();
        }
    }//GEN-LAST:event_buttionTransactionDelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttionTransactionDel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelTransactionAmount;
    private javax.swing.JLabel labelTransactionDescription;
    private javax.swing.JLabel labelTransactionIcon;
    private javax.swing.JLabel labelTransactionPaymentMethod;
    private javax.swing.JLabel labelTransectionDate;
    // End of variables declaration//GEN-END:variables

    private String id;

    public JLabel getLabelTransactionAmount() {
        return labelTransactionAmount;
    }

    public void setLabelTransactionAmount(JLabel labelTransactionAmount) {
        this.labelTransactionAmount = labelTransactionAmount;
    }

    public void setLabelTransactionAmount(String transactionAmount) {
        this.getLabelTransactionAmount().setText(transactionAmount);
    }

    public JLabel getLabelTransactionDate() {
        return labelTransectionDate;
    }

    public void setLabelTransactionDate(JLabel labelTransactionDate) {
        this.labelTransectionDate = labelTransactionDate;
    }

    public void setLabelTransactionDate(String transactionDate) {
        this.getLabelTransactionDate().setText(transactionDate);
    }

    public JLabel getLabelTransactionDescription() {
        return labelTransactionDescription;
    }

    public void setLabelTransactionDescription(JLabel labelTransactionDescription) {
        this.labelTransactionDescription = labelTransactionDescription;
    }

    public void setLabelTransactionDescription(String transactionDescription) {
        this.getLabelTransactionDescription().setText(transactionDescription);
    }

    public JLabel getLabelTransactionIcon() {
        return labelTransactionIcon;
    }

    public void setLabelTransactionIcon(JLabel labelTransactionIcon) {
        this.labelTransactionIcon = labelTransactionIcon;
    }

    public void setLabelTransactionIcon(ImageIcon transactionIcon) {
        this.getLabelTransactionIcon().setIcon(transactionIcon);
    }

    public JLabel getLabelTransactionPaymentMethod() {
        return labelTransactionPaymentMethod;
    }

    public void setLabelTransactionPaymentMethod(JLabel labelTransactionPaymentMethod) {
        this.labelTransactionPaymentMethod = labelTransactionPaymentMethod;
    }

    public void setLabelTransactionPaymentMethod(String transactionPaymentMethod) {
        this.getLabelTransactionPaymentMethod().setText(transactionPaymentMethod);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}