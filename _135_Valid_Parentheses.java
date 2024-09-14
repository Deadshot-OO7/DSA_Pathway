package StringBuilder;

import java.util.ArrayList;

public class _135_Valid_Parentheses {
    public static boolean main(String[] args) {

                String s = "([])";


                // Strings representing all opening and closing brackets.
                String openBrac = "({[", closeBrac = ")}]";

                // A list to store unmatched opening brackets.
                ArrayList<Character> list = new ArrayList<>();

                // If the string starts with a closing bracket, it's immediately invalid.
                if (closeBrac.contains("" + s.charAt(0)))
                    return false;

                // Iterate over each character in the string.
                for (int i = 0; i < s.length(); i++) {
                    // If the current character is an opening bracket, add it to the list.
                    if (!closeBrac.contains("" + s.charAt(i))) {
                        list.add(s.charAt(i));
                    }
                    // If the current character is a closing bracket and there's an unmatched opening bracket,
                    // check if the last added opening bracket corresponds to the current closing bracket.
                    else if (!list.isEmpty() && openBrac.indexOf(list.get(list.size() - 1)) == closeBrac.indexOf(s.charAt(i))) {
                        // If they match, remove the last unmatched opening bracket.
                        list.remove(list.size() - 1);
                    }
                    // If there's no matching opening bracket for the current closing bracket, return false.
                    else {
                        return false;
                    }
                }

                // If the list is empty, all brackets were matched correctly, so return true.
                if (list.isEmpty())
                    return true;

                // If the list still contains unmatched opening brackets, return false.
                return false;
            }
        }

