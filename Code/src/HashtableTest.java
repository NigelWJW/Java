import java.util.Hashtable;
/**
 * Hashtable类测试
 */
class A {
    public int count;
    public A(int count){
        this.count = count;
    }

    @Override
    public String toString() {
        return "A[" +count +  "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (obj != null && obj.getClass() == A.class){
            A a = (A)obj;
            return this.count == a.count;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }
}

public class HashtableTest {
    public static void main(String[] args){
        Hashtable ht = new Hashtable();
        A a1 = new A(10);
        A a2 = new A(20);
        A a3 = new A(-10);
        ht.put(a1," A class");
        ht.put(a2," B class");
        ht.put(a3," C class");
        System.out.println(ht);
        System.out.println(ht.containsValue(" A class"));
        System.out.println(ht.containsKey(new A(-10)));
        ht.remove(new A(10));
        System.out.println(ht);
    }
}
