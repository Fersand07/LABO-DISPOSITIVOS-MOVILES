package com.example.laboratorio05.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Actor_table")
data class ActorModel (
    @PrimaryKey(autoGenerate = true) var actorId: Long = 0L,
    @ColumnInfo(name = "name") val name: String,
)

{
    constructor(name: String): this(0, name)
}
