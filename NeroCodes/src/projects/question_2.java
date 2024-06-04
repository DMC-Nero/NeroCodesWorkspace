package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class question_2 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("enter L");
		        long L = scanner.nextLong();
		        System.out.println("enter M");
		        long R = scanner.nextLong();
		        scanner.close();
		        
		        System.out.println(solve(L, R));
		    }

		    public static int solve(long L, long R) {
		        int limit = (int) Math.sqrt(R);
		        boolean[] isPrime = new boolean[limit + 1];
		        Arrays.fill(isPrime, true);
		        isPrime[0] = isPrime[1] = false;

		        for (int i = 2; i * i <= limit; i++) {
		            if (isPrime[i]) {
		                for (int j = i * i; j <= limit; j += i) {
		                    isPrime[j] = false;
		                }
		            }
		        }

		        List<Integer> primes = new ArrayList<>();
		        for (int i = 2; i <= limit; i++) {
		            if (isPrime[i]) {
		                primes.add(i);
		            }
		        }

		        int nearlyPrimesCount = 0;
		        for (int prime : primes) {
		            long nearlyPrime = (long) prime * prime;
		            if (nearlyPrime > L && nearlyPrime < R) {
		                nearlyPrimesCount++;
		            }
		        }

		        return nearlyPrimesCount;
		    }
		}
