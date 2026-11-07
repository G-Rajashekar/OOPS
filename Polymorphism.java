class Calculator{
    int add(int a,int b){
        return a+b;
    }

    double add(double a,double b){
        return a+b;
    }
}

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}


public class Polymorphism {

    public static void main(String[] args){
        Calculator calc=new Calculator();
        System.out.println("Sum of integers: "+calc.add(5,10));
        System.out.println("Sum of doubles: "+calc.add(5.5,10.5));

        Dog dog=new Dog();
        dog.sound();
    }

}
