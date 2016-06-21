package com.example.hackeris.toyvpn;

/**
 * Created by hackeris on 15/9/7.
 */
public class Encrypt {

    public static void encrypt(byte[] buffer, int length) {

        int i;
        for (i = 0; i < length; i++) {
            buffer[i] = (byte) ((byte) (buffer[i] & 0xff) ^ (length - i));
        }
    }

    public static void decrypt(byte[] buffer, int length) {

        encrypt(buffer, length);
    }
}
