public class Main {
    public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.name = "Tommy";
      d1.age = 7;
      d1.bark();
    }
}

class Dog{
   String name;
   int age;

   void walk(){
       System.out.println("Dog is walking");
   }
   void bark(){
       System.out.println("Dog is barking");
   }
}