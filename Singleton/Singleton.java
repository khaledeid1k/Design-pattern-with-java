

package Designpattern.Singleton;

import java.util.Scanner;
 public class Singleton {

     private static  Singleton singleton = null;
     static int count = 0;

     private Singleton() {
         count++;

     }

     int f = 0;

     // ? This code is not thread-safe.
//    public static Singleton getSingleton() {
//
//        if (singleton == null)
//            singleton = new Singleton();
//
//        return singleton;
//    }

     /**
      * ! sdf
      * ? sdfs
      * TODO:
      *
      * @return
      * @see
      */

     public static Singleton getSingleton() {

         if (singleton == null) {                     // Single Checked
             synchronized (Singleton.class) {
                 if (singleton == null) {        // Double-checked
                     singleton = new Singleton();
                 }
             }


         }
         return singleton;
     }
 }

    