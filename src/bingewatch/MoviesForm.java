
package bingewatch;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sahil
 */
public class MoviesForm extends javax.swing.JFrame {

    public MoviesForm() {
        initComponents();
        // MySQLConnection(); // To Check SQLConnecion when the application stars.
        fillTable();
//        retrieveData();

    }
    
     public Connection MySQLConnection(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaProject","root","root");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bingewatch", "root" , "");
            
          //  JOptionPane.showMessageDialog(null,"Mysql connection Successful....");
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Mysql connection Failed....");
            return null;
         }
    }
     
     // Ignore the code till we reach the insert method. This code has been auto generated when we edited the table font and tbale row height.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jTextField_notes = new javax.swing.JTextField();
        jDateChooser_date = new com.toedter.calendar.JDateChooser();
        jButton_new = new javax.swing.JButton();
        jButton_save = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(204, 255, 204));

        label1.setText("label1");

        label2.setText("label2");

        label4.setText("label4");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("BINGE WATCH");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("No more missing your favourite movie/series. ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Movie To Binge");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Name: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Notes: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Date: ");

        jTextField_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_notes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton_new.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png"))); // NOI18N
        jButton_new.setText("New");

        jButton_save.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
        jButton_save.setText("Insert/Save");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jButton_update.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sync.png"))); // NOI18N
        jButton_update.setText("Update");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });

        jButton_delete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/erase.png"))); // NOI18N
        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Search Movie By Name");

        jTextField_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_searchActionPerformed(evt);
            }
        });
        jTextField_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_searchKeyReleased(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Notes", "Date"
            }
        ));
        jTable1.setRowHeight(19);
        jTable1.setRowMargin(2);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("ID: ");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(521, 521, 521)
                        .addComponent(jLabel3))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(47, 47, 47)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_id)
                            .addComponent(jTextField_notes)
                            .addComponent(jTextField_name)
                            .addComponent(jDateChooser_date, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(jTextField_search))
                        .addGap(190, 190, 190)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_new, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(382, 382, 382))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(265, 265, 265))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 136, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(76, 76, 76)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(41, 41, 41)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_notes, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(50, 50, 50)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jDateChooser_date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jButton_new, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_save)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_update)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    // To Save / Insert user's record to the DB
    
    @SuppressWarnings("empty-statement")
    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        
        if(( jTextField_id!=null || jTextField_name.getText() != null || jTextField_notes.getText() != null || jDateChooser_date != null)){
            try {
                Connection conn = MySQLConnection();
                //                String qry = "";
                PreparedStatement ps = conn.prepareStatement("insert into movies" + "(id, name,notes,date) values (?,?,?,?)");

                ps.setInt(1, Integer.parseInt(jTextField_id.getText()));
                ps.setString(2, jTextField_name.getText());
                ps.setString(3, jTextField_notes.getText());

                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

                String date1 = sdf.format(jDateChooser_date.getDate());;
                ps.setString(4,date1);

                int res = ps.executeUpdate();
                fillTable();
                if(res >= 1){
                    JOptionPane.showMessageDialog(null, res + "  Record added to Binge Watch...");

                }else{
                    JOptionPane.showMessageDialog(null, res + " Binge Watch Insertion Failed...");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
        jTextField_id.setText(" ");
        jTextField_name.setText(" ");
        jTextField_notes.setText(" ");
        jDateChooser_date.setDate(null);
       }else{
            JOptionPane.showMessageDialog(null, "Sorry, You Must Fill All Fields !");

        }

    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jTextField_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_searchActionPerformed
       
    }//GEN-LAST:event_jTextField_searchActionPerformed

    // Update Movie To Binge
    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
         if((jTextField_id!=null || jTextField_name.getText() != null || jTextField_notes.getText() != null || jDateChooser_date != null)){
            
            String qry = null;
            PreparedStatement ps = null;
            Connection conn = MySQLConnection();
            
            try {

                qry = "update movies set name = ?, notes = ?, date = ? where id = ?";
                ps = conn.prepareStatement(qry);
                
                ps.setString(1, jTextField_name.getText());
                ps.setString(2, jTextField_notes.getText());

                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

                String date1 = sdf.format(jDateChooser_date.getDate());;
                ps.setString(3,date1);

                ps.setInt(4,Integer.parseInt(jTextField_id.getText()));
                
                int res = ps.executeUpdate();
                fillTable();
                if(res >= 1){
                    JOptionPane.showMessageDialog(null, " Record Updated Successfully...");

                }else{
                    JOptionPane.showMessageDialog(null," Record Updation Failed... Invalid ID");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
            
            jTextField_id.setText(" ");
            jTextField_name.setText(" ");
            jTextField_notes.setText(" ");
            jDateChooser_date.setDate(null);
            
       }else{
            JOptionPane.showMessageDialog(null, "Sorry, You Must Fill All Fields !");

        }
        
    }//GEN-LAST:event_jButton_updateActionPerformed

    // Delete Movie To Binge
    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        if(jTextField_id.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter ID.");
        }else{
            try{
                String qry = "delete from movies where id = ?";
                Connection conn = MySQLConnection();
                PreparedStatement ps = conn.prepareStatement(qry);
                ps.setInt(1, Integer.parseInt(jTextField_id.getText().toString()));
                int res = ps.executeUpdate();
                fillTable();
                if(res>=1)
                {
                    JOptionPane.showMessageDialog(null, "Movie Deleted Successfully !");
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Movie Deletion Failed");

                }
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int ind = jTable1.getSelectedRow();
        showItemToFields(ind);
    }//GEN-LAST:event_jTable1MouseClicked

    // Search a field
    private void jTextField_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_searchKeyReleased
        ArrayList<MovieBean> al = null;
        al = new ArrayList<MovieBean>();
        String val = jTextField_search.getText().toString();
        
        try {
            Connection conn = MySQLConnection();
            String qry = "select * from movies where name like '%"+val+"%' ";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(qry);
            
            MovieBean movie;
            
            while(rs.next()){
                movie = new MovieBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                al.add(movie);
            }
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0); // Empty/clear the table
            Object[] row = new Object[4];
            
            for(int i=0;i<al.size(); i++){
                row[0] = al.get(i).getId();           
                row[1] = al.get(i).getName();
                row[2] = al.get(i).getNotes();
                row[3] = al.get(i).getDate();
              model.addRow(row);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
    }//GEN-LAST:event_jTextField_searchKeyReleased

    // Retrieve data from database 
    public ArrayList<MovieBean> retrieveData(){
        ArrayList<MovieBean> al = null;
        al = new ArrayList<>();
        try {
            Connection conn = MySQLConnection();
            String q = "select * from movies";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            MovieBean movie;
            
            while(rs.next()){
                movie = new MovieBean(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getString(4)
                );
                al.add(movie);
            }
        } catch (Exception e) {
            System.err.println("Could not retrieve data" + e);
        }
        
        return al;
    }    
    
    // Fill the table
    public void fillTable(){
        ArrayList<MovieBean> al = retrieveData();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0); //Empty or clear the tabe
        
        Object[] row = new Object[4];
        for(int i = 0; i< al.size(); i++){
            row[0] = al.get(i).getId();           
            row[1] = al.get(i).getName();
            row[2] = al.get(i).getNotes();
            row[3] = al.get(i).getDate();
            model.addRow(row);
        }
    }
    
    // Show table items to fields
    public void showItemToFields(int index){
        jTextField_id.setText(Integer.toString(retrieveData().get(index).getId()));
        jTextField_name.setText(retrieveData().get(index).getName());
        jTextField_notes.setText(retrieveData().get(index).getNotes());
           
        try {
            java.util.Date date = null;
            date = new SimpleDateFormat("dd-MM-yyyy").parse((String)retrieveData().get(index).getDate());
            jDateChooser_date.setDate(date);
        } catch (Exception e) {
            System.out.println("Error! Couldn't display items in fields");
        }
        
        
        
    }
    
    
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
            java.util.logging.Logger.getLogger(MoviesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoviesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoviesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoviesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoviesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_new;
    private javax.swing.JButton jButton_save;
    private javax.swing.JButton jButton_update;
    private com.toedter.calendar.JDateChooser jDateChooser_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_notes;
    private javax.swing.JTextField jTextField_search;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
