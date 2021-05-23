package org.object_class

abstract class Attachments {
    abstract val type: String

}

class VideoAttachments : Attachments() {
    override val type: String = "video"
    val video: Video = Video()
}

class Video {
    val id: Int = 0 // - �������������� ����������.
    val albumId: Int = 0 // - ������������� �������, � ������� ��������� ����������.
    val ownerId: Int = 0 // - ������������� ��������� ����������.
    val userId: Int = 0 // - ������������� ������������, ������������ ���� (���� ���������� ��������� � ����������). ��� ����������, ����������� �� ����� ����������, user_id = 100.
    val text: String = "" // - ����� �������� ����������.
    val date: Int = 0
}

class AudioAttachments : Attachments() {
    override val type: String = "audio"
    val audio: Audio = Audio()
}

class Audio {
    val id: Int = 0 //	������������� �����������.
    val ownerId: Int = 0 //	������������� ��������� �����������.
    val artist: String = ""// �����������.
    val title: String = "" // �������� ����������.
    val duration: Int = 0 //  ������������ ����������� � ��������.
    val url: String = ""  //	������ �� mp3.
    val lyricsId: Int = 0//	������������� ������ ����������� (���� ��������).
    val albumId: Int = 0 //	������������� �������, � ������� ��������� ����������� (���� ��������).
    val genreId: Int = 0 // ������������� ����� �� ������ ����� ������.
    val date: Int = 0 // ���� ����������.
    val no_search: Int = 0// 1 ec�� �������� ����� ��� �������� ��� ������. ���� ����� ���������, ���� �� ������������.
    val is_hq: Int = 0 //	1, ���� ����� � ������� ��������.
}

class LinkAttachments : Attachments() {
    override val type: String = "link"
    val link: Link = Link()
}

class Link{
    val url: String = "" //	URL ������.
    val title:String = "" //   string	��������� ������.
    val caption: String = "" //  string	������� ������ (���� �������).
    val description:String = "" //   string	�������� ������.
    val preview_page: String = "" //  string	������������� ����-�������� � ��������� ��� ������������� ����������� ��������. ������������ � ������� "owner_id_page_id".
    val preview_url: String = "" //  string	URL �������� � ��������� ��� ������������� ����������� ��������.

}


class NoteAttachments : Attachments() {
    override val type: String = "note"
    val note: Note = Note()
}

class  Note {
   val id: Int = 0 //   integer    ������������� �������.
    val ownerId: Int = 0 //    integer    ������������� ��������� �������.
    val title:String = "" //   string    ��������� �������.
    val text: String = "" //   string    ����� �������.
    val date: Int = 0 //   integer    ���� �������� ������� � ������� Unixtime.
    val comments: Int = 0 //    integer    ���������� ������������.
    val readComments: Int = 0 //    integer    ���������� ����������� ������������ (������ ��� ������� ���������� � ������� �������� ������������).
    val viewUrl: String = "" // string    URL �������� ��� ����������� �������.
}

class PhotoAttachments : Attachments() {
    override val type: String = "photo"
    val photo: Photo = Photo()
}

class Photo{

    val id: Int = 0 //   integer	������������� ����������.
    val albumId:Int = 0 //  integer	������������� �������, � ������� ��������� ����������.
    val ownerId:Int = 0 //  integer	������������� ��������� ����������.
    val userId:Int = 0 //   integer	������������� ������������, ������������ ���� (���� ���������� ��������� � ����������). ��� ����������, ����������� �� ����� ����������, user_id = 100.
    val text: String = "" //   string	����� �������� ����������.
    val date: Int = 0 //  integer	���� ���������� � ������� Unixtime.
}