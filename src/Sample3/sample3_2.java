package Sample3;
// +演算子で数字と文字列の結合
public class sample3_2 {
    public static void main(String[] args){
        String str = "Hello";
        int a = 10;
        int b = 20;
        System.out.println(str + a);
        System.out.println(str + a + b); // 計算順として文字列が先に来ているので、全て文字列として扱われる
        System.out.println(str + (a + b)); // 値の計算が優先されている
        System.out.println(a + b + str);

        // 文字列 + 値 = "文字列値"
        // 値 + 文字列 = 値"文字列
    }
}
