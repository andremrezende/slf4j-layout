package org.example.rezende;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

public class LoggerProxy {
    private Logger log;
    private Marker maker;

    private LoggerProxy(Class clazz) {
        this.maker = GeoMarkerFactory.getMarker(clazz);
        this.log = LoggerFactory.getLogger(clazz);
    }

    public static LoggerProxy getLogger(Class clazz) {
     return new LoggerProxy(clazz);
    }

    public void trace(String msg, Object... arguments) {
        log.trace(maker, msg, arguments);
    }

    public void debug(String msg, Object... arguments) {
        log.debug(maker, msg, arguments);
    }

    public void info(String msg, Object... arguments) {
        log.info(maker, msg, arguments);
    }

    public void warn(String msg, Throwable throwable) {
        log.warn(maker, msg, throwable);
    }

    public void error(String msg, Throwable throwable){
        log.error(maker, msg, throwable);
    }

}
