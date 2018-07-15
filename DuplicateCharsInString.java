import java.io.*;
import java.util.*;



class DuplicateCharsInString {

       public static void main(String[] args) {

           String str = "aabcc";

           char[] carr = str.toCharArray();

           Map<Character,Integer> m = new HashMap<Character,Integer>();

           for( Character c : carr )
           {
              if(  m.containsKey(c) )
                m.put(c,m.get(c) + 1);
              else
                m.put(c,1);

           }

          Set<Map.Entry<Character,Integer>> entrySet = m.entrySet();

           for( Map.Entry<Character,Integer> e : entrySet )
           {
               if( e.getValue() > 1 )
                 System.out.println(e.getKey()+" "+e.getValue() );
           }

       }

  }
