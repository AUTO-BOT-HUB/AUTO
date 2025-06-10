package Package2_For_Access_Modifier;

import Package1_For_Access_Modifier.Class1;

public class Class3 extends Class1 {
    public void class3Method(){
        //Able to access public, static, and protected variable outside a package by extending the Class1
        System.out.println(publicString);
        System.out.println(public_static_string);
        System.out.println(protectedString);

        //able to access public variable in subclass outside a package
        Class1 cs4 = new Class1();
        System.out.println(cs4.publicString);
        System.out.println("Single Change");
    }
}
