import java.util.ArrayList;;

public class Primes {

    public static ArrayList<Integer> getFirstPrimesUsingForLoops(int nbPrimes){		
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers.add(2);
		boolean isPrime;
		
		for(int i = 3; primeNumbers.size()<nbPrimes; i++){
			isPrime = true;
			for(int j=i-1; j >= 2; j--){
				if(i%j == 0){
					isPrime = false;
				}
			}
			if(isPrime){
				primeNumbers.add(i);
			}
		}
        return primeNumbers;
    }

    public static ArrayList<Integer> getFirstPrimesUsingWhileLoops(int nbPrimes){		
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers.add(2);
		boolean isPrime;
		
        int i = 3;
        while(primeNumbers.size()<nbPrimes){
            isPrime = true;
            int j = i-1;
            while(j>=2){
                if(i%j == 0){
					isPrime = false;
				}
                j--;
            }
			if(isPrime){
				primeNumbers.add(i);
			}
            i++;
		}
        return primeNumbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> primesFor = getFirstPrimesUsingForLoops(40);
        for (int prime : primesFor){
            System.out.println(prime);
        }
        ArrayList<Integer> primesWhile = getFirstPrimesUsingWhileLoops(40);
        for (int prime : primesWhile){
            System.out.println(prime);
        }
    }
}