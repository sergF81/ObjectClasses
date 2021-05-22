package org.object_class


var id_next: Int = 0

//создание Data класс Post
data class Post(
    var id: Int = 0,
    var owner_id: Int = 0,
    var from_id: Int = 0,
    var created_by: Int = 0,
    var date: Int = 0,
    var text: String = "empty",
    var reply_owner_id: Int = 0,
    var reply_post_id: Int = 0,
    var friends_only: Boolean = false,
    var comments: Comments = Comments(),
    var copyright: Copyright = Copyright(),
    var likes: Likes = Likes(),
    var reposts: Repost = Repost(),
    var views: Views = Views(),
    var post_type: String = "комментарий",
    var signer_id: Int = 0,
    var can_pin: Boolean = false,
    var can_delete: Boolean = false,
    var can_edit: Boolean = false,
    var is_pinned: Boolean = false,
    var marked_as_ads: Boolean = false,
    var is_favorite: Boolean = false,
    var donut: Donut = Donut(),
    var postponed_id: Int = 0,
)

//создание синглтона - Объект WallService, который внутри себя хранит посты в массиве
object WallService {
    private var posts = emptyArray<Post>()
    private var nextId: Int = 0
    private var updateId: Int = 0
    private var text1: String = ""
    fun add(post: Post): Post {
        nextId++
        post.id = nextId
        posts += post

        return posts.last()
    }

    @Override
    fun toString(post: Post): String {
        return "ID поста: " + post.id + ", текст: " + post.text + " id владельца:" + post.owner_id + " время публикации: " + post.date
    }

    fun update(post: Post): Boolean {
        var update: Boolean = false
        updateId = post.id

        var idNew = post.id
        var owner_idNew = post.owner_id
        var from_idNew = post.from_id
        var created_byNew = post.created_by
        var dateNew = post.date
        var textNew = post.text
        var reply_owner_idNew = post.reply_owner_id
        var reply_post_idNew = post.reply_post_id
        var friends_onlyNew = post.friends_only
        var commentsNew = post.comments
        var copyrightNew = post.copyright
        var likesNew = post.likes
        var repostsNew = post.reposts
        var viewsNew = post.views
        var post_typeNew = post.post_type
        var signer_idNew = post.signer_id
        var can_pinNew = post.can_pin
        var can_deleteNew = post.can_delete
        var can_editNew = post.can_edit
        var is_pinnedNew = post.is_pinned
        var marked_as_adsNew = post.marked_as_ads
        var is_favoriteNew = post.is_favorite
        var donutNew = post.donut
        var postponed_idNew = post.postponed_id

        for (post in posts) {

            if (post.id == updateId) {
                post.id = idNew
               // post.owner_id = owner_idNew
                post.from_id = from_idNew
                post.created_by = created_byNew
               // post.date = dateNew
                post.text = textNew
                post.reply_owner_id = reply_owner_idNew
                post.reply_post_id = reply_post_idNew
                post.friends_only = friends_onlyNew
                post.comments = commentsNew
                post.copyright = copyrightNew
                post.likes = likesNew
                post.reposts = repostsNew
                post.views = viewsNew
                post.post_type = post_typeNew
                post.signer_id = signer_idNew
                post.can_pin = can_pinNew
                post.can_delete = can_deleteNew
                post.can_edit = can_editNew
                post.is_pinned = is_pinnedNew
                post.marked_as_ads = marked_as_adsNew
                post.is_favorite = is_favoriteNew
                post.donut = donutNew
                post.postponed_id = postponed_idNew

              //  println(post.toString())
                println((post.id).toString() + "update")
                println(post.id.toString() + " id")
               // post.text = text1
                break
                update = true
            } else update = false
        };return update
    }
}

fun main() {
   var origin1 = Post(
        owner_id = 1,
        date = 1621668732,
        text = "Круто"
    )
    var origin2 = Post(
        owner_id = 2,
        date = 1621668734,
        text = "Жесть"
    )
    var origin3 = Post(
        2,
        owner_id = 5,
        date = 1621668740,
        text = "Уау, прикольно!!!"
    )


    WallService.add(origin1)
    WallService.add(origin2)
    WallService.update(origin3)

    println("__________________Вывод содержимого постов____________________")
    println(WallService.toString(origin1))
    println(WallService.toString(origin2))



}