package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bumblebee
 */
@Slf4j
public class SubClassLogic1 extends AbstractTemplate{

    @Override
    protected void call() {
      log.info("비지니 로직1 실행");
    }
}
