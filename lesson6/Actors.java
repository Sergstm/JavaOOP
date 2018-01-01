package homework.lesson6;

public enum Actors {
    SCHWARZENEGGER("Arnold Schwarzenegger"),
    STALLONE("Sylvester Stallone"),
    CARREY("Jim Carrey"),
    REEVES("Keanu Reeves");

    private String actorName;

    Actors(String actorName) {
        this.actorName = actorName;
    }

    public String getActorName() {
        return actorName;
    }
}
