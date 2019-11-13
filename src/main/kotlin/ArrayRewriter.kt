class ArrayRewriter {

    fun rewriteArray(oldArrayElements: Array<Int>): Array<Int?> {
        val newArrayElements = arrayOfNulls<Int>(oldArrayElements.size)
        var i = 0
        var j = oldArrayElements.size - 1
        oldArrayElements.forEach {
            if (it < 0) {
                newArrayElements[i] = it
                i++
            } else {
                newArrayElements[j] = it
                j--
            }
        }
        return newArrayElements
    }
}