/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul11_1811081002_Part2;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author DSC
 */
public class AESExample_1811081002 {
    static Cipher cipher_1002;
    
    public static void main(String[] args) throws Exception{
        KeyGenerator keyGenerator_1002 = KeyGenerator.getInstance("AES");
        keyGenerator_1002.init(128);
        SecretKey secretKey_1002 = keyGenerator_1002.generateKey();
        cipher_1002 = Cipher.getInstance("AES");
        
        String plainTxt_1002 = "AES symmetric Encryption Decryption";
        System.out.println("Plain Text Before Encryption : "+plainTxt_1002);
        
        String encryptedText_1002 = encrypt(plainTxt_1002, secretKey_1002);
        System.out.println("Plain Text After Encryption : "+ encryptedText_1002);
        
        String decryptedText_1002 = decrypt(encryptedText_1002, secretKey_1002);
        System.out.println("Plain Text After Decryption : "+decryptedText_1002);
    }

    public static String encrypt(String plainTxt, SecretKey key) throws Exception{
        byte[] plainTextBytes_1002 = plainTxt.getBytes();
        cipher_1002.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedByte_1002 = cipher_1002.doFinal(plainTextBytes_1002);
        Base64.Encoder encoder_1002 = Base64.getEncoder();
        String encryptedText_1002 = encoder_1002.encodeToString(encryptedByte_1002);
        return encryptedText_1002;
    }

    public static String decrypt(String encryptedText, SecretKey key) throws Exception{
        Base64.Decoder decoder_1002 = Base64.getDecoder();
        byte[] encryptedTextBytes_1002 = decoder_1002.decode(encryptedText);
        cipher_1002.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedByte_1002 = cipher_1002.doFinal(encryptedTextBytes_1002);
        String decryptedText_1002 = new String(decryptedByte_1002);
        return decryptedText_1002;
    }
    
    
}
