package ro.unibuc.lab8.set.exercise;


import ro.unibuc.lab8.set.exercise.dto.Question;

public class QuizManagement {
    /**
     * Create a program which creates pieces of quiz ensuring that each quiz contains unique questions (no duplicates allowed)
     * The questions will be answered in the stored order and should be based on complexity (from low to high)
     * The Question object should have the following properties: complexity and text
     * When a question already exists a DuplicateException will be thrown
     * If a there is DuplicateException, the program should try adding the next questions
     */
    public static void main(String[] args) {

        Question one = new Question(5, "the most complex one");
        Question two = new Question(1, "the least complex one");
        Question three = new Question(3, "moderate complexity");
        Question four = new Question(4, "more complex one");
        Question five = new Question(4, "more complex one");
        Question six = new Question(2, "less one");

    }
}
