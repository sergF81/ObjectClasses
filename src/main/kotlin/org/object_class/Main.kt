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
   // val comment = Comment(3, text = "Suka")

    WallService.add(origin1)
    WallService.add(origin1)
    WallService.add(origin2)
    WallService.update(origin3)
    println(WallService.posts.toList())
    val comment1 = Comment(3)
    WallService.createComment(comment1)
    println("__________________����� ����������� ������____________________")



}