public class Animal {
    private String name;
    private int age;
    private char gender;
    private double weight;

    public Animal(String name, int age, char gender, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void Eat(){
        System.out.println(name+" кушает");
    }
    @Override
    public String toString() {
        return "\nAnimal" +
                "\nname:" + name +
                "\nage:" + age +
                "\ngender:" + gender +
                "\nweight:" + weight;
    }
}
