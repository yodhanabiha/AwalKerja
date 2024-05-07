package com.nabiha.awalkerja.data.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.google.gson.Gson
import com.nabiha.awalkerja.model.entity.TokenResult
import com.nabiha.awalkerja.model.entity.User
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class PreferenceDatastore @Inject constructor(context: Context) {
    private val Context.dataStore : DataStore<Preferences> by preferencesDataStore("TOKEN_USER")
    private val pref = context.dataStore

    companion object{
        var tokenUser = stringPreferencesKey("TOKEN_USER")
        var userProfile = stringPreferencesKey("PROFILE")
    }

    suspend fun setToken(token: String){
        pref.edit {
            it[tokenUser] = token
        }
    }

    suspend fun setProfile(user: User) {
        val json = Gson().toJson(user)
        pref.edit {
            it[userProfile] = json
        }
    }

    fun getToken() = pref.data.map {
        TokenResult(it[tokenUser]?:"")
    }

    suspend fun getProfile(): User? {
        val json = pref.data.firstOrNull()?.get(userProfile)
        return if (json != null) {
            Gson().fromJson(json, User::class.java) // Mengonversi string JSON menjadi objek User
        } else {
            null
        }
    }
}