package com.desighnpattern.structural.decorator;


import java.util.Collections;

public class Teashop {

 public static void main(String[] args) {

  Tea t= new GreenTea(new LimeTea(new NormalTea()));
  t.cost();
 }
}
