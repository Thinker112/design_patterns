package behavioral.strategy.strategy01;

/**
 * @author yyb
 * @create 2022-11-27 10:13
 */
public class ClientTest {
    public static void main(String[] args) {
/*        System.out.println("Green dragon spotted ahead!");
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();

        System.out.println("Red dragon emerges.");
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();

        System.out.println("Black dragon lands before you.");
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

        System.out.println("Grey dragon fly here!");
        dragonSlayer.changeStrategy(() -> {
            System.out.println("the man kill dragon with knife");
        });
        dragonSlayer.goToBattle();*/

        System.out.println("Green dragon spotted ahead!");
        DragonSlayer2 dragonSlayer2 = new DragonSlayer2(() -> {
            System.out.println("the man kill dragon with knife");
        });
        dragonSlayer2.goToBattle();

        System.out.println("Red dragon emerges.");
        dragonSlayer2.changeStrategy(() -> {
            System.out.println("the man kill dragon with fire");
        });
        dragonSlayer2.goToBattle();
    }
}
