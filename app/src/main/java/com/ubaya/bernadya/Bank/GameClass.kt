package com.ubaya.bernadya.Bank

data class GameClass(val id: Int,
                     val nama: String,
                     val desc: String,
                     val gambar: Int,
                     val achievement: List<AchievementClass>,
                     val team: List<TeamClass>)
