package Sample4;
// 拡張 for について(for との違い)
public class sample4_7 {
    public static void main(String[] args){
        char[] array = {'a', 'b', 'c'};

        // for
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        // 拡張 for
        for (char i: array){
            System.out.println(i);
        }
    }
}
