class Calculation{
    int z;
    public void Addition(int x,int y){
        z = x + y;
        System.out.println("The sum of numbers:"+z);
    }
    public void Subtraction(int x,int y) {
        z = x - y;
        System.out.println("The difference of numbers:" + z);
    }
}
public class Main extends Calculation{
    public void Multiplication(int x, int y){
        z = x * y;
        System.out.println("The product of numbers:" +z);
    }
    public static void main(String [] args){
        int a= 4;int b=2;
        Main obj = new Main();
        obj.Addition(a,b);
        obj.Subtraction(a,b);
        obj.Multiplication(a,b);
    }
}
