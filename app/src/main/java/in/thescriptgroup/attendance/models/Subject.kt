package `in`.thescriptgroup.attendance.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class Subject(
    val subject: String = "",
    val th_present: Int,
    val th_total: Int,
    val tu_present: Int,
    val tu_total: Int,
    val pr_present: Int,
    val pr_total: Int,
    val in_present: Int,
    val in_total: Int
)