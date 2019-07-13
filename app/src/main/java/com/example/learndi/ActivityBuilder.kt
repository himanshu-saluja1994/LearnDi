package com.example.learndi

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector()
    abstract fun bindMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(LocalModuleTest::class,FragmentsModule::class))
    abstract fun bindActivityA(): ActivityA

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(LocalModuleTest::class,FragmentModuleB::class))
    abstract fun bindActivityB(): ActivityB

    @ContributesAndroidInjector(modules = arrayOf(FragmentModuleC::class,ComponentModule::class))
    abstract fun bindActivityC(): ActivityC
}
