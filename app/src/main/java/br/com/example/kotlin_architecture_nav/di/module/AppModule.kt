package br.com.example.kotlin_architecture_nav.di.module

import android.content.Context
import br.com.example.kotlin_architecture_nav.di.qualifier.ApplicationContext
import br.com.example.kotlin_architecture_nav.di.scope.ApplicationScope
import dagger.Module
import dagger.Provides

/**
 * Created by danilorangel on 7/13/18.
 */
@Module
class AppModule(private val context: Context) {

    @Provides
    @ApplicationScope
    @ApplicationContext
    fun provideContext(): Context {
        return context
    }
}