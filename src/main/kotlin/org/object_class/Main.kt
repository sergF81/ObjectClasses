package org.object_class

fun main() {

    val origin1 = Post(
        ownerId = 1,
        date = 1621668732,
        text = "Круто"
    )
    val origin2 = Post(
        ownerId = 2,
        date = 1621668734,
        text = "Жесть"
    )
    val origin3 = Post(
        2,
        ownerId = 5,
        date = 1621668740,
        text = "Уау, прикольно!!!"
    )


    WallService.add(origin1)
    WallService.add(origin2)
    WallService.update(origin3)

    println("__________________Вывод содержимого постов____________________")
    println(WallService.posts.toList())


}