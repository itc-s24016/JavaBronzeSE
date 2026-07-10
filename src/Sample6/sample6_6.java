package Sample6;
// static変数について（インスタンス変数と比較）
class Test2{
    int ins = 100;
    static int stt = 200;
    void func1() {System.out.println("func1:"+ ins);}
    void func2() {System.out.println("func2:"+ stt);}
}
public class sample6_6 {
    public static void main(String[] args){
//        System.out.println(Test2.ins);// ❌
        System.out.println(Test2.stt);

        // インスタンス変数はインスタンス化しないと使えない

        Test2 t2 = new Test2();
        t2.func1();
        t2.func2();

        // インスタンス変数は幾つも作れるし、異なる要素を格納できたりする
        // static変数はクラス全体の共有変数なので異なる要素ごとに作ることができない = 1つまで
    }
}
