Source code for GUI:
//Initializing package
package guijava;
//Adding Libraries
//Adding swing for GUI
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import net.proteanit.sql.DbUtils;
//Adding JFrame for GUI components
public class NewJFrame extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;
 public NewJFrame() {
 initComponents();
 showTableData();
 }
 //Initializing GUI components
 private void initComponents() {
//Adding JPanel for Content Pane
 jPanel1 = new javax.swing.JPanel();
 jLabel1 = new javax.swing.JLabel();
 jLabel2 = new javax.swing.JLabel();
 jLabel3 = new javax.swing.JLabel();
 jLabel4 = new javax.swing.JLabel();
 ID = new javax.swing.JTextField();
 Product = new javax.swing.JTextField();
 Price = new javax.swing.JTextField();
 Quantity = new javax.swing.JTextField();
//Initializing Buttons
 jButton1 = new javax.swing.JButton();
 jButton2 = new javax.swing.JButton();
 jButton3 = new javax.swing.JButton();
 jButton4 = new javax.swing.JButton();
 jScrollPane1 = new javax.swing.JScrollPane();
 jTable1 = new javax.swing.JTable();
 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 jLabel1.setText("ID");
 jLabel2.setText("Product");
 jLabel3.setText("Price");
 jLabel4.setText("Quantity");
//Adding Add,Delete,Update,Display buttons
 jButton1.setText("Add");
 jButton1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton1ActionPerformed(evt);
 }
 });
 jButton2.setText("Update");
 jButton2.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton2ActionPerformed(evt);
 }
 });
 jButton3.setText("Delete");
 jButton3.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton3ActionPerformed(evt);
 }
 });
 jButton4.setText("Display");
 jTable1.setModel(new javax.swing.table.DefaultTableModel(
 new Object [][] {
 {null, null, null, null},
 {null, null, null, null},
 {null, null, null, null},
 {null, null, null, null}
 },
 new String [] {
 "Title 1", "Title 2", "Title 3", "Title 4"
 }
 ));
 jScrollPane1.setViewportView(jTable1);
//Adding Jpanels for Content Pane and Layout
 javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
 jPanel1.setLayout(jPanel1Layout);
 jPanel1Layout.setHorizontalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addGap(51, 51, 51)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
false)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addComponent(jLabel4)
 .addGap(18, 18, 18)
 .addComponent(Quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 127,
Short.MAX_VALUE))
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
jPanel1Layout.createSequentialGroup()

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
false)
 .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 52,
Short.MAX_VALUE)
 .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
false)
 .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, 127,
Short.MAX_VALUE)
 .addComponent(Product)
 .addComponent(Price)))))
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addGap(29, 29, 29)
 .addComponent(jButton1)
 .addGap(18, 18, 18)
 .addComponent(jButton2)
 .addGap(18, 18, 18)
 .addComponent(jButton3)
 .addGap(18, 18, 18)
 .addComponent(jButton4)))
 .addGap(18, 18, 18)
 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addContainerGap(50, Short.MAX_VALUE))
 );
 jPanel1Layout.setVerticalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addGap(49, 49, 49)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
 .addGroup(jPanel1Layout.createSequentialGroup()

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jLabel1)
 .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGap(42, 42, 42)
 .addComponent(jLabel2))
 .addComponent(Product, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGap(54, 54, 54)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(jLabel3)
 .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGap(58, 58, 58)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(jLabel4)
 .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGap(47, 47, 47)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(jButton1)
 .addComponent(jButton2)
 .addComponent(jButton3)
 .addComponent(jButton4)))
 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336,
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addContainerGap(61, Short.MAX_VALUE))
 );
 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 );
 layout.setVerticalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 );
 pack();
 }
//Initializing Add function for adding product
//When Add button is clicked product is added
 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
 try{
 String sql = "INSERT INTO gui.content(Product, Price, Quantity) VALUES (?,?,?)";
 con = DriverManager.getConnection("jdbc:mysql://localhost:3308/gui","root","");
 pst = con.prepareStatement(sql);
 pst.setString(1, Product.getText());
 pst.setString(2, Price.getText());
 pst.setString(3, Quantity.getText());
 pst.executeUpdate();
 JOptionPane.showMessageDialog(null, "Added succesfully");

 }
 catch(HeadlessException | SQLException ex){
 JOptionPane.showMessageDialog(null, ex);
 }
 showTableData();
 }//Exception catch
//Initializing Delete function for adding product
//When Add button is clicked product is deleted
 private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GENFIRST:event_jButton3ActionPerformed
 try{
 String sql = "DELETE FROM gui.content WHERE ID =?";
 con = DriverManager.getConnection("jdbc:mysql://localhost:3308/gui","root","");
 pst = con.prepareStatement(sql);
 pst.setString(1, ID.getText());
 pst.executeUpdate();
 JOptionPane.showMessageDialog(null, "Deleted succesfully");

 }
 catch(HeadlessException | SQLException ex){
 JOptionPane.showMessageDialog(null, ex);
 }
 showTableData();
 }//Exception catch
//Initializing Update function for updating product
//When Add button is clicked product is updated
 private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
 try{
 String sql = "UPDATE gui.content SET Product=?, Price=?, Quantity=? WHERE ID =?";
 con = DriverManager.getConnection("jdbc:mysql://localhost:3308/gui","root","");
 pst = con.prepareStatement(sql);
 pst.setString(4, ID.getText());
 pst.setString(1, Product.getText());
 pst.setString(2, Price.getText());
 pst.setString(3, Quantity.getText());
 pst.executeUpdate();
 JOptionPane.showMessageDialog(null, "Updated succesfully");

 }
 catch(HeadlessException | SQLException ex){
 JOptionPane.showMessageDialog(null, ex);
 }
 showTableData();
 }
 public void showTableData(){
 try{
 con = DriverManager.getConnection("jdbc:mysql://localhost:3308/gui","root","");
 String sql = "SELECT * FROM gui.content";
pst = con.prepareStatement(sql);
rs = pst.executeQuery();
jTable1.setModel(DbUtils.resultSetToTableModel(rs));
 }
 catch(Exception ex) {
 JOptionPane.showMessageDialog(null, ex);
 }
 }Exception catch
 public static void main(String args[]) {
 /* Set the Nimbus look and feel Info */

 try {
 for (javax.swing.UIManager.LookAndFeelInfo info :
javax.swing.UIManager.getInstalledLookAndFeels()) {
 if ("Nimbus".equals(info.getName())) {
 javax.swing.UIManager.setLookAndFeel(info.getClassName());
 break;
 }
 }
 } catch (ClassNotFoundException ex) {

java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVE
RE, null, ex);
 } catch (InstantiationException ex) {

java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVE
RE, null, ex);
 } catch (IllegalAccessException ex) {

java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVE
RE, null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {

java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVE
RE, null, ex);
 }

 /* Create and display the form */
 java.awt.EventQueue.invokeLater(new Runnable() {
 public void run() {
 new NewJFrame().setVisible(true);
 }
 });
 }
 // Variables declaration
 private javax.swing.JTextField ID;
 private javax.swing.JTextField Price;
 private javax.swing.JTextField Product;
 private javax.swing.JTextField Quantity;
 private javax.swing.JButton jButton1;
 private javax.swing.JButton jButton2;
 private javax.swing.JButton jButton3;
 private javax.swing.JButton jButton4;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JLabel jLabel4;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JScrollPane jScrollPane1;
 private javax.swing.JTable jTable1;
 // End of variables declaration
}
