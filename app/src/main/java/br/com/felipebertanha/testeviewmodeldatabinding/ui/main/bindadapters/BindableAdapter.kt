package br.com.felipebertanha.testeviewmodeldatabinding.ui.main.bindadapters

interface BindableAdapter<T> {
    fun setData(data: T)
}