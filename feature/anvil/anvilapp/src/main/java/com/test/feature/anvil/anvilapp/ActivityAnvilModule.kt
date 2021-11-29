package com.test.feature.anvil.anvilapp

import android.app.Activity
import com.test.anvil_base.ActivityCmpScope
import com.test.anvil_base.ActivityScope
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides

@Module
@ContributesTo(ActivityCmpScope::class)
class ActivityAnvilModule {

    @Provides
    @ActivityScope
    fun provideDep(activity: Activity): ActivityWorker {
        return ActivityWorker(activity)
    }
}
