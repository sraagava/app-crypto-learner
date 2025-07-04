package com.appswarehouse.android.apps.cryptolearner.domain.util

import com.appswarehouse.android.apps.cryptolearner.common.Response
import retrofit2.HttpException

suspend fun <T> safeDataCall(
    block: suspend () -> T
): Response<T> {
    return try {
        Response.Success(block())
    } catch (e: HttpException) {
        when (val statusCode = e.code()) {
            in 400..499 -> {
                Response.Error("Client side error occurred. $statusCode: ${e.message}")
            }

            else -> {
                Response.Error("Unexpected error occurred.")
            }
        }
    } catch (_: Exception) {
        Response.Error("Cannot connect to our servers. Please check your internet connection before retrying")
    }
}