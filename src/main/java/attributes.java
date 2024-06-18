public class attributes {
    int a =4;
    final int b = 6;
    String name = "Uday";
    String l_name = "Majhi";

    public static void main(String[] args) {
        attributes myobj = new attributes();
        System.out.println(myobj.a);
        System.out.println(myobj.b);

        //Set the new value in attributes
        myobj.a = 40;
        System.out.println(myobj.a);
//        myobj.b = 60;  //b cannot be assigned because it has been already assigned as final
//        System.out.println(myobj.b);

        //Multiple Attributes
        System.out.println("Name :" + myobj.name + " " + myobj.l_name);

    }
}
