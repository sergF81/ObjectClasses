package org.object_class

import org.junit.Assert.*
import org.junit.Test

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
    fun updateFalse() {
        WallService.add(Post())
        WallService.add(Post())
        val post = Post(10)
        val result = WallService.update(post)
        assertFalse(result)
    }

}

