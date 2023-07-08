package com.stmik.project_uas.service

import com.stmik.project_uas.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=24962902e51d529c9f9690b2783c887e")
    fun getTvList(): Call<TVResponse>
}