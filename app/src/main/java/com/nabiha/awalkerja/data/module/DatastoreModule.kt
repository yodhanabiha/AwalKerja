package com.nabiha.awalkerja.data.module

import android.content.Context
import com.nabiha.awalkerja.data.datastore.PreferenceDatastore
import com.nabiha.awalkerja.di.qualifer.AppBaseUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatastoreModule {

    @Provides
    @Singleton
    fun providePreferenceDatastore(@ApplicationContext context: Context): PreferenceDatastore {
        return PreferenceDatastore(context)
    }
}