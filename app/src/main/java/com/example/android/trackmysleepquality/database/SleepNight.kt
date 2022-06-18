/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.trackmysleepquality.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Denotes a table being created with the name daily_sleep_quality_table
 */
@Entity(tableName = "daily_sleep_quality_table")
data class SleepNight(
    //Indicates which parameter is primary key and tells Room to auto-generate a unique id for each night
    @PrimaryKey(autoGenerate = true)
    var nightId: Long = 0L,
    //indicates that this is a column and assigns a name to the column
    @ColumnInfo(name = "start_time_milli")
    val startTimeMilli: Long = System.currentTimeMillis(),
    @ColumnInfo(name = "end_time_milli")
    var endTimeMilli: Long = startTimeMilli,
    @ColumnInfo(name = "quality_rating")
    var sleepQuality: Int = -1
)
