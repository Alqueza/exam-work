public class Dog extends Animal{
    private int tailSize;

    public Dog(String name, int age, char gender, double weight, int tailSize) {
        super(name, age, gender, weight);
        this.tailSize = tailSize;
    }

    public Dog(){

    }

    public int getTailSize() {
        return tailSize;
    }

    public void setTailSize(int tailSize) {
        this.tailSize = tailSize;
    }
    public void buryBone(){
        System.out.println(getName()+" закопал кость");
    }
    @Override
    public void Eat() {
        System.out.println(getName()+" кушает собачий корм");

    }

    @Override
    public String toString() {
        return "\nDog" +
                "\nИмя:"+getName()+
                "\nВозраст:"+getAge()+
                "\nПол:"+getGender()+
                "\nВес:"+getWeight()+
                "\nРазмер хвоста" + tailSize;
    }
}
