class Player extends Character {
    public Player (String name) {
        super (name, 100, 10, 5, 0, 0);
    }
    public void levelUp() {
        if (this.experience >= 100) {
            this.experience = 0;
            this.strength += 5;
            this.agility += 3;
            this.health += 20;
            System.out.println(this.name + " достиг нового уровня! Характеристики улучшиены");
        }
    }
public void gainExperience(int exp) {
    this.experience += exp;
    System.out.println(this.name + " получил " + exp + " опыта.");
    }
}
