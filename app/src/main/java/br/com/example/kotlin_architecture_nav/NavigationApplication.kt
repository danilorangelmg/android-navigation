package br.com.example.kotlin_architecture_nav

import android.app.Application
import br.com.example.kotlin_architecture_nav.di.component.AppComponent
import br.com.example.kotlin_architecture_nav.di.component.DaggerAppComponent
import br.com.example.kotlin_architecture_nav.di.module.AppModule


/**
 * Created by danilorangel on 7/13/18.
 */
class NavigationApplication: Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }


}