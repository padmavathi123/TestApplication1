package com.myapplication.adapters;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.myapplication.R;
import com.myapplication.entities.Product;
import com.myapplication.entities.Size;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pcs-155 on 2/9/16.
 */

public class ProductAdapter extends BaseAdapter{
    private List<Product> mProducts=new ArrayList<>();
    private Context mcontext;
    private LayoutInflater minflater;

    public ProductAdapter(Context con, List<Product> data){
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
    public View getView(final int i, View view, ViewGroup viewGroup) {
        ViewHolder holder=null;
        if(view==null){
            holder=new ViewHolder();
            view=minflater.inflate(R.layout.product_item,null);
            holder.image= (ImageView) view.findViewById(R.id.image);
            holder.bookmark= (ImageView) view.findViewById(R.id.bookmark);
            holder.size= (ImageView) view.findViewById(R.id.size);
            holder.tag= (ImageView) view.findViewById(R.id.tag);
            view.setTag(holder);
        }else{
            holder= (ViewHolder) view.getTag();
        }
        if(mProducts.get(i).getType().equalsIgnoreCase("cloth")){
            holder.size.setVisibility(View.VISIBLE);
            holder.tag.setVisibility(View.GONE);
        }else{
            holder.size.setVisibility(View.GONE);
            holder.tag.setVisibility(View.VISIBLE);
        }

        if(mProducts.get(i).isBookmark()){
            holder.bookmark.setImageResource(R.mipmap.bookmark);
        }else {
            holder.bookmark.setImageResource(R.mipmap.unbookmark);
        }

        String imagePath=mProducts.get(i).getLogo().getUrl();
       // holder.image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Picasso.with(mcontext).load(imagePath).into(holder.image);

        holder.bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mProducts.get(i).isBookmark()){
                    bookmark("Do you want to Un Bookmark this item",i);
                }else {
                    bookmark("Do you want to Bookmark this item",i);
                }
            }
        });

        holder.tag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> data=mProducts.get(i).getTags();
                showDialog(data,"Tags");
            }
        });

        holder.size.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<Size> sizeList=mProducts.get(i).getProductType().getSizes();
                List<String> data=new ArrayList<String>();
                for(int j=0;j<sizeList.size();j++){
                    data.add(sizeList.get(j).getSize());
                }

                showDialog(data,"Sizes");
            }
        });


        return view;
    }


    private void bookmark(String name , final int position){

        AlertDialog.Builder builder = new AlertDialog.Builder(mcontext);
        builder.setMessage(name)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        if(mProducts.get(position).isBookmark()){
                            mProducts.get(position).setBookmark(false);
                        }else {
                            mProducts.get(position).setBookmark(true);
                        }
                       dialog.dismiss();
                        notifyDataSetChanged();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                        dialog.dismiss();
                    }
                });
        AlertDialog dialog=builder.create();
        dialog.show();


    }

    private  void showDialog(List<String> data,String name){
        String[] stockArr = new String[data.size()];
        stockArr = data.toArray(stockArr);
        AlertDialog.Builder builder = new AlertDialog.Builder(mcontext);
        builder.setTitle(name);
        builder.setItems(stockArr, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                // Do something with the selection
            }
        });
        AlertDialog alert = builder.create();
        alert.show();

    }


    class  ViewHolder{
        ImageView image;
        ImageView bookmark;
        ImageView size;
        ImageView tag;

    }
}
