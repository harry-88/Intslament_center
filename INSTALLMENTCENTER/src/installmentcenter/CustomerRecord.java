/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package installmentcenter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author f2018266389
 */
public class CustomerRecord extends javax.swing.JFrame {

    /**
     * Creates new form Seerecord
     */
    public CustomerRecord() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        accNo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        installment = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        productname = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Records");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 10, 220, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Account Number");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 70, 102, 15);

        accNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accNoActionPerformed(evt);
            }
        });
        getContentPane().add(accNo);
        accNo.setBounds(280, 60, 258, 30);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Product Name", "Installment Number", "Per Month Installment", "Remaining Amount", "Date"
            }
        ));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(75);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(75);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(75);
            jTable2.getColumnModel().getColumn(1).setMinWidth(100);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(100);
            jTable2.getColumnModel().getColumn(2).setMinWidth(115);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(115);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(115);
            jTable2.getColumnModel().getColumn(3).setMinWidth(115);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(115);
            jTable2.getColumnModel().getColumn(3).setMaxWidth(115);
            jTable2.getColumnModel().getColumn(4).setMinWidth(115);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(115);
            jTable2.getColumnModel().getColumn(4).setMaxWidth(115);
            jTable2.getColumnModel().getColumn(5).setMinWidth(75);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(75);
            jTable2.getColumnModel().getColumn(5).setMaxWidth(75);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(110, 230, 580, 210);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 400, 90, 40);

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(560, 60, 80, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Per Month Installment");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 120, 139, 15);

        installment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                installmentActionPerformed(evt);
            }
        });
        getContentPane().add(installment);
        installment.setBounds(280, 110, 260, 31);

        Add.setBackground(new java.awt.Color(0, 0, 0));
        Add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(560, 150, 80, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date Of Installment");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 160, 130, 14);
        getContentPane().add(date);
        date.setBounds(280, 150, 260, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 200, 110, 15);

        productname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productnameActionPerformed(evt);
            }
        });
        getContentPane().add(productname);
        productname.setBounds(280, 190, 260, 30);

        Clear.setBackground(new java.awt.Color(0, 0, 0));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear);
        Clear.setBounds(10, 353, 90, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project Pics/art-colorful-contemporary-2047905.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 740, 450);

        setSize(new java.awt.Dimension(715, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void accNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accNoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           dispose(); 
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });   
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void installmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_installmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_installmentActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       DefaultTableModel model= (DefaultTableModel) jTable2.getModel();
       String data[]=new String[5];
       Boolean flag=false;
        for(int i=0;i<customer.size();i++)
        {
            if(accNo.getText().contains(customer.get(i).getAccountnum()))
            {
                index=i;
                flag=true;
                JOptionPane.showMessageDialog(this,"Now Add Record");
                for(int j=0;j<customer.get(i).getBuyProduct().size();j++)
                {
                    for(int k=0;k<customer.get(i).getBuyProduct().get(j).getInstalment().size();k++)
                    {
                        
                        Instalment obj=customer.get(i).getBuyProduct().get(j).getInstalment().get(k);
                        data[0]=customer.get(i).getBuyProduct().get(j).getName();
                        data[1]=(k+1)+"";
                        data[2]=obj.getMonthly()+"";
                        data[3]=obj.getRemaning()+"";
                        data[4]=obj.getDate();
                     
                       
                       model.addRow(data);
                    }
                    
                }
                break;
            }
        }
        if(flag==false)
            JOptionPane.showMessageDialog(this," Customer not Found!");
        
    }//GEN-LAST:event_searchActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        FileWriter fw=null;
        BufferedWriter bw=null;
        Boolean flag=false;
        for(int i=0;i<customer.get(index).getBuyProduct().size();i++)
        {
            if(productname.getText().contains(customer.get(index).getBuyProduct().get(i).getName()))
            {
                flag=true;
                int siz=customer.get(index).getBuyProduct().get(i).getInstalment().size();
               
                    
                float monthly=Float.parseFloat(installment.getText());
                float remaning=0;
                 if(siz>0){
                    remaning=customer.get(index).getBuyProduct().get(i).getInstalment().get(siz-1).getRemaning()-monthly;
                 }
                 else
                     remaning=(Float.parseFloat(customer.get(index).getInterestamount()))-monthly;
                String dat=date.getText();
                Instalment obj=new Instalment(monthly,remaning,dat);
                customer.get(index).getBuyProduct().get(i).getInstalment().add(obj);
                JOptionPane.showMessageDialog(this,"Added Successfully!");
                break;
            }
        }
        if(flag==false)
            JOptionPane.showMessageDialog(this,"Product not Found!  ");
        if(flag==true){
         try{
                fw=new FileWriter("customer.txt");
                bw=new BufferedWriter(fw);
                for(int i=0;i<customer.size();i++)
                {
                    Customers obj=customer.get(i);
                    bw.write(obj.getName()+" "+obj.getFather()+" "+obj.getCnic()+" "+obj.getAddress()+" "+obj.getContact()+" "+obj.getAccountnum()+" "+obj.getInterest()+" "+obj.getInterestamount()+" "+obj.getMonthlyamount()+" "+obj.getDateofpurchasing()+" "+obj.getDateofending()+" "+obj.getBuyProduct().size());
                    for(int j=0;j<obj.getBuyProduct().size();j++){
                        Product obj2=obj.getBuyProduct().get(j);
                        bw.newLine();
                        bw.write(obj2.getName()+" "+obj2.getCompany_name()+" "+obj2.getPrice()+" "+obj2.getQuantity()+" "+0+" "+obj2.getInstalment().size());
                        for(int k=0;k<obj2.getInstalment().size();k++)
                        {
                            Instalment obj3=obj2.getInstalment().get(k);
                            bw.newLine();
                            bw.write(obj3.getMonthly()+" "+obj3.getRemaning()+" "+obj3.getDate());
                        }
                        
                    }
                    bw.newLine();
                    
                }
                bw.close();
                fw.close();

            }catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        customer=new LoadCustomers().getdata();
         DefaultTableModel model= (DefaultTableModel) jTable2.getModel();
         model.addRow(new String[0]);
       String data[]=new String[6];
       Boolean flag1=false;
        for(int i=0;i<customer.size();i++)
        {
            if(accNo.getText().contains(customer.get(i).getAccountnum()))
            {
                index=i;
                flag1=true;
                for(int j=0;j<customer.get(i).getBuyProduct().size();j++)
                {
                    for(int k=0;k<customer.get(i).getBuyProduct().get(j).getInstalment().size();k++)
                    {
                        Instalment obj=customer.get(i).getBuyProduct().get(j).getInstalment().get(k);
                        data[0]=customer.get(i).getName();
                        data[1]=customer.get(i).getBuyProduct().get(j).getName();
                        data[2]=(k+1)+"";
                        data[3]=obj.getMonthly()+"";
                        data[4]=obj.getRemaning()+"";
                        data[5]=obj.getDate();
                     
                       
                       model.addRow(data);
                    }
                    
                }
                break;
            }
        }
        if(flag1==false)
            JOptionPane.showMessageDialog(this," Customer is Not Found!  ");
        
    }//GEN-LAST:event_AddActionPerformed

    private void productnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productnameActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
    accNo.setText("");
    installment.setText("");
    date.setText("");
    productname.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    /**
     * @param args the command line arguments
     */
    private static int  index;
   private ArrayList<Customers> customer=new LoadCustomers().getdata();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField accNo;
    private javax.swing.JTextField date;
    private javax.swing.JTextField installment;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField productname;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}