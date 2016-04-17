package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
       String bop = System.getProperty("java.version");
        int spot = bop.indexOf('.');
        spot = bop.indexOf('.', spot+1);
        double answer = Double.parseDouble (bop.substring (0, spot));
        return answer; 
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
    }
}
