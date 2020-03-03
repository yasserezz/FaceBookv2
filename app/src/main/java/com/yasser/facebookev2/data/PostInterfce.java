package com.yasser.facebookev2.data;

import com.yasser.facebookev2.pojo.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterfce {

    @GET ("posts")
    public Call<List<PostModel>> getPosts();

}
