public class Player {
    private String name;
    private int strength;
    private int dexterity;
    private int hunger;
    private int luck;
    private double height;
    
    public Player(String name, int strength, int dexterity, int hunger, int luck, double height) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.hunger = hunger;
        this.luck = luck;
        this.height = height;
    }
    
    public void run() {
        System.out.println(this.name + " is running.");
    }
    
    public void fight() {
        System.out.println(this.name + " is fighting.");
    }
    
    public void jump() {
        System.out.println(this.name + " is jumping.");
    }
    
    public void pickUpItem() {
        System.out.println(this.name + " is picking up an item.");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getStrength() {
        return strength;
    }
    
    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public int getDexterity() {
        return dexterity;
    }
    
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    
    public int getHunger() {
        return hunger;
    }
    
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    
    public int getLuck() {
        return luck;
    }
    
    public void setLuck(int luck) {
        this.luck = luck;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
}

