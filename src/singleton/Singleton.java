package singleton;

public class Singleton {
    private static Singleton connection = null;

    //Constructor is private. so, no objects can be created from outside the class.
    //when constructor is private, 'new Singleton()' will show compilation error. "java: Singleton() has private access in com.company.Singleton"
    private Singleton(){}

    //public function that creates object and returns it
    public static Singleton getConnection(){
        if (connection == null ) {
            return connection = new Singleton();
        }
        else{
            return connection;
        }

    }

}
