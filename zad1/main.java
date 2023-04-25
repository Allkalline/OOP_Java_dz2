
public class main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());
        zoo.addList(new Wolf("Wolk"))
            .addList(new Hare("Zaika"))
            .addList(new Duck("Donald"))
            .addList(new Bat("Batman"))
            .addList(new Shark("Akula"))
            .addList(new Сrocodile("Krok"));
            
    
        for (var i : zoo.getListAnimal()) {
            System.out.println(i);
        }
        System.out.println();
        for (var i : zoo.getSayAbles()) {
            System.out.println(i.say());
        }
        System.out.println();
        // for (var i  : zoo.walkables()) {
        //     System.out.printf("%s - %d\n", i.toString(), i.speedForWalk());
        // }
        // System.out.println();
        // for (var i  : zoo.flyables()) {
        //     System.out.printf("%s - %d\n", i.toString(), i.speedForFly());
        // }
        // System.out.println();

        // System.out.println("Winner to walk: " + zoo.winnerWalk());
        // System.out.println();

        // System.out.println("Winner to fly: " + zoo.winnerFly());
        for (var i  : zoo.swimables()) {
            System.out.printf("%s - %d\n", i.toString(), i.speedForSwim());
        }

        System.out.println();

        System.out.println("Winner to swim: " + zoo.winnerSwim());
    
        }
    
}