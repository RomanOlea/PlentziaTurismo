package com.example.plentziaapp.data.provider

import com.example.plentziaapp.domain.model.MenuInfo
import javax.inject.Inject

class MenuProvider @Inject constructor() {

    fun getMenu(): List<MenuInfo>{
        return listOf(
            MenuInfo.QueVer, MenuInfo.QueHacer,MenuInfo.Prepara,MenuInfo.Contacto
        )
    }
}