package sorting

fun <T: Comparable<T>> MutableList<T>.bubbleSort() {
    var isSorted = false
    while (!isSorted) {
        isSorted = true
        // bubble larger items up
        for (i in 0 until size - 1) {
            if (this[i] > this[i+1]) {
                isSorted = false
                this.swap(i, i + 1)
            }
        }
    }
}