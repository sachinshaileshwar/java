class Person{
    private String name = "raj";
    private int age=20;
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}


public class Main1 {
    public static void main(String[] args) {
        Person a = new Person();
        System.out.println(a.getName());
        System.out.println(a.getAge());
    }
}
