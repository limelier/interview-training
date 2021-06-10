package sorting

fun <T: Comparable<T>> MutableList<T>.insertionSort() {
    // sorted part of list: indices 0..i-1
    for (i in 1 until size) {
        // sink current item down to the right position in the sorted part of the list
        for (j in i downTo 1) {
            // right position found
            if (this[j - 1] <= this[j]) {
                break
            }
            // sink deeper
            swap(j - 1, j)
        }
    }
}