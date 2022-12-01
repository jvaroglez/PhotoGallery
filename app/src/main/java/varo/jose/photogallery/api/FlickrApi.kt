package varo.jose.photogallery.api

import retrofit2.http.GET
import retrofit2.http.Query
import varo.jose.photogallery.FlickrResponse

//private const val API_KEY = "e68930c4a2669e603666e85d7c0683ef"

interface FlickrApi {
    /*@GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )*/
    @GET("services/rest/?method=flickr.interestingness.getList")
    suspend fun fetchPhotos(): FlickrResponse

    @GET("services/rest?method=flickr.photos.search")
    suspend fun searchPhotos(@Query("text") query: String): FlickrResponse
    //suspend fun fetchContents() = flickrApi.fetchContents()
}