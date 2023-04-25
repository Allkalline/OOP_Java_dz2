public abstract class Animals implements SayAble {
    private String name;


    public Animals(String name) {
        this.name = name;
    }

    //public abstract String say();

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name: %s, Say: %s, Feed: %s", name, say(), feed());
    }
}
