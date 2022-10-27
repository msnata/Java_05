/*В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число,
возвращает “Odd”,  если число нечетное, и “Even”, если число четное. */

public class OddEven {
    public String oddEven(int num){

        if (num % 2 != 0) {

            return "Odd";
        } else if (num % 2 == 0 || num == 0) {


            return "Even";
        }

        return "Not a number";
    }


}
