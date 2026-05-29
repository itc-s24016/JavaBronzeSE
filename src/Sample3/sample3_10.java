package Sample3;

// 条件演算子について
public class sample3_10 {
    public static void main(String[] args) {
        int num1 = 20;
        String str = "num の値は ";

        str += num1 < 10 ? "10 未満" : num1 > 50 ? "50 以上" : "10 以上";
        System.out.println(str);

        // 条件 ? true : false;
        // if, else までは表せるが、if, else if までは表せない
        // その場合は、条件 ? true : 条件 ? true : false; とする

        int num2 = 2;
        str = "num の値は ";
        str += num2 == 1 ? "1" : num2 == 2 ? "2" : "3";
        System.out.println(str);

        // 条件 ? true : 当てはまらい場合の追加条件 ? true : false;
        // ⚠：推奨されているのは if, else if, else か、switch
    }
}