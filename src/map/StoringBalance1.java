package map;
import java.util.*;

class User {
    int id, balance;
    public User(int i, int b) {
        id = i;
        balance = b;
    }
}

class UserList {
    ArrayList<User> al;
    public UserList() {
        al = new ArrayList<User>();
    }

    public int get(int id) {
        for(User u: al) {
            if(u.id == id) {
               return u.balance;
            }
        }
       return -1;
    }

    public void set(int id, int bal) {
        for(User u: al) {
            if(u.id == id) {
                u.balance = bal;
                return;
            }
        }
        al.add(new User(id, bal));
    }

}

public class StoringBalance1 {

    public static void main(String[] args) {
        UserList customerList = new UserList();
        customerList.set(1, 100);
        customerList.set(2, 2000);
        System.out.println(customerList.get(1));

        customerList.set(1, 5000);
        System.out.println(customerList.get(1));

    }
    
}
