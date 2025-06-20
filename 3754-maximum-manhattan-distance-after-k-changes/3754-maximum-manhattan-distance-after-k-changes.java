class Solution {
    public int maxDistance(String s, int k) {
        int ans = 0;
        int north = 0, south = 0, east = 0, west = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Count directions up to index i
            if (c == 'N') north++;
            else if (c == 'S') south++;
            else if (c == 'E') east++;
            else if (c == 'W') west++;

            // Compute net distance: |north-south| + |east-west|
            int vertical = Math.abs(north - south);
            int horizontal = Math.abs(east - west);
            int manhattanDistance = vertical + horizontal;

            // Remaining moves = (i + 1) total steps so far - MD
            // You can at most flip k of them (each flip adds +2)
            int maxFixable = Math.min(2 * k, (i + 1) - manhattanDistance);
            int distanceWithFix = manhattanDistance + maxFixable;

            ans = Math.max(ans, distanceWithFix); // Track max distance
        }

        return ans;
    }
}
