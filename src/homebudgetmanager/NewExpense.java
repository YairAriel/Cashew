/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homebudgetmanager;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author Yair Ariel
 */
public class NewExpense extends javax.swing.JDialog {

    /**
     * Creates new form NewExpense
     */
    public NewExpense() {
        super(MainWindow.getProgram());
        setAmount(0.0);
        setPaymentMethod("");
        setCatagory("");
        setIconPath("");
        setDescription("");
        initComponents();
        setVisible(true);
        setIconImage(new ImageIcon(getClass().getResource("images/logoIcon.png")).getImage());
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Locale hebrew = new Locale("iw", "IL");
        ComponentOrientation hebrewOri1entation = ComponentOrientation.getOrientation(hebrew);
        comboBoxExpenseCategory.applyComponentOrientation(hebrewOri1entation);
        ((JLabel) comboBoxExpenseCategory.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);
        comboBoxExpenseMethod.applyComponentOrientation(hebrewOri1entation);
        ((JLabel) comboBoxExpenseMethod.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);
        datePickerExpense.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        textBoxExpenseComments.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        spinnerExpenseSum.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelCategory = new javax.swing.JLabel();
        labelPaymentMethod = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelAmount = new javax.swing.JLabel();
        comboBoxExpenseCategory = new javax.swing.JComboBox<>();
        comboBoxExpenseMethod = new javax.swing.JComboBox<>();
        textBoxExpenseComments = new javax.swing.JTextField();
        datePickerExpense = new org.jdesktop.swingx.JXDatePicker(new Date());
        spinnerExpenseSum = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        buttonAddExpense = new javax.swing.JButton();
        buttonExpenseCancel = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cashew - הוצאה חדשה");
        setPreferredSize(new java.awt.Dimension(660, 500));

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorRemoved(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(85, 96, 128));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("הוצאה חדשה");
        jLabel6.setName("jLabel6"); // NOI18N

        labelCategory.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        labelCategory.setText("קטגוריה");

        labelPaymentMethod.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        labelPaymentMethod.setText("אמצעי תשלום");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel3.setText("תיאור");

        labelDate.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        labelDate.setText("תאריך");

        labelAmount.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        labelAmount.setText("סכום");

        comboBoxExpenseCategory.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        comboBoxExpenseCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "בחר קטגוריה", "ארנונה", "ביגוד", "בידור", "ביטוח", "בריאות", "גינון", "דו\"חות", "דלק", "הנעלה", "חוגים", "חופשה", "חיות מחמד", "חינוך", "חיסכון", "חשמל", "טיולים", "כושר", "מזון וטואלטיקה", "מים", "מיסים", "מסעדות", "משכנתא", "מתנות", "עישון", "צדקה", "רכב", "שכר דירה", "תחבורה ציבורית", "תיקונים", "תקשורת", "אחר" }));
        comboBoxExpenseCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxExpenseCategoryItemStateChanged(evt);
            }
        });

        comboBoxExpenseMethod.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        comboBoxExpenseMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "בחר אמצעי תשלום", "מזומן", "צ'ק", "העברה בנקאית", "אשראי" }));
        comboBoxExpenseMethod.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxExpenseMethodItemStateChanged(evt);
            }
        });

        textBoxExpenseComments.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        textBoxExpenseComments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textBoxExpenseCommentsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textBoxExpenseCommentsKeyTyped(evt);
            }
        });

        datePickerExpense.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        datePickerExpense.setMaximumSize(new java.awt.Dimension(160, 38));
        datePickerExpense.setMinimumSize(new java.awt.Dimension(160, 38));
        datePickerExpense.setPreferredSize(new java.awt.Dimension(160, 38));
        datePickerExpense.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datePickerExpensePropertyChange(evt);
            }
        });

        spinnerExpenseSum.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        spinnerExpenseSum.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 5.0d));
        spinnerExpenseSum.setMaximumSize(new java.awt.Dimension(150, 36));
        spinnerExpenseSum.setMinimumSize(new java.awt.Dimension(150, 36));
        spinnerExpenseSum.setPreferredSize(new java.awt.Dimension(150, 36));
        spinnerExpenseSum.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerExpenseSumStateChanged(evt);
            }
        });
        spinnerExpenseSum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                spinnerExpenseSumFocusLost(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jLabel11.setText("₪");
        jLabel11.setName("incomesLabel"); // NOI18N

        buttonAddExpense.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        buttonAddExpense.setText("הוסף");
        buttonAddExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddExpenseActionPerformed(evt);
            }
        });

        buttonExpenseCancel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        buttonExpenseCancel.setText("ביטול");
        buttonExpenseCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExpenseCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerExpenseSum, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelCategory)
                    .addComponent(comboBoxExpenseMethod, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPaymentMethod)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxExpenseCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDate)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonAddExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datePickerExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonExpenseCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(textBoxExpenseComments, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datePickerExpense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxExpenseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerExpenseSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxExpenseMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBoxExpenseComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonAddExpense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonExpenseCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddExpenseActionPerformed
        // TODO add your handling code here:
        boolean flag = false;
        if (evt.getSource() instanceof JButton) {
            if (getComboBoxExpenseCategory().getSelectedIndex() == 0) {
                getLabelCategory().setForeground(Color.RED);
                flag = true;
            }
            if (getComboBoxExpenseMethod().getSelectedIndex() == 0) {
                getLabelPaymentMethod().setForeground(Color.RED);
                flag = true;
            }
            if (Double.parseDouble(getSpinnerExpenseSum().getValue().toString()) == 0) {
                getLabelAmount().setForeground(Color.RED);
                flag = true;
            }
            if (flag) {
                JOptionPane.showConfirmDialog(this, "אנא מלאו את כל השדות הנצרכות", "Cashew", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (getDescription().trim().equals("")) {
                setDescription(getCatagory());
            }
            SimpleDateFormat sdf = new SimpleDateFormat("_ddMMyyyy");
            TransactionParser.addTransactionRoutine(new Expense(sdf.format(getDate().getTime()) + "E", getAmount(), getDate(), getDescription(), getCatagory(), getPaymentMethod(), getIconPath()));
            if (BudgetParser.getBudget().isDeviationMessage()) {
                if (TransactionParser.getThisMonthExpensesAmount() + this.getAmount() > BudgetParser.getBudget().getBudgetSum() && BudgetParser.getBudget().getBudgetSum() != 0) {
                    JOptionPane.showMessageDialog(MainWindow.getProgram(), "שים לב! אתה חורג מהתקציב");
                }
            }
            dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            TransactionParser.transactionChangesRoutine();
            //System.out.println(MainWindow.getProgram().getPanelTransactions().getComponents().length);
        }
    }//GEN-LAST:event_buttonAddExpenseActionPerformed

    private void comboBoxExpenseCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxExpenseCategoryItemStateChanged
        // TODO add your handling code here:
        if (getLabelCategory().getForeground() == Color.RED) {
            getLabelCategory().setForeground(Color.BLACK);
        }
        if (evt.getSource() instanceof JComboBox) {
            setIconPath("images/" + TransactionParser.EXPENSE_ICON_ARR[((JComboBox) evt.getSource()).getSelectedIndex()]);
            setCatagory(((JComboBox) evt.getSource()).getSelectedItem().toString());
//            System.out.println(iconName);
//            System.out.println(catagory);
        }
    }//GEN-LAST:event_comboBoxExpenseCategoryItemStateChanged

    private void datePickerExpensePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datePickerExpensePropertyChange
        if (evt.getSource() instanceof JXDatePicker) {
            setDate(new GregorianCalendar());
            getDate().setTime(((JXDatePicker) evt.getSource()).getDate());
            //System.out.println(date);
        }
    }//GEN-LAST:event_datePickerExpensePropertyChange

    private void spinnerExpenseSumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spinnerExpenseSumFocusLost
        // TODO add your handling code here:
        if (evt.getSource() instanceof JSpinner) {
            setAmount(Double.parseDouble(((JSpinner) evt.getSource()).getValue().toString()));
            //System.out.println(amount);
        }
    }//GEN-LAST:event_spinnerExpenseSumFocusLost

    private void spinnerExpenseSumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerExpenseSumStateChanged
        // TODO add your handling code here:
        if (getLabelAmount().getForeground() == Color.RED) {
            getLabelAmount().setForeground(Color.BLACK);
        }
        if (evt.getSource() instanceof JSpinner) {
            setAmount(Double.parseDouble(((JSpinner) evt.getSource()).getValue().toString()));
            //System.out.println(amount);
        }
    }//GEN-LAST:event_spinnerExpenseSumStateChanged

    private void textBoxExpenseCommentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBoxExpenseCommentsKeyReleased
        // TODO add your handling code here:
        if (evt.getSource() instanceof JTextField) {
            setDescription(((JTextField) evt.getSource()).getText() != null ? ((JTextField) evt.getSource()).getText() : "");
            //System.out.println(description);
        }
    }//GEN-LAST:event_textBoxExpenseCommentsKeyReleased

    private void buttonExpenseCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExpenseCancelActionPerformed
        // TODO add your handling code here:
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_buttonExpenseCancelActionPerformed

    private void comboBoxExpenseMethodItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxExpenseMethodItemStateChanged
        // TODO add your handling code here:
        if (getLabelPaymentMethod().getForeground() == Color.RED) {
            getLabelPaymentMethod().setForeground(Color.BLACK);
        }
        if (evt.getSource() instanceof JComboBox) {
            setPaymentMethod(((JComboBox) evt.getSource()).getSelectedItem().toString());
        }
    }//GEN-LAST:event_comboBoxExpenseMethodItemStateChanged

    private void textBoxExpenseCommentsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBoxExpenseCommentsKeyTyped
        // TODO add your handling code here:
        if ((evt.getSource() instanceof JTextField) && (((JTextField) evt.getSource()).getText().length() >= 22)) {
            evt.consume();
        }
    }//GEN-LAST:event_textBoxExpenseCommentsKeyTyped

    private void jPanel1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorRemoved

        MainWindow.getProgram().getButtonNewExpense().setEnabled(true);
        MainWindow.getProgram().getButtonNewIncome().setEnabled(true);
        MainWindow.getProgram().getButtonNewExpense1().setEnabled(true);
        MainWindow.getProgram().getButtonNewIncome1().setEnabled(true);

    }//GEN-LAST:event_jPanel1AncestorRemoved

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
            java.util.logging.Logger.getLogger(NewExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewExpense().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddExpense;
    private javax.swing.JButton buttonExpenseCancel;
    private javax.swing.JComboBox<String> comboBoxExpenseCategory;
    private javax.swing.JComboBox<String> comboBoxExpenseMethod;
    private org.jdesktop.swingx.JXDatePicker datePickerExpense;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAmount;
    private javax.swing.JLabel labelCategory;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelPaymentMethod;
    private javax.swing.JSpinner spinnerExpenseSum;
    private javax.swing.JTextField textBoxExpenseComments;
    // End of variables declaration//GEN-END:variables
    private String iconPath;
    private Calendar date;
    private String catagory;
    private String paymentMethod;
    private String description;
    private double amount;

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public JButton getButtonAddExpense() {
        return buttonAddExpense;
    }

    public void setButtonAddExpense(JButton buttonAddExpense) {
        this.buttonAddExpense = buttonAddExpense;
    }

    public JButton getButtonExpenseCancel() {
        return buttonExpenseCancel;
    }

    public void setButtonExpenseCancel(JButton buttonExpenseCancel) {
        this.buttonExpenseCancel = buttonExpenseCancel;
    }

    public JComboBox<String> getComboBoxExpenseCategory() {
        return comboBoxExpenseCategory;
    }

    public void setComboBoxExpenseCategory(JComboBox<String> comboBoxExpenseCategory) {
        this.comboBoxExpenseCategory = comboBoxExpenseCategory;
    }

    public JComboBox<String> getComboBoxExpenseMethod() {
        return comboBoxExpenseMethod;
    }

    public void setComboBoxExpenseMethod(JComboBox<String> comboBoxExpenseMethod) {
        this.comboBoxExpenseMethod = comboBoxExpenseMethod;
    }

    public JXDatePicker getDatePickerExpense() {
        return datePickerExpense;
    }

    public void setDatePickerExpense(JXDatePicker datePickerExpense) {
        this.datePickerExpense = datePickerExpense;
    }

    public JLabel getLabelAmount() {
        return labelAmount;
    }

    public void setLabelAmount(JLabel labelAmount) {
        this.labelAmount = labelAmount;
    }

    public JLabel getLabelCategory() {
        return labelCategory;
    }

    public void setLabelCategory(JLabel labelCategory) {
        this.labelCategory = labelCategory;
    }

    public JLabel getLabelDate() {
        return labelDate;
    }

    public void setLabelDate(JLabel labelDate) {
        this.labelDate = labelDate;
    }

    public JLabel getLabelPaymentMethod() {
        return labelPaymentMethod;
    }

    public void setLabelPaymentMethod(JLabel labelPaymentMethod) {
        this.labelPaymentMethod = labelPaymentMethod;
    }

    public JSpinner getSpinnerExpenseSum() {
        return spinnerExpenseSum;
    }

    public void setSpinnerExpenseSum(JSpinner spinnerExpenseSum) {
        this.spinnerExpenseSum = spinnerExpenseSum;
    }

    public JTextField getTextBoxExpenseComments() {
        return textBoxExpenseComments;
    }

    public void setTextBoxExpenseComments(JTextField textBoxExpenseComments) {
        this.textBoxExpenseComments = textBoxExpenseComments;
    }

}
