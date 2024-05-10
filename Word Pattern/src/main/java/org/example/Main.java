package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))){
                if (!map.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                }
            }else if(map.containsValue(words[i])){
                return false;
            }else{
                map.put(pattern.charAt(i), words[i]);
            }
        }
        return true;
    }
}