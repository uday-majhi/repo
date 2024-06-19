public class constructors {
    int x;
    int k;
    int modelyear;
    String model;

    public constructors(){
        x  = 5;
    }

    public constructors(int l){
        k = l;
    }

    public constructors(int year, String carName){
        modelyear = year;
        model = carName;
    }

    public static void main(String[] args) {
        constructors integ = new constructors(2);
        System.out.println(integ.k);
        constructors inte = new constructors();
        System.out.println(inte.x);
        constructors car = new constructors(1920,"LAMBORGHINI");
        System.out.println("Manu year :" + car.modelyear + " , " + "Car name :" + car.model);

    }

}
