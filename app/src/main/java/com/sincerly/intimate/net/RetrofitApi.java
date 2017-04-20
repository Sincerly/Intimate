package com.sincerly.intimate.net;

import com.sincerly.intimate.common.Common;

import java.util.List;

import retrofit2.Retrofit;

/**
 * Created by Sincerly on 2017/4/19.
 */

public class RetrofitApi {
    public static RetrofitService retrofitService;
    public static RetrofitService getService(){
        if(retrofitService==null){
            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl(Common.Net.URL)
                    .build();
            retrofitService=retrofit.create(RetrofitService.class);
        }
        return retrofitService;
    }
}
