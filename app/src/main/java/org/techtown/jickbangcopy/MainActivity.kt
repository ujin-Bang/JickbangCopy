package org.techtown.jickbangcopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.techtown.jickbangcopy.adapters.RoomAdapter
import org.techtown.jickbangcopy.datas.RoomData

class MainActivity : AppCompatActivity() {

    val mRooms = ArrayList<RoomData>()
    lateinit var mRoomAdapter : RoomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRooms.add(RoomData(8000,"서울시 동새문구",5,"1번째 방입니다"))
        mRooms.add(RoomData(18000,"서울시 서대문구",0,"2번째 방입니다"))
        mRooms.add(RoomData(29700,"경기도 고양시",17,"세번째 방입니다"))
        mRooms.add(RoomData(43000,"부산광역시 중구",-2,"4번째 방입니다"))
        mRooms.add(RoomData(175300,"강원도 화천군",20,"5번째 방입니다"))

        mRoomAdapter = RoomAdapter(this,R.layout.room_list_item, mRooms)
        roomListView.adapter = mRoomAdapter

    }
}