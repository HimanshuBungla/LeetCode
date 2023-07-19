class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        gp(result, "", 0, 0, n);
        return result;
    }

    private void gp(List<String> result, String s, int o, int c, int n) {
        if (o == n && c == n) {
            result.add(s);
            return;
        }
        if (o< n) {
            gp(result, s + "(", o+1, c, n);
        }
        if (c<o) {
            gp(result, s + ")", o, c+1, n);
        }
    }
}