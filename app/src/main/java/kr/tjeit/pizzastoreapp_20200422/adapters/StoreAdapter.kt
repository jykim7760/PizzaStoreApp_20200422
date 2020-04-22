package kr.tjeit.pizzastoreapp_20200422.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import kr.tjeit.pizzastoreapp_20200422.R
import kr.tjeit.pizzastoreapp_20200422.datas.Store

class StoreAdapter(context: Context, resId:Int, list:ArrayList<Store>) : ArrayAdapter<Store>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        tempRow?.let {

        }.let {
            tempRow = inf.inflate(R.layout.store_list_item, null)
        }

        val row = tempRow!!


        val LogoImg = row.findViewById<ImageView>(R.id.LogoImg)

        val storeData = mList.get(position)

        storeName.text = storeData.name
        Glide



        return row

    }


}