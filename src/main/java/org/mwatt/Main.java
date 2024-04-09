package org.mwatt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main( String[] args ) {
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
    }
}
