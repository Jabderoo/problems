package za.co.wethinkcode.mastermind;

import java.util.Arrays;
import java.util.Random;

public class CodeGenerator {
    private final Random random;

    public CodeGenerator(){
        this.random = new Random();
    }

    public CodeGenerator(Random random){
        this.random = random;

    }

    /**
     * Generates a random 4 digit code, using this.random, where each digit is in the range 1 to 8 only.
     * Duplicated digits are allowed.
     * @return the generated 4-digit code
     */
    public String generateCode() {

        Random rnd = new Random();
        int [] digit = new int[4];

        for (int i = 0; i < 4; i++){
            digit[i] = rnd.nextInt(8);
            System.out.print(digit[i]);

//            for (int j = 1;j <= 4; j++) {
//                if (digit[i] == digit[j]){
//                    i--;
//                    break;
//                    }
//            }
////
        }
        return Arrays.toString(digit);
    }

}

