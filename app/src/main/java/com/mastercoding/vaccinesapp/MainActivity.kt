package com.mastercoding.vaccinesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //AdapterView : which is our RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,
            false
        )

        // data source in this case data source is list of vaccineModel objects

        var vaccineList: ArrayList<VaccineModel> = ArrayList()
        var v1 = VaccineModel("Covid-19", R.drawable.vaccine1)
        val v2  = VaccineModel("Hepatitis B Vaccine", R.drawable.vaccine4)
        val v3  = VaccineModel("Tatanus Vaccine", R.drawable.vaccine5)
        val v4  = VaccineModel("Pneumococal Vaccine", R.drawable.vaccine6)
        val v5  = VaccineModel("Rotavirus  Vaccine", R.drawable.vaccine7)
        val v6  = VaccineModel("Measles Vaccine", R.drawable.vaccine8)
        val v7  = VaccineModel("Chickenpox Vaccine", R.drawable.vaccine9)
        var v8 = VaccineModel("Covid-19", R.drawable.vaccine1)
        val v9  = VaccineModel("Hepatitis B Vaccine", R.drawable.vaccine4)
        val v10  = VaccineModel("Tatanus Vaccine", R.drawable.vaccine5)
        val v11  = VaccineModel("Pneumococal Vaccine", R.drawable.vaccine6)
        val v12  = VaccineModel("Rotavirus  Vaccine", R.drawable.vaccine7)
        val v13  = VaccineModel("Measles Vaccine", R.drawable.vaccine8)
        val v14  = VaccineModel("Chickenpox Vaccine", R.drawable.vaccine9)


        vaccineList.add(v1)
        vaccineList.add(v2)
        vaccineList.add(v3)
        vaccineList.add(v4)
        vaccineList.add(v5)
        vaccineList.add(v6)
        vaccineList.add(v7)
        vaccineList.add(v8)
        vaccineList.add(v9)
        vaccineList.add(v10)
        vaccineList.add(v11)
        vaccineList.add(v12)
        vaccineList.add(v13)
        vaccineList.add(v14)

        //before moving adapter need to add some data in above list

        val adapter = MyAdapter(vaccineList)
        recyclerView.adapter = adapter

    }
}