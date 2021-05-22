package org.object_class

//создание синглтона - Объект WallService, который внутри себя хранит посты в массиве
object WallService {
    var posts = emptyArray<Post>()
  //  private var nextId: Int = 0
    private var updateId: Int = 0


    fun add(post: Post): Post {
            var post  = if(posts.isEmpty() ) post.copy(id = 1)
                else post.copy(id = posts.last().id + 1)
        posts += post
        return  posts.last()
    }

    @Override
    fun toString(post: Post): String {
        return "ID поста: " + post.id + ", текст: " + post.text + " id владельца:" + post.ownerId + " время публикации: " + post.date
    }

    fun update(post: Post): Boolean {
        var update: Boolean = false
        updateId = post.id

        var idNew = post.id
        var ownerIdNew = post.ownerId
        var fromIdNew = post.fromId
        var createdByNew = post.createdBy
        var dateNew = post.date
        var textNew = post.text
        var replyOwnerIdNew = post.replyOwnerId
        var replyPostIdNew = post.replyPostId
        var friendsOnlyNew = post.friendsOnly
        var commentsNew = post.comments
        var copyrightNew = post.copyright
        var likesNew = post.likes
        var repostsNew = post.reposts
        var viewsNew = post.views
        var postTypeNew = post.postType
        var signerIdNew = post.signerId
        var canPinNew = post.canPin
        var canDeleteNew = post.canDelete
        var canEditNew = post.canEdit
        var isPinnedNew = post.isPinned
        var markedAsAdsNew = post.markedAsAds
        var isFavoriteNew = post.isFavorite
        var donutNew = post.donut
        var postponedIdNew = post.postponedId

        for (post in posts) {

            if (post.id == updateId) {
                post.id = idNew
                // post.owner_id = owner_idNew
                post.fromId = fromIdNew
                post.createdBy = createdByNew
                // post.date = dateNew
                post.text = textNew
                post.replyOwnerId = replyOwnerIdNew
                post.replyPostId = replyPostIdNew
                post.friendsOnly = friendsOnlyNew
                post.comments = commentsNew
                post.copyright = copyrightNew
                post.likes = likesNew
                post.reposts = repostsNew
                post.views = viewsNew
                post.postType = postTypeNew
                post.signerId = signerIdNew
                post.canPin = canPinNew
                post.canDelete = canDeleteNew
                post.canEdit = canEditNew
                post.isPinned = isPinnedNew
                post.markedAsAds = markedAsAdsNew
                post.isFavorite = isFavoriteNew
                post.donut = donutNew
                post.postponedId = postponedIdNew
                break
                update = true
            } else update = false
        };return update
    }
}