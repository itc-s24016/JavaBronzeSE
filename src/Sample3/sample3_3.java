package Sample3;
// ++演算子・--演算子について
public class sample3_3 {
    public static void main(String[] args){
        int a = 10; int b = 10; int c = 10; int d = 10;

        // 記号が後ろにある場合は、表示、代入をした後に増減する
        System.out.println(a++); // a (表示) してから +1
        System.out.println(++b); // +1 してから b(表示)
        System.out.println(c--);
        System.out.println(--d);

        a = 10; b = 10; c = 10; d = 10;
        b = ++a;
        System.out.println("a:" + a + "b:" + b); // 計算してから代入なので、a も b も 11
        d = c++;
        System.out.println("c:" + c + "d:" + d); // 代入してから計算なので、c は 11 だが d は 10
    }
}
