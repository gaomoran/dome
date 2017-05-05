package com.mrg.mymvpdemo.presenter.impi;

import android.os.Handler;

import com.mrg.mymvpdemo.entity.User;
import com.mrg.mymvpdemo.model.MainModle;
import com.mrg.mymvpdemo.model.imp.ImpiMainModel;
import com.mrg.mymvpdemo.presenter.MainPresenter;
import com.mrg.mymvpdemo.view.MainView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MrG on 2017-05-02.
 */
public class ImpiMainPresenter implements MainPresenter {

    MainView view;
    private final ImpiMainModel impiMainModel;
    private Handler mHandler = new Handler();

    public ImpiMainPresenter(MainView view) {
        this.view=view;
        impiMainModel = new ImpiMainModel();
    }


    @Override
    public void initview() {

        view.showLoading();
        new Thread() {
            @Override
            public void run() {
                try {
                    //模拟耗时操作
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //在主线程中操作
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        view.showList(impiMainModel.getNumber());
                        view.showSuccess();
                    }
                });

            }


        }.start();

    }
}
