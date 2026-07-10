package Sample8;
// 抽象クラスと具象クラス

abstract class Super {
    protected abstract void methodA(); //抽象メソッド
    public void methodB(){} // コロンで終わらず、{}がある = 具象メソッド

}

class Sub extends Super {
    @Override
//    protected void methodA() {}
    public void methodA(){} // アクセス修飾子は同じ protected か、より広い public にする必要がある

    // methodB は具象メソッドなので継承は任意
}