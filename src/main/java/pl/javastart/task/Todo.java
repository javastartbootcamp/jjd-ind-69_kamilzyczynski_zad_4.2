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

    public String getTask() {
        return task;
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
        return priority > 0;
    }

    public boolean mediumPriority() {
        return priority == 0;
    }

    public boolean lowPriority() {
        return priority < 0;
    }
}
