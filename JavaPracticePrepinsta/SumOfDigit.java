package JavaPracticePrepinsta;

public class SumOfDigit {
    public static void main (String[]args)
    {

        int num = 123456, sum = 0;

        while(num!=0){
            sum += num % 10; //Modulo Operator % : We’ll use this to extract the digits from the number.
            num = num / 10;  //Divide Operator / : We’ll use it to shorten the number by 1 digit.
        }

        System.out.println ("Sum of digits : " + sum);
    }
}
