package org.object_class

import org.junit.Assert.*
import org.junit.Test
import org.object_class.PostNotFoundException


class WallServiceTest() {

    @Test
    fun add() {
        val a = WallService()
        val result = a.add(Post(text = "проверка"))
        assertEquals(1, result.id)
    }

    @Test
    fun updateTrue() {
       val b = WallService()
        val post = Post(0)
        b.add(Post())
        b.add(Post())
        val post1 = Post(id = 1)
        val result = b.update(post1)
        assertTrue(result)
    }

    @Test
    fun createComment() {
        val a = WallService()
        a.add(Post())
        a.add(Post())
        a.createComment(Comment(1, text = "Проверка добавления"))
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val a = WallService()
        a.add(Post())
        a.add(Post())
        a.createComment(Comment(3, text = "ffff"))
    }
}



