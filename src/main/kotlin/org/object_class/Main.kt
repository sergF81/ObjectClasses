package org.object_class

fun main() {

    val origin1 = Post(
        ownerId = 1,
        date = 1621668732,
        text = "�����"
    )
    val origin2 = Post(
        ownerId = 2,
        date = 1621668734,
        text = "�����"
    )
    val origin3 = Post(
        2,
        ownerId = 5,
        date = 1621668740,
        text = "���, ���������!!!"
    )


    WallService.add(origin1)
    WallService.add(origin2)
    WallService.update(origin3)

    println("__________________����� ����������� ������____________________")
    println(WallService.posts.toList())


}