package Designpattern.proxy;

public class Client {
    public static void main(String[] args) throws Exception {
        Internet internet=new ProxyInternet();
        internet.connectTo("geeksForGeeks.org");
        internet.connectTo("abc.com");
    }
}
