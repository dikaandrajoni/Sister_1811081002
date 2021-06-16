/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul11_1811081002;

/**
 *
 * @author USER DSC
 */
public class Modulo26Crypto_1811081002 {
   public static void main(String[] args) {
        String plainText_1002 = "SISTER";
        String secretKey_1002 = "SECRETKEY";
        System.out.println("Plain Text Before Encryption\t: "+plainText_1002);
        String encryptedText_1002 = encrypt(plainText_1002, secretKey_1002);
        System.out.println("Encrypted Text After Encryption\t: "+encryptedText_1002);
        String decryptedText_1002 = decrypt(encryptedText_1002, secretKey_1002);
        System.out.println("Decrypted Text After Decryption\t: "+decryptedText_1002);
    }
    
    private static String encrypt(String str, String key){
        StringBuilder encryptedString_1002 = new StringBuilder();
        int encryptedInt_1002;
        for(int i=0; i<str.length(); i++){
            int strInt_1002 = (int)(str.charAt(i) - 'A');
            int keyInt_1002 = (int)(key.charAt(i) - 'A');
            encryptedInt_1002 = (strInt_1002+keyInt_1002)%26;
            encryptedString_1002.append((char) (encryptedInt_1002 + (int) 'A'));
        }
        return encryptedString_1002.toString();
    }
    
    private static String decrypt(String str, String key){
        StringBuilder decryptedString_1002 = new StringBuilder();
        int decryptedInt_1002;
        for(int i=0; i<str.length(); i++){
            int strInt_1002 = (int) (str.charAt(i) - 'A');
            int keyInt_1002 = (int) (key.charAt(i) - 'A');
            decryptedInt_1002 = strInt_1002 - keyInt_1002;
            if(decryptedInt_1002<0){
                decryptedInt_1002+=26;
            }
            decryptedString_1002.append((char) (decryptedInt_1002 + (int) 'A'));
        }
        return decryptedString_1002.toString();
    }
}
