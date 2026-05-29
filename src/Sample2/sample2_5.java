package Sample2;

// 配列の作成・格納・出力まで
public class sample2_5 {
    public static void main(String[] args){
        // リスト生成のパターン
        char[] c; // --------------------- パターン１
        c = new char[3];

        int[] i = new int[3]; // --------- パターン２

        String str[] = {"a", "b", "c"}; // パターン３

        // 各インデックスに値を格納
        c[0] = 'A'; c[1] = 'B'; c[2] = 'C';
        i[0] = 100; i[1] = 200; i[2] = 300;
        // str は作成時に格納済み

        // 表示
        System.out.println("str[] の長さ: " + str.length);
        System.out.println("c[0]       : " + c[0]);
        System.out.println("i[0]       : " + i[0]);

        System.out.println(c);
        System.out.println(i);   // これは文字化けしたように表示されるのが正解
        System.out.println(str); // これは文字化けしたように表示されるのが正解
    }
}
