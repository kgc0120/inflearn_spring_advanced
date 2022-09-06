package hello.advanced.trace.threadlocal;

import hello.advanced.trace.threadlocal.code.ThreadLocalService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author bumblebee
 */
@Slf4j
public class ThreadLocalServiceTest {

    private ThreadLocalService threadLocal = new ThreadLocalService();

    @Test
    void field() {
        log.info("main start");

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                threadLocal.logic("userA");
//            }
//        };

        Runnable userA = () -> {
            threadLocal.logic("userA");
        };
        Runnable userB = () -> {
            threadLocal.logic("userB");
        };

        Thread threadA = new Thread(userA);
        threadA.setName("thread-A");
        Thread threadB = new Thread(userB);
        threadB.setName("thread-B");

        threadA.start();
        sleep(100); // 동시성 문제 발생x
        threadB.start();

        sleep(2000); // 메인 쓰레드 종료 대기
        log.info("main exit");
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
