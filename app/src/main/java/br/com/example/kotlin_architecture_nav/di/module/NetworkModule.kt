package br.com.example.kotlin_architecture_nav.di.component

import br.com.example.kotlin_architecture_nav.BuildConfig
import br.com.example.kotlin_architecture_nav.di.scope.ApplicationScope
import br.com.example.kotlin_architecture_nav.rest.retrofit_service.ServiceApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by danilorangel on 14/07/18.
 */
@Module
class NetworkModule {

    internal val httpLoggingInterceptor: HttpLoggingInterceptor
        @Provides
        @ApplicationScope
        get() {
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            return httpLoggingInterceptor
        }

    @Provides
    @ApplicationScope
    internal fun getApiInterface(retroFit: Retrofit): ServiceApi {
        return retroFit.create(ServiceApi::class.java)
    }

    @Provides
    @ApplicationScope
    internal fun getRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
    }

    @Provides
    @ApplicationScope
    internal fun getOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build()
    }
}