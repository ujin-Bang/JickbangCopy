package org.techtown.jickbangcopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.jickbangcopy.datas.RoomData

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("room") as RoomData

    }
}