package Hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class fractions {

	static String[] reducedFractionSums(String[] expressions) {
		String[] answers = new String[expressions.length];
			for(int i=0; i<expressions.length; i++){
				String s = expressions[i];
				String[] fractions = s.split("+");
				String fraction1 = fractions[0];
				String fraction2 = fractions[1];
				String[] a = fraction1.split("/");
				String[] b = fraction2.split("/");
				int num1 = Integer.parseInt(a[0]);
				int den1 = Integer.parseInt(a[1]);
				int num2 = Integer.parseInt(b[0]);
				int den2 = Integer.parseInt(b[1]);
				int num3=0,den3=0;
				String string = addFraction(num1,num2,den1,den2,num3,den3);
				answers[i] = string;
				}
			return answers;
			}
    
	
	static int gcd(int a, int b){
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	
	static String addFraction(int num1, int num2, int den1, int den2, int num3, int den3){
		den3 = gcd(den1,den2);
		
		den3 = den1*den2/den3;
		
		num3 = num1*(den3/den1) + num2*(den3/den2);
		
		return reduceFraction(num3,den3);
	}
	
	static String reduceFraction(int a, int b){
			int factor = gcd(a,b);
			
			int num = a/factor;
			int den = b/factor;
			StringBuilder sb  = new StringBuilder();
			sb.append(num);
			sb.append("/");
			sb.append(den);
			return sb.toString();
	}
	
	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String[] res;
        int expressions_size = 0;
        expressions_size = Integer.parseInt(in.nextLine().trim());

        String[] expressions = new String[expressions_size];
        for(int i = 0; i < expressions_size; i++) {
            String expressions_item;
            try {
                expressions_item = in.nextLine();
            } catch (Exception e) {
                expressions_item = null;
            }
            expressions[i] = expressions_item;
        }

        res = reducedFractionSums(expressions);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}

