package com.example.lab6
import androidx.compose.foundation.layout.Box
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test


class WizardTest {
    private lateinit var evilWizard: Wizard

    @Before
    fun setUp() {
        evilWizard = Wizard("Evil Wizard", 30, 10)
    }


    @Test
    fun castSpell_explosion_successful() {
        val damageDealt = evilWizard.castSpell("Explosion")

        assertEquals(30, damageDealt) // spellPower of 10 * 3 = 30

        assertEquals(20, evilWizard.mana) // mana of 30 - 10 = 20
    }

    @Test
    fun castSpell_explosion_unsuccessful() {
        evilWizard.mana = 5 // Evil Wizard does not have enough mana to cast "Explosion"
        val damageDealt = evilWizard.castSpell("Explosion")

        assertEquals(0, damageDealt)

        assertEquals(5, evilWizard.mana) // mana still is 5
    }
    @Test
    fun castSpell_frostbite_successful() {
        val damageDealt = evilWizard.castSpell("Frostbite")

        assertEquals(20, damageDealt) // spellPower of 10 * 2 = 20

        assertEquals(25, evilWizard.mana) // mana of 30 - 5 = 25
        }

    @Test
    fun castSpell_frostbite_unsuccessful() {
        evilWizard.mana = 4 // Evil Wizard does not have enough mana to cast "Frostbite"
        val damageDealt = evilWizard.castSpell("Frostbite")

        assertEquals(0, damageDealt)

        assertEquals(4, evilWizard.mana) // mana still is 4
        }
    }

