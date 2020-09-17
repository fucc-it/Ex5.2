public class Corgi extends Dog{
    public Corgi(String name, String color, int age){
        super(name, color, age);
    }

    @Override
    public void golos() {
        System.out.println("UwU");
    }
}
