package com.java.leetcode.Strings;

public class ValidIP_Address_468 {
    public String validIPAddress(String queryIP) {
        if(queryIP.chars().filter(c -> c == '.').count() == 3){             //basic csheck.the dots should be 3 in order to proceed
            for(String token:queryIP.split("\\.", -1)){           //we are splitting with the '.' symbol
                if(token.length() == 0 || token.length()> 3)                   // For each token then we are checking the given rules and return neither if it maatches any rule
                    return "Neither";
                if(token.charAt(0) == '0' && token.length() != 1)
                    return "Neither";
                for(char c : token.toCharArray()){
                    if(!Character.isDigit(c))
                        return "Neither";
                }
                if(Integer.parseInt(token) > 255) return "Neither";
            }
            return "IPv4";
        }
        if(queryIP.chars().filter(c -> c == ':').count() == 7){     //Here we are splitting the string with : symbol.it should be 7 ..its a basic check.
            for(String token : queryIP.split(":",-1)){
                if(token.length()==0 || token.length()>4)
                    return "Neither";
                for(char c:token.toCharArray()){
                    if(!(c>=0 && c<='9' || c>='a' && c<= 'f' || c>='A' && c<='F'))
                        return "Neither";
                }
            }
            return "IPv6";
        }
        return "Neither";
    }
}
