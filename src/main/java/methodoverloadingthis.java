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


        //Started for a scope
        // Code here CANNOT use x

        int s = 100;

        // Code here can use x
        System.out.println(s);

        //Again here

        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x

            int x = 100;

            // Code here CAN use x
            System.out.println(x);

        } // The block ends here

        // Code here CANNOT use x
    }
}
