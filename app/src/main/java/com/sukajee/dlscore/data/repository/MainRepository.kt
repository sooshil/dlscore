package com.sukajee.dlscore.data.repository

import android.content.Context
import com.google.gson.Gson
import com.sukajee.dlscore.data.models.ResourcesResponse

class MainRepository(private val context: Context): BaseRepository {
    override fun getData(): ResourcesResponse {
        val rawResourcesString = context.assets.open("DLResourcesTable1.json").bufferedReader().use {
            it.readText()
        }
        val gson = Gson()
        return gson.fromJson(rawResourcesString, ResourcesResponse::class.java)
    }
}
