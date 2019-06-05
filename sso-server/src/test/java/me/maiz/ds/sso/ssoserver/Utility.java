package me.maiz.ds.sso.ssoserver;

import junit.framework.TestCase;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Utility extends TestCase {

    public void testEncrypt(){
        String result = new BCryptPasswordEncoder().encode("123abc");
        System.out.println(result);
    }

}
