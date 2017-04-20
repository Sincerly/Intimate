package com.sincerly.intimate.net;

import java.util.List;

import retrofit2.Retrofit;

/**
 * Created by Sincerly on 2017/4/19.
 */

public class RetrofitApi {
    public static Retrofit retrofit;

    public static Retrofit getRetrofit(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl("www.baidu.com")
                    .build();
        }
        return  retrofit;
    }

}
