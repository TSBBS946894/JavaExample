/*
d decimal, f float, n newline, tB td te ty tY tl date-time
 */
import java.text.DecimalFormat;
public class FormatClass {
    void customFormat(String pattern){
        double x=123.456;
        DecimalFormat mf=new DecimalFormat(pattern);
        String output=mf.format(x);
        System.out.println("Formatted "+pattern+" value is "+output);
    }
    void convertSample(){
        String s1="123.456";
        Float t1=Float.valueOf(s1);
        Float t2=Float.parseFloat(s1);
        String s2=String.valueOf(t1);
        String s3=Float.toString(t1);
    }
    public static void main(String[] args){
        double x=123.456;
        System.out.format("The value is %f%n",x);//method 1
        String fs=String.format("The value is %f",x);
        System.out.println(fs);//method 2
        FormatClass s=new FormatClass();
        s.customFormat("$###.####");//method 3
        s.customFormat("00000.00");
        s.convertSample();//convert between string and number
    }
}
