package sorting

fun <T: Comparable<T>> MutableList<T>.selectionSort() {
    // sorted part of list: indices 0..i-1
    for (i in 0 until size - 1) {
        // append smallest item in unsorted part to sorted part
        for (j in i + 1 until size) {
            if (this[i] > this[j]) {
                this.swap(i, j)
            }
        }
    }
}
