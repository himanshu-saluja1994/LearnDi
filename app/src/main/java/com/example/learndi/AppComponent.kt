package com.example.learndi

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf( AndroidSupportInjectionModule::class,AppModule::class,ActivityBuilder::class))
interface AppComponent {

    fun inject(application: MyApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        abstract fun application(application: Application): Builder

        fun build(): AppComponent
    }

}