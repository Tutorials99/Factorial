import java.util.Scanner;

/**
 *
 */
public class Tutorial {

    public static int factorialIteration(int n){
        int result = 1;//قيمه لتخزين الناتج فيها مع كل دوران للوب
        for(int i = 1;i<=n;i++){
            result = result *i;

        }
        return result;
    }
    public static int factorialRecursion(int n){

        if(n == 1){// base case
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //تعريف السكانر المسؤول عن اخذ الانبوت من اليوزر
        System.out.println("Enter a number to calculate its factorial: "); //سؤال اليوزر عن الرقم المطل،ب حساب الفاكتوريل له
        int n = scanner.nextInt();//اخذ الانبوت وتخزينه في فاريبل
        int factorialIter = factorialIteration(n); //حساب الفاكتوريل باستخدام اللوب
        int factorialRecur = factorialRecursion(n);//حساب الفاكتوريل باستخدام الريكورجن
        System.out.println("Factorial using iteration: " + factorialIter); //طباعة الناتج لليوزر
        System.out.println("Factorial using recursion: " + factorialRecur); //طباعة الناتج لليوزر

    }
}
