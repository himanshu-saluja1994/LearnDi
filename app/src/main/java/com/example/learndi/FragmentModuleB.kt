package com.example.learndi

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModuleB {
    @ContributesAndroidInjector
    abstract fun bindFragmentB(): FragmentB
}