package com.guzzler.bdroom.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_employe")
data class Employe(
    @PrimaryKey
    @ColumnInfo(name = "id_employe")
    val id: Int,

    @ColumnInfo(name = "noms_employe")
    val noms: String,

    @ColumnInfo(name = "adresse_employe")
    val adresse: String
)