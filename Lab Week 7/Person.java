class Person {
    String personName;
    int age;

    public Person(String personName, int age) {
        this.personName = personName;
        this.age = age;
    }

    public void print() {
        System.out.println("Name: " + personName);
        System.out.println("Age: " + age);
    }
}

class Patient extends Person {
    String diseaseType;
    String recommendedMedicine;

    public Patient(String personName, int age, String diseaseType, String recommendedMedicine) {
        super(personName, age);
        this.diseaseType = diseaseType;
        this.recommendedMedicine = recommendedMedicine;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Disease Type: " + diseaseType);
        System.out.println("Recommended Medicine: " + recommendedMedicine);
    }
}

class MedicarePatient extends Patient {
    String hospitalName;
    String wardName;
    int roomNumber;

    public MedicarePatient(String personName, int age, String diseaseType, String recommendedMedicine,
                           String hospitalName, String wardName, int roomNumber) {
        super(personName, age, diseaseType, recommendedMedicine);
        this.hospitalName = hospitalName;
        this.wardName = wardName;
        this.roomNumber = roomNumber;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Name of Hospital: " + hospitalName);
        System.out.println("Name of Ward: " + wardName);
        System.out.println("Room Number: " + roomNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Patient("Ahmed", 19, "Flu", "Panadol CP");
        Person p2 = new MedicarePatient("Ali", 30, "Fever", "Panadol", "AFIC", "General Cardiology", 4);

        System.out.println("Patient Information:");
        p1.print();

        System.out.println("\nMedicare Patient Details:");
        p2.print();
    }
}
