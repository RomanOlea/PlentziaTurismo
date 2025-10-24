package com.example.plentziaapp.domain.model

import com.example.plentziaapp.R

sealed class MenuInfo (
    val image: Int,
    val title:Int,
    val description: Int,
    val icon:Int
){
    object Prepara: MenuInfo(R.drawable.menu_prepara, R.string.menu_prepara, R.string.menu_prepara_description, R.drawable.ic_prepara)
    object QueHacer: MenuInfo(R.drawable.menu_prepara, R.string.menu_prepara, R.string.menu_prepara_description, R.drawable.ic_prepara)
    object QueVer: MenuInfo(R.drawable.menu_prepara, R.string.menu_prepara, R.string.menu_prepara_description, R.drawable.ic_prepara)
    object Contacto: MenuInfo(R.drawable.menu_prepara, R.string.menu_prepara, R.string.menu_prepara_description, R.drawable.ic_prepara)
}