public class Bulldog extends Dog {
    public Bulldog(String name, String color, int age){
        super(name, color, age);
    }

    @Override
    public void golos() {
        System.out.println("Gav-gav");
    }
}
