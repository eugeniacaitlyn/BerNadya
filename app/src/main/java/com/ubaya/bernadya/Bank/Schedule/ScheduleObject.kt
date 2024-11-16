package com.ubaya.bernadya.Bank.Schedule

import com.ubaya.bernadya.Bank.Play.GameObject
import com.ubaya.bernadya.R
import java.sql.Date

object ScheduleObject {
    val schedule = listOf(
        ScheduleClass(
            id = 1,
            event = "Regional Qualifier - Valorant",
            date = Date(2024, 9, 5),
            location = "Los Angeles, CA",
            gambarArena = R.drawable.img_arena_valo,
            desc = "The Regional Qualifier for Valorant brings together top teams from different regions to compete for a spot in the international championship. Teams will battle it out in a series of best-of-three matches, showcasing their strategic play and precision shooting skills.",
            gameClass = GameObject.games[0],
            teamGame = GameObject.games[0].team[0],
            imgArena = "https://cdn1-production-images-kly.akamaized.net/-d3zO776rSlw0XYvy2ICAo8P_P4=/1200x900/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/2370963/original/073884700_1538301627-esports-02.jpg"
        ),
        ScheduleClass(
            id = 2,
            event = "League of Legends Workshop",
            date = Date(2024, 9, 10),
            location = "Los Angeles, CB",
            gambarArena = R.drawable.img_arena_lol,
            desc = "This workshop is designed for both new and experienced League of Legends players. Participants will learn about champion mechanics, macro play, and teamwork strategies from professional coaches. It's a great opportunity to improve your skills and network with other players.",
            gameClass = GameObject.games[3],
            teamGame = GameObject.games[3].team[0],
            imgArena = "https://images.adsttc.com/media/images/6597/dd76/9936/3f1b/2dce/fae7/newsletter/populous-reveals-design-for-a-new-gaming-and-esports-arena-in-saudi-arabia_2.jpg?1704451662"
        ),
        ScheduleClass(
            id = 3,
            event = "Call of Duty Championship",
            date = Date(2024, 10, 7),
            location = "Los Angeles, CC",
            gambarArena = R.drawable.img_arena_cod,
            desc = "The Call of Duty Championship is the ultimate test of skill for top COD teams. Competing for massive prizes and prestige, teams will engage in high-intensity matches across various modes, from Search and Destroy to Team Deathmatch.",
            gameClass = GameObject.games[4],
            teamGame = GameObject.games[4].team[0],
            imgArena = "https://images.adsttc.com/media/images/5ef1/68f8/b357/6529/f500/0347/large_jpg/yc8m6r-A_jpeg.jpg?1592879340"
        ),
        ScheduleClass(
            id = 4,
            event = "Dota2 Livestream",
            date = Date(2024, 11, 11),
            location = "Los Angeles, CD",
            gambarArena = R.drawable.img_arena_dota,
            desc = "Join us for a live broadcast of the Dota2 tournament featuring some of the best teams in the world. The livestream will cover the entire event, including in-depth analysis, commentary, and behind-the-scenes interviews with players and coaches.",
            gameClass = GameObject.games[2],
            teamGame = GameObject.games[2].team[0],
            imgArena = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQcAWfWtXIQy7blw1tD2D396w3-oPMEC6X9bw&s"
        ),
        ScheduleClass(
            id = 5,
            event = "Fortnite Invitational",
            date = Date(2024, 12, 4),
            location = "Los Angeles, CE",
            gambarArena = R.drawable.img_arena_fortnite,
            desc = "The Fortnite Invitational gathers top players from around the world to compete in an epic battle royale event. With high-stakes matches and unique in-game events, this is a must-watch competition for all Fortnite fans.",
            gameClass = GameObject.games[5],
            teamGame = GameObject.games[5].team[0],
            imgArena = "https://thumb.viva.co.id/media/frontend/thumbs3/2021/11/10/618be539b11f5-ilustrasi-turnamen-esports_1265_711.jpg"
        )



        //tinggal tambah lagi klo mau ditambahin, tinggal tambah koma setelah tutup kurung di atas ini
    )
}