package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val temp= ArrayList<String>()
        val braces="<>()[]"
        var i:Int=0
        for (i in 0..inputString.length-1) {
            if(braces.indexOf(inputString[i])%2==0) {
                val bracket=braces[braces.indexOf(inputString[i])+1]
                var k = i
                var tempString=""
                var bracketCount = 1
                while(bracketCount!=0)
                {
                    when(inputString[++k]) {
                        bracket -> bracketCount--
                        inputString[i] -> bracketCount++
                    }
                    if(bracketCount==0) break;
                    tempString+=inputString[k]
                }
                System.out.println(tempString)
                temp.add(tempString);
            }
        }
        val result=Array<String>(temp.size){""}
        temp.toArray(result)
        return result
    }
}
