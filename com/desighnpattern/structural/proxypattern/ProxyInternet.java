package com.desighnpattern.structural.proxypattern;

import java.net.http.HttpConnectTimeoutException;
import java.util.concurrent.ExecutionException;

public class ProxyInternet implements Internet{

    public static  Internet internet;


    @Override
    public Boolean connect(String url, String usr, String pwd) {
        if("akhil".equalsIgnoreCase(usr)&&"pwdak".equals(pwd)){
            //this snippet block shows access control  of  Real Internet
            System.out.println("Connecting to internet via proxy");
            if (null==internet){
                //this snippet block shows lazy initialization of heavy  object Real Internet
                // In real lazy intialization of internet not make sense since its not give benefits
                // but to demonstrate virtulizaton of demonstration
                System.out.println("Delegating to real internet");
                this.internet=new RealInternet();
            }
            try{
            internet.connect(url,usr,pwd);
            }catch (Exception e){
                System.out.println("connection error"+e.getMessage());
            }
        }else {
            System.out.println("Access denied");
        }
        return true;
    }
}
