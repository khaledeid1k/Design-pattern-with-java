

package Designpattern.FactoryMethod;



 public class Sandawish {
    private String name  ;
    private int cator;
    
    public String getname(){
    return name ;
    }
     public void setname(String name){
    this.name =name;
    } public int getcator(){
    return cator ;
    } public void setcator(int cator){
    this.cator=cator ;
    }
    
    public void preprer(){
    
    System.out.println(name + " "+ cator);
    }
    
    
}
