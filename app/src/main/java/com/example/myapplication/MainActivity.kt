package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("key", "onCreate \nВ этот лес завороженный,\n" +  //добавляем 'Log' для отслеживания активности, значение 'debug'
                "По пушинкам серебра,\n" +                    //устанавливаем ключ 'key' для поиска и создания фильтра поиска
                "Я с винтовкой заряженной") //добавляем message(сообщение которое будет показываться при запуске активности) в данном случае строки стихотвореня
    }

    override fun onStart() {
        super.onStart()
        Log.d("key", " onStart \nНа охоту шел вчера.\n" +
                "По дорожке чистой, гладкой\n" +
                "Я прошел, не наследил…")
    }

    override fun onResume() {
        super.onResume()
        Log.d("key", "onResume \nКто ж катался здесь украдкой?\n" +
                "Кто здесь падал и ходил?\n" +
                "Подойду, взгляну поближе:")
    }

    override fun onPause() {
        super.onPause()
        Log.d("key", "onPause \nХрупкий снег изломан весь.\n" +
                "Здесь вот когти, дальше — лыжи…\n" +
                "Кто-то странный бегал здесь.")
    }

    override fun onStop() {
        super.onStop()
        Log.d("key", "onStop \nКабы твердо знал я тайну\n" +
                "Заколдованным речам,\n" +
                "Я узнал бы хоть случайно,")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("key", "on Restart \nКто здесь бродит по ночам.\n" +
                "Из-за елки бы высокой\n" +
                "Подсмотрел я на кругу:")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("key", "onDestroy \nКто глубокий след далекий\n" +
                "Оставляет на снегу?..")
    }
    //далее создаем фильтр в Logcat с ключевым словом 'key' и выбираем debug или(как в моем случае) в поле фильтра просто прописываем ключевое слово 'key'
    //запускается жизненный цикл Activity в таком порядке при запуске приложения:
    //onCreate
    //onStart
    //onResume
    //далее если приложение свернуть запустятся
    //onPause
    //onStop
    //если приложение снова активировать то запустятся
    //onRestart
    //onStart
    //onResume
    //если приложение закрыит окончательно то сработают
    //onPause
    //onStop
    //и в самом конце onDestroy


}