package Sample3;
// 論理演算子について（& と && のちがい）
public class sample3_5 {
    public static void main(String[] args){
        int a = 10; int b = 10; int c = 10; int d = 10;

        boolean result1 = a++ > 10 & ++b > 10;
        System.out.println("result1：" + result1); // 評価内容：false & true = false
        System.out.println("a:" + a + "b:" + b);

        boolean result2 = c++ > 10 && ++d > 10;
        System.out.println("result2：" + result2); // 評価内容：false = false
        System.out.println("c:" + c + "d:" + d);

        // &：両方とも計算して評価する
        // &&：左側（先頭）の計算結果が false なら、右側は計算しなくていい
        // もし result2 で true && false なら、評価結果は false になる
    }
}
