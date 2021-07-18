package coding.challenges
// Given list of strings representing train station names implement
//   a function which will return passenger friendly `String`:
//
//  - String always starts with `Train is calling at`
//  - If list contains single tran station name then return `Train is calling at stationName`
//  - If list contains multiple train station names then return comma separated station names,
//       but pre-last and last names are separated separated by `and`

fun main() {
    println(formatTrainRoute(listOf("London", "New York", "Hoth", "Mars")))
}


private fun formatTrainRoute(stations: List<String>): String {
    val prefix = "Train is calling at "

    if (stations.size == 1) {
        return prefix + stations[0]
    }

    val lastStation = stations.takeLast(1)
        .joinToString { it }

    val followingStations = stations.dropLast(1)
        .joinToString { it }

    return "$prefix$followingStations and $lastStation"
}



