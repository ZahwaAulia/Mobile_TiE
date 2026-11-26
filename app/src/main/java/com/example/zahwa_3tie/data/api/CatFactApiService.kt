package com.example.zahwa_3tie.Home.api

import com.example.zahwa_3tie.data.model.CatFactModel
import retrofit2.http.GET

interface CatFactApiService {
    @GET("fact")
    suspend fun getCatFact(): CatFactModel
}