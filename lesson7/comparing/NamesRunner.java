package homework.lesson7.comparing;

public class NamesRunner {

    public static void main(String[] args) {

        Names list = new Names();
        list.add("John");
        list.add("Arnold");
        list.add("Phillip");
        list.add("Diana");
        list.add("Bob");
        list.add("Silvester");
        list.add("Ann");
        list.add("Mary");
        list.add("Jenny");
        System.out.println(list + "\n");

        System.out.println(list.sortName());
        System.out.println(list.reverseSortName());
        System.out.println(list.minName());
        System.out.println(list.sortLengthName());
        System.out.println(list.sortGroupName());
    }
}
