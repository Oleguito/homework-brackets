public class Main {
    public static void main(String[] args) {
        final String[] strings = {
                "",
                "()",
                "(",
                ")(()))",
                "(())((()())())",
        };
        final boolean[] results = {
                true, true, false, false, true
        };
        for (int i = 0; i < strings.length; i++)
        {
            assert checkBracketsConsistent(strings[i]) == results[i];
        }
    }
    
    static boolean checkBracketsConsistent (String string) {
        if (string.isEmpty()) return true;
        
        int len = string.length();
        if (len % 2 != 0) return false;
        // int[] stack = {0, 0, 0, 0, 0, 0, 0, 0};
        int stackIndex = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == '(') ++stackIndex;
            else if (string.charAt(i) == ')') --stackIndex;
        }
        return stackIndex == 0;
    }
}