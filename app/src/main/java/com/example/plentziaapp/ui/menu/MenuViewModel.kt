package com.example.plentziaapp.ui.menu

import androidx.lifecycle.ViewModel
import com.example.plentziaapp.data.provider.MenuProvider
import com.example.plentziaapp.domain.model.MenuInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
//class MenuViewModel @Inject constructor(): ViewModel(){
class MenuViewModel @Inject constructor(private val menuProvider: MenuProvider): ViewModel(){
    private var _menu = MutableStateFlow<List<MenuInfo>>(emptyList())
    val menu: StateFlow<List<MenuInfo>> = _menu

    init {
        //_menu.value = listOf(
        //    MenuInfo.QueVer, MenuInfo.QueHacer,MenuInfo.Prepara,MenuInfo.Contacto
        //)
        _menu.value = menuProvider.getMenu()
    }


}