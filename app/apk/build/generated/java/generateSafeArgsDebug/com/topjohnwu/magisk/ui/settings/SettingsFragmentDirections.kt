package com.topjohnwu.magisk.ui.settings

import android.net.Uri
import androidx.`annotation`.CheckResult
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.topjohnwu.magisk.MainDirections
import com.topjohnwu.magisk.R
import kotlin.String

public class SettingsFragmentDirections private constructor() {
  public companion object {
    @CheckResult
    public fun actionSettingsFragmentToThemeFragment(): NavDirections = ActionOnlyNavDirections(R.id.action_settingsFragment_to_themeFragment)

    @CheckResult
    public fun actionSettingsFragmentToDenyFragment(): NavDirections = ActionOnlyNavDirections(R.id.action_settingsFragment_to_denyFragment)

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
