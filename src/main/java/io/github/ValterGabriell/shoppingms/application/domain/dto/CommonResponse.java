package io.github.ValterGabriell.shoppingms.application.domain.dto;


import lombok.Data;


public class CommonResponse<T> {

    private T data;
    private String message;
    private String headerLocation;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHeaderLocation() {
        return headerLocation;
    }

    public void setHeaderLocation(String headerLocation) {
        this.headerLocation = headerLocation;
    }
}
