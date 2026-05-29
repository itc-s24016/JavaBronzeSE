package Sample4;
// do-while について
public class sample4_4 {
    public static void main(String[] args){
        int i = 5;

        // while
        while (i != 5 && i > 0){
            System.out.println("while: "+ i);
            i--;
        }

        // do-while
        do {
            System.out.println("do_while: "+ i);
            i--;
        } while (i != 5 && i > 0);
        
        // while   : 条件に合わないので、一度も実行されない
        // do-while: 条件に合わくても、必ず一度は実行される
    }
}
