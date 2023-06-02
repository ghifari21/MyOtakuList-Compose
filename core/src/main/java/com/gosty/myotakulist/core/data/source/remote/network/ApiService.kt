package com.gosty.myotakulist.core.data.source.remote.network

import com.gosty.myotakulist.core.data.source.remote.response.anime.AnimeResponse
import com.gosty.myotakulist.core.data.source.remote.response.common.CommonPaginationResponse
import com.gosty.myotakulist.core.data.source.remote.response.manga.MangaResponse
import retrofit2.http.GET
import retrofit2.http.Query

/***
 * Api Service Interface
 * @author Ghifari Octaverin
 */
interface ApiService {
    /* API call for anime */
    /***
     * function to call all anime from this season
     * @param page Int
     * @return CommonPaginationResponse<AnimeResponse>
     */
    @GET("/seasons/now")
    suspend fun getSeasonsNow(
        @Query("page") page: Int
    ): CommonPaginationResponse<AnimeResponse>

    /***
     * function to search anime
     * @param q String
     * @param page Int
     * @return CommonPaginationResponse<AnimeResponse>
     */
    @GET("/anime")
    suspend fun getAnimeSearch(
        @Query("q") q: String,
        @Query("page") page: Int
    ): CommonPaginationResponse<AnimeResponse>

    /***
     * function to get all anime based on rating
     * @param page Int
     * @return CommonPaginationResponse<AnimeResponse>
     */
    @GET("top/anime")
    suspend fun getTopAnime(
        @Query("page") page: Int
    ): CommonPaginationResponse<AnimeResponse>

    /* API call for manga */

    /***
     * function to search manga
     * @param q String
     * @param page Int
     * @return CommonPaginationResponse<MangaResponse>
     */
    @GET("manga")
    suspend fun getMangaSearch(
        @Query("q") q: String,
        @Query("page") page: Int
    ): CommonPaginationResponse<MangaResponse>

    /***
     * function to get all manga based on rating
     * @param page Int
     * @return CommonPaginationResponse<MangaResponse>
     */
    @GET("top/manga")
    suspend fun getTopManga(
        @Query("page") page: Int
    ): CommonPaginationResponse<MangaResponse>
}