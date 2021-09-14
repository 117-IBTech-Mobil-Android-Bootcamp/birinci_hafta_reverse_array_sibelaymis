package com.example.homework1


    private fun MutableList<Int>.reverseListGivenIndex(startingIndex: Int = 0): MutableList<Int> {
        if (startingIndex > this.size - 1 || startingIndex < 0) {
            println("Out of list size!!")
            return mutableListOf()
        }
        val reversedList: MutableList<Int> = mutableListOf()
        for (item in 0 until startingIndex) {
            reversedList.add(this[item])
        }
        for (item in this.size - 1 downTo startingIndex) {
            reversedList.add(this[item])
        }
        return reversedList
    }

    fun main() {
        val inputList:MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8,9,10)
        println("Enter index for starting reverse")
        val startingIndex= readLine()?.toIntOrNull() ?: 0
        println("inputList : $inputList")
        val reversedList = inputList.reverseListGivenIndex(startingIndex)
        print("reversedList : $reversedList")
    }
