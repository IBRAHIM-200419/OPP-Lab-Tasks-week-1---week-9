#include <iostream>
using namespace std;

class Computer {
public:
    int word_size;
    int memory_size;
    int storage_size;
    int speed;

    Computer(int w, int m, int s, int sp) {
        word_size = w;
        memory_size = m;
        storage_size = s;
        speed = sp;
    }

    void setSpecs(int m, int sp) {
        memory_size = m;
        speed = sp;
    }

    void setSpecs(int m, int sp, int s) {
        memory_size = m;
        speed = sp;
        storage_size = s;
    }

    void display() {
        cout << "Computer:\n";
        cout << "Word Size: " << word_size << " bits\n";
        cout << "Memory: " << memory_size << " MB\n";
        cout << "Storage: " << storage_size << " MB\n";
        cout << "Speed: " << speed << " MHz\n";
    }
};

class Laptop : public Computer {
public:
    double length, width, height, weight;

    Laptop(int w, int m, int s, int sp, double l, double wi, double h, double we)
        : Computer(w, m, s, sp) {
        length = l;
        width = wi;
        height = h;
        weight = we;
    }

    void display() {
        Computer::display();
        cout << "Laptop:\n";
        cout << "Length: " << length << " cm\n";
        cout << "Width: " << width << " cm\n";
        cout << "Height: " << height << " cm\n";
        cout << "Weight: " << weight << " kg\n";
    }
};

int main() {
    Computer pc(64, 8192, 512000, 3200);
    pc.display();

    cout << "\n";

    Laptop laptop(64, 16384, 1000000, 4200, 35.8, 24.5, 1.8, 2.3);
    laptop.display();

    return 0;
}
