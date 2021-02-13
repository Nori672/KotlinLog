package jp.techacademy.norihiro.nakano.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ", 3)
        dog.say()
        dog.move()

        val dog2 = Dog("ハチ", 10)
        dog.say()
        Log.d("kotlintest", "犬の名前は" + dog2.name + "です")
        Log.d("kotlintest", "犬の年齢は" + dog2.age + "歳です。")

        val bigdog = BigDog("ヨーゼフ", 15)

        bigdog.say()
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")

        val human1 = Human("kiyo", 30, "今日のご飯")

        human1.say()
        human1.think()

        val human2 = Human("fuji", 35, "音楽")

        human2.say()
        human2.think()
    }
}