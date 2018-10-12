package com.example

import okhttp3.mockwebserver.MockResponse

object Response {

    val teamsSuccessResponse = MockResponse().setResponseCode(200).setBody("""

        {
            "teams": [
                        {
                            "idTeam": "134221",
                            "idSoccerXML": "676",
                            "intLoved": null,
                            "strTeam": "Alaves",
                            "strTeamShort": null,
                            "strAlternate": "Deportivo Alavés",
                            "intFormedYear": "1921",
                            "strSport": "Soccer",
                            "strLeague": "Spanish La Liga",
                            "idLeague": "4335",
                            "strDivision": null,
                            "strManager": "Luis Zubeldía",
                            "strStadium": "Mendizorroza",
                            "strKeywords": "",
                            "strRSS": "",
                            "strStadiumThumb": "https://www.thesportsdb.com/images/media/team/stadium/vwtxsr1472387761.jpg",
                            "strStadiumDescription": "Estadio Mendizorrotza is a football stadium in Vitoria-Gasteiz, Spain. The stadium is the home ground of Deportivo Alavés.\r\n\r\nOpened on 27 April 1924, it is currently the third oldest football stadium in the Spanish Professional Football, behind El Molinón and Mestalla.\r\n\r\nDuring its history, the stadium had several renovations. The most important one was the expansion made in 1999, making new stands in the corners for increasing the capacity of the stadium to the current 19,840 seats.",
                            "strStadiumLocation": "Vitoria",
                            "intStadiumCapacity": "19840",
                            "strWebsite": "www.alaves.com",
                            "strFacebook": "",
                            "strTwitter": "",
                            "strInstagram": "",
                            "strDescriptionEN": "Deportivo Alavés, S.A.D. ; (Sporting Alavés), usually abbreviated to Alavés, is a Spanish football club based in Vitoria-Gasteiz, Álava, in the autonomous community of the Basque Country. Founded in 23rd June 1921 as Sport Fiend's Club, it plays in the highest football category of The Liga Nacional de Fútbol Profesional, La Liga, since the 2016–17 season.\r\n\r\nIt is recognized as the third best team in the Basque Country following Athletic Club of Bilbao and Real Sociedad de Futbol of San Sebastián. Its biggest success was in 2001 when, in the year of its debut in European competition, it was one of the finalists in the 2001 UEFA Cup Final against Liverpool, being defeated 5–4 by golden goal. In 2017, the club reached the final of the Copa del Rey, losing out 3–1 to Barcelona.\r\n\r\nThe team's home kit is blue and white-striped shirt, blue shorts and white socks.It holds home matches at the 19,800-seater Mendizorrotza Stadium and besides counts on other facilities located in Ibaia dedicated to training.",
                            "strDescriptionDE": null,
                            "strDescriptionFR": null,
                            "strDescriptionCN": null,
                            "strDescriptionIT": null,
                            "strDescriptionJP": null,
                            "strDescriptionRU": null,
                            "strDescriptionES": "El Deportivo Alavés, S.A.D es un club de fútbol español con sede en la ciudad de Vitoria. Fue fundado en el año 1921 y actualmente juega en la Segunda División de España. Su mayor éxito deportivo tuvo lugar en 2001, cuando, en el año de su debut en competición europea, fue finalista de la Copa de la UEFA ante el Liverpool FC, siendo derrotado por gol de oro (5-4).",
                            "strDescriptionPT": null,
                            "strDescriptionSE": null,
                            "strDescriptionNL": null,
                            "strDescriptionHU": null,
                            "strDescriptionNO": null,
                            "strDescriptionIL": null,
                            "strDescriptionPL": null,
                            "strGender": "Male",
                            "strCountry": "Spain",
                            "strTeamBadge": "https://www.thesportsdb.com/images/media/team/badge/vwqswq1420325494.png",
                            "strTeamJersey": "https://www.thesportsdb.com/images/media/team/jersey/tprvqx1472752261.png",
                            "strTeamLogo": "https://www.thesportsdb.com/images/media/team/logo/iq6a8b1527934454.png",
                            "strTeamFanart1": "https://www.thesportsdb.com/images/media/team/fanart/wrpsts1472387855.jpg",
                            "strTeamFanart2": "https://www.thesportsdb.com/images/media/team/fanart/xyuqvr1472388029.jpg",
                            "strTeamFanart3": "https://www.thesportsdb.com/images/media/team/fanart/xqwuyy1472388289.jpg",
                            "strTeamFanart4": "https://www.thesportsdb.com/images/media/team/fanart/fp357p1527863440.jpg",
                            "strTeamBanner": "https://www.thesportsdb.com/images/media/team/banner/3axoi21504718301.jpg",
                            "strYoutube": "",
                            "strLocked": "unlocked"
                        },
                        {
                            "idTeam": "133727",
                            "idSoccerXML": "143",
                            "intLoved": null,
                            "strTeam": "Ath Bilbao",
                            "strTeamShort": null,
                            "strAlternate": "Athletic Bilbao",
                            "intFormedYear": "1898",
                            "strSport": "Soccer",
                            "strLeague": "Spanish La Liga",
                            "idLeague": "4335",
                            "strDivision": null,
                            "strManager": "José Ángel Ziganda",
                            "strStadium": "San Mamés",
                            "strKeywords": "",
                            "strRSS": "",
                            "strStadiumThumb": "https://www.thesportsdb.com/images/media/team/stadium/rsppwx1423700155.jpg",
                            "strStadiumDescription": "San Mamés (also known as Nuevo San Mamés or San Mames Barria) is an all-seater football stadium in Bilbao, Basque Country, Spain. Inaugurated on 16 September 2013, the stadium replaced the \"old\" San Mamés as the home of Athletic Bilbao.",
                            "strStadiumLocation": "Bilbao, Vizcaya",
                            "intStadiumCapacity": "53289",
                            "strWebsite": "www.athletic-club.net/web/main.asp",
                            "strFacebook": "www.facebook.com/athleticclub",
                            "strTwitter": "www.twitter.com/AthleticClub",
                            "strInstagram": "instagram.com/athleticclub?ref=badge",
                            "strDescriptionEN": "Athletic Club (Basque: Athletic Kluba), also commonly known as Athletic Bilbao (Basque: Bilboko Athletic Kluba / Spanish: Athletic de Bilbao), is a professional football club, based in Bilbao, Basque Country, Spain.\r\n\r\nThey are known as Los Leones (The Lions) because their stadium was built near a church called San Mamés (Saint Mammes). Mammes was a semi-legendary early Christian thrown to the lions by the Romans. Mammes pacified the lions and was later made a saint.\r\n\r\nThe club is one of three founding members of the Primera División that have never been relegated from the top division, the others being Real Madrid and Barcelona. Athletic have won La Liga on eight occasions, fourth most in the history of the league. In the table of Copa del Rey titles, Athletic is second only to Barcelona, having won it 24 times (per the team's official records; the Royal Spanish Football Federation (RFEF) recognizes 23 victories). The club also has one of the most successful women's teams in Spain, which has won five championships in the Primera División Femenina.\r\n\r\nThe club is known for its cantera policy of bringing young Basque players through the ranks, as well as recruiting top Basque players from other clubs (like Joseba Etxeberria and Javi Martínez). Athletic's official policy is signing professional players native to or trained in football in the greater Basque Country, including Biscay, Gipuzkoa, Álava and Navarre (in Spain); and Labourd, Soule and Lower Navarre (in France). Since its foundation, Athletic has played exclusively with players meeting the criteria to be deemed as Basque players, and has been one of the most successful teams of La Liga. This can be seen as a unique case in European football; it has gained Athletic both admirers and critics. The club has been praised for promoting home grown players and club loyalty. Athletic is one of only three professional clubs in Spain in La Liga (the others being Real Madrid, and Barcelona) that is not a sports corporation; it is owned and operated by its club members.\r\n\r\nAthletic's main rivals are Real Sociedad, against whom it plays the Basque derby, and Real Madrid, due to sport and political rivalry.",
                            "strDescriptionDE": null,
                            "strDescriptionFR": null,
                            "strDescriptionCN": null,
                            "strDescriptionIT": null,
                            "strDescriptionJP": null,
                            "strDescriptionRU": null,
                            "strDescriptionES": "El Athletic Club es un club de fútbol de la villa de Bilbao, País Vasco, España. Fue fundado en 1898 y es, junto al Real Madrid Club de Fútbol y al Fútbol Club Barcelona, el único club que ha disputado todas las ediciones de la Primera División de España desde su creación en 1928. A su vez, es uno de los cuatro únicos clubes profesionales de España que no es una sociedad anónima deportiva, de manera que la propiedad del club recae en sus socios.7 8 Se lo conoce ampliamente como Athletic de Bilbao, y en algunas ocasiones con el nombre de la ciudad, Bilbao, o incluso como Atlético de Bilbao.9 10 Estos dos últimos términos resultan molestos para gran parte de los aficionados del club, ya que el primero no tiene ninguna relación con el nombre real del club, y el segundo porque fue el nombre impuesto al club durante la dictadura franquista.\r\n\r\nUna de las particularidades más representativas y originales del club vasco es su tradición de jugar únicamente con jugadores nacidos o formados futbolísticamente en Euskal Herria, tradición que ha mantenido casi desde sus inicios.1 También es reconocido históricamente por ser un club de cantera y trabajar en la formación de jóvenes futbolistas, por tanto, esta es la principal fuente de abastecimiento de jugadores para el primer equipo.11\r\n\r\nLa práctica totalidad de sus logros se ha conseguido en las competiciones nacionales, donde está considerado un club histórico dentro del fútbol español.12 Buena parte de su prestigio lo ha conseguido en la Copa del Rey, que ha conquistado en veinticuatro ocasiones.13 A fecha de 2014, es el segundo equipo español con más campeonatos de Copa, con dos títulos menos que el Fútbol Club Barcelona y con cinco más que el tercero, el Real Madrid.14\r\n\r\nSe ha proclamado campeón de la liga española en ocho ocasiones y es el cuarto club en España con más estandartes en esta competición tras Real Madrid, Barcelona y Atlético de Madrid.15 Al término de la temporada 2013/14, ocupa el quinto lugar en la clasificación histórica de la Primera División, habiendo sido tercero hasta la temporada 2009/10, momento en el cual fue superado por el Valencia C. F., y cuarto hasta la 2013/14, siendo superado en este caso por el Atlético de Madrid. Asimismo, ostenta el récord de mayor goleada en la historia de la liga, al haber vencido al F. C. Barcelona por 12-1 en la temporada 1930/31.\r\n\r\nLos mayores logros continentales del club vizcaíno han sido, hasta 2014, dos subcampeonatos de la UEFA Europa League conseguidos en las temporadas 1976/77 y 2011/12.16 La mayor goleada del Athletic en competición continental fue un 1-7 al Standard de Lieja, en la temporada 2004/05.",
                            "strDescriptionPT": null,
                            "strDescriptionSE": null,
                            "strDescriptionNL": null,
                            "strDescriptionHU": null,
                            "strDescriptionNO": null,
                            "strDescriptionIL": null,
                            "strDescriptionPL": null,
                            "strGender": "Male",
                            "strCountry": "Spain",
                            "strTeamBadge": "https://www.thesportsdb.com/images/media/team/badge/sxxppv1473502842.png",
                            "strTeamJersey": "https://www.thesportsdb.com/images/media/team/jersey/uvutpx1472752274.png",
                            "strTeamLogo": "https://www.thesportsdb.com/images/media/team/logo/j8s4fv1527934684.png",
                            "strTeamFanart1": "https://www.thesportsdb.com/images/media/team/fanart/qysput1420368007.jpg",
                            "strTeamFanart2": "https://www.thesportsdb.com/images/media/team/fanart/joqevn1503250501.jpg",
                            "strTeamFanart3": "https://www.thesportsdb.com/images/media/team/fanart/xwpsss1424275128.jpg",
                            "strTeamFanart4": "https://www.thesportsdb.com/images/media/team/fanart/tvuqps1433200595.jpg",
                            "strTeamBanner": "https://www.thesportsdb.com/images/media/team/banner/hk0zvx1503237261.jpg",
                            "strYoutube": "www.youtube.com/user/TVAthleticClub",
                            "strLocked": "unlocked"
                        }
            ]
        }


    """)

    val eventsSuccessResponse = MockResponse().setResponseCode(200).setBody("""

        {
	        "events": [
                        {
                            "strFilename": "La Liga 2018-10-21 Celta Vigo vs Alaves"
                        },
                        {
                            "strFilename": "La Liga 2018-10-21 Celta Vigo vs Alaves"
                        }
            ]
        }

        """)
}
