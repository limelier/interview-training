package sorting

/** Assuming a heap, find the index of the children of the element at this index. */
private fun Int.children() = intArrayOf(2 * this + 1, 2 * this + 2)

/** Assuming a heap, find the index of the parent of the element at this index. */
private fun Int.parent(): Int {
    // parent n -> children 2n+1, 2n+2
    return if (this % 2 == 0) {
        (this / 2) - 1
    } else {
        this / 2
    }
}

/** Repair the heap, assuming the heaps rooted at the children are valid. */
private fun <T: Comparable<T>> MutableList<T>.siftDown(start: Int = 0, end: Int = size - 1) {
    var root = start

    while (true) {
        val biggerChild = root.children().filter { it <= end }.maxByOrNull { this[it] } ?: break
        if (this[root] >= this[biggerChild]) return // if root is biggest, heap is fine
        swap(root, biggerChild)
        root = biggerChild
    }
}

/** Rearrange list elements into an list-based max-heap */
private fun <T: Comparable<T>> MutableList<T>.heapify() {
    var root = (size - 1).parent() // start with last parent in list

    while (root >= 0) { // fix sub-trees and move up
        siftDown(start = root)
        root--
    }
}

fun <T: Comparable<T>> MutableList<T>.heapSort() {
    heapify()
    var heapEnd = size - 1
    while (heapEnd > 0) {
        swap(0, heapEnd) // largest item is root of heap
        heapEnd--
        siftDown(end = heapEnd) // fix heap
    }
}