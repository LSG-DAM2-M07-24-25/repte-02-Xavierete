package com.example.prueba.Navigation

import androidx.lifecycle.ViewModel
import com.lasalle.model.AppModel

class AppViewModel : ViewModel() {
    private val model = AppModel()

    // Expose data from the model
    val screenOneTitle = model.screenOneTitle
    val screenOneSubtitle = model.screenOneSubtitle
    val screenOneBody = model.screenOneBody
    val screenTwoBody = model.screenTwoBody
}