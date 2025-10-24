package com.example.plentziaapp.ui.menu

import androidx.lifecycle.ViewModel
import com.example.plentziaapp.domain.model.MenuInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class MenuViewModel @Inject constructor(): ViewModel(){

    private var _menu = MutableStateFlow<List<MenuInfo>>(emptyList())
    val menu: StateFlow<List<MenuInfo>> = _menu

    init {
        _menu.value = listOf(
            MenuInfo.QueVer, MenuInfo.QueHacer,MenuInfo.Prepara,MenuInfo.Contacto
        )
        //_horoscope.value = horoscopeProvider.getHoroscopes()
    }


}