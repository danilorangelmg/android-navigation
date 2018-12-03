package br.com.example.kotlin_architecture_nav.di.component

import android.content.Context
import br.com.example.kotlin_architecture_nav.NavigationApplication
import br.com.example.kotlin_architecture_nav.di.module.AppModule
import br.com.example.kotlin_architecture_nav.di.qualifier.ApplicationContext
import br.com.example.kotlin_architecture_nav.di.scope.ApplicationScope
import br.com.example.kotlin_architecture_nav.rest.retrofit_service.ServiceApi
import dagger.Component

/**
 * Created by danilorangel on 7/13/18.
 */
@ApplicationScope
@Component(modules = arrayOf(AppModule::class, NetworkModule::class))
interface AppComponent {

    fun getApiInterface(): ServiceApi

    @ApplicationContext
    fun getContext(): Context

    fun injectApplication(myApplication: NavigationApplication)

}