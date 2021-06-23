/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul11_1811081002_Part2;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author DSC
 */
public class Crypto_1811081002 {
    private static Cipher cipher_1002 = null;
    
    public static void main(String[] args) throws Exception{
        KeyGenerator keyGenerator_1002 = KeyGenerator.getInstance("DESede");
        
        keyGenerator_1002.init(168);
        SecretKey secretKey_1002 = keyGenerator_1002.generateKey();
        cipher_1002 = Cipher.getInstance("DESede");
        
        String plainTxt_1002 = "Kriptografi menggunakan Java Cryptography Extension";
        System.out.println("Plain Text Before Encryption : "+plainTxt_1002);
        
        byte[] plainTextByte_1002 = plainTxt_1002.getBytes("UTF8");
        
        byte[] encryptedBytes_1002 = encrypt(plainTextByte_1002, secretKey_1002);
        String encryptedText_1002 = new String(encryptedBytes_1002, "UTF8");
        System.out.println("Plain Text After Encryption : "+ encryptedText_1002);
        
        byte[] decryptedBytes_1002 = decrypt(encryptedBytes_1002, secretKey_1002);
        String decryptedText_1002 = new String(decryptedBytes_1002, "UTF8");
        System.out.println("Plain Text After Decryption : "+decryptedText_1002);
    }
    
    static byte[] encrypt(byte[] plainText, SecretKey key) throws Exception{
        cipher_1002.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes_1002 = cipher_1002.doFinal(plainText);
        return encryptedBytes_1002;
    }
    
    static byte[] decrypt(byte[] encryptedText, SecretKey key) throws Exception{
        cipher_1002.init(cipher_1002.DECRYPT_MODE, key);
        byte[] decryptedBytes_1002 = cipher_1002.doFinal(encryptedText);
        return decryptedBytes_1002;
    }
}
