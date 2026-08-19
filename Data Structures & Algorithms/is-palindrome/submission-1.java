class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.toLowerCase();
        newS = newS.replaceAll("[^a-zA-Z0-9]", "");
        int n = newS.length()-1;
        boolean isPalin = true;
        for(int i = 0; i<newS.length(); i++){
            if(newS.charAt(i) != newS.charAt(n)){
                isPalin = false;
                break;
            }
            else{
                n--;
            }
        }

        return isPalin;
    }
}
