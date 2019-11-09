package com.sriyank.javatokotlindemo.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitClient {

	private val BASE_URL = "https://api.github.com/"

	private val retrofit: Retrofit = Retrofit.Builder()
			.baseUrl(BASE_URL)
			.addConverterFactory(GsonConverterFactory.create())
			.build()

	val githubAPIService: GithubAPIService = retrofit.create(GithubAPIService::class.java)
}
