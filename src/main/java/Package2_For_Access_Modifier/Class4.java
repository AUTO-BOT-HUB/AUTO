package Package2_For_Access_Modifier;
import Package1_For_Access_Modifier.Class1;

public class Class4 {
    public void class4Method(){
        //Able to access public variable outside a package of non su class by creating an object of the Class1
        Class1 cs5 = new Class1();
        System.out.println(cs5.publicString);
        System.out.println("Single Change");
        System.out.println("Second Change");
    }
}
