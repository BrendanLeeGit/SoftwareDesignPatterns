import java.util.Random;
public class DnDAverage {
    public static void main(String[] args){
        int[] dice = new int[4];
        int lowestIndex = 0;
        Random r = new Random();
        double average = 0;
        int numRuns = 10000;

        for (int i = 0; i < numRuns; i++){
            for (int j = 0; j < 4; j++){
                dice[j] = r.nextInt(6) + 1;
            }
            //change lowest to 0
            for (int j = 0; j < 3; j++){
                if (dice[lowestIndex] > dice[j + 1]){
                    lowestIndex = j + 1;
                }
            }

            for (int j = 0; j < 4; j++){
                System.out.println(dice[j]);
            }
            dice[lowestIndex] = 0;
            for (int j = 0; j < 4; j++){
                System.out.println(dice[j]);
            }

            for (int j = 0; j < 4; j++){
                average += dice[j];
            }
            lowestIndex = 0;
        }
        System.out.println(average/numRuns);
    }
}
