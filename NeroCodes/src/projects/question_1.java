package projects;

public class question_1 {

	static final int MOD = 1000000007;
	
	public static void main(String[] args) {
		
	}

	public static int NumberOfString(int n) {
		// Write your code here
		if (n == 1) {
            // If n is 1, only three possible strings: "T", "N", "S"
            return 3;
        }

        // Characters we care about: T, A, R, U, N, S
        char[] chars = {'T', 'A', 'R', 'U', 'N', 'S'};
        int[] idx = new int[256]; // ASCII based indexing for quick lookup
        for (int i = 0; i < chars.length; i++) {
            idx[chars[i]] = i;
        }

        // DP table initialization
        long[][] dp = new long[n + 1][6];

        // Initial valid starting characters
        dp[1][idx['T']] = 1;
        dp[1][idx['N']] = 1;
        dp[1][idx['S']] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i][idx['A']] = dp[i - 1][idx['T']] % MOD;
            dp[i][idx['R']] = (dp[i - 1][idx['N']] + dp[i - 1][idx['A']]) % MOD;
            dp[i][idx['U']] = dp[i - 1][idx['R']] % MOD;
            dp[i][idx['S']] = (dp[i - 1][idx['U']] + dp[i - 1][idx['S']] + dp[i - 1][idx['T']] + dp[i - 1][idx['A']] + dp[i - 1][idx['N']] + dp[i - 1][idx['R']]) % MOD;
            dp[i][idx['T']] = dp[i - 1][idx['S']] % MOD;
            dp[i][idx['N']] = (dp[i - 1][idx['A']] + dp[i - 1][idx['S']]) % MOD;
        }

        // Sum up all valid strings of length n
        long result = 0;
        for (int i = 0; i < 6; i++) {
            result = (result + dp[n][i]) % MOD;
        }

        return (int) result;

		
	}
}