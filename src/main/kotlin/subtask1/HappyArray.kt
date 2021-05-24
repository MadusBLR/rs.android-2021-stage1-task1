package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var temp=sadArray
        var i=1
        while(i<=temp.size-2) {
            if (temp[i] > (temp[i + 1] + temp[i - 1])) {
                val result = IntArray(temp.size - 1)
                System.arraycopy(temp, 0, result, 0, i)
                System.arraycopy(temp, i + 1, result, i, temp.size - i - 1)
                temp = result;
                if(i!=1)
                    i--
                continue
            }
            i++
        }
        return temp;
    }
}
