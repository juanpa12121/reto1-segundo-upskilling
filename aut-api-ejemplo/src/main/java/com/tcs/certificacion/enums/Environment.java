package com.tcs.certificacion.enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum Environment {
    DEV("dev", "https://api.genderize.io"),
    QA("qa", "https://api.genderize.io" ),
    PROD("pdn", "https://api.genderize.io");

    private final String key;
    private final String url;
    private static Map<String, String> environment;

    Environment(String key, String url) {
        this.key = key;
        this.url = url;
    }


    static{
        Map<String, String> env = new HashMap<>();
        for(Environment uri: Environment.values()){
            env.put(uri.key, uri.url);
        }
        environment = Collections.unmodifiableMap(env);
    }

    public static String getEnvironment(String key){
        if(environment.containsKey(key)){
            return environment.get(key);
        }
        return null;
    }
}
