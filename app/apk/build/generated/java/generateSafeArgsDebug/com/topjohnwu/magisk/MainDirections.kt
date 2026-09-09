package com.topjohnwu.magisk

import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import androidx.`annotation`.CheckResult
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class MainDirections private constructor() {
  private data class ActionFlashFragment(
    public val action: String,
    public val additionalData: Uri? = null,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_flashFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        result.putString("action", this.action)
        if (Parcelable::class.java.isAssignableFrom(Uri::class.java)) {
          result.putParcelable("additional_data", this.additionalData as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Uri::class.java)) {
          result.putSerializable("additional_data", this.additionalData as Serializable?)
        }
        return result
      }
  }

  private data class ActionActionFragment(
    public val id: String,
    public val name: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_actionFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("id", this.id)
        result.putString("name", this.name)
        return result
      }
  }

  public companion object {
    @CheckResult
    public fun actionHomeFragment(): NavDirections = ActionOnlyNavDirections(R.id.action_homeFragment)

    @CheckResult
    public fun actionSuperuserFragment(): NavDirections = ActionOnlyNavDirections(R.id.action_superuserFragment)

    @CheckResult
    public fun actionLogFragment(): NavDirections = ActionOnlyNavDirections(R.id.action_logFragment)

    @CheckResult
    public fun actionModuleFragment(): NavDirections = ActionOnlyNavDirections(R.id.action_moduleFragment)

    @CheckResult
    public fun actionFlashFragment(action: String, additionalData: Uri? = null): NavDirections = ActionFlashFragment(action, additionalData)

    @CheckResult
    public fun actionActionFragment(id: String, name: String): NavDirections = ActionActionFragment(id, name)
  }
}
