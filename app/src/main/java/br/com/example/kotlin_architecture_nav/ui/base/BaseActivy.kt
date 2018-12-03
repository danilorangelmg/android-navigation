package br.com.example.kotlin_architecture_nav.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.Navigation

abstract class BaseActivy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResource())
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, getNavigationHost()).navigateUp()
    }

    abstract fun getLayoutResource(): Int

    abstract fun getNavigationHost(): Int
}