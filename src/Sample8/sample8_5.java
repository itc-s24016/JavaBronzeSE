package Sample8;
// キャスト演算子について（基本データ型）
public class sample8_5 {
    public static void main(String[] args){
        double a = 10.5;
        int b = (int)a;

        System.out.println("double:"+a);
        System.out.println("int:"+b);

        // 引数でもキャスト演算子が使える
        foo((short) b);
    }
    static void foo(short c){
        System.out.println("short:"+c);
    }
}
