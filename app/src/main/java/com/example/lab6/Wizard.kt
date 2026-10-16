package com.example.lab6


/**
 * the wizard class does x
 */

class Wizard(val name: String, var mana: Int, var spellPower: Int) {
    /**
     * Represents x
     * @property name name of the wizard
     * @property mana current mana available for casting spells
     * @property spellPower the base power used for spell damage calculation
     */


    /**
     * casts spell and return damage
     * - explosions costs 10 mana deals 5 * spellPower damage
     * - frostbite costs 5 mana deals 2 * spellPower damage
     * @param spell the name of the spell to cast
     * @return the integer amount of damage dealt, or 0 if the spell fails
     */
    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else return 0 // not enough mana
            }
            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2
                } else return 0 // not enough mana
            }
            else -> {
                return 0 // invalid spell
            }
        }
    }
}