public class Main {

    public static void main(String[] args) {
        Time t = new Time(22,58,58);
        System.out.println("Hour:" + t.getHour());
        System.out.println("Minute:"+t.getMinute());
        System.out.println("Second:" + t.getSecond());
        t.nextSecond(); //22:58:59
        t.nextSecond();//22:59:00
        t.previousSecond(); //22:58:59
        t.previousSecond();
        System.out.println("The time is:" + t.toString() );
    }

}