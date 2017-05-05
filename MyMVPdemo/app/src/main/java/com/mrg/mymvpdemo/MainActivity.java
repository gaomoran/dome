package com.mrg.mymvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.mrg.mymvpdemo.adapter.MyAdapter;
import com.mrg.mymvpdemo.entity.User;
import com.mrg.mymvpdemo.presenter.impi.ImpiMainPresenter;
import com.mrg.mymvpdemo.view.MainView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{

    private ListView listView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initen();
      new ImpiMainPresenter(this).initview();
    }

    private void initen() {
        listView = (ListView) findViewById(R.id.listView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
    }

    @Override
    public void showList(List<User> userList) {
        listView.setAdapter(new MyAdapter(this,userList));
    }

    @Override
    public void showError() {
        progressBar.setVisibility(View.GONE);
        Toast.makeText(MainActivity.this, "加载失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
        Toast.makeText(MainActivity.this, "正在加载", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSuccess() {
        progressBar.setVisibility(View.GONE);
        listView.setVisibility(View.VISIBLE);
    }
}
