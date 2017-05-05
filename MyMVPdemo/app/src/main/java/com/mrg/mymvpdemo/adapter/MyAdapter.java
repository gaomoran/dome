package com.mrg.mymvpdemo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.mrg.mymvpdemo.R;
import com.mrg.mymvpdemo.entity.User;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by MrG on 2017-05-02.
 */
public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<User> userList;


    public MyAdapter(Context context,List<User> userList) {
        this.context=context;
        this.userList=userList;
    }
    @Override
    public int getCount() {
        return userList.size();
    }

    @Override
    public Object getItem(int i) {
        return userList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View contentview, ViewGroup viewGroup) {

        View view;
        ViewHolder viewHolder;
        if (contentview==null){
            view=View.inflate(context,R.layout.item_list_main,null);
            viewHolder = new ViewHolder();
            viewHolder.name= (TextView) view.findViewById(R.id.tv_name);
            viewHolder.age= (TextView) view.findViewById(R.id.tv_age);
            viewHolder.xinbie= (TextView) view.findViewById(R.id.tv_xinbie);
            view.setTag(viewHolder);
        }else {
            view=contentview;
            viewHolder= (ViewHolder) view.getTag();
        }
        viewHolder.name.setText(userList.get(i).getName());
        viewHolder.age.setText(userList.get(i).getAge());
        viewHolder.xinbie.setText(userList.get(i).getXinbie());


        return view;
    }
    private static class ViewHolder{
        public TextView name=null;
        public TextView age=null;
        public TextView xinbie=null;
    }
}
