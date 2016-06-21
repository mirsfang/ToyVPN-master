package com.example.hackeris.toyvpn;

/**
 * Created by hackeris on 15/9/7.
 */
public class Encryptor {

    public void encrypt(byte[] array, int length){

        byte[] arr = RC4.RC4Base(array, "test");
        int i;
        for(i=0; i < length; i ++){
            array[i] = arr[i];
        }
        //Encrypt.encrypt(array, length);
    }

    public void decrypt(byte[] array,int length){

        encrypt(array, length);
        //Encrypt.decrypt(array, length);
    }
}
