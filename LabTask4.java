class Marks {
    int mark1, mark2, mark3;

    Marks() {
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }

    Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    int calculateSum() {
        return mark1 + mark2 + mark3;
    }
}

public class LabTask4 {

    public static void main(String[] args) {

        Marks student1 = new Marks();

        System.out.println("Sum of Student 1 marks: "
                + student1.calculateSum());

        Marks student2 = new Marks(80, 75, 90);

        System.out.println("Sum of Student 2 marks: "
                + student2.calculateSum());
    }
}