package com.example.belajarmvp

class MainPresenterImp( private val view: IMainView): IMainPresenter {
    override fun penjumlahan(bilangan: Bilangan) {
        val result = bilangan.bil1+bilangan.bil2
        view.hasilJumlah(result)
        view.clearField()
    }

    override fun pengurangan(bilangan: Bilangan) {
        val result = bilangan.bil1-bilangan.bil2
        view.showToast(result.toString())
    }
}