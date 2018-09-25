package com.oneut.javaexample.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.inject.Inject;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class User {
    private Integer id;

    public User newInstance(Integer id) {
        return User.of(id);
    }
}
