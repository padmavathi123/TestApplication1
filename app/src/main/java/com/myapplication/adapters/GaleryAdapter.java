package com.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.myapplication.R;
import com.myapplication.entities.Image;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pcs-155 on 1/12/16.
 */

public class GaleryAdapter extends BaseAdapter {
    private List<Image> mProducts=new ArrayList<>();
    private Context mcontext;
    private LayoutInflater minflater;

    public GaleryAdapter(Context con, List<Image> data){
        mcontext=con;
        mProducts.addAll(data);
        minflater=LayoutInflater.from(con);
    }

    @Override
    public int getCount() {
        return mProducts.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder=null;
        if(view==null){
            holder=new ViewHolder();
            view=minflater.inflate(R.layout.galertitem,null);
            holder.image= (ImageView) view.findViewById(R.id.imageView);
            view.setTag(holder);
        }else{
            holder= (ViewHolder) view.getTag();
        }
        String imagePath=mProducts.get(i).getUrl();
        // holder.image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Picasso.with(mcontext).load(imagePath).into(holder.image);
        return view;
    }

    class  ViewHolder{
        ImageView image;
    }
}
