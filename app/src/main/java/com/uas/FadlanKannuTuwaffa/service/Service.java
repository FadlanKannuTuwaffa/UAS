package com.uas.FadlanKannuTuwaffa.service;

import com.uas.FadlanKannuTuwaffa.model.UserResponseItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET("/users")
    Call<List<UserResponseItem>> getDataUser();

}
