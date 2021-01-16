package com.example.Bolaboli.ui.detail


import com.example.Bolaboli.data.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}