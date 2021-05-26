package org.object_class

data class Thread (   // ���������� � ��������� ����� ������������, ������ � ������:
    val count: Int = 0,// (integer) � ���������� ������������ � �����.
    val items: Array<Comments>? = null, //� ������ �������� ������������ � ������ (������ ��� ������ wall.getComments).
    val canPost: Boolean = false, //(boolean) � ����� �� ������� ������������ ��������� ����������� � ���� �����.
    val show_reply_button: Boolean = false, // (boolean) � ����� �� ���������� ������ ���������� � �����.
    val groups_can_post: Boolean = false // (boolean) � ����� �� ���������� ��������� ����������� � �����.
)