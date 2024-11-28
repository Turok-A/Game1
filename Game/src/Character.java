import java.util.Random;

abstract class  Character {
    protected String name;
    protected int health;
    protected int strength;
    protected int agility;
    protected int experience;
    protected int gold;

    public Character(String name, int health, int strength, int agility, int experience, int gold){
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.experience = experience;
        this.gold = gold;
    }
public void attack(Character target) {
    Random random = new Random();
    int hitChance = random.nextInt(100);
    if (hitChance < this.agility * 3) {
        int damage = this.strength;
        if (random.nextInt(100) < 20) {
            damage *= 2;
            System.out.println(this.name + " нанес сокрушительный удар!");
        }
        target.health -= damage;
        System.out.println(this.name + " ударил " + target.name);
    } else {
        System.out.println(this.name + " промахнулся.");
    }
}
public boolean isAlive() {
    return this.health > 0;
}
public void displayStats() {
        System.out.println(this.name + "| Здоровье:" + this.health + "| Сила: " + this.strength + " | Ловкость: " + this.agility + " | Опыт: " + this.experience + " | Золото: " + this.gold);
}
public String getName() {
    return name;
}
public int getHealth() {
    return health;
}
public int getStrength() {
    return strength;
}
public int getAgility() {
    return agility;
}
public int getExperience() {
    return experience;
}
public int getGold() {
        return gold;
}
}
