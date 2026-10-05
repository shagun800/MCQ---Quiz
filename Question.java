
public class Question {
    private String questionText;
    private String[] options;
    private int correctOptionIndex;

    public Question(String questionText, String[] options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }

    public void displayQuestion() {
        System.out.println(getQuestionText());
        for (String option : getOptions()) {
            System.out.println(option);
        }
    }

    public boolean checkAnswer(int userAnswer) {
        if (userAnswer == getCorrectOptionIndex()) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Incorrect!");
            return false;
        }
    }
}