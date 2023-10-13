package com.example.superheroe.data

import com.example.superhero.R
import com.example.superheroes.model.Superhero

object DataSource {

    val heroes = listOf(
        Superhero(R.drawable.nick, R.string.hero1, R.string.vuln1, R.string.description1, R.string.vulndetail1),
        Superhero(R.drawable.reality_protector, R.string.hero2, R.string.vuln2, R.string.description2, R.string.vulndetail2),
        Superhero(R.drawable.andre, R.string.hero3, R.string.vuln3, R.string.description3, R.string.vulndetail3),
        Superhero(R.drawable.benjamin, R.string.hero4, R.string.vuln4, R.string.description4, R.string.vulndetail4),
        Superhero(R.drawable.maru, R.string.hero5, R.string.vuln5, R.string.description5, R.string.vulndetail5),
        Superhero(R.drawable.yasmine, R.string.hero6, R.string.vuln6, R.string.description6, R.string.vulndetail6)
    )

}