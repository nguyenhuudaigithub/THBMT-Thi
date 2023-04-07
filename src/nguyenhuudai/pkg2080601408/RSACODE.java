/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenhuudai.pkg2080601408;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

   
/**
 *
 * @author LENOVO
 */
public class RSACODE {
    private String password;
    private BigInteger[] ciphertext;
    private BigInteger n;
    private BigInteger d;
    private String message;
    private String dhash;

    public RSACODE(String password) {
        this.password = password;
        RSA rsa = new RSA(8);
        this.n = rsa.getN();
        this.d = rsa.getD();
        this.ciphertext = rsa.encrypt(password);
        this.message = getMessage();
        this.dhash = getDhash();
    }

    public String getMessage() {
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < this.ciphertext.length; i++) {
            bf.append(this.ciphertext[i].toString(16).toUpperCase());
            if (i != this.ciphertext.length - 1)
                System.out.println(" ");
        }
        return bf.toString();
    }

    public String getDhash() {
        RSA rsa = new RSA(8);
        String dhash = rsa.decrypt(this.ciphertext, this.d, this.n);
        try {
            FileWriter writer = new FileWriter("D:/dhash.txt");
            writer.write(dhash);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }       
        return dhash;
    }
    
    public String getMessageResult() {
        return this.message;
    }

    public String getDhashResult() {
        return this.dhash;
    }
}




