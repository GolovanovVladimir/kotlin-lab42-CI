package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest2 {

    @Test
    fun mainInputCardMaster() {

        val input = "1"
        var result = " "
        when(input) {
            "1" -> result = "MASTER / MAESTRO"
            "2" -> result = "VISA / МИР"
            else -> result = "VK Pay"
        }
        assertEquals("MASTER / MAESTRO", result)
    }
    @Test
    fun mainInputCardVisa() {

        val input = "2"
        var result = " "
        when(input) {
            "1" -> result = "MASTER / MAESTRO"
            "2" -> result = "VISA / МИР"
            else -> result = "VK Pay"
        }
        assertEquals("VISA / МИР", result)
    }
    @Test
    fun mainInputCardVKPay() {

        val input = "4"
        var result = " "
        when(input) {
            "1" -> result = "MASTER / MAESTRO"
            "2" -> result = "VISA / МИР"
            else -> result = "VK Pay"
        }
        assertEquals("VK Pay", result)
    }
}