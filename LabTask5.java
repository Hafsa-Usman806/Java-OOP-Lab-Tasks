class Time {
    private int hr;
    private int min;
    private int sec;

      public Time() {
        hr = 0;
        min = 0;
        sec = 0;
    }

 
    public Time(int h, int m, int s) {
        if (h >= 0 && h <= 23) {
            hr = h;
        } else {
            hr = 0;
        }

        if (m >= 0 && m <= 59) {
            min = m;
        } else {
            min = 0;
        }

        if (s >= 0 && s <= 59) {
            sec = s;
        } else {
            sec = 0;
        }
    }

    
    public void display() {
        System.out.println("Hour: " + hr);
        System.out.println("Minute: " + min);
        System.out.println("Second: " + sec);
    }
}

public class LabTask5 {

    public static void main(String[] args) {

        Time t1 = new Time();

        System.out.println("Time 1:");
        t1.display();

        Time t2 = new Time(10, 30, 45);

        System.out.println("\nTime 2:");
        t2.display();

        Time t3 = new Time(25, 70, 80);

        System.out.println("\nTime 3:");
        t3.display();
    }
}