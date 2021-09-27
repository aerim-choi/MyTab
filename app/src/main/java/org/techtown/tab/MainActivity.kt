package org.techtown.tab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //처음에 보일 프레그먼트 설정
        with(supportFragmentManager.beginTransaction()){
            val first=FirstFragment()
            replace(R.id.container,first)
        }.commit()

        //bottomNavigationView에 있는 탭버튼을 눌럿을때 동작하도록 하는것
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.tab1 ->{
                    with(supportFragmentManager.beginTransaction()){
                        val first=FirstFragment()
                        replace(R.id.container,first)
                    }.commit()
                }
                R.id.tab2 ->{
                    with(supportFragmentManager.beginTransaction()){
                        val second=SecondFragment()
                        replace(R.id.container,second)
                    }.commit()
                }
                R.id.tab3 ->{
                    with(supportFragmentManager.beginTransaction()){
                        val third=ThirdFragment()
                        replace(R.id.container,third)
                    }.commit()
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}