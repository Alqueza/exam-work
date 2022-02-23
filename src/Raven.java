public class Raven extends Animal{
    private int wingsSize;
    public Raven(String name, int age, char gender, double weight, int wingsSize) {
        super(name, age, gender, weight);
        this.wingsSize = wingsSize;
    }

    public Raven() {
    }

    public int getWingsSize() {
        return wingsSize;
    }

    public void setWingsSize(int wingsSize) {
        this.wingsSize = wingsSize;
    }

    public void Fly(){
        System.out.println(getName()+"Взмахнул крыльями и полетел");

    }
    @Override
    public void Eat() {
        System.out.println("Ворона кушает крошки хлеба.");
    }

    @Override
    public String toString() {
        return "\nRaven" +
                "\nИмя:"+getName()+
                "\nВозраст:"+getAge()+
                "\nПол:"+getGender()+
                "\nВес:"+getWeight()+
                "\nРазмер Крыльев:" + wingsSize;
    }
}
