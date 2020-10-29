package maps;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        test();

        Map<String,String>dictionary;
                dictionary= new HashMap<>();

                dictionary.put("SEO","Search engine optimization");
                dictionary.put("SaaS","Software as a service");
                dictionary.put("UX","User experience");

          if (dictionary.containsKey("")) {
              System.out.println("Word doesn't exist, try again or Q to quit");
          }
              System.out.println(dictionary.get("SEO"));

              for (Map.Entry<String,String> entry:dictionary.entrySet()){
                  System.out.println(entry.getKey() + ": " + entry.getValue());
              }




    }

//    public static void test(){

    }
