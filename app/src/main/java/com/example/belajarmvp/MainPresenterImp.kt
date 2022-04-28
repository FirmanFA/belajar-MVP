package com.example.belajarmvp

class MainPresenterImp( private val view: IMainView): IMainPresenter {
    override fun countResult(bilangan: Bilangan) {
        val result = bilangan.bil1+bilangan.bil2
        view.showResult(result)
        view.clearField()
    }

    override fun pengurangan(message: String) {
        view.showToast(message)
    }
}