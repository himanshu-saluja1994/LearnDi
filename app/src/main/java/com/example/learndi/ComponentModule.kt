package com.example.learndi

import dagger.Module
import dagger.Provides

@Module(subcomponents = arrayOf(TestSubComponent::class))
public class ComponentModule {


}