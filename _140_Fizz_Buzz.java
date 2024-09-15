package StringBuilder;

import java.util.ArrayList;

/*
* answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

* */
public class _140_Fizz_Buzz {
    public static void main(String[] args) {
        int n = 5;

        ArrayList<String> answer = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            int num = i+1;
            if (num%15==0)
                answer.add("FizzBuzz");
            else if (num%5==0)
                    answer.add("Buzz");
            else if(num%3==0)
                answer.add("Fizz");
            else
                answer.add(""+num);

            }

        }



    }

