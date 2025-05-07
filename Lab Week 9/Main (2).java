
abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
int mark1, mark2, mark3;

A(int m1, int m2, int m3) {
    if (mark1 < 0 || mark2 < 0 || mark3 < 0 || mark1 > 100 || mark2 > 100 || mark3 > 100 ){
        throw new IllegalArgumentException( "Marks shoeld be bt 0 and 100 ");
    }
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
    }

    double getPercentage() {
        return ((mark1 + mark2 + mark3) / 3.0) ;
    }
}

class B extends Marks {
int mark1, mark2, mark3, mark4;

B(int m1, int m2, int m3, int m4) {
    if (mark1 < 0 || mark2 < 0 || mark3 < 0 || mark4< 0 || mark1 > 100 || mark2 > 100 || mark3 > 100 || mark4 >100 ){
        throw new IllegalArgumentException( "Marks shoeld be bt 0 and 100" );
    }
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
        this.mark4 = m4;
    }

    double getPercentage() {
        return ((mark1 + mark2 + mark3 + mark4) / 4.0) ;
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            A studentA = new A(85, 90, 80);
            B studentB = new B(75, 80, 70, 85);

            System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
            System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
        } catch (IllegalArgumentException e) {
            System.out.println("error :" + e.getMessage());
        }
    }
}