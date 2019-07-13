package com.example.learndi

import dagger.Module
import dagger.Provides

@Module
class LocalModuleTest{

    @Provides
    @ActivityScope
    fun provideClassC():ClassC{
        return ClassC()
    }

}