package com.example.lkard.remind.dto;

/**
 * Created by LKARD on 17.06.2016.
 */
public class RemindDTO {
    private String title;
    public RemindDTO(String title){
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {

        return title;
    }
}
