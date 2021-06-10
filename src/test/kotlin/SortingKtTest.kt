import sorting.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*

internal class SortingKtTest {
    private val sortedList = (1..100).toList()
    // sortedList, but not sorted
    private var list = mutableListOf(6, 56, 44, 7, 13, 70, 11, 57, 47, 18, 77, 8, 60, 69, 25, 1, 73, 93, 79, 40, 32, 86, 19, 51, 76, 5, 53, 67, 100, 91, 29, 74, 52, 33, 62, 28, 82, 89, 23, 78, 10, 36, 24, 15, 34, 21, 37, 27, 90, 81, 16, 65, 95, 12, 49, 99, 68, 31, 54, 30, 72, 96, 87, 26, 85, 94, 61, 98, 9, 80, 50, 66, 58, 20, 14, 42, 43, 3, 83, 59, 64, 75, 71, 55, 92, 38, 88, 46, 4, 17, 22, 84, 2, 41, 48, 45, 35, 97, 39, 63)

    @AfterEach
    fun shouldBeSorted() = assertEquals(sortedList, list)

    @Test
    fun bubbleSort() = list.bubbleSort()

    @Test
    fun selectionSort() = list.selectionSort()

    @Test
    fun insertionSort() = list.insertionSort()

    @Test
    fun mergeSort() {
        list = list.mergeSorted().toMutableList()
    }

    @Test
    fun quickSort() = list.quickSort()

    @Test
    fun heapSort() = list.heapSort()

    @Test
    fun doWhatever() = list.swap(1, 2)
}
