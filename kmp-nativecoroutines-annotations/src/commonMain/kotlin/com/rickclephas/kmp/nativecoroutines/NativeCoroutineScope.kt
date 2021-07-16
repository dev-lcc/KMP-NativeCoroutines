package com.rickclephas.kmp.nativecoroutines

/**
 * Identifies the `CoroutineScope` property that will be used by
 * the autogenerated NativeCoroutines functions and properties.
 */
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class NativeCoroutineScope