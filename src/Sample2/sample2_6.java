package Sample2;

// 配列の初期化について
public class sample2_6 {
    public static void main(String[] args){
        int i;
//        System.out.println("i の値： " + i); // 表示する値（初期値）が無いのでエラー（コンパイルエラー）

        int[] array1 = new int[1];
        System.out.println("array1[0] の値： " + array1[0]);   // 配列は作成時に初期化されるのでOK
//        System.out.println("array1[0] の値： " + array1[1]); // 配列のサイズオーバーでエラー（実行時エラー）

        // 配列化すると、0 のインデックスに初期値が入るようになっている
        char[] array2 = new char[10];
        System.out.println("array2[0] の値： " + array2[0]);

        String[] array3 = new String[10];
        System.out.println("array3[0] の値： " + array3[0]);

        boolean[] array4 = new boolean[10];
        System.out.println("array4[0] の値： " + array4[0]);

        double[] array5 = new double[10];
        System.out.println("array5[0] の値： " + array5[0]);
    }
}
