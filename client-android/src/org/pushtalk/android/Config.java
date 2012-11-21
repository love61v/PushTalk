package org.pushtalk.android;

import java.util.LinkedHashMap;
import java.util.Set;

public class Config {

    public static boolean IS_TEST_MODE = true;
    
    public static String VERSION = "0.1.0";
    public static String WEB_JS_MODULE = "pushtalk";
    
//    public static final String HOST = "http://192.168.1.6:10010";
    public static final String HOST = "http://192.168.1.236:10010";
//    public static final String HOST = "http://111.13.48.109:10010";
    
    public static final boolean NOTIFICATION_NEED_SOUND = true;
    public static final boolean NOTIFICATION_NEED_VIBRATE = true;
    
    public static String udid;
    public static String myName;
    public static Set<String> myChannels;
    
    public static boolean isBackground = true;
    
    public static final LinkedHashMap<String, String> serverList = new LinkedHashMap<String, String>(){{
        put("请选择...", "");
        put("jpush free", HOST);
    }};

}
