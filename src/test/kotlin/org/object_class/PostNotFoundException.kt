package org.object_class

class PostNotFoundException {
    private fun PostNotFoundException(): Throwable {
        throw Throwable("Не найден Post с таким Id")
    }

}
