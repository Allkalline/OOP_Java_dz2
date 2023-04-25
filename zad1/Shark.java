public class Shark extends Predator implements SwimableDZ {
    
    public Shark(String name) {
        super(name);
    }

    

    @Override
    public String say() {
     
        return "Arrr";
    }

    @Override
    public String toString() {
        return String.format("Shark, %s", super.toString());
    }



    @Override
    public int speedForSwim() {
        
        return 50;
    }

}
