package behavioral.strategy.strategy01;

/**
 * @author yyb
 * @create 2022-11-27 10:03
 */

public class MeleeStrategy implements DragonSlayingStrategy{

    @Override
    public void execute() {
        System.out.println("With your Excalibur you sever the dragon's head!");
    }
}
