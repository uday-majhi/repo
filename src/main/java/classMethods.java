public class classMethods {
    public void speed(int maxspeed){
        System.out.println("The max speed is : " + maxspeed);
    }

    public void fullthrotle(){
        System.out.println("The car is going as fast as it can.");
    }

    public static void main(String[] args) {
        classMethods myCar = new classMethods();
        myCar.speed(200);
        myCar.fullthrotle();
    }
}
