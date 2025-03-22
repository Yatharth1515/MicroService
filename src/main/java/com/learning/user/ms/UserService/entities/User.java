package com.learning.user.ms.UserService.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Document
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    private String userId ;
    @Field("NAME")
    private String name;
    @Field("EMAIL")
    private String email;
    @Field("ABOUT")
    private String about;
    private List<Rating> ratings = new ArrayList<>();

    public User(String userId, String name, String email, String about) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.about = about;
    }


}
