package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Kamil", "Życzyński");
        Todo learning = new Todo("Learn Programming", "Trying to get better in Java", 1, person);
        System.out.println(learning.highPriority());

        Todo cleaning = new Todo("Cleaning", "Have to clean kitchen");
        cleaning.setPriority(0);
        cleaning.setPerson(person);
        System.out.println(cleaning.highPriority());
        System.out.println(cleaning.mediumPriority());

        Todo swimming = new Todo("Swimming", "Go to the swimming pool", -1);
        swimming.setPerson(person);
        System.out.println(swimming.lowPriority());

    }
}
