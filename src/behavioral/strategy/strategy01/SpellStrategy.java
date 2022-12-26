package behavioral.strategy.strategy01;

/**
 * @author yyb
 * @create 2022-11-27 10:09
 */
public class SpellStrategy implements DragonSlayingStrategy{
    @Override
    public void execute() {
        System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }
}
