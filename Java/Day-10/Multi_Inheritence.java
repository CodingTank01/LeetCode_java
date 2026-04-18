class Animal2{
    void eat(){
        System.out.println("animal eats");
    }
   
    
}
class Cat2 extends Animal2 {
    void sound(){
        System.out.println("Cat meows");
    }
}
class Kitten2 extends Cat2{
    void play(){
        System.out.println("Kitten plays");
    }
}

class Multi_Inheritence
{
	public static void main(String[] args) {
	Kitten2 k=new Kitten2(); 
	k.sound();
	k.eat();
	k.play();
	}
}
