package com.sukajee.dlscore.data.repository

import com.sukajee.dlscore.data.models.ResourcesResponse

interface BaseRepository {

    suspend fun getData(): ResourcesResponse
}
