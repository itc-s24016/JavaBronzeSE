package Sample2;

// データ型に限界値以上の数値が代入されてコンパイルエラーになる
public class sample2_3 {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 30;
//        long num3_1 = 10000000000; // コンパイルエラーになるはず
        long num3_2 = 10000000000l; // そのまま l をつければOK
//        float num4 = 10.0; // コンパイルエラーになるはず
    }
}

