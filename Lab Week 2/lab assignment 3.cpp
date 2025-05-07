#include <iostream>
using namespace std;

class AverageCalculator {
private:
    float numbers[100];
    int size;

public:

    AverageCalculator(int s) : size(s) {}

    void getInput() {
        for (int i = 0; i < size; ++i) {
            cout << "Enter number " << i + 1 << ": ";
            cin >> numbers[i];
        }
    }

    float sumNumbers() {
        float sum = 0;
        for (int i = 0; i < size; ++i) {
            sum += numbers[i];
        }
        return sum;
    }

    void outputAverage() {
        float totalSum = sumNumbers();
        float average = totalSum / size;
        cout << "The average of the numbers is: " << average << endl;
    }

    void outputNumbers() {
        cout << "The numbers you entered are:" << endl;
        for (int i = 0; i < size; ++i) {
            cout << numbers[i] << endl;
        }
    }
};

int main() {
    int size;

    cout << "Enter the number of values you want to input: ";
    cin >> size;

    AverageCalculator calculator(size);

    calculator.getInput();
    calculator.outputNumbers();
    calculator.outputAverage();

    return 0;
}

