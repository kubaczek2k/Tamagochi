package animals;

public class Cat extends Animal {
    Cat(String _name) {
        super(_name);
    }

    public int getHappiness(){
        return super.getHappiness();
    }

    public int getHealth(){
        return super.getHealth();
    }

    public String getName(){
        return super.getName();
    }

    public void feedAnimal(){
        super.feedAnimal();
    }
}
