package org.object_class

import java.lang.RuntimeException
import java.security.cert.Extension

//создание синглтона - Объект WallService, который внутри себя хранит посты в массиве
object WallService {
   // val posts = emptyArray<Post>()
    val posts: ArrayList<Post> = arrayListOf()
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        val postNew = if (posts.isEmpty()) post.copy(id = 1)
        else post.copy(id = posts.last().id + 1)
        posts += postNew
        return posts.last()
    }

    fun createComment(comment: Comment) {
        val id = comment.id
        for((index,post) in posts.withIndex()){
            if (post.id == comment.id){
                comments += Comment()
            }else  throw PostNotFoundException("Жесть")
        }
        if(!comments.isEmpty())
        TODO()
    }

    private fun PostNotFoundException(s: String): Throwable {
        throw RuntimeException()
    }

    fun update (newPost: Post):Boolean{
          for ((index, post) in posts.withIndex()) {

            if (post.id == newPost.id) {
               newPost.ownerId = post.ownerId
               newPost.date = post.date
                posts[index] = newPost
                return true
            }
        }
        return false
    }

}