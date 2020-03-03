package com.yasser.facebookev2.data;

import com.yasser.facebookev2.pojo.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostsClient {

    private static  final  String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private  PostInterfce postInterface;
    private  static  PostsClient INSTANCE;

    public PostsClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory ( GsonConverterFactory.create () )
                .build ();
        postInterface = retrofit.create ( PostInterfce.class );

    }

    public static PostsClient getINSTANCE() {
        if ( null == INSTANCE){
            INSTANCE = new PostsClient ();
        }

        return INSTANCE;
    }

    public Call<List<PostModel>> getPosts(){
        return postInterface.getPosts ();
    }
}
