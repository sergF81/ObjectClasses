package org.object_class

import java.util.*

data class Donut(
    //���������� � ������ VK Donut:
    var isDonut: Boolean = false, // � ������ �������� ������ ������� ����������� VK Donut;
    var paidDuration: Int = 0, // � �����, � ������� �������� ������ ����� �������� ������ ������� ����������� VK Donut;
    var placeholder: Object = Object(), //  � �������� ��� �������������, ������� �� �������� �������� VK Donut. ������������ ������ ����������� ������.
    var canPublishFreeCopy: Boolean = false, // � ����� �� ������� ������ ��� ���� �������������, � �� ������ ����������� VK Donut;
    var editMode: String = "", // � ���������� � ���, ����� �������� VK Donut ����� �������� � ������. ��������� ��������:
    var all: String = "��� ���������� � VK Donut.",
    var duration: String = "�����, � ������� �������� ������ ����� �������� ������ ������� ����������� VK Donut.",
)
