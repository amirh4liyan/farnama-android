package com.example.farnama.data.repository

import com.example.farnama.model.Association
import kotlinx.coroutines.delay

class AssociationRepository {
    // فعلاً فیک: بعداً با API سرور و Room جایگزین می‌شود
    suspend fun getAssociations(): List<Association> {
        delay(500)
        return listOf(
            Association(1, "انجمن علمی مهندسی کامپیوتر", "انجمن علمی", "برگزاری کارگاه‌ها و مسابقات برنامه‌نویسی", 120),
            Association(2, "شورای صنفی دانشجویان", "شورای صنفی", "پیگیری مسائل رفاهی و آموزشی دانشجویان", 15),
            Association(3, "انجمن علمی برق", "انجمن علمی", "دوره‌ها و بازدیدهای علمی برای دانشجویان برق", 85),
            Association(4, "کانون فرهنگی و هنری", "تشکل فرهنگی", "رویدادهای هنری، موسیقی و تئاتر", 60)
        )
    }
}