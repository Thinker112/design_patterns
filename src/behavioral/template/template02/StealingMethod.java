package behavioral.template.template02;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

/**
 * @author yyb
 * @create 2022-11-27 10:51
 */
public abstract class StealingMethod {
    private static final Logger LOGGER = LoggerFactory.getLogger(StealingMethod.class);

    protected abstract String pickTarget();

    protected abstract void confuseTarget(String target);

    protected abstract void stealTheItem(String target);

    public void steal() {
        String target = pickTarget();
        LOGGER.debug("The target has been chosen as {}.", target);
        confuseTarget(target);
        stealTheItem(target);
    }
}
