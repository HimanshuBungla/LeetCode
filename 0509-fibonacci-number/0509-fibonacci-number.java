class Solution {
  public int fib(int n) {
    if (n < 2)
      return n;

    int[] seq = {0, 0, 1};

    for (int i = 2; i <= n; ++i) {
      seq[0] = seq[1];
      seq[1] = seq[2];
      seq[2] = seq[0] + seq[1];
    }

    return seq[2];
  }
}
