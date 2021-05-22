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
    fun update() {

        val post = Post(ownerId = 4, date = 1621668759, text = "����")

        WallService.add(post)

        val post1 = Post(id = 1, ownerId = 2, date = 1621668760, text = "����!")

        WallService.update(post1)
        assertEquals(update(), true)
       // assertEquals(false, false)

    }

}