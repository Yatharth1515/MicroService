package com.learning.user.ms.UserService.repositories;

import com.learning.user.ms.UserService.entities.User;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CouchbaseRepository<User, String> {
}
