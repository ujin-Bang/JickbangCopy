package org.techtown.jickbangcopy.adapters

import android.content.Context
import android.widget.ArrayAdapter
import org.techtown.jickbangcopy.datas.RoomData

class RoomAdapter (
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>): ArrayAdapter<RoomAdapter>(){
}