package com.mrg.mymvpdemo.model;

import com.mrg.mymvpdemo.entity.User;

import java.util.List;

/**
 * Created by MrG on 2017-05-02.
 */
public interface MainModle extends BaseModel{

    List<User> getNumber() throws InterruptedException;



}
