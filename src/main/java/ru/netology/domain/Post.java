package ru.netology.domain;

public class Post {
    private int id;
    private String text;
    private boolean video;
    private boolean music;
    private boolean picture;
    private int likes;
    private int share;
    private int watching;
    private CommentsInfo commentsInfo;

    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    private Copyright copyright;
    private Donut donut;
    private Geo geo;
    private LikesInfo likesInfo;
    private Object object;
    private Placeholder placeholder;
    private PostSource postSource;
    private RepostsInfo repostsInfo;
    private TypeOfComments typeOfComments;
    private ViewsInfo viewsInfo;


    // + get/set на все поля
}
