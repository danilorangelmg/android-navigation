package br.com.example.kotlin_architecture_nav.ui

import br.com.example.kotlin_architecture_nav.R
import br.com.example.kotlin_architecture_nav.ui.base.BaseActivy

class MainNavigationActivity : BaseActivy() {

    override fun getNavigationHost(): Int {
        return R.id.nav_host
    }

    override fun getLayoutResource(): Int {
        return R.layout.main_navigation_activity
    }

}