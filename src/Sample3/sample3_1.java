package Sample3;
// 算術演算子について
public class sample3_1 {
    public static void main(String[] args){
        System.out.println(10 + 3);
        System.out.println(10 - 3);
        System.out.println(10 * 3);
        System.out.println(10 / 3); // 整数同士の割り算は、商の整数部分のみが返される
        System.out.println(10 / 3.0); // 小数点を含む数値があると、商の小数部分も返される
        System.out.println(10 % 3);
    }
}
