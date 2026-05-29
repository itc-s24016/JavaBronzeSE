package Sample3;
// 関係演算子について
public class sample3_4 {
    public static void main(String[] args){
        int a = 10; int b = 10; int c = 10;

        System.out.println("a == b : " + (a == b));
        System.out.println("a == c : " + (a == c));
        System.out.println("a != b : " + (a != b));
        System.out.println("a != c : " + (a != c));
        System.out.println("a < b : " + (a < b));
        System.out.println("a <= c : " + (a <= c));
        System.out.println("a > b : " + (a > b));
        System.out.println("a >= c : " + (a >= c));

        /*
        ==：同じ
        !=：同じじゃない

        ---（値を含まない）-------
        <：より大きい
        >：より小さい

        ---（値を含む）----------
        <=：以上
        >=：以下
        */
    }
}
