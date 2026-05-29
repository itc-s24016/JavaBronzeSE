package Sample4;
// for について
public class sample4_6 {
    public static void main(String[] args){

        // カウンタ変数を省略する（事前に宣言していること）
        int i = 0;
        for(; i < 5; i++){
            System.out.println(i);
        }

        // 更新式を省略する（処理内で更新していること）
        for(int n = 0; n < 5;){
            System.out.println(n);
            n++;
        }

        // 省略は可能だが、記述量の変わらなさ と 可読性の低下 になるのでやめた方がいい
    }
}
