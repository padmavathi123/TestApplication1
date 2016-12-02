package com.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;

import com.myapplication.adapters.GaleryAdapter;
import com.myapplication.entities.Product;
import com.squareup.picasso.Picasso;

/**
 * Created by pcs-155 on 1/12/16.
 */

public class ProductDetailsActivity extends AppCompatActivity {

    private ImageView mProductImage;
    private Gallery mProductGallery;
    private Product mProduct;
    private TextView title;
    private TextView description;
    private TextView price;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
           mProduct= (Product) bundle.getSerializable("data");
        }
        setContentView(R.layout.product_details);
        mProductImage= (ImageView) findViewById(R.id.image);
        mProductGallery= (Gallery) findViewById(R.id.galery);
        title= (TextView) findViewById(R.id.title);
        description= (TextView) findViewById(R.id.desc);
        price=(TextView)findViewById(R.id.price);

        Picasso.with(this).load(mProduct.getLogo().getUrl()).into(mProductImage);
      //  mProduct.getImages();
        title.setText(mProduct.getBrandName()+ "  " +mProduct.getTitle());
        description.setText(mProduct.getDescription());
        price.setText("Rs "+mProduct.getSalePrice());
        if(mProduct.getType().equalsIgnoreCase("cloth")){
            mProductGallery.setAdapter(new GaleryAdapter(this,mProduct.getImages()));
            mProductGallery.setSelection(1);

            mProductGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Picasso.with(ProductDetailsActivity.this).load(mProduct.getImages().get(position).getUrl()).into(mProductImage);
                }
            });
        }else{
            mProductGallery.setVisibility(View.GONE);
        }


//     mProductGallery.setOnTouchListener(new View.OnTouchListener() {
//
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//
//                return true;
//            }
//        });

    }

}
