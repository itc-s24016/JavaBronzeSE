package Sample7;
// this について
class Foo {
    String s;
    int i;
    public Foo() {
        this("Hello");
    }
    public Foo(String s){
        this(s, 1);
    }
    public Foo(String s, int i){
        this.s = s;
        this.i = i;
        System.out.println("String: " + s);
        System.out.println("int: " + i);
    }
}
//public class Cap07_2_04 {
//    public static void main(String[] args) {
//        System.out.println("Foo()");
//        Foo f1 = new Foo();
//        System.out.println("Foo(\"Hey\")");
//        Foo f2 = new Foo("Hey");
//        System.out.println("Foo(\"Bye\")");
//        Foo f3 = new Foo("Bye");
//    }
//}
