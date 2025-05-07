#include <iostream>
using namespace std;

class Counter {
private:
    int count;
public:
    Counter() { count = 0; }
    void increase() { count++; }
    void show() { cout << "Count: " << count << endl; }
};

void incrementByValue(Counter c) {
    c.increase();
}

void incrementByReference(Counter &c) {
    c.increase();
}

void incrementByPointer(Counter* c) {
    c->increase();
}

int main() {
    Counter obj;
    obj.show();

    incrementByValue(obj);
    obj.show();

    incrementByReference(obj);
    obj.show();

    incrementByPointer(&obj);
    obj.show();

    return 0;
}
