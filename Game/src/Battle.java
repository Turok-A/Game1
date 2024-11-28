class Battle {
    private Player player;
    private Character monster;

    public Battle(Player player, Character monster) {
        this.player = player;
        this.monster = monster;
        }

        public void start() {
        System.out.println("По пути Вы встретили! " + monster.getName() + " Бой начался! " + player.getName() + " против " + monster.getName() + "!");

        while (player.isAlive() && monster.isAlive()) {
            player.attack(monster);
            if (monster.isAlive()) {
                monster.attack(player);
                System.out.println();
                }
            }
        if (player.isAlive()) {
            System.out.println(player.getName() + " победил!");
            player.gainExperience(50);
            player.gold += monster.getGold();
            System.out.println(player.getName() + " получает " + monster.getGold() + " золота. ");
        } else {
            System.out.println(player.getName() + " проиграл ;(");

        }
        }
}
