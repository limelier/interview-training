package sorting

/** Merge two sorted lists into one */
private fun <T: Comparable<T>> merge(first: List<T>, second: List<T>): List<T> {
    val totalSize = first.size + second.size
    val sorted = ArrayList<T>(totalSize)

    var firstIndex = 0
    var secondIndex = 0
    while (firstIndex < first.size && secondIndex < second.size) {
        sorted.add(if (first[firstIndex] < second[secondIndex]) {
            first[firstIndex++]
        } else {
            second[secondIndex++]
        })
    }
    sorted.addAll(first.subList(firstIndex, first.size))
    sorted.addAll(second.subList(secondIndex, second.size))

    return sorted
}

fun <T: Comparable<T>> List<T>.mergeSorted(): List<T> {
    if (size < 2) return this.toList()

    val left = this.subList(0, size / 2)
    val right = this.subList(size / 2, size)
    return merge(left.mergeSorted(), right.mergeSorted())
}