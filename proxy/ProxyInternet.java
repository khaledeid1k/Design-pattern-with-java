package Designpattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    RealInternet realInternet=new RealInternet();
    private static List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }
    @Override
    public void connectTo(String serverHost) throws Exception {


        if(bannedSites.contains(serverHost)){
            System.out.println("Connection is Denied");
        }else{
            realInternet.connectTo(serverHost);
        }

    }
}
