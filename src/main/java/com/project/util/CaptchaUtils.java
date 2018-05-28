package com.project.util;

import java.util.Random;

public class CaptchaUtils {
	 /** 

     * Description：生成验证码

     * @return

     * @return String

     * @author name：lichao <br>email: 1563322963@qq.com

     **/
    public static String creatCaptcha(int count){
        String captcha = captcha(count);
        return captcha;
    }

    /** 

     * Description：生成随机数

     * @param charCount

     * @return

     * @return String


     **/
    public static String captcha(int charCount){
        String charValue = "";
        for (int i = 0; i < charCount; i++) {
            char c = (char) (randomInt(0, 10) + '0');
            charValue += String.valueOf(c);
        }
        return charValue;
    }

    public static int randomInt(int from, int to) {
        Random r = new Random();
        return from + r.nextInt(to - from);
    }
}
