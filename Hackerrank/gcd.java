package Hackerrank;

public class gcd {
	static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b%a, a);
    }
     
    // Function to find gcd of array of
    // numbers
    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int i=1; i<n; i++)
            result = gcd(arr[i], result);
         
        return result;
    }
     
    public static void main(String[] args)
    {
        int arr[] = {24,102,54};
        int n = arr.length;
        System.out.println(findGCD(arr, n));
    }

}
