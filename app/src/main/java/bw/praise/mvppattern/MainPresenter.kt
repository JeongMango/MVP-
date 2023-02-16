package bw.praise.mvppattern

import bw.praise.mvppattern.`interface`.MainContract

class MainPresenter (
    val mainRepository: MainRepository,
    val mainContractView: MainContract.View
        ) : MainContract.Presenter{

            init {
                mainContractView.presenter = this
            }

    override fun start() {
        mainContractView.showProgress(false)
        val data = mainRepository.getData()
        mainContractView.setData(data)
        mainContractView.showProgress(true)
    }
}