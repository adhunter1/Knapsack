import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        FractionalKnapsack fSack= new FractionalKnapsack();
        ZeroOneKnapsack zeroOne=new ZeroOneKnapsack();
        System.out.println("Fractional Knapsack:");

        int capacityMF;
        int nF;

        Scanner input=new Scanner(System.in);
        // entering initial values
        System.out.println("Please enter the capacity:");
        capacityMF =input.nextInt();
        System.out.println("Please enter the  number of objects");
        nF=input.nextInt();
        //set arrays and how big they are
        int profitsF[] = new int[nF];
        int weightsF[] = new int[nF];
        System.out.println("Please enter the values for weight(s):");
        for(int j=0;j<nF;j++)
        {
            weightsF[j]=input.nextInt();
        }
        System.out.println("Please enter the values for profit(s):");
        for(int i=0;i<nF;i++)
        {
            profitsF[i]=input.nextInt();
        }



        System.out.println("Result: "+fSack.calculate(capacityMF,weightsF, profitsF, nF));
        System.out.println("\n0/1 Knapsack:");
        //initializing variables
        int nO;
        int mO;
       

        System.out.println("Please enter the knapsack weight:");

        mO = input.nextInt();


        System.out.println("Please enter the number of elements:");

        nO = input.nextInt();
        //initialize arrays
        int[] weightsO = new int[nO + 1];
        int[] profitsO = new int[nO + 1];
        //have users enter values
        System.out.println("Enter the values for weight(s):");
        for (int i = 1; i <= nO; i++) {
            weightsO[i] = input.nextInt();
        }

        System.out.println("Enter the values for profit(s):");

        for (int i = 1; i <= nO; i++) {
            profitsO[i] = input.nextInt();
        }
        //calculate
        zeroOne.calculate(weightsO, profitsO, mO, nO);
        input.close();

    }
}
