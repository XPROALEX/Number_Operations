public class Main {
    public static void main(String[]args){
        int a=15;
        a +=5;
        a-=4;
        int b =a;
        b ++;
        boolean isOdd= b % 2 != 0;
        System.out.println("B value="+b);
        System.out.println("Is B an odd number? "+isOdd);
        int multiply=b*(b+1);
        boolean isMultiple=multiply % 3 == 0;
        System.out.println("multiply the value of b by its own value+1 = "+multiply);
        System.out.println("Is the result multiple of 3? "+ isMultiple);
    }
}
