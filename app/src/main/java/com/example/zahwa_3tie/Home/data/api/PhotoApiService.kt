package com.example.zahwa_3tie.Home.data.api

import com.example.zahwa_3tie.Home.data.model.PhotoModel
import retrofit2.http.GET

interface PhotoApiService {
    @GET("list")
    suspend fun getPhotos(): List<PhotoModel>
}