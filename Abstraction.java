abstract class Whatsapp{
    abstract void button();
}
class example extends Whatsapp {
    void button() {
        System.out.println("Send");
    }
    }
    public class Abstract {
    public static void main(String[] args) {
        example a = new example();
        a.button();
    }
}
