package animals;

public class Dog extends Animal{

    Dog(String _name) {
        super(_name);
    }

    public int getHealth(){
        return super.getHealth();
    }

    public int getHappiness(){
        return super.getHappiness();
    }

    public String getName(){
        return super.getName();
    }

    public void feedAnimal(){
        super.feedAnimal();
    }
}
