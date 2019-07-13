package com.example.learndi

import dagger.Lazy
import javax.inject.Inject

class HelperClass @Inject constructor(val x:Lazy<ClassX>, c:ClassC)