package com.topjohnwu.magisk.ui.home

import android.net.Uri
import androidx.`annotation`.CheckResult
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.topjohnwu.magisk.MainDirections
import com.topjohnwu.magisk.R
import kotlin.String

public class HomeFragmentDirections private constructor() {
  public companion object {
    @CheckResult
    public fun actionHomeFragmentToSettingsFragment(): NavDirections = ActionOnlyNavDirections(R.id.action_homeFragment_to_settingsFragment)

    @CheckResult
    public fun actionHomeFragmentToInstallFragment(): NavDirections = ActionOnlyNavDirections(R.id.action_homeFragment_to_installFragment)

    @CheckResult
    public fun actionHomeFragment(): NavDirections = MainDirections.actionHomeFragment()

    @CheckResult
    public fun actionSuperuserFragment(): NavDirections = MainDirections.actionSuperuserFragment()

    @CheckResult
    public fun actionLogFragment(): NavDirections = MainDirections.actionLogFragment()

    @CheckResult
    public fun actionModuleFragment(): NavDirections = MainDirections.actionModuleFragment()

    @CheckResult
    public fun actionFlashFragment(action: String, additionalData: Uri? = null): NavDirections = MainDirections.actionFlashFragment(action, additionalData)

    @CheckResult
    public fun actionActionFragment(id: String, name: String): NavDirections = MainDirections.actionActionFragment(id, name)
  }
}
