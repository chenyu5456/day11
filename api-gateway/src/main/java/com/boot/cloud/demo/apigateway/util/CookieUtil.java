package com.boot.cloud.demo.apigateway.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author chenyu
 * @time 2019/5/25 22:33
 */
public class CookieUtil {
    public static Cookie getCookieValue(String key, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(cookies != null && cookies.length > 0){
            for (int i= 0; i < cookies.length; i++){
                Cookie cookie = cookies[i];
                if(key.equals(cookie.getName())){
                    return cookie;
                }
            }
        }
        return null;
    }
}
