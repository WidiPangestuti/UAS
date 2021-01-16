package com.example.Bolaboli.ui.event

import com.example.Bolaboli.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}