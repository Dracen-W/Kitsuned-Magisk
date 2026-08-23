package com.topjohnwu.magisk.ui.deny

import android.net.Uri
import androidx.`annotation`.CheckResult
import androidx.navigation.NavDirections
import com.topjohnwu.magisk.MainDirections
import kotlin.String

public class DenyListFragmentDirections private constructor() {
  public companion object {
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
