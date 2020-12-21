package com.hoangmn.pubsubdemo.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(MessageSource.class)
public class Consumer {

    @StreamListener(MessageSource.INPUT)
    void handleFileReady(String message) {
        try {

            System.out.println("Receive : " + message);
            process(message);

        } catch (Exception e) {
            handleFailure(e);
        }
    }

    private void process(String message) {
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int i = 1/0;
    }

    private void handleFailure(Exception e) {
        throw new RuntimeException("testt");
    }
}
