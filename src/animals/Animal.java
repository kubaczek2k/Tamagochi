package animals;

public abstract class Animal {
    private int health = 100;
    private String name;
    private int happiness = 100;

    Animal(String _name){
        setName(_name);
    }

    public int getHealth(){
        return this.health;
    }

    public int getHappiness(){
        return this.happiness;
    }

    public void setName(String _name){
        this.name = _name;
    }

    public String getName(){
        return this.name;
    }

    public void feedAnimal(){
        if(this.happiness <= 95){
            this.happiness += 5;
        }
        if(this.health <= 96){
            this.health += 4;
        }
    }
}
