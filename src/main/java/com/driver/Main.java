package com.driver;

public class Main {
  RWOnly obj = new RWOnly();
// obj.name = "rajat";
//java: name has private access in RWOnly --> Error shown by the Compiler
  obj.setName("Rajat");
  System.out.println(obj.getName());
}
