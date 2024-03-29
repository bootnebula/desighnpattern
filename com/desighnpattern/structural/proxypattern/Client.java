package com.desighnpattern.structural.proxypattern;

public class Client {

    public static void main(String[] args) {
       Internet internet=new ProxyInternet();
        internet.connect("https://google.com","user1","pwd1");

       internet.connect("https://google.com","akhil","pwdak");


        Internet internet1=new ProxyInternet();
        internet1.connect("https://google.com","user1","pwd1");

        internet1.connect("https://google.com","akhil","pwdak");

    }
}
