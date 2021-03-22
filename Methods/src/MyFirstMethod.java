public class MyFirstMethod {
    public static void main(String[] args) {
        myMethod();
        String output = message("anthea");
        System.out.println(output);
    }

    public static void myMethod(){
        System.out.println("Hello World");
    }

    public static String message(String name){
        return "Hello " + name;
    }
}
