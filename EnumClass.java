import java.lang.*;
class EnumClass{
    enum Day{SUNDAY, MONDAY, TUESDAY}
    Day day;
    EnumClass(Day day){this.day=day;}
    void printday(){if(day==day.SUNDAY){System.out.println("Sunday is great!");}}
    public static void main(String[] args){
        EnumClass s=new EnumClass(Day.SUNDAY);
        s.printday();
    }
}

