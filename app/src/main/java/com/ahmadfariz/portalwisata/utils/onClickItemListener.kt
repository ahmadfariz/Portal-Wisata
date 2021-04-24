package com.ahmadfariz.portalwisata.utils

import com.ahmadfariz.portalwisata.model.ModelNote

interface onClickItemListener {
    fun onClick(modelNote: ModelNote, position: Int)
}