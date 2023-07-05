package com.java.leetcode.Strings;

import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodeTinyURL_535 {
    Map<String, String > myMap = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = ""+longUrl.hashCode();
        myMap.put(key,longUrl);
        return key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return myMap.get(shortUrl);
    }
}
