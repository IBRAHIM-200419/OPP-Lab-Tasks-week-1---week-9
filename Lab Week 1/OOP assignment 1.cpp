#include <iostream>
#include <cmath> // we include c math for power function
using namespace std;

int add(int a, int b);
int sub(int a, int b);
int muti(int a, int b);
int dive(int a, int b);
int power(int a, int b); // Renamed from pow to avoid conflict with cmath's pow()

void m() {
    int choice, a, b;
    cout << "Please select an option: \n";
    cout << "1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Power\n";
    cin >> choice;

    cout << "Enter two numbers: ";
    cin >> a >> b;

    switch (choice) {
        case 1:
            cout << "Result: " << add(a, b) << endl;
            break;
        case 2:
            cout << "Result: " << sub(a, b) << endl;
            break;
        case 3:
            cout << "Result: " << muti(a, b) << endl;
            break;
        case 4:
            if (b == 0) {
                cout << "Error: Division by zero!" << endl;
            } else {
                cout << "Result: " << dive(a, b) << endl;
            }
            break;
        case 5:
            cout << "Result: " << power(a, b) << endl;
            break;
        default:
            cout << "Invalid choice!" << endl;
            break;
    }
}

int add(int a, int b) {
    return a + b;
}

int sub(int a, int b) {
    return a - b;
}

int muti(int a, int b) {
    return a * b;
}

int dive(int a, int b) {
    return (b != 0) ? a / b : 0; // Additional check for division by zero
}

int power(int a, int b) {
    return pow(a, b);
}

int main() {
    m(); // Call function m(), no need for cout
    return 0;
}
