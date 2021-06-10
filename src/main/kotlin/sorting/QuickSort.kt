package sorting

/**
 * Partition the list using the last item as a pivot, moving smaller items to the left and larger ones to the right
 *
 * @return the new position of the pivot item
 */
private fun <T: Comparable<T>> MutableList<T>.partition(): Int {
    val pivot = this[size - 1]
    var i = 0
    for (j in 0 until size - 1) {
        if (this[j] < pivot) {
            swap(i, j)
            i++
        }
    }
    swap(i, size - 1)
    return i
}

fun <T: Comparable<T>> MutableList<T>.quickSort() {
    if (size < 2) return

    val pivotIndex = partition()
    subList(0, pivotIndex).quickSort()
    subList(pivotIndex + 1, size).quickSort()
}