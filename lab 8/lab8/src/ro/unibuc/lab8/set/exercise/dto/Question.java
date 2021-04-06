package ro.unibuc.lab8.set.exercise.dto;

import java.util.Objects;

public class Question implements Comparable<Question> {
    private int complexity;
    private String text;

    public Question(int complexity, String text) {
        this.complexity = complexity;
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Question question = (Question) o;
        return complexity == question.complexity &&
                Objects.equals(text, question.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(complexity, text);
    }

    @Override
    public String toString() {
        return "Question{" +
                "complexity=" + complexity +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public int compareTo(Question o) {
        return o.complexity - this.complexity;
    }
}
