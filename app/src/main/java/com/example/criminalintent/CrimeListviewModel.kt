package com.example.criminalintent
import com.example.criminalintent.Crime


import androidx.lifecycle.ViewModel

class CrimeListviewModel : ViewModel() {
    val crimes = mutableListOf<Crime>()

    init {
        for (i in 0 until 100) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crimes += crime
        }
    }

}