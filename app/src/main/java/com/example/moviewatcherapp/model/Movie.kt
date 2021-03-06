package com.example.moviewatcherapp.model

import android.os.Parcelable
import com.example.moviewatcherapp.R
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
        val id: Int = 25,
        val title: String = "",
        val originalTitle: String = "",
        val releaseDate: String = "",
        val genre: Genre = Genre.UNKNOWN,
        val poster: Int = 0,
        val video: Boolean = true,
        val descriptionOfMovie: String = ""
) : Parcelable

fun getDefaultGenre() = Genre.UNKNOWN

fun getMoviesList() = listOf(
            Movie(
                    1,
                    "Французский диспетчер",
                    "The French Dispatch",
                    "2021",
                    Genre.COMEDY,
                    R.drawable.french_poster,
                    true,
                    "Альманах о работе американской редакции во французской газете"

            ),
            Movie(
                    2,
                    "Манхэттен",
                    "Manhattan",
                    "1974",
                    Genre.DRAMA,
                    R.drawable.manhattan,
                    true,
                    "Желая бросить опостылевшую работу и привычный круг знакомств, телевизионный сценарист заводит роман с любовницей своего друга.\n" +
                            "И вновь оказывается в замкнутом круге лжи, лицемерия, пустословия. Неожиданно для себя он делает открытие, что надо больше доверять людям"
            ),
            Movie(
                    3,
                    "Криминальное Чтиво",
                    "Pulp Fiction",
                    "1994",
                    Genre.CRIME,
                    R.drawable.pulp_fiction,
                    true,
                    " Двое бандитов Винсент Вега и Джулс Винфилд ведут философские беседы в перерывах между разборками и решением проблем с должниками криминального\n" +
                            "босса Марселласа Уоллеса. В первой истории Винсент проводит незабываемый вечер с женой Марселласа Мией. Во второй рассказывается о боксёре Бутче Кулидже, купленном Уоллесом,\n" +
                            "чтобы сдать бой. В третьей истории Винсент и Джулс по нелепой случайности попадают в неприятности."
            ),
            Movie(
                    4,
                    "Сломанные цветы",
                    "Broken Flowers",
                    "2005",
                    Genre.DRAMA,
                    R.drawable.broken_flowers,
                    true,
                    "Утро для престарелого «Дон Жуана» Дона Джонстона начинается с того, что от него уходит очередная подружка Шерри, потеряв веру в то, что с этим человеком можно создать семью. Оставшись в одиночестве,\n" +
                            "разбирая почту, Дон обнаруживает розовый конверт. В письме неизвестная сообщает, что двадцать лет назад, расставшись с Доном, обнаружила, что беременна. Показав письмо другу Уинстону - любителю детективов - Дон получил от того совет: вспомнить всех своих подружек,\n" +
                            "которые у него были 20 лет назад и посетить их, выяснив, какая из них родила ему сына."
            ),
            Movie(
                    5,
                    "Твин Пикс",
                    "Twin Peaks",
                    "1990",
                    Genre.THRILLER,
                    R.drawable.twin_peaks,
                    true,
                    "История начинается с известия о находке обнаженного тела старшеклассницы Лоры Палмер, завёрнутого в полиэтилен и выброшенного волнами на берег озера.\n" +
                            "В ходе расследования перед внимательными взглядами агента Купера, шерифа Трумана и его помощников проходят разные жители Твин Пикс.\n" +
                            "Постепенно зритель открывает для себя темную и страшную сторону жизни обитателей на первый взгляд тихого и мирного городка."
            ),
            Movie(
                    6,
                    "Мой сосед Тоторо",
                    "Tonari no Totoro",
                    "1988",
                    Genre.ANIMATION,
                    R.drawable.totoro,
                    true,
                    "Сестры Сацуки и Мэй переезжают вместе с папой в деревенский дом. Однажды девочки обнаруживают, что по соседству с ними живут лесные духи — хранители леса\n" +
                            "во главе со своим могущественным, но добрым повелителем Тоторо. Постепенно Тоторо становится другом девочек, помогая им в их повседневных приключениях"
            )
    )

