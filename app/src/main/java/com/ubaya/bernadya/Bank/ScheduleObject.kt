package com.ubaya.bernadya.Bank

import com.ubaya.bernadya.R
import java.sql.Date

object ScheduleObject {
    val gamePlaceholder = GameClass(0,"","",0,listOf(),listOf())
    val schedule = listOf(
        ScheduleClass(
            id = 1,
            event = "Regional Qualifier - Valorant",
            date = Date(2024, 9, 5),
            location = "Los Angeles, CA",
            desc = "The Regional Qualifier for Valorant brings together top teams from different regions to compete for a spot in the international championship. Teams will battle it out in a series of best-of-three matches, showcasing their strategic play and precision shooting skills.",
            gameClass = gamePlaceholder
        ),
        ScheduleClass(
            id = 2,
            event = "League of Legends Workshop",
            date = Date(2024, 9, 10),
            location = "Los Angeles, CB",
            desc = "This workshop is designed for both new and experienced League of Legends players. Participants will learn about champion mechanics, macro play, and teamwork strategies from professional coaches. It's a great opportunity to improve your skills and network with other players.",
            gameClass = gamePlaceholder
        ),
        ScheduleClass(
            id = 3,
            event = "Call of Duty Championship",
            date = Date(2024, 10, 7),
            location = "Los Angeles, CC",
            desc = "The Call of Duty Championship is the ultimate test of skill for top COD teams. Competing for massive prizes and prestige, teams will engage in high-intensity matches across various modes, from Search and Destroy to Team Deathmatch.",
            gameClass = gamePlaceholder
        ),
        ScheduleClass(
            id = 4,
            event = "Dota2 Livestream",
            date = Date(2024, 11, 11),
            location = "Los Angeles, CD",
            desc = "Join us for a live broadcast of the Dota2 tournament featuring some of the best teams in the world. The livestream will cover the entire event, including in-depth analysis, commentary, and behind-the-scenes interviews with players and coaches.",
            gameClass = gamePlaceholder
        ),
        ScheduleClass(
            id = 5,
            event = "Fortnite Invitational",
            date = Date(2024, 12, 4),
            location = "Los Angeles, CE",
            desc = "The Fortnite Invitational gathers top players from around the world to compete in an epic battle royale event. With high-stakes matches and unique in-game events, this is a must-watch competition for all Fortnite fans.",
            gameClass = gamePlaceholder
        )



        //tinggal tambah lagi klo mau ditambahin, tinggal tambah koma setelah tutup kurung di atas ini
    )
}