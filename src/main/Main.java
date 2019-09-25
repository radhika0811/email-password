package main;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        User[] users = new User[n];
        for (int i = 0; i < n; i++) {
            String value = s.nextLine().trim();
            String company = s.nextLine().trim();
            int age = s.nextInt();
            s.nextLine().trim();
            users[i] = new User(value, company, age);
        }
        for( int i=0; i<n; i++) {
            users[i].display();
            users[i].password();
        }
    }
}
class User {
    String value;
    String company;
    int age;
    User(String value, String company, int age) {
        this.value = value;
        this.company = company;
        this.age = age;
    }
     void display() {
        System.out.println(String.format("%s_%d@%s.com", value, age, company));
    }
    void password() {
        StringBuilder pass = new StringBuilder();
        Random random = new Random();
        int n = (int) Math.random()*10;
        pass.append(n);
        char a = (char) (random.nextInt(26)+'a');
        pass.append(a);
        pass.append(value.substring(0,5));
        char ak = (char) (random.nextInt(48)+10);
        pass.append(ak);
        System.out.println(pass);
    }
}