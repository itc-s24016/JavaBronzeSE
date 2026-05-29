package Sample3;

// null 比較について
public class sample3_6 {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "";
        int[] array1 = null;
        int[] array2 = new int[1];
        int num = 0;

        System.out.println(str1 == null); // null == null
        System.out.println(str2 == null); // "" != null
        System.out.println(array1 != null);
        System.out.println(array2 != null); // [] != null
//        System.out.println(num == null); // コンパイルエラー

        System.out.println(array2[0]); // インデックス0に初期値が領域として入っていた == null ではない

        // String や Array は、null と比較することができるが、
        // int や false などの型は、null と比較することができない
    }
}
