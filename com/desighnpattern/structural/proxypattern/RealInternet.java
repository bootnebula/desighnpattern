package com.desighnpattern.structural.proxypattern;

public class RealInternet implements Internet{

    @Override
    public Boolean connect(String url, String usr, String pwd) {
      System.out.println("Connecting to real internet");
      return true;
    }
}
