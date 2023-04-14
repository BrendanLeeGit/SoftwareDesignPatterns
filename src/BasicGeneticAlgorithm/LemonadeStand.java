package BasicGeneticAlgorithm;

public class LemonadeStand {
    private int quantityOfProduct;
    private double qualityOfProduct;
    private int possibleBuyers;
    private double percentageOfCustomersBuying;
    private int[] moneyAllocation;
    private double profit;

    public LemonadeStand(int[] moneyAllocation){
        /*
        The indexes of moneyAllocation are as follows:
        0 - $ spent on quantity of product
        1 - $ spent on quality of product
        3 - $ spent on advertisement for product
        4 - Price of product
         */
        quantityOfProduct = moneyAllocation[0] * 2;
        qualityOfProduct = moneyAllocation[1] * 0.1;
        possibleBuyers = moneyAllocation[2] * 2;

        //Percentage of customers buying is calculated by
        //(quality's price)/(actual price)
        percentageOfCustomersBuying = qualityOfProduct/moneyAllocation[3];
        this.moneyAllocation = moneyAllocation;
        profit = 0;
    }

    public void calculateProfit(){
        profit = quantityOfProduct * possibleBuyers * percentageOfCustomersBuying;
    }

    public double getProfit(){
        return profit;
    }

    public int[] getParams(){
        return moneyAllocation;
    }
}
