package org.object_class

import java.util.*

//создание Data класс Post
data class Post(
    val id: Int,
    val owner_id: Int,
    val from_id: Int,
    val created_by: Int,
    val date: Int,
    val text: String,
    val reply_owner_id: Int,
    val reply_post_id: Int,
    val friends_only: Boolean,
    val comments: Object,
    val copyright: Object,
    val likes: Object,
    val reposts: Object,
    val views: Object,
    val post_type: String,
    val signer_id: Int,
    val can_pin: Boolean,
    val can_delete: Boolean,
    val can_edit: Boolean,
    val is_pinned: Boolean,
    val marked_as_ads: Boolean,
    val is_favorite: Boolean,
    val donut: Object,
    val postponed_id: Int )
//создание синглтона - Объект WallService, который внутри себя хранит посты в массиве
object WallService{
    private var posts = emptyArray<Post>()
}