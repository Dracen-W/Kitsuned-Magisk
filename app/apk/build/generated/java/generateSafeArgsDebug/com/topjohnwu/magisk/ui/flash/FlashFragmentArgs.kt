package com.topjohnwu.magisk.ui.flash

import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class FlashFragmentArgs(
  public val action: String,
  public val additionalData: Uri? = null,
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("action", this.action)
    if (Parcelable::class.java.isAssignableFrom(Uri::class.java)) {
      result.putParcelable("additional_data", this.additionalData as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Uri::class.java)) {
      result.putSerializable("additional_data", this.additionalData as Serializable?)
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("action", this.action)
    if (Parcelable::class.java.isAssignableFrom(Uri::class.java)) {
      result.set("additional_data", this.additionalData as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Uri::class.java)) {
      result.set("additional_data", this.additionalData as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): FlashFragmentArgs {
      bundle.setClassLoader(FlashFragmentArgs::class.java.classLoader)
      val __action : String?
      if (bundle.containsKey("action")) {
        __action = bundle.getString("action")
        if (__action == null) {
          throw IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue")
      }
      val __additionalData : Uri?
      if (bundle.containsKey("additional_data")) {
        if (Parcelable::class.java.isAssignableFrom(Uri::class.java) || Serializable::class.java.isAssignableFrom(Uri::class.java)) {
          __additionalData = bundle.get("additional_data") as Uri?
        } else {
          throw UnsupportedOperationException(Uri::class.java.name + " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __additionalData = null
      }
      return FlashFragmentArgs(__action, __additionalData)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): FlashFragmentArgs {
      val __action : String?
      if (savedStateHandle.contains("action")) {
        __action = savedStateHandle["action"]
        if (__action == null) {
          throw IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue")
      }
      val __additionalData : Uri?
      if (savedStateHandle.contains("additional_data")) {
        if (Parcelable::class.java.isAssignableFrom(Uri::class.java) || Serializable::class.java.isAssignableFrom(Uri::class.java)) {
          __additionalData = savedStateHandle.get<Uri?>("additional_data")
        } else {
          throw UnsupportedOperationException(Uri::class.java.name + " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __additionalData = null
      }
      return FlashFragmentArgs(__action, __additionalData)
    }
  }
}
