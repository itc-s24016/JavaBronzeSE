package Sample6;
// アクセス修飾子について
class Employee2 {
    private int id;
    public Employee2(int i){ id = i; } // コンストラクタ
    public int getId() { return id; }
}
public class sample6_8 {
    public static void main(String[] args){
        Employee2 emp = new Employee2(100);
//        System.out.println(emp.id); // id は private なのでアクセスできない
        System.out.println(emp.getId());
    }
}
