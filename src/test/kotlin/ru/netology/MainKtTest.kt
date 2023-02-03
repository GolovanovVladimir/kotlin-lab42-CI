package ru.netology

import org.junit.Test
import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateCommissionMaster() {
        val amountCurrent = 100_000.0
        val typeCard = "MASTER / MAESTRO"

        val result = calculateCommission(typeCard, 20_000.0, amountCurrent)
        assertEquals(1.0,  result,0.0)
    }
    @Test
    fun calculateCommissionVisa() {
        val amountCurrent = 30_000.0
        val typeCard = "VISA / МИР"

        val result = calculateCommission(typeCard, 110_000.0, amountCurrent)
        assertEquals(225.0,  result,0.0)
    }
    @Test
    fun calculateCommissionVKPay() {
        val amountCurrent = 14_000.0
        val typeCard = "VK Pay"

        val result = calculateCommission(typeCard, 17_000.0, amountCurrent)
        assertEquals(1.0,  result,0.0)
    }

    @Test
    fun calculateCommissionVKPayLimitDay() {
        val amountCurrent = 16_000.0
        val typeCard = "VK Pay"

        val result = calculateCommission(typeCard, 36_000.0, amountCurrent)
        assertEquals(0.0,  result,0.0)
    }
    @Test
    fun calculateCommissionVKPayLimitMonth() {
        val amountCurrent = 16_000.0
        val typeCard = "VK Pay"

        val result = calculateCommission(typeCard, 25_000.0, amountCurrent)
        assertEquals(0.0,  result,0.0)
    }
    @Test
    fun calculateCommissionMasterLimitDay() {
        val amountCurrent = 151_000.0
        val typeCard = "MASTER / MAESTRO"

        val result = calculateCommission(typeCard, 36_000.0, amountCurrent)
        assertEquals(0.0,  result,0.0)
    }
   @Test
    fun calculateCommissionMasterLimitMonth() {
        val amountCurrent = 601_000.0
        val typeCard = "MASTER / MAESTRO"

        val result = calculateCommission(typeCard, 350_000.0, amountCurrent)
        assertEquals(0.0,  result,0.0)
    }
    @Test
    fun calculateCommissionVisaLimitDay() {
        val amountCurrent = 151_000.0
        val typeCard = "VISA / МИР"

        val result = calculateCommission(typeCard, 36_000.0, amountCurrent)
        assertEquals(0.0,  result,0.0)
    }
    @Test
    fun calculateCommissionVisaLimitMonth() {
        val amountCurrent = 601_000.0
        val typeCard = "VISA / МИР"

        val result = calculateCommission(typeCard, 350_000.0, amountCurrent)
        assertEquals(0.0,  result,0.0)
    }
}