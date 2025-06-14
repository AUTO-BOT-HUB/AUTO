package Package1_For_Access_Modifier;

public class Class2 extends Class1{
    public void class2Method(){
        //Able to use public and static variables outside a class but within a same package
        //by extending Class1
        //Also we can use the static varible by importing the PackageName.ClassName.VariableName
        System.out.println(publicString);
        System.out.println(public_static_string);
        System.out.println(defaultString);

        //Able to access protected, default, and public variable outside a class1 and within the same package by creating a
        //object of the class
        Class1 cs3 = new Class1();
        System.out.println(cs3.protectedString);
        System.out.println(cs3.defaultString);
        System.out.println(cs3.publicString);
        System.out.println("Single Change");
        System.out.println("Second Change");
    }
}
