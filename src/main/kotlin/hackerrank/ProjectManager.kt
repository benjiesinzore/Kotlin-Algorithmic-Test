package hackerrank

import java.util.*


fun main() {

    println(projectManager(feedProjectManager()))
}


fun feedProjectManager() : List<String>{

    val list: MutableList<String> = ArrayList()
    list.add("YYY")
    list.add("YNY")
    list.add("YYY")
    list.add("NNY")
    list.add("NYY")
    list.add("YYY")
    list.add("YYY")
    return list
}


fun projectManager(list: List<String>) {
    for (ss in list) {
        val lst = ss.split("".toRegex())
            .dropLastWhile { it.isEmpty() }
            .toTypedArray()
        println(lst.contentToString())
    }
}