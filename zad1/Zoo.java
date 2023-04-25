import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animals> listAnimal = new ArrayList<>();

    public List <Animals> getListAnimal(){
        return listAnimal;
    }

    public Zoo addList(Animals animals){
        listAnimal.add(animals);
        return this;
    }
    
    private Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public List<SayAble> getSayAbles(){
        List<SayAble> sayAbles = new ArrayList<>();
        for (var i : listAnimal) {
            sayAbles.add(i);
        }
        sayAbles.add(radio);
        return sayAbles;
    }

    public List<Walkable> walkables(){
        List<Walkable> walkables = new ArrayList<>();
        for (var i : listAnimal) {
            if(i instanceof Walkable){
                walkables.add((Walkable) i);
            }
        }
        return walkables;
    }

    public List<Flyable> flyables(){
        List<Flyable> flyables = new ArrayList<>();
        for (var i : listAnimal) {
            if(i instanceof Flyable){
                flyables.add((Flyable) i);
            }
        }
    return flyables;
    }
    public List<SwimableDZ> swimables(){
        List<SwimableDZ> swimables = new ArrayList<>();
        for (var i : listAnimal) {
            if(i instanceof SwimableDZ){
               swimables.add((SwimableDZ) i);
            }
        }
    return swimables;
    }

    public Walkable winnerWalk(){
        int index = 0;
        for (int i = 0; i < walkables().size(); i++) {
            if(walkables().get(i).speedForWalk()>walkables().get(index).speedForWalk()){
                index = i;
            }
        }
        return walkables().get(index);
    }

    public Flyable winnerFly(){
        int index = 0;
        for (int i = 0; i < flyables().size(); i++) {
            if(flyables().get(i).speedForFly()>flyables().get(index).speedForFly()){
                index = i;
            }
        }
        return flyables().get(index);
    }

    public SwimableDZ winnerSwim(){
        int index = 0;
        for (int i = 0; i < swimables().size(); i++) {
            if(swimables().get(i).speedForSwim()>swimables().get(index).speedForSwim()){
                index = i;
            }
        }
        return swimables().get(index);
    }
    
}
