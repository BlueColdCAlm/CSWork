public class Operators{
    public static void main(String[] args){
        //The + operators can also be used for string 
        //concattention, for example:
        String num1 = "1";
        String num2 = "2";
        System.out.println(num1 + num2);
        //if you're using numbers
        System.out.println(1 + 2);
        //when you mix them it will turn the nubmers into strings
        System.out.println("1" + 2);
        //Incremanting is when you increase the value of a variable by a certain amount
        //Decrementing, decrease varaibels value bu a certain amount.
        //Java has special operators for icnrementing and decrementing
        int increment = 1;
        increment += 7;
        System.out.println(increment);
        increment -=7;
        System.out.println(increment);
        //This al;so works fo rmultiplying and dividing
        increment *= 7;
        System.out.println(increment);
        //I'm tired fo typing so much xd
        increment /= 7;
        print(increment);
        //We need to make another method for itnergers.
        double num = 5.67;
        print(num);
        //two mroe operators
        //++ adds one
        //-- subtarcts one
        int myNumber = 10;
        myNumber++;
        print(myNumber);
        myNumber--;
        ++myNumber;
        print(myNumber);
        print(++myNumber);

    }
    //So lets make a method
    //It's public so we can use it outside our class
    //it;s static so it doesnt' have to be atatched to an instance of a class object
    //and its void because it retusn nothing
    //typing print() will now print the value
    //These share the same name and both will runw hen you run print, but now print will
    //work for intergers and strings. This is called overloading. 
    public static void print(String value){
        System.out.println(value);
    }
    public static void print(int value){
        System.out.println(value);
    }
    public static void print(double value){
        System.out.println(value);
    }
}