public class Main {
    public static void main(String[]args){
        int a=15;
        a +=5;
        a-=4;
        int b =a;
        b ++;
        boolean isOdd= b % 2 != 0;
        int multiply=b*(b+1);
        boolean isMultiple=multiply % 3 == 0;
        System.out.println(isOdd&&isMultiple);
        //System.out.println("B value="+b+"\nIs B an odd number? "+isOdd+"\nmultiply the value of b by its own value+1 = "+multiply+"\nIs the result multiple of 3? "+ isMultiple);
    }
}
