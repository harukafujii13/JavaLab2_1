import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        System.out.println("-----------------\nExercise 1\n-----------------");
        int start, end;
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Input the start:");
        start = scan1.nextInt();
        System.out.println("Input the end:");
        end = scan1.nextInt();

        for(int i = start; i <= end; i++){
            System.out.println(i);
        }
        

        System.out.println("-----------------\nExercise 2\n-----------------");
        int n;
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Input the N:");
        n = scan2.nextInt();

        System.out.println("The sum of 1 to n is: " + (n * (n + 1) / 2));


        System.out.println("-----------------\nExercise 3\n-----------------");
        String word;
        Scanner scan3  = new Scanner(System.in);

        System.out.println("Input a word:");
        word = scan3.nextLine();

        for(int i = 1; i <= word.length(); i++){
            System.out.println(word);
        }

        System.out.println("-----------------\nExercise 4\n-----------------");

        int count, sum = 0;
        Scanner scan4 = new Scanner(System.in);

        System.out.println("How many integers will be added?");
        count = scan4.nextInt();

        while(count > 0){
            System.out.println("Enter an integer:");
            sum += scan4.nextInt();
            count--;
        }

        System.out.println("The sum is: " + sum);

        scan1.close();
        scan2.close();
        scan3.close();
        scan4.close();
    }
}