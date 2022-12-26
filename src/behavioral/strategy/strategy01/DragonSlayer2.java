package behavioral.strategy.strategy01;

/**
 * @author yyb
 * @create 2022-11-27 10:29
 */
public class DragonSlayer2 {
    private DragonSlayingStrategy2 strategy;

    public DragonSlayer2(DragonSlayingStrategy2 strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(DragonSlayingStrategy2 strategy) {
        this.strategy = strategy;
    }

    public void goToBattle() {
        strategy.execute();
    }

    @FunctionalInterface
    public interface DragonSlayingStrategy2{
        void execute();
    }
}
