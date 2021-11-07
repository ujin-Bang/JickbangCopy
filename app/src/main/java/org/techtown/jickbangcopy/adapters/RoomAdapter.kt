package org.techtown.jickbangcopy.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import org.techtown.jickbangcopy.R
import org.techtown.jickbangcopy.datas.RoomData

class RoomAdapter (
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>): ArrayAdapter<RoomData>( mContext,resId,mList){

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        return row

    }
}