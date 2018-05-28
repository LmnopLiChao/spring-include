package com.project.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * 
 * @className: MD5
 * @description: md5加密
 * @author 李超   lichao03@yinhai.com
 * @date 2018年5月21日 下午2:19:50
 */
public class MD5 {
	public static String getMD5 (String m) {
		return md5(m);
	}

    private static String md5(String m) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(m.getBytes());
            m = new BigInteger(1, md.digest()).toString(16);
            m = fillMD5(m);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
		return m;
    }
    /**
     * 采用递归   补全md5长度
     * @title: fillMD5 
     * @author 李超 lichao03@yinhai.com
     * @date 2018年5月21日
     * @description: TODO
     * @param md5
     * @return
     */
    private static String fillMD5(String md5){
        return md5.length()==32?md5:fillMD5("0"+md5);
    }
}
