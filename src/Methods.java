public class Methods {
    public static void main(String[] args) {
        var method = new Methods();
        method.reverseDoubleChar("hello");
        method.sumDigits(123);
        method.birthdayName("Akirah");
        method.missingFront("time");
        method.swapEnds("each");
        method.everyOther("pink");
        method.nonStart("eat", "candy");
        method.fibonacci(5);
        method.luckySum(6, 2, 1);
        method.hasPalindrome("mom");
        method.powerOfTwo(49);

    }

    //returns string without first 3 characters
    public String missingFront(String str) {
        return str.substring(3);
    }


    //returns the string name with "Happy Birthday" name and "1"
    public String birthdayName(String name) {
        return "Happy Birthday " + name + "!";
    }


    //returns a string where the first and last characters exchange
    public String swapEnds(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);
            return last + middle + first;
        }
    }

    //n is a power of 2
    public boolean powerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else {
            do {
                if (n == 1) {
                    return true;
                } else if (n % 2 != 0) {
                    return false;
                }
                n /= 2;
            } while (true);

        }

    }

    //returns if the string can be spelt forward as backward
    public boolean hasPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for (int i = 0; i < str.length(); i++) {
            // check for odd-length palindromes
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
            // check for even-length palindromes
            left = i;
            right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }
        return false;
    }

    //returns string if value equals 13
    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }

    }

    //returns string but first character is omitted
    public String nonStart(String a, String b) {
        if (a.length() < 2 || b.length() < 2) {
            return "";
        } else {
            return a.substring(1) + b.substring(1);
        }
    }

    //input string is reversed and each character doubles
    public String reverseDoubleChar(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i) + "" + word.charAt(i);
        }
        return result;
    }


    //returns the nth number of fibonacci sequence
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative.");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }

    //returns the sum of digits
    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }

    //returns string of every other character
    public String everyOther(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }
}




