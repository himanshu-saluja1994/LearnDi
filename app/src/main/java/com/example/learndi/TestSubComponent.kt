package com.example.learndi

import dagger.BindsInstance
import dagger.Module
import dagger.Subcomponent
import javax.inject.Provider

@Subcomponent
public interface TestSubComponent {

    fun helperClass():HelperClass

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun classX(x: ClassX): Builder

        @BindsInstance
        fun classC(d: ClassC): Builder

        fun build(): TestSubComponent
    }

}