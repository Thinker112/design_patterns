package behavioral.strategy.strategy01;

/**
 * @author yyb
 * @create 2022-11-27 10:09
 */
public class ProjectileStrategy implements DragonSlayingStrategy{
    @Override
    public void execute() {
        System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
    }
}
