package org.techtown.jickbangcopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import org.techtown.jickbangcopy.datas.RoomData

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("room") as RoomData


        txtPrice.text = roomData.getFormattedPrice()
        txtDescription.text = roomData.description
        txtAddress.text = roomData.address
        txtFoor.text = roomData.getFormattedFloor()
    }
}