public abstract class Dog {
    private String name;
    private int age;
    private String color;
    public Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void golos();
}
