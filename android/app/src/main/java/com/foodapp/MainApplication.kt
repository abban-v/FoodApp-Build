package com.foodapp

import android.app.Application
import com.facebook.react.PackageList
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import com.facebook.soloader.SoLoader
import com.foodapp.BuildConfig

class MainApplication : Application(), ReactApplication {

    private val mReactNativeHost: ReactNativeHost =
        object : ReactNativeHost(this) {
            override fun getUseDeveloperSupport(): Boolean {
                return BuildConfig.DEBUG
            }

            override fun getPackages(): List<ReactPackage> {
                return PackageList(this).packages.apply {
                    // Add extra packages here if needed
                }
            }

            override fun getJSMainModuleName(): String {
                return "index"
            }
        }

    override fun getReactNativeHost(): ReactNativeHost {
        return mReactNativeHost
    }

    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, false)
    }

    /**
     * Helper to check if new architecture is enabled
     */
    fun isNewArchitectureEnabled(): Boolean {
        return BuildConfig.IS_NEW_ARCHITECTURE_ENABLED
    }

    /**
     * Helper to check if Hermes is enabled
     */
    fun isHermesEnabled(): Boolean {
        return BuildConfig.IS_HERMES_ENABLED
    }
}
