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
        // Declaring Variables
        Sort_Array<Integer> sort_array;
        Scanner scanner = new Scanner(System.in);
        int tempChoiceNumber1, tempChoiceNumber2;
        boolean displayIntermediateSteps = false;
        ArrayList<ArrayList<Integer>> steps;

        while(true){

            System.out.println("Enter The File Name:");
            sort_array = new Sort_Array<>(scanner.next());

            while(sort_array.getData() == null) {
                System.out.println("Enter The File Name:");
                sort_array = new Sort_Array<>(scanner.next());
            }

            while(true) {
                tempChoiceNumber1 = 0;
                while(tempChoiceNumber1 != 1 && tempChoiceNumber1 != 2) {
                    System.out.println("Enter the desired option number:");
                    System.out.println("1. Display Intermediate Steps.");
                    System.out.println("2. Do Not Display Intermediate Steps.");
                    tempChoiceNumber1 = scanner.nextInt();
                }

                tempChoiceNumber2 = 0;
                while (((tempChoiceNumber2 != -1 && tempChoiceNumber2 != -9) &&
                        tempChoiceNumber2 < 1) || tempChoiceNumber2 > 3 ) {
                    System.out.println("Enter the Required Complexity:");
                    System.out.println("1. Simple Sort O(N ^ 2)");
                    System.out.println("2. Efficient Sort O(N LOG N)");
                    System.out.println("3. Non Comparison Sort O(N)");
                    System.out.println("To Change the input file enter -1");
                    System.out.println("To exit the application enter -9");
                    tempChoiceNumber2 = scanner.nextInt();
                }

                if(tempChoiceNumber2 == -1)
                    break;
                if(tempChoiceNumber2 == -9){
                    System.out.println("Application Terminating ..");
                    System.exit(0);
                }

                steps = (switch (tempChoiceNumber2) {
                    case 1 -> sort_array.simpleSort(tempChoiceNumber1 == 1);
                    case 2 -> sort_array.efficientSort(tempChoiceNumber1 == 1);
                    case 3 -> sort_array.nonComparisonSort(tempChoiceNumber1 == 1);
                    default -> null;
                });
                if(steps == null)
                    continue;

                displaySteps(steps, tempChoiceNumber1 == 1);
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

//    public static ArrayList<Integer> importData(String fileName) {
//        fileName = System.getProperty("user.dir").concat("/src/Scripts_and_RandomData/").concat(fileName);
//        ArrayList<Integer> data = new ArrayList<>();
//        File file = new File(fileName);
//        try {
//            Scanner sc = new Scanner(file);
//            String line = sc.nextLine();
//            Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).forEach(data::add);
//        } catch (FileNotFoundException e) {
//            System.out.println("File doesn't exist.");
//            return null;
//        }
//        return data;
//    }

}