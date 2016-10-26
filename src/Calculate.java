public class Calculate {
	public static void main(String[] args) {
		Calculate calc = new Calculate();
		long sumOfAll =0;
		for (int i = 1; i < 28123; i++) { //it is OK to check up to 20162 against 28123
			boolean numberToAdd = true;
			if(i%2 == 1 && i<944){
				sumOfAll += i;
				continue;
			}
			for(int j = 1; j<(i/2)+1; j++){
				if(calc.isAbundant(j) && calc.isAbundant(i-j)){
					numberToAdd = false;
					break;
				}
			}
			if(numberToAdd){
				sumOfAll +=i;
			}
		}
		System.out.println(sumOfAll); //ANSWER: 4179871 it takes 3 min to answer
	}
	boolean isAbundant(int numberToCheck) {
		int tmpSum =0;
		for(int i = 1; i < (numberToCheck / 2) + 1; i++){
			if(numberToCheck % i == 0){
				tmpSum += i;
			}
		}
		return tmpSum > numberToCheck ? true : false;
	}
}