package map;
import java.util.*;

class UserAccountList {
    HashMap<Integer, Integer> m;

    public UserAccountList() {
        m = new HashMap<Integer, Integer>();
    }

    public int get(int id) {
        return m.get(id);
    }

    public void set(int id, int bal) {
        m.put(id, bal);
    }
}

public class StoringBalance2 {

    public static void main(String[] args) {
        
        UserAccountList list = new UserAccountList();
        list.set(1, 100);
        list.set(2, 2000);
        System.out.println(list.get(1));

        list.set(1, 5000);
        System.out.println(list.get(1));

    }
    
}
