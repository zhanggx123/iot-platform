package com.tqzl.iot.common.core.utils;

import cn.hutool.core.codec.Base64;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/12 14:49]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
public class EncryptionUtil {

    @Value("${iot.platform.keyPari}")
    private String keyPair;


    public String encryptPassword(String password){
        byte[] key = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue(), Base64.decodeStr(keyPair).getBytes()).getEncoded();
        SymmetricCrypto aes = new SymmetricCrypto(SymmetricAlgorithm.AES, key);
        return aes.encryptHex(aes.encrypt(password));
    }

    public boolean matchesPassword(String password, String encodePassword){
        return encryptPassword(password).equals(encodePassword);
    }

}
