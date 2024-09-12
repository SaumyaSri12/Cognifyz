import java.util.Scanner;

public class Quiz{
    public static void main(String[] args) {
        // Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Initialize score counter
        int score = 0;

        // Question 1
        System.out.println("Question 1: What is the capital of France?");
        System.out.println("A) Berlin");
        System.out.println("B) Madrid");
        System.out.println("C) Paris");
        System.out.println("D) Rome");
        System.out.print("Your answer: ");
        char answer1 = scanner.next().charAt(0);

        // Check answer for question 1
        if (answer1 == 'C' || answer1 == 'c') {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is C) Paris.");
        }

        // Question 2
        System.out.println("\nQuestion 2: What is the tallest mountain in the world?");
        System.out.println("A) The Himalayan Mountain Range");
        System.out.println("B) The Aravali MOuntain Range");
        System.out.println("C) Purvanchal Mountain Range ");
        System.out.println("D) Mount Everest");
        System.out.print("Your answer: ");
        char answer2 = scanner.next().charAt(0);

        // Check answer for question 2
        if (answer2 == 'D' || answer2 == 'd') {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is D) Mount Everest.");
        }

        // Question 3
        System.out.println("\nQuestion 3: Who wrote 'To Kill a Mockingbird'?");
        System.out.println("A) Harper Lee");
        System.out.println("B) J.K. Rowling");
        System.out.println("C) Mark Twain");
        System.out.println("D) Ernest Hemingway");
        System.out.print("Your answer: ");
        char answer3 = scanner.next().charAt(0);

        // Check answer for question 3
        if (answer3 == 'A' || answer3 == 'a') {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is A) Harper Lee.");
        }
        // Question 4
        System.out.println("\nQuestion 3: Who Invented Light Bulb?");
        System.out.println("A) Thomas Edition");
        System.out.println("B) Newton");
        System.out.println("C) Einstein");
        System.out.println("D) Galileo Galilei");
        System.out.print("Your answer: ");
        char answer4 = scanner.next().charAt(0);

        // Check answer for question 3
        if (answer4 == 'A' || answer4 == 'a') {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is A) Thomas Edition.");
        }
        // Question 5
        System.out.println("\nQuestion 5: Who wrote 'Romeo and Juliet'?");
        System.out.println("A) Harper Lee");
        System.out.println("B) William Shakespeare");
        System.out.println("C) Mark Twain");
        System.out.println("D) Ernest Hemingway");
        System.out.print("Your answer: ");
        char answer5 = scanner.next().charAt(0);

        // Check answer for question 5
        if (answer5 == 'B' || answer5 == 'b') {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is B) Willian Shakespeare.");
        }

        // Display final score
        System.out.println("\nQuiz complete! Your score: " + score + "/5");

        // Close the scanner
        scanner.close();
    }
}
