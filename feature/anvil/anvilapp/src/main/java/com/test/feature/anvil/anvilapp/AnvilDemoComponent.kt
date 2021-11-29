package com.test.feature.anvil.anvilapp

import android.app.Application
import com.test.anvil_base.AppCmpScope
import com.squareup.anvil.annotations.MergeComponent
import dagger.BindsInstance
import dagger.Component

@MergeComponent(AppCmpScope::class)
interface AnvilDemoComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): AnvilDemoComponent
    }
}
