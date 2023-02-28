package Designpattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class RealInternet implements Internet{


    @Override
    public void connectTo(String serverHost) throws Exception {
            System.out.println("Connection is Allowed to " + serverHost);


    }
}
