package comp.example.ahsimapc.coders.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import comp.example.ahsimapc.coders.R
import comp.example.ahsimapc.coders.Services.DataService
import comp.example.ahsimapc.coders.model.Categories
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var adapter:CustomAdapter
        adapter= CustomAdapter(this,DataService.categories)
        categorieid.adapter=adapter
    }
}
