package com.prabhakar;

public class DeletingAFrom12thPosition {
    String removeA(String string) {
        int length = string.length();
        String result="";
        if(length >= 2) {
            if(string.charAt(0) == 'a' && string.charAt(1) == 'a') {
                result = string.substring(2,length);
            }
            else if(string.charAt(0) == 'a' && string.charAt(1) != 'a') {
                result = string.substring(1,length);
            }
            else if(string.charAt(0) != 'a' && string.charAt(1) == 'a') {
                result = string.charAt(0)+string.substring(2,length);
            }
            else {
                result = string;
            }
        }
        return result;
    }
}
