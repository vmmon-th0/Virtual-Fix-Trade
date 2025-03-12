package com.core.fix.processor.handlers;

import com.core.fix.processor.FixMessagePreProcessor;

public class LoggingHandler extends FixMessagePreProcessor {

    @Override
    protected void process(Object input) {
        if (!(input instanceof String message)) {
            return ;
        }
        System.out.println("Logging Handler: " + message);
    }
}
