import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Question[] questions = new Question[5];

        questions[0] = new Question("What is the capital of India?", new String[]{"1. New Delhi", "2. Mumbai", "3. Kolkata", "4. Chennai"}, 0);
        questions[1] = new Question("What is the largest planet in our solar system?", new String[]{"1. Earth", "2. Jupiter", "3. Saturn", "4. Mars"}, 1);
        questions[2] = new Question("What is the chemical symbol for water?", new String[]{"1. H2O", "2. CO2", "3. O2", "4. NaCl"}, 0);
        questions[3] = new Question("What is the capital of France?", new String[]{"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"}, 2);
        questions[4] = new Question("What is the largest mammal?", new String[]{"1. Elephant", "2. Blue Whale", "3. Giraffe", "4. Hippopotamus"}, 1);

        int score = 0;
        for (Question question : questions) {
            question.displayQuestion();
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();
            if (question.checkAnswer(userAnswer - 1)) {
                score++;
            }
        }

        System.out.println("Your final score is: " + score + "/5");
        scanner.close();
    }
}
