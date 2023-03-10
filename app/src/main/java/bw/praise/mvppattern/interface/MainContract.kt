package bw.praise.mvppattern.`interface`

interface MainContract {

    interface View: BaseView<Presenter>{
        fun showProgress(isShow: Boolean)
        fun setData(str: String)
    }

    interface Presenter : BasePresenter

}

interface BasePresenter {
    fun start()
}

interface BaseView<T>{
    var presenter: T

}