public class Сrocodile extends Predator implements Walkable, SwimableDZ {

    public Сrocodile(String name) {
        super(name);
    }

    @Override
    public String say() {
     
        return "Chak-chak-chak";
    }

    @Override
    public String toString() {
        return String.format("Сrocodile, %s", super.toString());
    }



    @Override
    public int speedForWalk() {
        
        return 10;
    }



    @Override
    public int speedForSwim() {
       
        return 30;
    }
    
}
