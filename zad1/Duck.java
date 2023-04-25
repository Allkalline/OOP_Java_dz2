public class Duck extends Herbivores implements Walkable, Flyable, SwimableDZ {

    public Duck(String name) {
        super(name);
    }

    

    @Override
    public String say() {
     
        return "Krya-krya-krya";
    }

    @Override
    public String toString() {
        return String.format("Duck, %s", super.toString());
    }



    @Override
    public int speedForWalk() {
        
        return 5;
    }



    @Override
    public int speedForFly() {
       
        return 80;
    }



    @Override
    public int speedForSwim() {
      
        return 15;
    }
    

    
}
