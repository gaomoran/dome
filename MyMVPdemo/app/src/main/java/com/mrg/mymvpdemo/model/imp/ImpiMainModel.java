package com.mrg.mymvpdemo.model.imp;

import com.mrg.mymvpdemo.entity.User;
import com.mrg.mymvpdemo.model.MainModle;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by MrG on 2017-05-02.
 */
public class ImpiMainModel implements MainModle {
    @Override
    public List<User> getNumber() {
        final List<User> users = new ArrayList<>();


                for (int i = 0; i < 100; i++) {
                    User user = new User();
                    user.setAge("" + i + 2);
                    user.setName("xiaomin" + i);
                    user.setXinbie("n/u" + i);
                    users.add(user);
                }


        return users;

    }

}
