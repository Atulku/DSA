class Solution {
    public boolean isValid(String s) {
        char firstChar = s.charAt(0);
        if(s.length()%2 == 1 || firstChar == ')' || firstChar == '}' || firstChar == ']')
            return false;
        int currentSize = 0;
        while(s.length() != currentSize)
        {
            currentSize = s.length();
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }
        return s.length() == 0;
    }
}