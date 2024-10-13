package com.ubaya.bernadya.Bank.Play

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
        GameClass(
            id = 4,
            nama = "League of Legends",
            desc = "League of Legends (LoL) is a fast-paced multiplayer online battle arena (MOBA) game where players control unique champions and compete in teams of five to destroy the enemy’s Nexus. It combines strategy, teamwork, and quick reflexes, making it a staple in the competitive gaming scene.",
            gambar = R.drawable.lol_image,
            achievement = listOf(
                AchievementClass("Juara 1 World Championship", 2022),
                AchievementClass("Juara 2 MSI", 2023),
                AchievementClass("Juara 1 LCK Summer", 2023),
                AchievementClass("Juara 3 World Championship", 2024)
            ),
            team = listOf(
                TeamClass(
                    namaTeam = "T1",
                    namaMember = listOf(
                        MemberClass("Faker", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Zeus", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("Oner", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Gumayusi", "https://i.pravatar.cc/300?img=18"),
                        MemberClass("Keria", "https://i.pravatar.cc/300?img=12")
                    )
                ),
                TeamClass(
                    namaTeam = "G2 Esports",
                    namaMember = listOf(
                        MemberClass("Caps", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("Jankos", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("BrokenBlade", "https://i.pravatar.cc/300?img=12"),
                        MemberClass("Flakked", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Targamas", "https://i.pravatar.cc/300?img=18")
                    )
                )
            )
        ),
        GameClass(
            id = 5,
            nama = "Call of Duty",
            desc = "Call of Duty (COD) is a first-person shooter that emphasizes fast-paced, action-packed gameplay. Known for its intense multiplayer modes and realistic graphics, COD has been a dominant force in the FPS genre with various game modes and large-scale battles.",
            gambar = R.drawable.cod_image,
            achievement = listOf(
                AchievementClass("Juara 1 COD World League", 2023),
                AchievementClass("Juara 2 COD Mobile World Championship", 2023),
                AchievementClass("Juara 1 CDL Championship", 2022),
                AchievementClass("Juara 3 COD Championship", 2024)
            ),
            team = listOf(
                TeamClass(
                    namaTeam = "OpTic Gaming",
                    namaMember = listOf(
                        MemberClass("Scump", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Dashy", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("iLLeY", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Shotzzy", "https://i.pravatar.cc/300?img=18"),
                        MemberClass("Ghosty", "https://i.pravatar.cc/300?img=12")
                    )
                ),
                TeamClass(
                    namaTeam = "FaZe Clan",
                    namaMember = listOf(
                        MemberClass("aBeZy", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("Simp", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Cellium", "https://i.pravatar.cc/300?img=12"),
                        MemberClass("Arcitys", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Prestinni", "https://i.pravatar.cc/300?img=18")
                    )
                )
            )
        ),
        GameClass(
            id = 6,
            nama = "Fortnite",
            desc = "Fortnite is a battle royale game where players compete to be the last person standing on an island. With its unique building mechanics, vibrant graphics, and frequent in-game events, Fortnite has become a cultural phenomenon and a top choice in competitive gaming.",
            gambar = R.drawable.fortnite_image,
            achievement = listOf(
                AchievementClass("Juara 1 Fortnite World Cup", 2022),
                AchievementClass("Juara 2 FNCS Grand Royale", 2023),
                AchievementClass("Juara 3 Fortnite Championship Series", 2022),
                AchievementClass("Juara 1 FNCS Invitational", 2024)
            ),
            team = listOf(
                TeamClass(
                    namaTeam = "Team Liquid Fortnite",
                    namaMember = listOf(
                        MemberClass("Benjyfishy", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Mongraal", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("Mitro", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Aqua", "https://i.pravatar.cc/300?img=18"),
                        MemberClass("Wolfiez", "https://i.pravatar.cc/300?img=12")
                    )
                ),
                TeamClass(
                    namaTeam = "NRG Fortnite",
                    namaMember = listOf(
                        MemberClass("Clix", "https://i.pravatar.cc/300?img=59"),
                        MemberClass("UnknownxArmy", "https://i.pravatar.cc/300?img=15"),
                        MemberClass("Zayt", "https://i.pravatar.cc/300?img=12"),
                        MemberClass("Dubs", "https://i.pravatar.cc/300?img=58"),
                        MemberClass("Saf", "https://i.pravatar.cc/300?img=18")
                    )
                )
            )
        )

                    //tinggal tambah lagi klo mau ditambahin, tinggal tambah koma setelah tutup kurung di atas ini
    )
}