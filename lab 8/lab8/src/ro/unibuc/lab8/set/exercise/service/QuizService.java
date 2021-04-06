package ro.unibuc.lab8.set.exercise.service;


import ro.unibuc.lab8.set.exercise.dto.Question;
import ro.unibuc.lab8.set.exercise.exception.DuplicateException;

import java.util.Set;
import java.util.TreeSet;

public class QuizService {

    private final Set<Question> questions = new TreeSet<>();


    //todo: varargs
    public void addQuestions(Question... questionsToAnswer) {
        for (Question question : questionsToAnswer) {
            try {
                add(question);
            } catch (DuplicateException ex) {
                System.out.println("Just be aware -> " + question.toString() + ex.getMessage());
            }
        }
    }

    public void displayQuestions() {
        for (Question q : this.questions) {
            System.out.println(q);
        }
    }

    private void add(Question question) throws DuplicateException {
        if (!this.questions.add(question)) {
            throw new DuplicateException("Already exists!");
        }
    }
}
