package JavaPracticePrepinsta;

public class PalindromeNum {
    public static void main (String[]args)
    {
        int num = 12021, reverse = 0, rem, temp;

        temp = num;
        while (temp != 0)
        {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10; // Divides n by 10. In integer arithmetic this removes the last digit from num
        };

        // palindrome if num and reverse are equal
        if (num == reverse)
            System.out.println (num + " is Palindrome");
        else
            System.out.println (num + " is not Palindrome");
    }
}
