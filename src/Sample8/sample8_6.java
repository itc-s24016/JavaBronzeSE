package Sample8;
// キャスト演算子について(参照型 + インターフェース)
public class sample8_6 {
    public static void main(String[] args){
        Animal a = new Dog();   // アップキャスト
        Dog d = (Dog) a;        // ダウンキャスト
        d.bark();

        // インターフェース型へのキャスト
        Pet p = (Pet) a;        // Animal型 → Pet型(インターフェース)へのダウンキャスト
        p.play();
    }
}
// スーパークラス
class Animal {
}
// インターフェース
interface Pet {
    void play();
}
// サブクラス(継承 + インターフェースの実装)
class Dog extends Animal implements Pet {
    void bark(){
        System.out.println("吠える");
    }
    @Override
    public void play(){
        System.out.println("遊ぶ");
    }
}