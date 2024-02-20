package com.example.menuproject

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast


class CustomMenu {

    fun customeMenu(context: Context, view : View) {

        val pop = PopupMenu(context,view)
        pop.inflate(R.menu.menu)

        pop.setOnMenuItemClickListener {
            when(it!!.itemId){
                R.id.edit -> { Toast.makeText(context,"Clicked Edit",Toast.LENGTH_LONG).show()
                true
                }
                R.id.delete -> {
                    Toast.makeText(context,"Clicked Deleted",Toast.LENGTH_LONG).show()
                    true
                }
                R.id.shared -> {
                    Toast.makeText(context,"Clicked Shared",Toast.LENGTH_LONG).show()
                    true
                }
                else -> false
            }
        }

        try {

            val fieldMpopup = PopupMenu::class.java.getDeclaredField("mpop")
            fieldMpopup.isAccessible = true
            val mPopup = fieldMpopup.get(pop)
            mPopup.javaClass
                .getDeclaredMethod("setForShowIcon",Boolean::class.java)
                .invoke(mPopup,true)
        } catch (e:Exception){

        } finally {
            pop.show()
        }




    }
}