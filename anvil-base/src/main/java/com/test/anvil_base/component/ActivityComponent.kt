package com.test.anvil_base.component

import android.app.Activity
import com.squareup.anvil.annotations.ContributesSubcomponent
import com.test.anvil_base.ActivityCmpScope
import com.test.anvil_base.ActivityScope
import com.test.anvil_base.AnvilInjector
import com.test.anvil_base.AppCmpScope
import dagger.BindsInstance

@ActivityScope
@ContributesSubcomponent(scope = ActivityCmpScope::class, parentScope = AppCmpScope::class)
interface ActivityComponent {
    fun activityInjectors(): Map<Class<out Activity>, AnvilInjector<*>>

    @ContributesSubcomponent.Factory
    interface Factory {
        fun create(@BindsInstance activity: Activity): ActivityComponent
    }
}
