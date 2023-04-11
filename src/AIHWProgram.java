public class AIHWProgram {
    public static void main(String[] args){
        double[] nums = {0.2, 0.45, 0.1, 0.48, 0.6, 0.13, 0.75, 0.68, 0.9, 0.01, 0.51, 0.82, 0.1, 0.23, 0.32, 0.66, 0.71, 0.09, 0.99, 0.11,
                0.68, 0.21, 0.34, 0.55, 0.52, 0.56, 0.48, 0.99, 0.43, 0.88, 0.47, 0.31, 0.36, 0.45, 0.1, 0.48, 0.6, 0.13, 0.75, 0.68, 0.9,
                0.01, 0.09, 0.99, 0.11, 0.68, 0.2, 0.45, 0.1, 0.48, 0.21, 0.34, 0.55, 0.52, 0.56, 0.48, 0.99, 0.43, 0.88, 0.47};

        String parent1 = "00000011100101000000000000000000";
        String parent2 = "10110111111111111111111111111111";

        boolean poop = true;
        if (poop) {
            String temp;
            temp = parent1;
            parent1 = parent2;
            parent2 = temp;
        }

        String result = "";
        int j = 0;
        for (int i = 0; i < parent1.length(); i++){
            if (nums[j++] >= .5){
                result += parent2.charAt(i);
            }
            else{
                result += parent1.charAt(i);
            }
        }
        System.out.println(result);
    }
}
