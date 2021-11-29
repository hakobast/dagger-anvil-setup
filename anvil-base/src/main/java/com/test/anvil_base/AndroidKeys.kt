package com.test.anvil_base

import android.app.Activity
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import dagger.MapKey
import kotlin.reflect.KClass

@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ActivityKey(val value: KClass<out Activity>)
