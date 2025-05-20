package easy;

import java.util.ArrayList;
import java.util.List;

public class _412_FizzBuzz {
    /**
     * 412. Fizz Buzz
     * @param n integer
     * @return a string array answer
     */
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String s = "";

            if (i % 3 == 0) s += "Fizz";
            if (i % 5 == 0) s += "Buzz";
            if (s.isEmpty()) s += String.valueOf(i);

            ans.add(s);
        }

        return ans;
    }
}
