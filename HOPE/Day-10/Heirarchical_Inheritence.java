class Animal1 {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog is barking");
    }
}
class Cat1 extends Animal1 {
    void meow() {
        System.out.println("Cat is meowing");
    }
}
public class Heirarchical_Inheritence {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat();
        d.bark();
        Cat1 c = new Cat1();
        c.eat();
        c.meow();
    }
}
