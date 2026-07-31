
class Solution {
    public int minimumPushes(String word) {
        int min = 0;
        int pushes = 0;
        int[] freq = new int[26];
        for(char x : word.toCharArray()){
            freq[x - 'a']++;
        }
        Arrays.sort(freq);

        for(int i = 0; i<26; i++){
           pushes = i/8 + 1;
           min += freq[25-i] * pushes;
        }

        return min;
    }
}