package Sample6;
// オーバーロードについて

/*条件
* 引数の型
* 引数の並び
* 引数の数
* */
class Test {
    void func(){System.out.println("引数なし");}
    void func(int a){System.out.println(a);}
    void func(int a, String b){System.out.println(a +":"+ b);}
//    void func(String b, int a){System.out.println(a +":"+ b);} // これはダメ
    void func(String a, int b){System.out.println(b +":"+ a);}
//    void func(int b, String a){System.out.println(b +":"+ a);} // これはダメ

}
public class sample6_3 {
    public static void main(String[] args){
        Test t = new Test();
        t.func();
        t.func(100);
        t.func(100, "Hello");
        t.func("Hello", 100);
    }
}
