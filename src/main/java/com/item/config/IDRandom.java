package com.item.config;

import java.util.Random;
import java.util.UUID;

public class IDRandom {


    public synchronized static final String buildID() {
        synchronized (IDRandom.class) {
            return UUID.randomUUID().toString().replaceAll("-", "");
        }
    }


    public synchronized static String randomSMSCode() {
        Random rad = new Random();
        String result = rad.nextInt(1000000) + "";
        if (result.length() != 6) {
            return randomSMSCode();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(buildID());
    }

    public static String buildButtonUniqueCode(){
        String salt = String.valueOf(System.currentTimeMillis());
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid+salt;
    }

    public static String generateRandomName(){
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 5);
    }
}
