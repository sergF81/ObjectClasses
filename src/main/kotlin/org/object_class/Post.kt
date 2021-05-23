package org.object_class

import kotlin.collections.ArrayList

data class Post(
    val id: Int = 0,
    var ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    var date: Int = 0,
    val text: String = "empty",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: Comments = Comments(),
    val copyright: Copyright = Copyright(),
    val likes: Likes = Likes(),
    val reposts: Repost = Repost(),
    val views: Views = Views(),
    val postType: String = "комментарий",
    val postSource: PostSource = PostSource(),
    val attachments: Array<Attachments>? = null,
    val geo: Geo = Geo(),
    val copyHistory: ArrayList<Post>? = null,
    val signerId: Int = 0,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut = Donut(),
    val postponedId: Int = 0,
)
