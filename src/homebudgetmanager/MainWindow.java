/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homebudgetmanager;

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

/**
 *
 * @author Yair Ariel
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("logoIcon.png")).getImage());
        setLocationRelativeTo(null);
        Locale hebrew = new Locale("iw","IL");
        ComponentOrientation hebrewOri1entation = ComponentOrientation.getOrientation(hebrew);
        try {
             GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
             ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Varela Round Regular.ttf")));
        } catch (IOException|FontFormatException e) {
            System.out.println(e.getMessage());
        }
        
        // General view components
        labelTitleGeneralView.setFont(new Font("Varela Round Regular",Font.PLAIN,48));
        buttonNewIncome.setFont(new Font("Varela Round Regular",Font.BOLD,23));
        buttonNewExpense.setFont(new Font("Varela Round Regular",Font.BOLD,23));
        jTabbedPaneMenu.setFont(new Font("Varela Round Regular",Font.PLAIN,18));
        jLabel3.setFont(new Font("Varela Round Regular", Font.PLAIN, 14));
        jLabel4.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        jLabel5.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        jLabel6.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        jLabel7.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        jLabel10.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        jLabel12.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        jLabel20.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        jLabel21.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        jLabel22.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        jLabel23.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        jLabel24.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        jLabel25.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        comboBoxDatesRange.setFont(new Font("Varela Round Regular", Font.PLAIN, 12));
        comboBoxDatesRange.applyComponentOrientation(hebrewOri1entation);
        ((JLabel)comboBoxDatesRange.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);
        
        // Transactions components
        labelTransactions.setFont(new Font("Varela Round Regular",Font.PLAIN,48));
        jLabel13.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        jLabel14.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        jLabel15.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        datePickerFromDate.setFont(new Font("Varela Round Regular", Font.PLAIN, 14));
        datePickerFromDate.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        datePickerToDate.setFont(new Font("Varela Round Regular", Font.PLAIN, 14));
        datePickerToDate.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        comboBoxTransactionsData.setFont(new Font("Varela Round Regular", Font.PLAIN, 16));
        comboBoxTransactionsData.applyComponentOrientation(hebrewOri1entation);
        ((JLabel)comboBoxTransactionsData.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);
        
        // Budget components
        labelBudget.setFont(new Font("Varela Round Regular",Font.PLAIN,48));  
        jLabel16.setFont(new Font("Varela Round Regular", Font.PLAIN, 20));
        jLabel17.setFont(new Font("Varela Round Regular", Font.PLAIN, 18));
        jLabel18.setFont(new Font("Varela Round Regular", Font.PLAIN, 18));
        jLabel19.setFont(new Font("Varela Round Regular", Font.PLAIN, 14));
        checkBoxAlertBeforeException.setFont(new Font("Varela Round Regular", Font.PLAIN, 14));
        checkBoxAlertBeforeX.setFont(new Font("Varela Round Regular", Font.PLAIN, 14));
        spinnerBudgetAmount.setFont(new Font("Varela Round Regular", Font.PLAIN, 14));
        spinnerBudgetAmount.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        spinnerAlertBefore.setFont(new Font("Varela Round Regular", Font.PLAIN, 14));
        spinnerAlertBefore.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        buttonDefineBudjet.setFont(new Font("Varela Round Regular", Font.PLAIN, 16));
        
        // Calculator components
        labelCalculator.setFont(new Font("Varela Round Regular",Font.PLAIN,48));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jTabbedPaneMenu = new javax.swing.JTabbedPane();
        labelTitleBudget = new javax.swing.JPanel();
        labelBudget = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        checkBoxAlertBeforeException = new javax.swing.JCheckBox();
        checkBoxAlertBeforeX = new javax.swing.JCheckBox();
        spinnerAlertBefore = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        spinnerBudgetAmount = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        buttonDefineBudjet = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        labelTitleTransactions = new javax.swing.JPanel();
        labelTransactions = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        datePickerFromDate = new org.jdesktop.swingx.JXDatePicker();
        datePickerToDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel15 = new javax.swing.JLabel();
        comboBoxTransactionsData = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        labelTitleGeneralView = new javax.swing.JLabel();
        generalViewPanel = new javax.swing.JPanel();
        comboBoxDatesRange = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        buttonNewIncome = new javax.swing.JButton();
        buttonNewExpense = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelCalculator = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 239, 239));
        setResizable(false);

        jTabbedPaneMenu.setBackground(new java.awt.Color(251, 248, 247));
        jTabbedPaneMenu.setForeground(new java.awt.Color(85, 96, 128));
        jTabbedPaneMenu.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTabbedPaneMenu.setName(""); // NOI18N

        labelTitleBudget.setBackground(new java.awt.Color(251, 248, 247));
        labelTitleBudget.setForeground(new java.awt.Color(0, 102, 255));
        labelTitleBudget.setName(""); // NOI18N

        labelBudget.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelBudget.setForeground(new java.awt.Color(85, 96, 128));
        labelBudget.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBudget.setText("תקציב");
        labelBudget.setName("labelTitleGeneralView"); // NOI18N

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 96, 128), 2, true));
        jPanel2.setForeground(new java.awt.Color(85, 96, 128));

        checkBoxAlertBeforeException.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkBoxAlertBeforeException.setSelected(true);
        checkBoxAlertBeforeException.setText("התראה בעת חריגה");
        checkBoxAlertBeforeException.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        checkBoxAlertBeforeX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkBoxAlertBeforeX.setSelected(true);
        checkBoxAlertBeforeX.setText("אזהרה כאשר נותרו");
        checkBoxAlertBeforeX.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("₪ בתקציב");
        jLabel19.setName("incomesLabel"); // NOI18N

        jLabel17.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel17.setText("₪");
        jLabel17.setName("incomesLabel"); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("סכום");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("הגדר תקציב חדש ");

        buttonDefineBudjet.setText("הגדר");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonDefineBudjet, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel16)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerBudgetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spinnerAlertBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkBoxAlertBeforeX))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(checkBoxAlertBeforeException)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spinnerBudgetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkBoxAlertBeforeException)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxAlertBeforeX)
                    .addComponent(spinnerAlertBefore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(buttonDefineBudjet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 96, 128), 2, true));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout labelTitleBudgetLayout = new javax.swing.GroupLayout(labelTitleBudget);
        labelTitleBudget.setLayout(labelTitleBudgetLayout);
        labelTitleBudgetLayout.setHorizontalGroup(
            labelTitleBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelTitleBudgetLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(labelBudget)
                .addContainerGap(324, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelTitleBudgetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        labelTitleBudgetLayout.setVerticalGroup(
            labelTitleBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelTitleBudgetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBudget)
                .addGap(18, 18, 18)
                .addGroup(labelTitleBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneMenu.addTab("תקציב", null, labelTitleBudget, "");
        labelTitleBudget.getAccessibleContext().setAccessibleName("tabExpenses");

        labelTitleTransactions.setBackground(new java.awt.Color(251, 248, 247));
        labelTitleTransactions.setForeground(new java.awt.Color(0, 102, 255));
        labelTitleTransactions.setName(""); // NOI18N

        labelTransactions.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelTransactions.setForeground(new java.awt.Color(85, 96, 128));
        labelTransactions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTransactions.setText("תנועות");
        labelTransactions.setName("labelTitleGeneralView"); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(242, 242, 242));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("מתאריך");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("עד תאריך");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("מציג");

        comboBoxTransactionsData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "כל התנועות", "הכנסות", "הוצאות" }));

        javax.swing.GroupLayout labelTitleTransactionsLayout = new javax.swing.GroupLayout(labelTitleTransactions);
        labelTitleTransactions.setLayout(labelTitleTransactionsLayout);
        labelTitleTransactionsLayout.setHorizontalGroup(
            labelTitleTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelTitleTransactionsLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(labelTransactions)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(labelTitleTransactionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labelTitleTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datePickerFromDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datePickerToDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelTitleTransactionsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(labelTitleTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(comboBoxTransactionsData, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        labelTitleTransactionsLayout.setVerticalGroup(
            labelTitleTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelTitleTransactionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTransactions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labelTitleTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addGroup(labelTitleTransactionsLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxTransactionsData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datePickerFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datePickerToDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPaneMenu.addTab("תנועות", labelTitleTransactions);
        labelTitleTransactions.getAccessibleContext().setAccessibleName("tabIncomes");

        jPanel1.setBackground(new java.awt.Color(251, 248, 247));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.setName(""); // NOI18N

        labelTitleGeneralView.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelTitleGeneralView.setForeground(new java.awt.Color(85, 96, 128));
        labelTitleGeneralView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitleGeneralView.setText("מבט על");
        labelTitleGeneralView.setName("labelTitleGeneralView"); // NOI18N

        generalViewPanel.setBackground(new java.awt.Color(242, 242, 242));
        generalViewPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 96, 128), 2, true));
        generalViewPanel.setForeground(new java.awt.Color(85, 96, 128));
        generalViewPanel.setToolTipText("");
        generalViewPanel.setName(""); // NOI18N

        comboBoxDatesRange.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboBoxDatesRange.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "היום", "החודש", "השנה" }));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("מציג מידע עבור");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("27/01/2017");
        jTextField1.setName("currentDateTextBox"); // NOI18N

        jPanel4.setBackground(new java.awt.Color(242, 242, 242));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "תקציב", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("השתמשת ב");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("0.0");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("₪");
        jLabel22.setName("incomesLabel"); // NOI18N

        jLabel23.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setText("מתוך");

        jLabel24.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("0.0");

        jLabel25.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText("₪");
        jLabel25.setName("incomesLabel"); // NOI18N

        jProgressBar1.setToolTipText("");
        jProgressBar1.setValue(32);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel23))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(242, 242, 242));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "סיכום", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(34, 206, 26));
        jLabel4.setText("הכנסות:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(34, 206, 26));
        jLabel8.setText("₪");
        jLabel8.setName("incomesLabel"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(34, 206, 26));
        jLabel6.setText("0.0");
        jLabel6.setName("incomesLabel"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 65, 21));
        jLabel5.setText("הוצאות:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 65, 21));
        jLabel9.setText("₪");
        jLabel9.setName("incomesLabel"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 65, 21));
        jLabel7.setText("0.0");
        jLabel7.setName("incomesLabel"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(85, 96, 128));
        jLabel10.setText("סה\"כ:");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(85, 96, 128));
        jLabel11.setText("₪");
        jLabel11.setName("incomesLabel"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(85, 96, 128));
        jLabel12.setText("0.0");
        jLabel12.setName("incomesLabel"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout generalViewPanelLayout = new javax.swing.GroupLayout(generalViewPanel);
        generalViewPanel.setLayout(generalViewPanelLayout);
        generalViewPanelLayout.setHorizontalGroup(
            generalViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalViewPanelLayout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generalViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(generalViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generalViewPanelLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(generalViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBoxDatesRange, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        generalViewPanelLayout.setVerticalGroup(
            generalViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalViewPanelLayout.createSequentialGroup()
                .addGroup(generalViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generalViewPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxDatesRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generalViewPanelLayout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addGroup(generalViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        buttonNewIncome.setBackground(new java.awt.Color(34, 206, 26));
        buttonNewIncome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        buttonNewIncome.setForeground(new java.awt.Color(255, 255, 255));
        buttonNewIncome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homebudgetmanager/plusIcon.png"))); // NOI18N
        buttonNewIncome.setText("הכנסה חדשה ");
        buttonNewIncome.setName("buttonNewIncome"); // NOI18N
        buttonNewIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewIncomeActionPerformed(evt);
            }
        });

        buttonNewExpense.setBackground(new java.awt.Color(242, 65, 21));
        buttonNewExpense.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        buttonNewExpense.setForeground(new java.awt.Color(255, 255, 255));
        buttonNewExpense.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homebudgetmanager/minusIcon.png"))); // NOI18N
        buttonNewExpense.setText("הוצאה חדשה ");
        buttonNewExpense.setName("buttonNewExpense"); // NOI18N
        buttonNewExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewExpenseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(buttonNewExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNewIncome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(labelTitleGeneralView))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(generalViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitleGeneralView)
                .addGap(18, 18, 18)
                .addComponent(generalViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNewIncome)
                    .addComponent(buttonNewExpense))
                .addGap(25, 25, 25))
        );

        jTabbedPaneMenu.addTab("מבט על", null, jPanel1, "");
        jPanel1.getAccessibleContext().setAccessibleName("tab1");

        jPanel3.setBackground(new java.awt.Color(251, 248, 247));

        labelCalculator.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelCalculator.setForeground(new java.awt.Color(85, 96, 128));
        labelCalculator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCalculator.setText("מחשבון");
        labelCalculator.setName("labelTitleGeneralView"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(labelCalculator)
                .addContainerGap(303, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCalculator)
                .addContainerGap(337, Short.MAX_VALUE))
        );

        jTabbedPaneMenu.addTab("מחשבון", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPaneMenu.getAccessibleContext().setAccessibleName("מבט על");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNewExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewExpenseActionPerformed

        NewExpense expenseModal = new NewExpense();
        expenseModal.setLocationRelativeTo(this);
    }//GEN-LAST:event_buttonNewExpenseActionPerformed

    private void buttonNewIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewIncomeActionPerformed

        NewIncome incomeModal = new NewIncome();
        incomeModal.setLocationRelativeTo(this);
    }//GEN-LAST:event_buttonNewIncomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDefineBudjet;
    private javax.swing.JButton buttonNewExpense;
    private javax.swing.JButton buttonNewIncome;
    private javax.swing.JCheckBox checkBoxAlertBeforeException;
    private javax.swing.JCheckBox checkBoxAlertBeforeX;
    private javax.swing.JComboBox<String> comboBoxDatesRange;
    private javax.swing.JComboBox<String> comboBoxTransactionsData;
    private org.jdesktop.swingx.JXDatePicker datePickerFromDate;
    private org.jdesktop.swingx.JXDatePicker datePickerToDate;
    private javax.swing.JPanel generalViewPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneMenu;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelBudget;
    private javax.swing.JLabel labelCalculator;
    private javax.swing.JPanel labelTitleBudget;
    private javax.swing.JLabel labelTitleGeneralView;
    private javax.swing.JPanel labelTitleTransactions;
    private javax.swing.JLabel labelTransactions;
    private javax.swing.JSpinner spinnerAlertBefore;
    private javax.swing.JSpinner spinnerBudgetAmount;
    // End of variables declaration//GEN-END:variables
}
