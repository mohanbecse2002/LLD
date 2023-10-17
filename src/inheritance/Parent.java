package inheritance;

public class Parent extends GrandParent{
//    String name = "parent";
//    int age = 80;

    Parent(){
//        super(); // This is optional, anyway java automatically calls 'super()' without any parameters.
        System.out.println("Parent Constructor Called!");
    }
}
