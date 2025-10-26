package com.example.plentziaapp.domain.model

import com.example.plentziaapp.R

sealed class MenuInfo (
    val title:Int,
    val description: Int,
    val icon:Int,
    val fragment:Int
){
    object Prepara: MenuInfo( R.string.menu_prepara, R.string.menu_prepara_description, R.drawable.ic_prepara, R.id.preparaFragment)
    object QueHacer: MenuInfo( R.string.menu_quehacer, R.string.menu_quehacer_description, R.drawable.ic_quehacer, R.id.queHacerFragment)
    object QueVer: MenuInfo( R.string.menu_quever, R.string.menu_quever_description, R.drawable.ic_quever, R.id.queVerFragment)
    object Contacto: MenuInfo( R.string.menu_contacto, R.string.menu_contacto_description, R.drawable.ic_contacto, R.id.contactoFragment)
}