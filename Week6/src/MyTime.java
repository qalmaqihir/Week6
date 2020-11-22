public class MyTime {
    private int hour;
    private int minute;
    private int second;
    public MyTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public MyTime() {
        this(0,0,0);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
    public MyTime nextSecond(){
        //int second=time.getSecond();
        setSecond(getSecond()+1);
        MyTime newTime=new MyTime(this.hour,this.minute,this.second);
        return newTime;
    }
    public MyTime previousSecond(){
        //int second=time.getSecond();
        setSecond(getSecond()-1);
        MyTime newTime=new MyTime(this.hour,this.minute,this.second);
        return newTime;
    }
    public MyTime previousMinute(){
        //int second=time.getSecond();
        setMinute(getMinute()-1);
        MyTime newTime=new MyTime(this.hour,this.minute,this.second);
        return newTime;
    }
    public MyTime nextMinute(){
        //int second=time.getSecond();
        setMinute(getMinute()+1);
        MyTime newTime=new MyTime(this.hour,this.minute,this.second);
        return newTime;
    }
    public MyTime nexHour(){
        //int second=time.getSecond();
        setHour(getHour()+1);
        MyTime newTime=new MyTime(this.hour,this.minute,this.second);
        return newTime;
    }
    public MyTime previousHour(){
        //int second=time.getSecond();
        setHour(getHour()-1);
        MyTime newTime=new MyTime(hour,minute,second);
        return newTime;
    }
}
