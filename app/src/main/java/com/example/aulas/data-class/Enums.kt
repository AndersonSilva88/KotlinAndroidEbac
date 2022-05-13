package com.example.aulas.data

fun main() {
    var season: Season = Season.FALL
    season = Season.SPRING


    //println(season.translate)
   //println(season)
   //season.hello()
   /*
    when(season) {
        Season.WINTER -> println("É inverno")
        Season.SPRING -> println("É primavera")
    }
        **/
    SchedulerHandler.currentSeason()
    SchedulerHandler.setSeason(Season.SPRING)
    SchedulerHandler.currentSeason()

    val otherClasse = OtherClasse()
    SchedulerHandler.currentSeason()
    SchedulerHandler.setSeason(Season.SUMMER)
    otherClasse.printCurrentSeason()

}

class OtherClasse() {
    init {
        SchedulerHandler.setSeason(Season.FALL)
    }
    fun printCurrentSeason() = SchedulerHandler.currentSeason()
}

//singleton
object SchedulerHandler{
    private var season: Season = Season.WINTER

    fun setSeason(newSeason: Season) {
        this.season = newSeason
    }

    fun currentSeason() = println(season)
}

