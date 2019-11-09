package com.sriyank.javatokotlindemo.retrofit


import com.sriyank.javatokotlindemo.models.Repository
import com.sriyank.javatokotlindemo.models.SearchResponse

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap


interface GithubAPIService {

	@GET("search/repositories")
	fun searchRepositories(@QueryMap options: Map<String, String>): Call<SearchResponse>

	@GET("/users/{username}/repos")
	fun searchRepositoriesByUser(@Path("username") githubUser: String): Call<List<Repository>>
}
