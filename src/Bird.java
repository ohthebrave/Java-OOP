public class Bird extends Animal{

    public Bird(int age, String gender, int weight){
        super(age ,gender,weight);
    }

    public void move() {
        System.out.println("flapping it's wings");
    }

    public void fly(){
        System.out.println("Flying");
    }
}
