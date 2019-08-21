package com.ubt.myapplication.network;

import android.text.TextUtils;

import com.ubt.myapplication.model.AccountBean;
import com.ubt.myapplication.model.AnnotationBean;
import com.ubt.myapplication.model.RequestBody;

import org.json.JSONObject;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by chenqiang on 2019/8/21.
 */
public class NetClient {

    /**
     * 默认超时时间
     */
    private static final int DEFAULT_TIMEOUT = 3600;

    private NetService netService;

    private static final NetClient ourInstance = new NetClient();

    public static NetClient getInstance() {
        return ourInstance;
    }

    private NetClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit = new Retrofit
                .Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(NetService.BODY_URL)
                .build();
        netService = retrofit.create(NetService.class);
    }

    public Observable<AnnotationBean> faceAnnotation(RequestBody faceRequestBody) {
        return netService.faceAnnotation(faceRequestBody);
    }


    public Observable<AccountBean> getAccountInfo(String dkVal) {
        return netService.getAccountInfo(dkVal);
    }

}
