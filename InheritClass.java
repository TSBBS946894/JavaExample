class InheritClass {
    public static void main(String[] args){
        Bike bk1=new MBike();
        if (bk1 instanceof MBike){MBike bk2=(MBike)bk1;}//casting
        CCar c=new CCar();
        c.start();
    }
}
class Bike{void printOut(){System.out.println("This is a bike.");}}
class MBike extends Bike{void printOut(){System.out.println("This is a MBike.");}}
//inherit from two interface classes
interface FCar{default void start(){System.out.println("This is a FCar.");}}
interface OCar{default void start(){System.out.println("This is a OCar.");}}
class CCar implements OCar,FCar{public void start(){
    FCar.super.start();OCar.super.start();}
}//example