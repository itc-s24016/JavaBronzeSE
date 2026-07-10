package Sample7;

class Super3 {
    public Super3() { System.out.println("Super3()"); }
    public Super3(int a) { System.out.println("Super3(int a)"); }
}

class Sub3 extends Super {
    public Sub3() { System.out.println("Sub3()"); }
    public Sub3(int a) { System.out.println("Sub3(int a)"); }
}

class Cap07_2_06 {
    public static void main(String[] args) {
        Sub3 s1 = new Sub3();
        Sub3 s2 = new Sub3(10);
    }
}