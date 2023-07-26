class Solution {
    public String reverseOnlyLetters(String S) {
        char[] array = S.toCharArray();
        int s = 0, e = array.length - 1;
        while (s < e) {
            char c1 = array[s], c2 = array[e];
            if (Character.isLetter(c1) && Character.isLetter(c2)) {
                array[s] = c2;
                array[e] = c1;
                s++;
                e--;
            } else {
                if (!Character.isLetter(c1))
                    s++;
                if (!Character.isLetter(c2))
                    e--;
            }
        }
        return new String(array);
    }
}