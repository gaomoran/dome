package com.mrg.mymvpdemo.view;

import com.mrg.mymvpdemo.entity.User;

import java.util.List;

/**
 * Created by MrG on 2017-05-02.
 */
public interface MainView {

    void showList(List<User> userList);
    void showError();
    void showLoading();
    void showSuccess();
}
