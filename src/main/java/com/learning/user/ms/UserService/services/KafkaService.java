package com.learning.user.ms.UserService.services;

import com.learning.user.ms.UserService.configs.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class KafkaService {

    @Inject
    private KafkaTemplate<String,String> kafkaTemplate;

    private Logger logger = LoggerFactory.getLogger(KafkaService.class);
    public void userDetails(String location){
        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
        logger.info("message-produced");
    }
}
