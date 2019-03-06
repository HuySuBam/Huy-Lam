public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second){
        setTime(hour,minute,second);
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (0<=hour && hour <24) {
            this.hour = hour;
        }else if (hour==24) {
            this.hour = 0;
        }else {
            System.out.println("invalid input- hour should be in range of 0 - 23 h ");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (0<=minute && minute < 60) {
            this.minute = minute;
        } else if (minute >= 60) {
            this.minute = minute - 60;
            this.hour = hour + 1;
        }else {
            System.out.println("invalid input- negative minute");
        }

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (0<=second && second < 60) {
            this.second = second;
        } else if (second >= 60) {
            this.second = second - 60;
            this.minute = minute + 1;
        }else {
            System.out.println("invalid input- negative second");
        }
    }

    public void setTime(int hour, int minute, int second){

        setHour(hour);
        setMinute(minute);
        setSecond(second);

    }

    public Time nextSecond(){
        second++;
        if (second>=60){
            minute++;
            second = second - 60;
        }
        if (minute>=60){
            hour++;
            minute = minute-60;
        }
        if(hour>=24) {
            hour=hour-24;
        }
        return new Time(hour,minute,second);
    }

    public Time previousSecond(){
        second--;
        if (second>=60){
            minute++;
            second = second - 60;
        } else if (second<0) {
            second = 60 + second;
            minute--;
        }
        if (minute>=60){
            hour++;
            minute = minute-60;
        } else if (minute<0) {
            minute = minute + 60;
            hour--;
        }
        if(hour>=24) {
            hour=hour-24;
        }
        return new Time(hour,minute,second);
    }
    public String toString(){
        return String.format("%02d",this.hour) + ":" + String.format("%02d",this.minute) + ":" + String.format("%02d",this.second);
    }
}