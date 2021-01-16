package com.example.Bolaboli.ui.favorite

import com.example.Bolaboli.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}