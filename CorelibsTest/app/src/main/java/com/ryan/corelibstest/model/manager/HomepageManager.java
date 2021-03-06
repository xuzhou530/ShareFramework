package com.ryan.corelibstest.model.manager;

import com.ryan.corelibstest.constants.Urls;
import com.ryan.corelibstest.model.bean.BaseData;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Ryan on 2016/1/6.
 */
public interface HomepageManager {

    @POST(Urls.GET_MAIN_DATA)
    Observable<BaseData> getTypes();

    @FormUrlEncoded
    @POST(Urls.GET_HOT_PRODUCTS)
    Observable<BaseData> getTopProducts(@Field("pageNo") int pageNo, @Field("pageSize") int pageSize);
}
