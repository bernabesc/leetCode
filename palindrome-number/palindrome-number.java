class Solution {
    public boolean isPalindrome(int x) {
        String intText = Integer.toString(x);
        StringBuilder sB = new StringBuilder();
        sB.append(x);
        if (intText.equals(sB.reverse().toString()))
            return true;
        return false;  
    }
}