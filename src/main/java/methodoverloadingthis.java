public class methodoverloadingthis {
    static int intmethod(int a, int b){
        return a + b;
    }

    static double doublemethod(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        int mynum  = intmethod(3,4);
        System.out.println("This is for integer :" + mynum);
        double hernem = doublemethod(4.3, 6.36);
        System.out.println("This is for double:" + hernem );
    }
}
