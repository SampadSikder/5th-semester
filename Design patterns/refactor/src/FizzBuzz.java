/**
 * Requirements:
 * For factor of three print Fizz instead of the number
 * For factor of five print Buzz instead of the number
 * For numbers which are factors of both three and five print FizzBuzz instead of the number
 */
public class FizzBuzz {

    public static String checkNumber(int number) {
        String fizzedWord="";
        if (number % 3 == 0) {
            fizzedWord+="Fizz";
        }
        if(number % 5==0){
            fizzedWord+="Buzz";
        }

        if(fizzedWord.compareTo("")==0){
            fizzedWord=String.valueOf(number);
        }
        return fizzedWord;

    }

}
