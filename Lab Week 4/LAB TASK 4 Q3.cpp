#include <iostream>
using namespace std;

// Product class
class Product {
public:
    string name;
    double price;
    int quantity;

    // Default constructor
    Product() {
        name = "";
        price = 0.0;
        quantity = 0;
    }

    // Parameterized constructor
    Product(string n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    double totalValue() {
        return price * quantity;
    }
};

// Inventory class
class Inventory {
public:
    Product products[5];
    int count;

    Inventory() {
        count = 0;
    }

    void addProduct(Product p) {
        if (count < 5) {
            products[count] = p;
            count++;
        }
    }

    void displayHighValueProducts(double threshold) {
        cout << "\nProducts with total value over $" << threshold << ":\n";
        for (int i = 0; i < count; i++) {
            if (products[i].totalValue() > threshold) {
                cout << products[i].name << " - $" << products[i].totalValue() << endl;
            }
        }
    }
};

int main() {
    Inventory inventory;

    for (int i = 0; i < 5; i++) {
        string name;
        double price;
        int quantity;

        cout << "Enter product name, price, and quantity: ";
        cin >> name >> price >> quantity;

        inventory.addProduct(Product(name, price, quantity));
    }

    inventory.displayHighValueProducts(500);

    return 0;
}
s
