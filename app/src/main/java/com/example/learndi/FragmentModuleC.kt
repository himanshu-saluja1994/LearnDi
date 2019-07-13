package com.example.learndi

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModuleC {
    @ContributesAndroidInjector
    abstract fun bindFragmentC(): FragmentC
}