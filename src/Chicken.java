public class Chicken extends Bird{

    public Chicken(int age, String gender, int weight) {
        super(age, gender, weight);
    }

//    overriding the method defined in bird
    public void fly(){
        System.out.println("Not able to fly...");
    }
}
