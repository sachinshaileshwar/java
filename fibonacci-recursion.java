import java.util.*;
public class Main{
    static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1) + fibo ( n-2);
    }
    
    public static void main(String [] args){
        System.out.println("Fibonacci series using Recursion");
        int n =7;
        for(int i=0; i<=n ; i++){
            System.out.print(fibo(i) + " ");
        }
        System.out.println();
        System.out.println("Fibonacci series using iteration");
        int first = 0;
        int second = 1;
        int temp=0;
        System.out.print(first + " " + second + " ");
        for(int i =2; i<=n; i++){
            temp = first + second;
            System.out.print(temp + " ");
            first = second;
            second = temp ;
            }
    }
} 
