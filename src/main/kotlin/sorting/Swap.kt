package sorting

import java.util.*

internal fun <T> MutableList<T>.swap(i: Int, j: Int) {
    Collections.swap(this, i, j)
}