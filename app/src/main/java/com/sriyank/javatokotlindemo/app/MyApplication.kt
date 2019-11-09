package com.sriyank.javatokotlindemo.app

import android.app.Application

import io.realm.Realm
import io.realm.RealmConfiguration


class MyApplication : Application() {

	override fun onCreate() {
		super.onCreate()

		Realm.init(this) // should only be done once when app starts

		val config = RealmConfiguration.Builder()
				.name("myrealm.realm")
				.build()

		Realm.setDefaultConfiguration(config)
	}
}
