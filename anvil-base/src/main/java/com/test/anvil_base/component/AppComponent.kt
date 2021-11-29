package com.test.anvil_base.component

import android.app.Application
import androidx.activity.ComponentActivity
import com.test.anvil_base.AppCmpScope
import com.test.anvil_base.AppScope
import com.squareup.anvil.annotations.ContributesTo
import com.test.anvil_base.AnvilInjector

@AppScope
@ContributesTo(AppCmpScope::class)
interface AppComponent {
    val activityComponentFactory: ActivityComponent.Factory
    fun application(): Application
}
