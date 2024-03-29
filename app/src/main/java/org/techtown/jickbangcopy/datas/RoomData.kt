package org.techtown.jickbangcopy.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String) : Serializable{

//    가격에 따라 다른 형태로 가공해서 가격을 알려주는 함수

    fun getFormattedPrice() : String {

        if(this.price < 10000) {

            val priceStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
            return priceStr + "만원"
        }

        else{

            val uk = this.price / 10000
            val rest =  this.price % 10000
            val restCommaStr = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)

            val priceStr = "${uk}억 ${restCommaStr}만원"

            return priceStr

        }

    }

//    층수를 상황에 따라 가공해서 보여주는 함수
    fun getFormattedFloor() : String {

        if(this.floor > 0) {
            return "${this.floor}층"
        }
        else if( this.floor == 0 ) {
            return "반지하하하"
        }
        else  {
            return "지하${-this.floor}층"
        }

    }
}