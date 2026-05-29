package Sample4;
// break について
public class sample4_9 {
    public static void main(String[] args){
        // for と if の場合
        for (int i = 0; ; i++){
            if (i == 3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("ここは for の外です");

        // for の条件が抜けているので本来であれば無限ループ
        // しかし、if に該当したとき break で抜けているので無限ループになっていない

        // for と switch の場合
        int num = 0;
        for(int i = 0; i < 5; i++){
            switch (i % 2){
                case 0:
                    num++;
                    break;
                case 1:
                    break;
            }
        }
        System.out.println("ここは for の外です： "+ num);

        // ここの break は switch の break であって、for の break ではない
        // ので、switch で加算、for で繰り返し処理をして、結果 3 になる
    }
}
