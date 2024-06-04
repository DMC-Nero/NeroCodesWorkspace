package projects;

import java.util.Scanner;

public class question_3 {

	static final int MOD = 1000000007;

    public static void main(String[] args) {
    	int N = 4;
    	int K = 3;
    	int X = 2;
        
        System.out.println(countValidArrays(N, K, X));
        
    }

    public static int countValidArrays(int N, int K, int X) {
        
    	 long[] dp = new long[N + 1];
         dp[1] = 1;
         dp[2] = 1;
         for (int i = 3; i <= N; i++) {
             dp[i] = (dp[i - 2] * (K - 2) + dp[i - 1] * (K - 1)) % 1000000007;
         }
         return (int) ((X == 1 || X == K) ? dp[N - 1] : dp[N]);
     }
}


/**
 * Description
You are given 3 integers: N, K, and X, where N denotes the size of the array.

Your task is to find the number of possible arrays such that the first element is 1 and the last element is X, and all the other elements should be between 1 and K, both inclusive, and no two consecutive elements should be the same.

As the answer can be large, you have to print the answer modulo 1000000007.

Input

The first three lines contain 3 positive integers denoting the values of N, K, and X.
Output

Return the answer modulo 1000000007.
Constraints

3<= N <=100000
2<= K <=100000
1<= X <= K
Sample Test Case

Input

4 
3 
2
Output

3
Explanation

possible arrays are

{1,3,1,2}

{1,2,1,2}

{1,2,3,2}


Execution time limit
Default
 * 
 * 
 * 
 * 
**/

/*
 * 
 * 
 */
