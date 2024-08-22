package JavaPracticePrepinsta;

public class ReverseNum {
    public static void main (String[]args)
    {

        int num = 123456, reverse = 0, rem;

        while (num != 0)
        {
            rem = num % 10;                  //% : to extract
            reverse = reverse * 10 + rem;    /// : to shorten
            num /= 10;
        };
        System.out.println ("Reversed Number: " + reverse);
    }
}
