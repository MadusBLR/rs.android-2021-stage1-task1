package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var total:Int=0
        for(c:Int in bill)
            total+=c
        total-=bill[k]
        total/=2
        if(total==b)
            return "Bon Appetit"
        return (b-total).toString()
    }
}
