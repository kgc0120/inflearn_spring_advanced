package hello.advanced;

import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bumblebee
 */
@Configuration
public class LogTraceConfig {

    // LogTrace Interface 빈으로 등록
    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }

}
