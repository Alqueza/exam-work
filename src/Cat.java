public class Cat extends Animal{
    private String color;

    public Cat(String name, int age, char gender, double weight, String color) {
        super(name, age, gender, weight);
        this.color = color;
    }

    public Cat() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void huntingMause(){
        System.out.println(getName()+" гониться за мышью");
    }
    @Override
    public void Eat() {
        System.out.println(getName()+" ест кошачий корм");
    }

    @Override
    public String toString() {
        return "\nCat" +
                "\nИмя:"+getName()+
                "\nВозраст:"+getAge()+
                "\nПол:"+getGender()+
                "\nВес:"+getWeight()+
                "\nЦвет:" + color;
    }
}
