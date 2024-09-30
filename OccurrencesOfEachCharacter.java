package geek.java.common.programs;

import java.util.HashMap;

public class OccurrencesOfEachCharacter {
    public static void main(String[] args) {
        String str = "anilrautela";
        HashMap<Character, Integer> map= new HashMap<Character, Integer>();
        char[] strArray = str.toCharArray();
        for(char c:strArray){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        map.forEach((k,v)-> System.out.println(k +":" +v));
    }

}
