package Sample4;
// while について
public class sample4_1 {
    public static void main(String[] args){
        int num = 0;

        while (num < 5) {
            System.out.println(num);
            num++;
        }

      // 注意！
        num = 0;
        while (num < 5) {
            System.out.println(num);
            num--; // 実行しないで！
        }
//        一見無限ループに見えないが、
//        条件）5 より小さい
//        処理）0 をすっとマイナスしていく
//
//        結果）ずっと 5 より小さいままなので 無限ループ になる
    }
}
