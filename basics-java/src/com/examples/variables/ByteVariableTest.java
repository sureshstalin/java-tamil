package com.examples.variables;

public class ByteVariableTest {

	public static void main(String[] args) {
		 byte b = 20;
		 String str = "This is variable session";
		 byte strb[] = str.getBytes();
		 System.out.println("Array byte variable " + strb[1]);
		 System.out.println("Byte Value b is  " + b);
		 // strb[0] = 84 // str[1] = 104
		 System.out.println((char)84); // type casting
		 System.out.println((char)104);
		
	}
}

