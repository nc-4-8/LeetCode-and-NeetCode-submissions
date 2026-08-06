class Solution {
    public int smallestNumber(int n, int t) {

        int x = n;

        while (true) {
            int y = x;
            int z = 1;

            while (y > 0) {
                z *= y % 10;
                y /= 10;
            }

            if (z % t == 0) return x;

            x++;
        }
    }
}