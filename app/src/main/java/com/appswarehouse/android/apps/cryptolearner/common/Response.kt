package com.appswarehouse.android.apps.cryptolearner.common

sealed class Response<out T> {
    class Loading<out T> : Response<T>()
    class Error<out T>(val message: String) : Response<T>()
    class Success<out T>(val data: T) : Response<T>()
}