package com.test.feature.anvil.anvilapp

import com.squareup.anvil.annotations.ContributesTo
import dagger.Binds
import dagger.MembersInjector
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Inject
import com.test.anvil_base.ActivityCmpScope
import com.test.anvil_base.ActivityKey
import com.test.anvil_base.ActivityScope
import com.test.anvil_base.AnvilInjector
import com.test.anvil_base.AppCmpScope
import com.test.anvil_base.AppScope

class MainActivityAnvilInjector @Inject constructor(
    override val injector: MembersInjector<MainActivity>
) : AnvilInjector<MainActivity>

@Module
@ContributesTo(ActivityCmpScope::class)
interface MainActivityAnvilInjectorBinder {
    @IntoMap
    @Binds
    @ActivityKey(MainActivity::class)
    fun MainActivityAnvilInjector.bind(): AnvilInjector<*>
}
