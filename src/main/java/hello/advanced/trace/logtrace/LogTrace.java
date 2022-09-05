package hello.advanced.trace.logtrace;

import hello.advanced.trace.TraceStatus;

/**
 * @author bumblebee
 */
public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);


}
