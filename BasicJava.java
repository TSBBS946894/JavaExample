
class BasicJava{
/* 1 Primitive data Type: byte, short, int, long, float, double, boolean, char
   2 Literals: \b(backspace), \t(tab), \n(line feed), \f(form feed),
     \r(carriage return), \"(double quote), \'(single quote), \\(backslash)
*/
    int[] anArray=new int[3];
    void ifexample(){
        int x=0;
        if (x==1){}else if(x==2){}else{}
    }
    void switchexample(){
        int x=0; int y;
        switch(x){
            case 1:y=1;break;
            case 2:y=2;break;
            default:y=0;break;
        }
    }
    void whileexample(){while(true){}}
    void forexample(){
        int[] x={1,2,3};
        for(int i=0;i<3;i++){}
        for (int i:x){}
        //for(;;){} //infinite loop
    }
    void breakexample(){
        int[][] x={{1,2},{3,2}};
        s1:
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x[i].length;j++){
                if (x[i][j]==2){System.out.println("The location is "+i+","+j);break s1;}
            }
        }
    }
}
