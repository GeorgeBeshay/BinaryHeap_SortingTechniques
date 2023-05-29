import Sorting_Algorithms.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.*;
import java.io.*;

public class CLI {

    private SortFactory<Integer> simpleSF;
    private SortFactory<Integer> efficientSF;
    private SortFactory<Integer> nonComparisonSF;
    private SortFactory<Integer> heapSF;

    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.run();
    }

    public CLI(){
        this.simpleSF = new SimpleSort_Factory<>();
        this.efficientSF = new EfficientSort_Factory<>();
        this.nonComparisonSF = new NonComparisonSort_Factory<>();
        this.heapSF = new HeapSort_Factory<>();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        String tempFileName;
        int tempChoiceNumber;
        boolean displayIntermediateSteps = false;
        ArrayList<Integer> input = null;
        ArrayList<ArrayList<Integer>> steps;
        BiFunction<ArrayList<Integer>, Boolean, ArrayList<ArrayList<Integer>>> mySortingFunction;
        while(true){
            while(input == null) {
                System.out.println("Enter The File Name:");
                tempFileName = scanner.next();
                input = importData(tempFileName);
            }
            while(true) {
                System.out.println("Enter The Algorithm Number:");
                System.out.println("1. Simple Sort - Insertion Sort");
                System.out.println("2. Efficient Sort - Merge Sort");
                System.out.println("3. Non Comparison Sort - Counting Sort");
                System.out.println("4. Heap Sort");
                System.out.println("5. Efficient Sort - Quick Sort");
                System.out.println("To Change the input file enter -1");
                System.out.println("To exit the application enter -9");
                tempChoiceNumber = scanner.nextInt();
                if(tempChoiceNumber == -1)
                    break;
                if(tempChoiceNumber == -9){
                    System.out.println("Application Terminating ..");
                    System.exit(0);
                }
                switch (tempChoiceNumber){
                    case 1:
                        mySortingFunction = this.simpleSF.getSortingAlgorithm("Insertion Sort");
                        break;
                    case 2:
                        mySortingFunction = this.efficientSF.getSortingAlgorithm("Merge Sort");
                        break;
                    case 3:
                        mySortingFunction = this.nonComparisonSF.getSortingAlgorithm("Counting Sort");
                        break;
                    case 4:
                        mySortingFunction = this.heapSF.getSortingAlgorithm("Heap Sort");
                        break;
                    case 5:
                        mySortingFunction = this.efficientSF.getSortingAlgorithm("Quick Sort");
                        break;
                    default:
                        System.out.println("Wrong input was passed, please try again.");
                        continue;
                }
                tempChoiceNumber = 0;
                while(tempChoiceNumber != 1 && tempChoiceNumber != 2) {
                    System.out.println("Enter the desired option number:");
                    System.out.println("1. Display Intermediate Steps.");
                    System.out.println("2. Do Not Display Intermediate Steps.");
                    tempChoiceNumber = scanner.nextInt();
                }
                displayIntermediateSteps = (tempChoiceNumber) == 1;
                steps = mySortingFunction.apply(input, displayIntermediateSteps);
                displaySteps(steps, displayIntermediateSteps);
                System.out.println();
            }
        }
    }

    public static <T> void displaySteps(ArrayList<ArrayList<T>> list, boolean displayIntermediateSteps){
        if(!displayIntermediateSteps)
            for(T x : list.get(list.size() - 1))
                System.out.print(x + ", ");
        else
            for(ArrayList<T> step : list){
                for(T x : step)
                    System.out.print(x + ", ");
                System.out.println();
            }
    }

    public static ArrayList<Integer> importData(String fileName) {
        fileName = System.getProperty("user.dir").concat("/src/IO/").concat(fileName);
        ArrayList<Integer> data = new ArrayList<>();
        File file = new File(fileName);
        try {
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).forEach(data::add);
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist.");
            return null;
        }
        return data;
    }

}