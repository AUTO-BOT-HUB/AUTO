package Package1_For_Access_Modifier;

public class Class1 {
    public String publicString = "Public String";
    public static String public_static_string = "Static String";
    String defaultString = "Default String";
    private String privateString = "Private String";
    protected String protectedString = "Protected String";

    public void getterMethod(){
        //Able to access static variable within a class, by just name
        System.out.println(public_static_string);
        //Able to access public, private, protected variables by creating an object of the class within a class
        Class1 cs2 = new Class1();
        System.out.println(cs2.publicString);
        System.out.println(cs2.protectedString);
        System.out.println(cs2.privateString);
    }

    public static void main(String[] args) {
        Class1 cs1 = new Class1();
        cs1.getterMethod();
    }
}
