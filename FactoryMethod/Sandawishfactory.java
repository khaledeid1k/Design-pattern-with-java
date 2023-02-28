
package Designpattern.FactoryMethod;


public class Sandawishfactory {
    public final static int chesse=1;
    public final static int chicken=2; 
    public static Sandawish creatsandawish(int sadid){
    switch(sadid){
        case chesse:
            return new chesse();
        case chicken:
            return new chicken();
        default:
            return null;
    
    }
    
    }
}
