package Designpattern.Singleton;

import Designpattern.Singleton.Singleton;
import  java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.lang.*;
import java.io.*;
import java.lang.reflect.Array;
import java.sql.Struct;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashSet;
import java.math.BigDecimal; 
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.regex.Pattern;

     public class lol{ 
  public static void main(String[] args) {


      Singleton g = Singleton.getSingleton();

      g.f=1;
        Singleton r = Singleton.getSingleton();
        r.f=2;
        
      System.out.println("Total Number of Objects: " + Singleton.count);
            System.out.println(g.f);  


}    

 
    }

         

  
     
          
  
    
    


  
  
  
	



           

