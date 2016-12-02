package com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.myapplication.adapters.ProductAdapter;
import com.myapplication.entities.Product;
import com.myapplication.entities.ProductEntity;
import com.myapplication.service.ApiClient;
import com.myapplication.service.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pcs-155 on 1/12/16.
 */

public class ProductsListAcitvity extends AppCompatActivity {
    private List<Product> productsList=new ArrayList<>();

    private List<Product> clothsList=new ArrayList<>();
    private List<Product> foodList=new ArrayList<>();
    private ListView productListView=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productListView= (ListView) findViewById(R.id.products_list_view);
        productListView.setOnItemClickListener(onItemClickListener);
        getClothProducts();
    }

    AdapterView.OnItemClickListener onItemClickListener=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent=new Intent(ProductsListAcitvity.this,ProductDetailsActivity.class);
            intent.putExtra("data",productsList.get(position));
            startActivity(intent);

        }
    };

    private void getClothProducts(){

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);


        Call<ProductEntity> call=  apiService.getClothProducts();

        call.enqueue(new Callback<ProductEntity>() {
            @Override
            public void onResponse(Call<ProductEntity> call, Response<ProductEntity> response) {
                    clothsList.addAll(response.body().getProducts());
                     getFoodProducts();
            }

            @Override
            public void onFailure(Call<ProductEntity> call, Throwable t) {

            }


        });
    }

    private void getFoodProducts(){

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);


        Call<ProductEntity> call=  apiService.getFoodProducts();

        call.enqueue(new Callback<ProductEntity>() {
            @Override
            public void onResponse(Call<ProductEntity> call, Response<ProductEntity> response) {
                foodList.addAll(response.body().getProducts());
                     mergeProducts();
            }

            @Override
            public void onFailure(Call<ProductEntity> call, Throwable t) {

            }


        });
    }

    private void mergeProducts(){
        if(clothsList.size()>0&&foodList.size()>0){
            for(int i=0;i<clothsList.size();i++){
                foodList.get(i).setType("food");
                productsList.add(foodList.get(i));
                clothsList.get(i).setType("cloth");
                productsList.add(clothsList.get(i));
            }
        }
        if(productListView!=null&&productsList.size()>0){
            productListView.setAdapter(new ProductAdapter(this,productsList));
        }
    }

}
