public class encapsulation {
    public static void main(String[] args) {
        person myObj = new person();
        myObj.setName("John");
        System.out.println(myObj.getName());

        encap1 yoobj = new encap1();
        yoobj.setNames("Uday");
        System.out.println(yoobj.getNames());

        encap2 objects = new encap2();
        objects.setName("Alok");
        System.out.println(objects.getName());
    }
}
