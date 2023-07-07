class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> all = new HashSet<Character>();
        int len = sentence.length();
        for (int i = 0; i < len; i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z')
                all.add(c);
        }
        return all.size() == 26;
    }
}