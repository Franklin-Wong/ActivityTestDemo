package com.wang.activitytestdemo.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Wongerfeng on 2018/3/19.
 */

public class BookEntity implements Parcelable {

    private int mId;
    private String mBookName;

    private BookEntity(int id, String bookName) {
        mId = id;
        mBookName = bookName;
    }

    protected BookEntity(Parcel in) {
        mId = in.readInt();
        mBookName = in.readString();
    }

    public static final Creator<BookEntity> CREATOR = new Creator<BookEntity>() {
        @Override
        public BookEntity createFromParcel(Parcel in) {
            return new BookEntity(in);
        }

        @Override
        public BookEntity[] newArray(int size) {
            return new BookEntity[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mId);
        parcel.writeString(mBookName);
    }

}
