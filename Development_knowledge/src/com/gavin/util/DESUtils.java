package com.gavin.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;

public class DESUtils {

    /**
     * ��Կ�㷨
     */
    private static final String ALGORITHM = "DES";
    /**
     * ����/�����㷨-����ģʽ-���ģʽ
     */
    private static final String CIPHER_ALGORITHM = "DES/CBC/PKCS5Padding";
    /**
     * Ĭ�ϱ���
     */
    private static final String CHARSET = "utf-8";

    public static void main(String[] args) {
        //ƫ�Ʊ������̶�ռ8λ�ֽ�
        String iv = "54a6cc76";
        //����
        //String password = "54a6cc76-e700-a1b2-fa3d-fb966efb7578";
        String password = "78c41cf8c82c6e9399db230d7d53e52373b78bdbaa836bc904cc7190";
        //����
        String data = "12345qwe";
        String encrypt = encrypt(password, iv, data);
        System.out.println(encrypt);
        //����
        String decrypt = decrypt(password, iv, encrypt);
        System.out.println(decrypt);

    }

    /**
     * ����key
     *
     * @param password
     * @return
     * @throws Exception
     */
    private static Key generateKey(String password) throws Exception {
        DESKeySpec dks = new DESKeySpec(password.getBytes(CHARSET));
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        return keyFactory.generateSecret(dks);
    }


    /**
     * DES�����ַ���
     *
     * @param password �������룬���Ȳ��ܹ�С��8λ
     * @param data �������ַ���
     * @param ivParam ƫ������
     * @return ���ܺ�����
     */
    public static String encrypt(String password, String ivParam, String data) {
        if (password== null || password.length() < 8) {
            throw new RuntimeException("����ʧ�ܣ�key����С��8λ");
        }
        if (data == null){
            return null;
        }
        try {
            Key secretKey = generateKey(password);
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
            IvParameterSpec iv = new IvParameterSpec(ivParam.getBytes(CHARSET));
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);
            byte[] bytes = cipher.doFinal(data.getBytes(CHARSET));

            BASE64Encoder encoder = new BASE64Encoder();
            return new String(encoder.encode(bytes));

        } catch (Exception e) {
            e.printStackTrace();
            return data;
        }
    }

    /**
     * DES�����ַ���
     *
     * @param password �������룬���Ȳ��ܹ�С��8λ
     * @param ivParam ƫ������
     * @param data �������ַ���
     * @return ���ܺ�����
     */
    public static String decrypt(String password, String ivParam, String data) {
        if (password== null || password.length() < 8) {
            throw new RuntimeException("����ʧ�ܣ�key����С��8λ");
        }
        if (data == null){
            return null;
        }
        try {
            Key secretKey = generateKey(password);
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
            IvParameterSpec iv = new IvParameterSpec(ivParam.getBytes(CHARSET));
            cipher.init(Cipher.DECRYPT_MODE, secretKey, iv);
            BASE64Decoder decoder = new BASE64Decoder();
            return new String(cipher.doFinal(decoder.decodeBuffer(data)), CHARSET);
        } catch (Exception e) {
            e.printStackTrace();
            return data;
        }
    }

}