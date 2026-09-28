class Distance {
    public int feet;
    public float inches;

    public Distance() {
        feet = 0;
        inches = 0;
    }

    public Distance(int f, float i) {
        feet = f;
        inches = i;
    }

    void display() {
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}

public class LabTask3 {

    public static void main(String[] args) {

        Distance d1 = new Distance();

        System.out.println("Distance 1:");
        d1.display();

        Distance d2 = new Distance(5, 8.5f);

        System.out.println("\nDistance 2:");
        d2.display();
    }
}