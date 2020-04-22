package kr.tjeit.pizzastoreapp_20200422

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.tjeit.pizzastoreapp_20200422.datas.Store
import java.util.*

class StoreDetailctivity : BaseActivity() {

    private lateinit var storeDate:Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store_detailctivity)
        setValues()
        setupEvents()
    }


    override fun setupEvents() {

    }

    override fun setValues() {

        storeDate = intent.getSerializableExtra("storeData") as Store



    }

}
