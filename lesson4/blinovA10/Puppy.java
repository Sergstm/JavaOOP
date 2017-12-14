package homework.lesson4.blinovA10;

public class Puppy extends Dog {

    private String name;

    Puppy(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Puppy name is " + name);
    }

    public void jump() {
        System.out.println("Puppy is jumping");
    }
}
