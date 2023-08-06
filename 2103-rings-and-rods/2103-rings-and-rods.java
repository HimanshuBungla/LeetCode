class Solution {
    public int charToInt(char c) {
        switch(c) {
            case 'B':
                return 0;
            case 'R':
                return 1;
            case 'G':
                return 2;
        }
        return -1;
    }
    public int countPoints(String rings) {
        boolean arr[][] = new boolean[10][3];
        int n = rings.length() / 2;
        for (int i = 0; i < n; i++) {
            int color = charToInt(rings.charAt(2 * i));
            int ring = rings.charAt(2 * i + 1) - '0';
            arr[ring][color] = true;
        }
        int res = 0;
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j]) {
                    count++;
                }
            }
            if (count == 3) {
                res++;
            }
        }
        return res;
    }
}