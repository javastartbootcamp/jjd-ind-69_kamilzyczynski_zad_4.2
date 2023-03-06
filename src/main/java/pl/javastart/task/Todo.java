package pl.javastart.task;

public class Todo {
    private String task;
    private String description;
    private int priority;
    private Person person;

    public Todo(String task, String description, int priority, Person person) {
        this(task, description, priority);
        this.person = person;
    }

    public Todo(String task, String description, int priority) {
        this (task, description);
        this.priority = priority;
    }

    public Todo(String task, String description) {
        this.task = task;
        this.description = description;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean highPriority() {
        System.out.printf("Czy zadanie: %s ma wysoki priorytet? ", task);
        return priority > 0;
    }

    public boolean mediumPriority() {
        System.out.printf("Czy zadanie: %s ma średni priorytet? ", task);
        return priority == 0;
    }

    public boolean lowPriority() {
        System.out.printf("Czy zadanie: %s ma niski priorytet? ", task);
        return priority < 0;
    }
}
