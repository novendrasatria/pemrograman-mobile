package com.novendra.satria.pertemuan12.api

import com.novendra.satria.pertemuan12.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>
}