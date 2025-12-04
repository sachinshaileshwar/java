import java.util.*;
public class Main{
    static int gcd(int first , int second){
        if(second==0) return first;
        return gcd(second, first%second);
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println(gcd(first,second));
        
    }
} 
