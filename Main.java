
public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(22);
        System.out.println(t1.toString());

        Time t2 = new Time(22, 20);
        System.out.println(t2.toString());

        Time t3 = new Time(23, 54, 59);
        System.out.println(t3.toString());


        for (int i = 0; i < 1000; i++) {
            t3.incSecond();
            System.out.println(t3.toString12());
        }

        t3.setH(23);
        t3.setM(50);
        t3.setS(50);
        System.out.println(t3.toString());
        System.out.println(t2.compareTo(t3));
    }


}
