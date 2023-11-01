package com.example.demo.user;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class UsersService {
    public List<UserModel> GetUsers() {
        return List.of(new UserModel(1L,"meraj",20,"merajmusavi1243m@gmail.com", LocalDate.of(2002, Month.JANUARY,29)));
    }
}
