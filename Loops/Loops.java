public class Loops {
    public static void main(String[] args){
        writeSquares();
    }
    public static void writeSquares(){
        System.out.println("writeSquares...");
        //we want to create a program to print the squares of the first five natural numbers
        //one way to do it is like this:
        System.out.println(1 + " squared = " + (1*1));
        System.out.println(2 + " squared = " + (2*2));
        System.out.println(3 + " squared = " + (3*3));
        System.out.println(4 + " squared = " + (4*4));
        System.out.println(5 + " squared = " + (5*5));

        writeSquares2();
    }
    
    public static void writeSquares2(){
        System.out.println("writeSquares2...");
        for(int i =1; i <=5; i++){
            System.out.println(i + " squared = " + (i*i));
        }
        //There are 3 parts to a for loop, all optional
        //First part initilizes variable
        //second part sets the parameter
        //third part sets icnrmeent or decrement
        writeSquares4(1000);
    }
    public static void writeSquares4(int stopVal){
        System.out.println("writeSquares4...");
        System.out.println("stop value is " + stopVal);
        for(int i = 1; i <= stopVal; i++){
            System.out.println(i + " squared =" + (i*i));
        }
    }
}