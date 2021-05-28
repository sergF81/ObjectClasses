package org.object_class

import org.junit.Assert.*
import org.junit.Test
import org.object_class.WallService.PostNotFoundException


class WallServiceTest {


    @Test
    fun addNotZero() {
        val post = Post(0)
        WallService.add(post)
        assertNotEquals(0, WallService.posts.last().id)
    }

    @Test
    fun updateTrue() {
        WallService.add(Post())
        WallService.add(Post())
        val post = Post(id = 1)
        val result = WallService.update(post)
        assertTrue(result)
    }

    @Test
    fun createComment() {
        WallService.add(Post())
        WallService.add(Post())
        WallService.createComment(Comment(1, text = "Проверка добавления"))
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        WallService.add(Post())
        WallService.add(Post())
        WallService.createComment(Comment(3, text = "ffff"))
    }
}



