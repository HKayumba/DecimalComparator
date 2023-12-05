public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
    public static boolean areEqualTreeDecimalPlaces(double number1, double number2){
        number1 = Math.round(number1 * 1000);
        number1 = number1/1000;

        number2 = Math.round(number2 * 1000);
        number2 = number2/1000;

        if(number1 == number2){
            return true;
        } else{
            return false;
        }
    }
}
/* int num1Int = (int) (num1 * 1000);
    int num2Int = (int) (num2 * 1000);
    return num1Int == num2Int;

    code from ChatGPT
    This method takes two parameters of type double,
    num1 and num2, and returns a boolean value indicating whether
    the two numbers are equal up to three decimal places.
    The method first multiplies each input by 1000 and casts
    the result to an integer, effectively removing any digits beyond the third decimal place.
     It then compares the resulting integers to see if they are equal.
    If the two numbers are equal up to three decimal places, the method
    returns true. Otherwise, it returns false.
    Note that this method does not handle special cases like NaN or Infinity.
    Also, it assumes that both inputs are finite numbers.
 */