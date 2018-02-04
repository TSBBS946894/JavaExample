class OuterClass {
    interface Hello{void greet(String x);}
    void say(){
        class EnglishHello implements Hello{public void greet(String x){System.out.println("Hello "+x);}}
        Hello s1=new EnglishHello();
        s1.greet("Bridgett");
        Hello s2=new Hello(){public void greet(String x){System.out.println("Bonjour "+x);}};
        s2.greet("Bridgett");
    }
    public static void main(String[] args){
        OuterClass r=new OuterClass();
        r.say();
    }
}
class A{
    int x;
    A(){this(0);}
    A(int x){this.x=x;}
}
/* 1 Modifier: public, protected (class, package, subclass),
               default (class, package), private
   2 Inner class (non-static):
     Outerclass s1=new Outerclass();
     Outerclass.Innerclass s2=s1.new Innerclass();
   3 Refer to outerclass variable from innerclass methods: Outerclass.this.x
*/
