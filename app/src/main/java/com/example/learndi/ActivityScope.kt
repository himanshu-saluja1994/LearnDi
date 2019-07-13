package com.example.learndi

import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

@Retention(value = AnnotationRetention.RUNTIME)
@Scope
annotation class ActivityScope


