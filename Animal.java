class Animal {
    public static void main(String args[]) {
    }
    private String name;
    private int age;

}
class Dog extends Animal {
    public void bark() {
        System.out.println("Woof! Woof!");
    }
}
class Jindo extends Dog {
    private String origin;
}