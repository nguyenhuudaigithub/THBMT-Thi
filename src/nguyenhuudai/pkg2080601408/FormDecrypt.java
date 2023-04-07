/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nguyenhuudai.pkg2080601408;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class FormDecrypt extends javax.swing.JFrame {

    /**
     * Creates new form FormDecrypt
     */
    int vig[][];
    public FormDecrypt() {
         initComponents();
        vig = new int[26][26];
        for(int i=0;i<26;i++)
            for(int j=0;j<26;j++)
                vig[i][j] = (i+j)%26;
    }
    
   
  
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtM10 = new javax.swing.JTextField();
        btnMoFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGiaiMa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnTachChuoi = new javax.swing.JButton();
        txtmahoa2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtKhoa2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNoiChuoi2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtvanban3 = new javax.swing.JTextField();
        txtBam = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNoiChuoi = new javax.swing.JTextField();
        txtM7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtM8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtM9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtM11 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMoFile.setText("Mở FILE mã hóa E3");
        btnMoFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoFileActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Form Decrypt");

        btnGiaiMa.setText("Giải mã E3");
        btnGiaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaiMaActionPerformed(evt);
            }
        });

        jLabel2.setText("Cipher (E3) :");

        btnTachChuoi.setText("Tách chuỗi D3 : M3 + H2 + N1");
        btnTachChuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTachChuoiActionPerformed(evt);
            }
        });

        jButton4.setText("Tách chuỗi N1: M2 + E1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Key Ecrypt (K3) :");

        jButton5.setText("Giải mã E1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Decrypt (D3) :");

        jLabel5.setText("Message(M3):");

        jLabel6.setText("Message Hash (H2):");

        jLabel7.setText("Message (N1):");

        jLabel8.setText("Message (M2):");

        jLabel9.setText("Message (E1) :");

        jLabel10.setText("Key Encrypt(K1):");

        jLabel11.setText("Message (M1) :");

        jLabel12.setText("Hash (H2') :");

        jButton6.setText("Kiểm tra toàn vẹn ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Băm chuỗi N1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtM7, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtM9, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKhoa2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNoiChuoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBam, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNoiChuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtM8, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtM10, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmahoa2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtM11, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtvanban3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGiaiMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTachChuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMoFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmahoa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKhoa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNoiChuoi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGiaiMa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtvanban3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTachChuoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNoiChuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtM7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtM8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtM9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtM10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtM11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoFileActionPerformed
       
        // Khai báo các biến
        File file = new File("D:\\Encrypt.txt");
        StringBuilder content = new StringBuilder();

        try {
            // Đọc nội dung tệp
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append("");
            }
            scanner.close();

            // Đưa nội dung vào txtmahoa2
            txtmahoa2.setText(content.toString());
        } catch (FileNotFoundException ex) {
            System.out.println("Không tìm thấy tệp.");
        }

        
    }//GEN-LAST:event_btnMoFileActionPerformed

    private void btnGiaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaiMaActionPerformed
        // TODO add your handling code here:    
        
        int k= Integer.valueOf(this.txtKhoa2.getText());
        String s=this.txtmahoa2.getText();
        int n=s.length();
        int sd,sc;
        sd=k;
        sc=n/sd+1;
        char hr[][]=new char[sd][sc];
        
        String kq="";
        int sodu=n%sd;
        int sokytu=sc;
        int t=0;
        
        
        for(int i=0;i<sd;i++)
        {
            if(i>=sodu) sokytu=sc-1;
            for(int j=0;j<sokytu;j++)
            {
                hr[i][j]=s.charAt(t);
                t++;
            }
            
        }
        int c,d;
        c=0;
        d=0;
        for(int i=0; i<n;i++)
        {
            kq+=hr[d][c];
            d++;
            if(d==k){
                c++;
                d=0;
            }
        }
        this.txtNoiChuoi2.setText(kq);
        
    }//GEN-LAST:event_btnGiaiMaActionPerformed

      
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        String banma = this.txtM8.getText();
        String k=this.txtM9.getText();
        String kt1="";
        int kn=k.length();
        for(int i = 0; i<kn;i++)
            kt1+=(char)(((26-(Character.toUpperCase(k.charAt(i))-'A'))%26)+'A');
        this.txtM9.setText(kt1);
        String banro=mahoa(banma,kt1);
        this.txtM10.setText(banro);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private String mahoa(String banro,String key){
        int n=banro.length();
        String banma="";
        int k=0;
        for(int i=0; i<n;i++)
            if(Character.isLetter(banro.charAt(i)))
            {
              banma+=mahoa(banro.charAt(i),key.charAt(k));
              k++;
              k=k%key.length();
              
            }else 
                banma+=banro.charAt(i);
        return banma;
    }
    
    char mahoa(char x,char k){
        int xn=Character.toUpperCase(x)-'A';
        int kn=Character.toUpperCase(k)-'A';
        int yn=vig[kn][xn];
        return (char) (yn+'A');
    }
    
    
    private void btnTachChuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTachChuoiActionPerformed
        // TODO add your handling code here:
        
        File file = new File("D:\\M3.txt");
        StringBuilder content = new StringBuilder();

        try {
            // Đọc nội dung tệp
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append("");
            }
            scanner.close();

            // Đưa nội dung vào txtmahoa2
            txtvanban3.setText(content.toString());
        } catch (FileNotFoundException ex) {
            System.out.println("Không tìm thấy tệp.");
        }

        try{
            BufferedReader br=null;
            String fileName ="D:\\Bam.txt";
            br= new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null,"Read file success");
            char[] ca=new char[5];
            while (br.ready()){
                int len=br.read(ca);
                sb.append(ca,0,len);
            }
            br.close();
            System.out.println("Data is :"+""+sb);
            String chuoi = sb.toString();
            txtBam.setText(chuoi);
        }catch(IOException ex){
            //Logger.getLogger(MaHoaCeasar.class.getName()).log(Level.SEVERE,null,ex);
        }
            
        try{
            BufferedReader br1 = null;
            String fileNam ="D:\\N1.txt";
            br1 = new BufferedReader(new FileReader(fileNam));
            StringBuffer sb1 = new StringBuffer();
            
            char[] ca1 = new char[5];
            while(br1.ready())
            {
                int len = br1.read(ca1);
                sb1.append(ca1,0,len);
            }
            br1.close();
            System.out.println("Du lieu la"+""+sb1);
            String chuoi1=sb1.toString();
            txtNoiChuoi.setText(chuoi1);
            
        }catch(IOException ex)
            {
               
            }
        
        
    }//GEN-LAST:event_btnTachChuoiActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
         try{
            BufferedReader br1 = null;
            String fileNam ="D:\\M2.txt";
            br1 = new BufferedReader(new FileReader(fileNam));
            StringBuffer sb1 = new StringBuffer();
            
            char[] ca1 = new char[5];
            while(br1.ready())
            {
                int len = br1.read(ca1);
                sb1.append(ca1,0,len);
            }
            br1.close();
            System.out.println("Du lieu la"+""+sb1);
            String chuoi1=sb1.toString();
            txtM7.setText(chuoi1);
            
            BufferedReader br = null;
            String fileName ="D:\\E1.txt";
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            
            char[] ca = new char[5];
            while(br.ready())
            {
                int len = br.read(ca);
                sb.append(ca,0,len);
            }
            br.close();
            System.out.println("Du lieu la"+""+sb);
            String chuoi=sb.toString();
            txtM8.setText(chuoi);
            
            
            
        }catch(IOException ex)
            {
               
            }
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FormDecrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDecrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDecrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDecrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDecrypt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiaiMa;
    private javax.swing.JButton btnMoFile;
    private javax.swing.JButton btnTachChuoi;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBam;
    private javax.swing.JTextField txtKhoa2;
    private javax.swing.JTextField txtM10;
    private javax.swing.JTextField txtM11;
    private javax.swing.JTextField txtM7;
    private javax.swing.JTextField txtM8;
    private javax.swing.JTextField txtM9;
    private javax.swing.JTextField txtNoiChuoi;
    private javax.swing.JTextField txtNoiChuoi2;
    private javax.swing.JTextField txtmahoa2;
    private javax.swing.JTextField txtvanban3;
    // End of variables declaration//GEN-END:variables
}




