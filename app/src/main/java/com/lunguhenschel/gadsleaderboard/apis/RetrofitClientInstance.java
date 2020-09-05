package com.lunguhenschel.gadsleaderboard.apis;

import com.github.leonardoxh.livedatacalladapter.LiveDataCallAdapterFactory;
import com.github.leonardoxh.livedatacalladapter.LiveDataResponseBodyConverterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    private static Retrofit sRetrofit;
    private static Retrofit sRetrofit2;
    private static final String LEARNER_LIST_BASE_URL = "https://gadsapi.herokuapp.com";
    private static final String GOOGLE_FORM_BASE_URL = "https://docs.google.com/forms/d/e/";

    public static Retrofit getRetrofitInstance() {
        if (sRetrofit == null) {
            sRetrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(LEARNER_LIST_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return sRetrofit;
    }

    public static Retrofit getRetrofitInstanceToPost() {
        if (sRetrofit2 == null) {
            sRetrofit2 = new retrofit2.Retrofit.Builder()
                    .baseUrl(GOOGLE_FORM_BASE_URL)
                    .build();
        }
        return sRetrofit2;
    }
}
