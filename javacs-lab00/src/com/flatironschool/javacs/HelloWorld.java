package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        //get java.version property as a string and convert it to double
        //The first 3 characters should have the version number
        try{
        	String trimmedJavaVersion = System.getProperty("java.version").substring(0, 3);
        	return Double.parseDouble(trimmedJavaVersion);
        } catch(NumberFormatException e) {
        	//Return negative number on failure
        	return -1.0;
        }   
    }

    public static void main(String[] args) {
	    //test getVersion
	    System.out.println(getVersion());
    }
}
