#include <iostream>
using namespace std;

class BankAccount {
private:
    double balance;
public:
    BankAccount() { balance = 0; }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            cout << "Invalid deposit!" << endl;
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            cout << "Not enough money!" << endl;
        }
    }

    void showBalance() {
        cout << "Balance: " << balance << endl;
    }
};

int main() {
    BankAccount myAccount;

    myAccount.showBalance();

    myAccount.deposit(50);
    myAccount.showBalance();

    myAccount.deposit(-20);

    myAccount.withdraw(30);
    myAccount.showBalance();

    myAccount.withdraw(200);

    return 0;
}

