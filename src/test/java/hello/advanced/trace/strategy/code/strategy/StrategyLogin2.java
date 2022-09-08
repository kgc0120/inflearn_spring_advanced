package hello.advanced.trace.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bumblebee
 */
@Slf4j
public class StrategyLogin2 implements Strategy {

    @Override
    public void call() {
        log.info("비즈니스 로직2 실행");
    }
}
