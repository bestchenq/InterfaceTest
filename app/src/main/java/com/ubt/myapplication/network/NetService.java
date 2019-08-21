package com.ubt.myapplication.network;

import android.icu.lang.UCharacter;

import com.ubt.myapplication.model.AccountBean;
import com.ubt.myapplication.model.AnnotationBean;
import com.ubt.myapplication.model.RequestBody;

import org.json.JSONObject;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by chenqiang on 2019/8/21.
 */
public interface NetService {

    String BODY_URL = "http://115.77.188.232:8282/face_api/";
    String ACCOUNT_URL = "http://113.161.56.137:9019/v1.0/account/";

    @POST("annotation_embd")
    Observable<AnnotationBean> faceAnnotation(@Body RequestBody body);

    @GET(ACCOUNT_URL)
    @Headers({"X-API-Key: 1", "X-Request-ID: 1"})
    Observable<AccountBean> getAccountInfo(@Query("dk") String dkVal);

}
