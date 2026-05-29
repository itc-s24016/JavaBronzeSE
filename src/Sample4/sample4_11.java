package Sample4;
// ラベルについて
public class sample4_11 {
    public static void main(String[] args){
        loop1:
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.printf("x: %d, y: %d\n", x, y);
                if (x == 1 && y == 1) {
                    System.out.println("break の実行");
                    break loop1;
                }
            }
        }System.out.println("--------------------------------");
        loop2:
        for (int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++){
                System.out.printf("x: %d, y: %d\n", x, y);
                if (x == 1 && y == 1){
                    System.out.println("continue の実行");
                    continue loop2;
                }
            }
        }
        // 本来であれば 内側の for のみ抜けて外側の for がまだ続くはずだが、
        // break loop1（外側）が指定されているので、内側の for と外側の for の両方を抜ける
    }
}
