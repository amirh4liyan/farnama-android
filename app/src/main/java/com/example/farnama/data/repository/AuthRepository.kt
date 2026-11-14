package com.example.farnama.data.repository

import kotlinx.coroutines.delay

class AuthRepository {
    // فعلاً فیک: وقتی API سرور آماده شد، اینجا Retrofit می‌آید
    suspend fun login(username: String, password: String): Result<String> {
        delay(800)
        return if (username.isNotBlank() && password.length >= 4) {
            Result.success("fake-token")
        } else {
            Result.failure(Exception("نام کاربری یا رمز عبور نادرست است"))
        }
    }
}