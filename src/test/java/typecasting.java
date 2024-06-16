import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class typecasting {
    public static void main(String[] args) {
        int a =9;
        float myDouble = a;
        System.out.println(a);
        System.out.println(myDouble);

        double hereDouble = 9.78d;
        int Myint = (int) hereDouble;
        System.out.println(hereDouble);
        System.out.println(Myint);
        String word = "Hello I am ";
        String word2 = "here";
        System.out.println(word.concat(word2));
        System.out.println(word.length());
        System.out.println(word.concat(word2.toUpperCase()));
        System.out.println(word.concat(word2.toLowerCase()));
        String text = "Where i am i 'am' need to be";
        System.out.println(text.indexOf("am"));
        System.out.println(word + "" + word2);
        System.out.println("\'");
        int i = 29;
        int  j = 30;
        System.out.println(Math.max(i,j));


        int ynum = 9 ;
        double ydouble = ynum;
        System.out.println(ydouble);
        System.out.println(ynum);
        int yint = (int) ydouble;
        System.out.println((yint));

        boolean JavaFun = TRUE;
        boolean notFun = FALSE;
        System.out.println(JavaFun);
        System.out.println(notFun);
        System.out.println(i<j);

        

    }
}
