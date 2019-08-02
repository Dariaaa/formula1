package ru.kd.formula1.api

import io.reactivex.Observable
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import ru.kd.formula1.api.entity.MRData


interface ErgastApiServiceInterface {

    @GET("{season}.json")
    fun getRounds(@Path("season") season: Int): Observable<MRData>

    @GET("current.json")
    fun getCurrentRounds(): Observable<MRData>

    @GET("{season}/{round}/results.json")
    fun getRound(@Path("season") season: Int, @Path("round") round: Int): Observable<MRData>

    @GET("drivers/{driverId}.json")
    fun getDriver(@Path("driverId") driverId: String): Observable<MRData>

    companion object Factory {
        fun create(url:String): ErgastApiServiceInterface {
            val retrofit = retrofit2.Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(url)
                .build()

            return retrofit.create(ErgastApiServiceInterface::class.java)
        }
    }
}