package com.example.mygallery

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getAllPhotos()
    }

    private fun getAllPhotos() {
        //모든 사진 정보 가져오기
        val cursor = contentResolver.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
        null, // 가져올 항목 배열
        null, // 조건
        null, // 조건
        MediaStore.Images.ImageColumns.DATE_TAKEN + "DESC")

    }
}