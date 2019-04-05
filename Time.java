public class Time {
    int h, m, s;

    public Time(int h) {
       setH(h);
    }

    public Time(int h, int m){
       setH(h);
       setM(m);

    }

    public Time(int h, int m, int s) {
       setH(h);
       setM(m);
       setS(s);

    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    public void setH(int h) {
        if (h<0 || h>23)
            throw new IllegalArgumentException("Time: Bad hours value: " + h);
        this.h = h;
    }

    public void setM(int m) {
        if (m<0 || m>59)
            throw new IllegalArgumentException("Time: Bad minuts value: " + s);
        this.m = m;
    }

    public void setS(int s) {
        if (s<0 || s>59)
            throw new IllegalArgumentException("Time: Bad seconds value: " + s);
        this.s = s;
    }

    public String toString(){
        return String.format("Time: " + "%02d:%02d:%02d", h, m, s);
    }

    public String toString12() {
        if (isAm()) return String.format("Time: " + "%02d:%02d:%02d AM",h,m,s );
        else if (h >= 12 && h < 13 )return String.format("Time: "+"%02d:%02d:%02d PM",h,m,s);
        else return String.format("Time: "+"%02d:%02d:%02d PM",h-12,m,s);
    }

    public boolean isAm(){
        return h < 12;
    }

    public void incSecond(){
        s++;
        if (s > 59){
            incMinut();
            s = 0;
        }
    }

    public void incMinut(){
        m++;
        if (m > 59) {
             m = 0;
            incHour();
        }
    }

    public void incHour(){
        h++;
        if (h==24) h=0;
    }

    public int secondTotal(Time t){
        return (t.s + 60*t.m + 3600*t.h);
    }

    public int compareTo(Time other){
       System.out.println(secondTotal(this));
       System.out.println(secondTotal(other));
       return secondTotal(this) - secondTotal(other);
    }

}

