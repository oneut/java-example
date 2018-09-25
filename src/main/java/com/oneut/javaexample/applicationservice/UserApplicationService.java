package com.oneut.javaexample.applicationservice;

import com.oneut.javaexample.models.User;
import lombok.RequiredArgsConstructor;

import javax.inject.Inject;

@RequiredArgsConstructor(onConstructor = @__({@Inject}))
public class UserApplicationService {
    private final User user;

    public User find(Integer id) {
        return this.user.newInstance(id);
    }
}
