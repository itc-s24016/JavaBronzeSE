package Sample8;
// インターフェースと実装クラス

interface MyInterface {
//    int a; // 初期化しないとコンパイルエラーになる
    int b = 10;
    final int c = 20;
    public int d = 30;
    static int e = 40;
    public static int f = 50;
    public final int g = 60;

    public abstract void methodA(); // 抽象メソッド
    void methodB(); // public abstract は省略OK
//    protected void methodC(); // protected は不可 | コンパイルエラー
}

class MyClass implements MyInterface {
    @Override
    public void methodA() {}

    @Override
    public void methodB() {}
}
