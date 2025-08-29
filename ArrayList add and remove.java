import java.io.*;
import java.util.*;
class Array{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a;
        ArrayList arr = new ArrayList();
        for(int i =0; i<6;i++){
            a = sc.nextInt();
            arr.add(a);
        }
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
    }
}
