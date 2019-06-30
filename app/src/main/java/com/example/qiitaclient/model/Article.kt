package com.example.qiitaclient.model

import com.example.qiitaclient.model.User

data class Article(val id: String,
                   val title: String,
                   val url: String,
                   val user: User)
