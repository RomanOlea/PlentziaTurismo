package com.example.plentziaapp.ui.menu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plentziaapp.R
import com.example.plentziaapp.domain.model.MenuInfo

//class MenuAdapter(private var menuList:List<MenuInfo> = emptyList()): RecyclerView.Adapter<MenuViewHolder>() {
    class MenuAdapter(private var menuList:List<MenuInfo>,private val onItemSelected:(MenuInfo) -> Unit )
    : RecyclerView.Adapter<MenuViewHolder>() {
    fun updateList(list: List<MenuInfo>){
        menuList = list
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MenuViewHolder {
        return MenuViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        )
    }

    override fun onBindViewHolder(
        holder: MenuViewHolder,
        position: Int
    ) {
        holder.render(menuList[position], onItemSelected)
    }

    override fun getItemCount(): Int {
        return menuList.size
    }
}