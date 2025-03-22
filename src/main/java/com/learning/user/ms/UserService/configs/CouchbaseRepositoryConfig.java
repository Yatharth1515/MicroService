package com.learning.user.ms.UserService.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
public class CouchbaseRepositoryConfig extends AbstractCouchbaseConfiguration {


    @Override
    public String getConnectionString() {
        // TODO Auto-generated method stub
        return "couchbase://127.0.0.1";
    }

    @Override
    public String getUserName() {
        // TODO Auto-generated method stub
        return "Administrator";
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return "Administrator";
    }

    @Override
    public String getBucketName() {
        // TODO Auto-generated method stub
        return "users";
    }
}
