public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobik",3,'M',10,10);
        System.out.println(dog);
        dog.Eat();
        dog.buryBone();
        System.out.println();

        Raven raven = new Raven("Grisha",2,'M',3,10);
        System.out.println(raven);
        raven.Eat();
        raven.Fly();
        System.out.println();

        Cat cat = new Cat("Misha",5,'M',7,"Brown");
        System.out.println(cat);
        cat.Eat();
        cat.huntingMause();
    }
}
