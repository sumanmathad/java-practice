package concepts;

public class polymorphs {
    public static void main(String[] args) {
        Animal anim = new Animal();
        Animal animpig = new Pig();
        Animal animdog = new Dog();

        anim.animalSound();
        animpig.animalSound();
        animdog.animalSound();



    }


}

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
