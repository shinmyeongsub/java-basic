package oop1.ex;

public class Account {
    int balance = 0; // 잔액

    void deposit(int amount) {
        balance += amount;
        System.out.println("amount = " + amount);
    }

    void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("amount = " + amount);
        } else {
            System.out.println("잔액 부족");
        }
    }
}
