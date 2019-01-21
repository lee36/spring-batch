package com.lee.springbatchdemo1;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String,String> {
    @Override
    public String process(String s) throws Exception {
        return s.toUpperCase();
    }
}
