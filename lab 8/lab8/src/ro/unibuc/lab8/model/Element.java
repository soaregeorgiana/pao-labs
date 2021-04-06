package ro.unibuc.lab8.model;

import java.util.Objects;

public class Element implements Comparable<Element> {
    private int id;
    private String title;
    private String description;

    public Element(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(Element o) {
        return this.getTitle().compareTo(o.getTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Element element = (Element) o;
        return id == element.id &&
                Objects.equals(title, element.title) &&
                Objects.equals(description, element.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description);
    }
}
