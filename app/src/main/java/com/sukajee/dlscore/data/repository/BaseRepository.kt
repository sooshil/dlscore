package com.sukajee.dlscore.data.repository

import com.sukajee.dlscore.data.models.ResourcesResponse

interface BaseRepository {

    fun getData(): ResourcesResponse
}
