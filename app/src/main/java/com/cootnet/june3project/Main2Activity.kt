package com.cootnet.june3project


import android.os.Bundle
import android.support.design.widget.BottomNavigationView


class Main2Activity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun getItemId(): Int {
        return  R.id.second_icon
    }

    override fun getContenView(): Int {
        return R.layout.activity_main
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
}
