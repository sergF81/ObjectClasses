package org.object_class

class Likes(

    var count: Int = 0,// � ����� �������������, ������� ����������� ������;
    var userLikes: Boolean = false,// � ������� ������� ���� ��������� �� �������� ������������ (1 � ����, 0 � ���);
    var canLike: Boolean = false, // � ���������� � ���, ����� �� ������� ������������ ��������� ������� ���� ��������� (1 � �����, 0 � �� �����);
    var canPublish: Boolean = false, // � ���������� � ���, ����� �� ������� ������������ ������� ������ ������ (1 � �����, 0 � �� �����).
)
