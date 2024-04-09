package org.mwatt;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

class MainTest {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MainTest.class);

    @Test
    public void loggingForTest() {
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }
}