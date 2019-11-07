package com.graphicalinfo.mvp.base;

public class Presenter<V> {

    public V view;

    public Presenter(V view) {
        this.attacheView(view);
    }

    protected void attacheView(V view) {
        this.view = view;
    }


    // في حاله اغلاق الاكتفيتي تاكد من ان
    // البرسينتر مغلق لايلعب في الخلفيه
    // javaRxخصوصا اذا كنت تستخدم الرياكتف
    // في وجود سبسكريبر لعمل اتصال بالسيرفير او الشبكه
    // تاكد من اغلاق السبسكريبر او على الاقل توقفه
    //detachView في الفكشن
    protected void detachView(){
        this.view = null;
    }

}
