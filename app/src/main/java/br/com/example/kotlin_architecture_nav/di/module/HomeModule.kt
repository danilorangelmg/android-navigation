//package com.example.ktmovies.di.module
//
//import dagger.Module
//import dagger.Provides
//
///**
// * Created by danilorangel on 15/07/18.
// */
//@Module
//class HomeModule(private val mView: HomeContract.View) {
//
//    @Provides
//    fun provideView(): HomeContract.View {
//        return mView
//    }
//
//    @Provides
//    fun providePresenter(view: HomeContract.View, repository: MoviesRepository): HomeContract.Presenter {
//        return HomePresenter(view, repository)
//    }
//
//    @Provides
//    fun provideRepository(serviceApi: ServiceApi): MoviesRepository {
//        return MoviesRepositoryImpl(serviceApi)
//    }
//}