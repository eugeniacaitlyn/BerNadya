package com.ubaya.bernadya.Bank

import com.ubaya.bernadya.R

object GameObject {
    val games = listOf(
        GameClass(
            id = 1,
            nama = "VALORANT",
            desc = "VALORANT is a tactical first-person shooter from Riot Games that combines precise gunplay with unique character abilities. Players engage in strategic, team-based matches where that must complete objectives and outsmart opponents to win.",
            gambar = R.drawable.valorant_image,
            achievement = listOf(
                AchievementClass("Juara 1 Valorant Championship Indonesia", 2023),
                AchievementClass("Juara 3 VCT International", 2023),
                AchievementClass("Juara 2 VCT Sea", 2022),
                AchievementClass("Juara 1 Valorant Tournament", 2024)
            ),
            team = listOf(
                TeamClass(
                    namaTeam = "Bigetron VALORANT",
                    namaMember = listOf(
                        MemberClass("Member 1", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Member 2", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("Member 3", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Member 4", "https://i.pravatar.cc/300?img=18"),
                        MemberClass("Member 5", "https://i.pravatar.cc/300?img=12")
                    )
                ),
                TeamClass(
                    namaTeam = "EVOS VALORANT",
                    namaMember = listOf(
                        MemberClass("Member 1", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("Member 2", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Member 3", "https://i.pravatar.cc/300?img=12"),
                        MemberClass("Member 4", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Member 5", "https://i.pravatar.cc/300?img=18")
                    )
                )
            )
        ),
        GameClass(
            id = 2,
            nama = "Mobile Legends: Bang Bang",
            desc = "Mobile Legends: Bang Bang is a mobile multiplayer online battle arena game developed and published by Chinese developer Moonton, a subsidiary of ByteDance. The game was released in 2016 and grew in popularity, most prominently in Southeast Asia.",
            gambar = R.drawable.mlbbimage,
            achievement = listOf(
                AchievementClass("Juara 2 Mobile Legends Championship Indonesia", 2023),
                AchievementClass("Juara 3 MLBB Champions", 2021),
                AchievementClass("Juara 2 MLBB Community Tournament", 2022),
                AchievementClass("Juara 1 MLBB World Tournament", 2024)
            ),
            team = listOf(
                TeamClass(
                    namaTeam = "Bigetron MLBB",
                    namaMember = listOf(
                        MemberClass("Member 1", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Member 2", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("Member 3", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Member 4", "https://i.pravatar.cc/300?img=18"),
                        MemberClass("Member 5", "https://i.pravatar.cc/300?img=12")
                    )
                ),
                TeamClass(
                    namaTeam = "EVOS MLBB",
                    namaMember = listOf(
                        MemberClass("Member 1", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("Member 2", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Member 3", "https://i.pravatar.cc/300?img=12"),
                        MemberClass("Member 4", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Member 5", "https://i.pravatar.cc/300?img=18")
                    )
                )
            )
        ),
        GameClass(
            id = 3,
            nama = "DOTA 2",
            desc = "Dota 2 is a 2013 multiplayer online battle arena video game by Valve. The game is a sequel to Defense of the Ancients, a community-created mod for Blizzard Entertainment's Warcraft III: Reign of Chaos.",
            gambar = R.drawable.dota2image,
            achievement = listOf(
                AchievementClass("Juara 1 Valorant Championship Indonesia", 2023),
                AchievementClass("Juara 3 VCT International", 2023),
                AchievementClass("Juara 2 VCT Sea", 2022),
                AchievementClass("Juara 1 Valorant Tournament", 2024)
            ),
            team = listOf(
                TeamClass(
                    namaTeam = "Bigetron DOTA 2",
                    namaMember = listOf(
                        MemberClass("Member 1", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Member 2", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("Member 3", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Member 4", "https://i.pravatar.cc/300?img=18"),
                        MemberClass("Member 5", "https://i.pravatar.cc/300?img=12")
                    )
                ),
                TeamClass(
                    namaTeam = "EVOS DOTA 2",
                    namaMember = listOf(
                        MemberClass("Member 1", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("Member 2", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Member 3", "https://i.pravatar.cc/300?img=12"),
                        MemberClass("Member 4", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Member 5", "https://i.pravatar.cc/300?img=18")
                    )
                )
            )
        ),

        //tinggal tambah lagi klo mau ditambahin, tinggal tambah koma setelah tutup kurung di atas ini
    )
}