
public class Main {
    public static void main(String[] args) {
        Dni dni1 = new Dni(20973181);
        System.out.println(dni1);
        Dni dni2 = new Dni(20973181, 'D');
        System.out.println(dni2.isCorrect() ? "correcto" : "incorrecto");
        Dni dni3 = new Dni("20973181X");
    }
}
