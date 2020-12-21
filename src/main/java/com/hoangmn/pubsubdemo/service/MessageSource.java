package com.hoangmn.pubsubdemo.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MessageSource {

    String INPUT = "inputChannel";

    @Input(INPUT)
    SubscribableChannel fileInputChannel();
}
