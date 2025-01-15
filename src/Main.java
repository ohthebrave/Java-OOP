//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal sparrow = new Sparrow(23,"Male", 29);
        moveAnimal(sparrow);

        Bird bird1 = new Bird(3, "male",12);
        bird1.sleep();

        Chicken chick1 = new Chicken(2, "f", 10);
        chick1.fly();
    }
    static void moveAnimal(Animal animal){
        animal.move();

    }
}