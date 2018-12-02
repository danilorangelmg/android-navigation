package br.com.example.kotlin_architecture_nav.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import br.com.example.kotlin_architecture_nav.R

class MainNavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_navigation_activity)

        val drawerNavController = Navigation.findNavController(this, R.id.nav_host)
//        NavigationUI.setupWithNavController(navView, drawerNavController)
        drawerNavController.addOnNavigatedListener { controller, destination ->
            // Update UI visibility and other events
            Log.i("NAVIGATION", destination.toString())
        }
    }

    override fun onSupportNavigateUp(): Boolean {// Up button will work on this method
        return Navigation.findNavController(this, R.id.nav_host).navigateUp()
    }
}